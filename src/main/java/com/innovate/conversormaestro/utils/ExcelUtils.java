package com.innovate.conversormaestro.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;

import com.innovate.conversormaestro.datasource.ConnectionController;

public class ExcelUtils {
    private String PathSourceExcel;
    private ConnectionController connectionController;

    public int devuelveNFilasExcel() {
        connectionController = ConnectionController.getConectionController();
        PathSourceExcel = connectionController.getPathSourceExcel();
        int result = 0;

        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

            result = hssfSheet.getLastRowNum();
            hssfWorkbook.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println(
                        "Error in file processing after close it (Error al procesar el fichero después de cerrarlo): "
                                + ex);
            }
        }
        return result;
    }

    public String devuelveValorCelda(int fila, String columna) {
        String result = "";
        connectionController = ConnectionController.getConectionController();
        PathSourceExcel = connectionController.getPathSourceExcel();
    
        // Usamos try-with-resources para asegurarnos de cerrar el flujo y el archivo
        try (InputStream excelStream = new FileInputStream(PathSourceExcel);
             HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream)) {
    
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera = hssfSheet.getRow(0);
            HSSFRow hssfRow = hssfSheet.getRow(fila);
    
            if (hssfRowCabecera == null || hssfRow == null) {
                throw new IllegalArgumentException("Fila o cabecera no encontrada.");
            }
    
            DataFormatter dataFormatter = new DataFormatter();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            // Encontramos el índice de la columna en la cabecera
            int columnIndex = -1;
            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                if (hssfRowCabecera.getCell(c).getStringCellValue().equalsIgnoreCase(columna)) {
                    columnIndex = c;
                    break;
                }
            }
    
            if (columnIndex == -1) {
                throw new IllegalArgumentException("Columna no encontrada: " + columna);
            }
    
            HSSFCell cell = hssfRow.getCell(columnIndex);
            if (cell != null) {
                if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
                    result = dateFormat.format(cell.getDateCellValue());
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    result = dataFormatter.formatCellValue(cell).replace(",", ".");
                } else {
                    result = dataFormatter.formatCellValue(cell);
                }
            }
    
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo Excel no encontrado en la ruta especificada.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo Excel.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

    public List<Integer> buscarDatosIgualesEnColumna(String columna, String dato) {
        List<Integer> filasConDato = new ArrayList<>();
        InputStream excelStream = null;
        connectionController = ConnectionController.getConectionController();
        PathSourceExcel = connectionController.getPathSourceExcel();
        try {
            excelStream = new FileInputStream(PathSourceExcel);
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera = hssfSheet.getRow(0);

            int columnaIndex = -1;
            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                if (hssfRowCabecera.getCell(c).getStringCellValue().equals(columna)) {
                    columnaIndex = c;
                    break;
                }
            }

            if (columnaIndex == -1) {
                System.out.println("Columna no encontrada");
                hssfWorkbook.close();
                return filasConDato;
            }

            for (int r = 1; r <= hssfSheet.getLastRowNum(); r++) {
                HSSFRow hssfRow = hssfSheet.getRow(r);
                if (hssfRow != null && hssfRow.getCell(columnaIndex) != null) {
                    hssfRow.getCell(columnaIndex).setCellType(CellType.STRING);
                    if (hssfRow.getCell(columnaIndex).getStringCellValue().equals(dato)) {
                        filasConDato.add(r);
                    }
                }
            }

            hssfWorkbook.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error al leer el fichero excel");
        } catch (IOException ex) {
            System.out.println("Error al leer el fichero excel");
        } finally {
            try {
                if (excelStream != null) {
                    excelStream.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al leer el fichero excel");
            }
        }
        return filasConDato;
    }
}
