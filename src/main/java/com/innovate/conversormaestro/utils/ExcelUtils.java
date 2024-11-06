package com.innovate.conversormaestro.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

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
        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;
            HSSFRow hssfRow;

            hssfRowCabecera = hssfSheet.getRow(0);
            hssfRow = hssfSheet.getRow(fila);
            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                if (hssfRowCabecera.getCell(c).getStringCellValue().equals(columna)) {
                    //System.out.println(hssfRowCabecera.getCell(c).getStringCellValue().equals(columna));
                    if (hssfRow.getCell(c) != null) {
                        hssfRow.getCell(c).setCellType(CellType.STRING);
                        //System.out.println(hssfRow.getCell(c).getStringCellValue());
                        result = hssfRow.getCell(c).getStringCellValue();
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
                excelStream.close();
            } catch (IOException ex) {
                System.out.println("Error al leer el fichero excel");
            }
        }
        return result;
    }

    public List<Integer> buscarDatosIgualesEnColumna(String columna, String dato) {
        List<Integer> filasConDato = new ArrayList<>();
        InputStream excelStream = null;
        PathSourceExcel = "C:\\Users\\PC\\Documents\\previsiones_cobro.xls";
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
