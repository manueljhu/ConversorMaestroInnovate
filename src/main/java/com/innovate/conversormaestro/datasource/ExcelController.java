package com.innovate.conversormaestro.datasource;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelController {
    private static ExcelController excelController;
    private String PathSourceExcel;
	private ConnectionController connectionController;

    private ExcelController(){
		connectionController = ConnectionController.getConectionController();
		PathSourceExcel = connectionController.getPathSourceExcel();
    }

	

    public static ExcelController getExcelController(){

        if(excelController == null){
            excelController = new ExcelController();
        }

        return excelController;
    }

    public void readExcelFile(){
        
        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);

            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                System.out.println(hssfRowCabecera.getCell(c).getStringCellValue());
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println("Error in file processing after close it (Error al procesar el fichero después de cerrarlo): " + ex);
            }
        }
    }

    public String getPathSourceExcel(){
		return PathSourceExcel;
	}

    

	



}
