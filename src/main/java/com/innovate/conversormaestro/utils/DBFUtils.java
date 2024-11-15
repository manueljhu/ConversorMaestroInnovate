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
        } catch (CorruptedTableException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<Field> fields = table.getFields();
        int columnIndex = -1;

        // Encontrar el índice de la columna
        for (int i = 0; i < fields.size(); i++) {
            if (fields.get(i).getName().equalsIgnoreCase(columna)) {
                columnIndex = i;
                break;
            }
        }

        if (columnIndex == -1) {
            throw new IllegalArgumentException("Columna no encontrada: " + columna);
        }

        Iterator<Record> it = table.recordIterator();
        int currentRow = 0;

        // Recorrer las filas hasta encontrar la fila especificada
        while (it.hasNext()) {
            Record record = it.next();
            if (currentRow == fila) {
                Field field = fields.get(columnIndex);
                Object value = record.getTypedValue(field.getName());
                result = value != null ? value.toString().trim() : "NULL";
                //System.out.println("Columna: " + columna + " Fila: " + fila + " Tipo: " + field.getType() + " Valor: " + result);
                break;
            }
            currentRow++;
        }

        try {
            table.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
