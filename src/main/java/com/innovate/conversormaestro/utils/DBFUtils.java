package com.innovate.conversormaestro.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.linuxense.javadbf.DBFReader;

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
        InputStream dbfStream = null;
        connectionController = ConnectionController.getConectionController();
        PathSourceDBF = connectionController.getPathSourceDBF();
        try {
            dbfStream = new FileInputStream(PathSourceDBF);

            DBFReader dbfReader = new DBFReader(dbfStream);
            Object[] rowObjects;
            /* while ((rowObjects = dbfReader.nextRecord()) != null) {
                // Formatear los datos para comparación
                String rowValue = rowObjects[0].toString().trim();
                String filaValue = String.valueOf(fila).trim();
                
                // Imprimir el contenido de rowObjects[0] para depuración
                System.out.println("Comparando: " + rowValue + " con " + filaValue);
                if (rowValue.equals(filaValue)) {
                    result = rowObjects[1].toString();
                    break;
                }
            } */
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
