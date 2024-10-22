package com.innovate.conversormaestro.datasource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

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

			

		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}
    }

	public String getPathSourceDBF(){
		return PathSourceDBF;
	}

	public ArrayList<String> getColumnOrigin(){
		ArrayList<String> result = new ArrayList<String>();

		DBFReader reader = null;

		try {
			reader = new DBFReader(new FileInputStream(new File(PathSourceDBF)), StandardCharsets.UTF_8);		

			int numberOfFields = reader.getFieldCount();			

			for (int i = 0; i < numberOfFields; i++) {
				DBFField field = reader.getField(i);
				result.add(field.getName());
			}
		} catch (DBFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			DBFUtils.close(reader);
		}

		return result;
	}
}