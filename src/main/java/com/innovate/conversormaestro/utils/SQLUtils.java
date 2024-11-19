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

public class SQLUtils {
    private String PathSourceSQL;
    private ConnectionController connectionController;

    public int devuelveNFilasSQL() {
        int result = 0;
        /* connectionController = ConnectionController.getConectionController();
        PathSourceSQL = connectionController.getPathSourceSQL();
        

        InputStream SQLStream = null;
        try {
            SQLStream = new FileInputStream(PathSourceSQL);

            SQLReader SQLReader = new SQLReader(SQLStream);
            result = SQLReader.getRecordCount();
            SQLReader.close();
            SQLStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                SQLStream.close();
            } catch (IOException ex) {
                System.out.println(
                        "Error in file processing after close it (Error al procesar el fichero después de cerrarlo): "
                                + ex);
            }
        } */
        return result;
    }

    public String devuelveValorCelda(int fila, String columna) {
        String result = "";
        /* connectionController = ConnectionController.getConectionController();
        PathSourceSQL = connectionController.getPathSourceSQL();
        File file = new File(PathSourceSQL);
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
 */
        return result;
    }

    public List<Integer> buscarDatosIgualesEnColumna(String columna, String dato) {
        List<Integer> filasConDato = new ArrayList<>();
        /* InputStream SQLStream = null;
        connectionController = ConnectionController.getConectionController();
        PathSourceSQL = connectionController.getPathSourceSQL();

        try {
            SQLStream = new FileInputStream(PathSourceSQL);

            SQLReader SQLReader = new SQLReader(SQLStream);
            Object[] rowObjects;
            while ((rowObjects = SQLReader.nextRecord()) != null) {
                if (rowObjects[1].equals(dato)) {
                    filasConDato.add((Integer) rowObjects[0]);
                }
            }
            SQLReader.close();
            SQLStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                SQLStream.close();
            } catch (IOException ex) {
                System.out.println(
                        "Error in file processing after close it (Error al procesar el fichero después de cerrarlo): "
                                + ex);
            }
        } */

        return filasConDato;
    }

}
