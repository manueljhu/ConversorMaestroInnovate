package com.innovate.conversormaestro.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFRow;

import nl.knaw.dans.common.dbflib.*;

public class DBFUtils {
    private String PathSourceDBF;
    private ConnectionController connectionController;

    public int devuelveNFilasDBF() {
        connectionController = ConnectionController.getConectionController();
        PathSourceDBF = connectionController.getPathSourceDBF();
        int result = 0;

        InputStream dbfStream = null;
        try {
            dbfStream = new FileInputStream(PathSourceDBF);

            DBFReader dbfReader = new DBFReader(dbfStream);
            result = dbfReader.getRecordCount();
            dbfReader.close();
            dbfStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                dbfStream.close();
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
        PathSourceDBF = connectionController.getPathSourceDBF();
        File file = new File(PathSourceDBF);
        Table table = new Table(file);
        try {
            table.open(IfNonExistent.ERROR);
            Record record = table.getRecordAt(fila);
            Object value = record.getTypedValue(columna);
                result = value != null ? value.toString().trim() : "NULL";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                table.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }

        return result;
    }

    public List<Integer> buscarDatosIgualesEnColumna(String columna, String dato) {
        List<Integer> filasConDato = new ArrayList<>();
        InputStream dbfStream = null;
        connectionController = ConnectionController.getConectionController();
        PathSourceDBF = connectionController.getPathSourceDBF();

        try {
            dbfStream = new FileInputStream(PathSourceDBF);

            DBFReader dbfReader = new DBFReader(dbfStream);
            Object[] rowObjects;
            while ((rowObjects = dbfReader.nextRecord()) != null) {
                if (rowObjects[1].equals(dato)) {
                    filasConDato.add((Integer) rowObjects[0]);
                }
            }
            dbfReader.close();
            dbfStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                dbfStream.close();
            } catch (IOException ex) {
                System.out.println(
                        "Error in file processing after close it (Error al procesar el fichero después de cerrarlo): "
                                + ex);
            }
        }

        return filasConDato;
    }

}
