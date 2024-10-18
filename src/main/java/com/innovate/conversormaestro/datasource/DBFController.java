package com.innovate.conversormaestro.datasource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFUtils;



public class DBFController {
    private static DBFController dbfController;
    private String PathSourceDBF;
	private ConnectionController connectionController;


    private DBFController(){
		connectionController = ConnectionController.getConectionController();
		PathSourceDBF = connectionController.getPathSourceDBF();
    }

	

    public static DBFController getDBFController(){

        if(dbfController == null){
            dbfController = new DBFController();
        }

        return dbfController;
    }

    public void readDBFFile(){
        DBFReader reader = null;
		try {
			reader = new DBFReader(new FileInputStream(new File(PathSourceDBF)), StandardCharsets.UTF_8);		

			int numberOfFields = reader.getFieldCount();			

			for (int i = 0; i < numberOfFields; i++) {

				DBFField field = reader.getField(i);

				// do something with it if you want
				// refer the JavaDoc API reference for more details
				//
				System.out.println(field.getName());
			}

			// Now, lets us start reading the rows

			Object[] rowObjects;

			while ((rowObjects = reader.nextRecord()) != null) {

				for (int i = 0; i < rowObjects.length; i++) {
					System.out.println(rowObjects[i]);
				}
			}

			// By now, we have iterated through all of the rows

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
    }



}
