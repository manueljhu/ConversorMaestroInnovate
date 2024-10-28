package com.innovate.conversormaestro.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class SQLController {

    private static SQLController instance = null;

    private SQLController() {
    }

    public static SQLController getSQLController() {
        if (instance == null) {
            instance = new SQLController();
        }
        return instance;
    }

    private ConnectionController connectionController = ConnectionController.getConectionController();

    Connection connectionOrigin = null;


    // Method to start the connection to the source database
    private void startConnectionOrigin() {
        String Servercon = connectionController.getServerSource();
        String[] ServerElements;
        Servercon = Servercon.replace("\\", "%");
        ServerElements = Servercon.split("%");
        String ServerIP = ServerElements[0];
        String ServerInstance = ServerElements[1];

        String URLConection = "jdbc:jtds:sqlserver://" + ServerIP + ";instance=" + ServerInstance + ";DatabaseName="
                + connectionController.getDataBaseSource();

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionOrigin = DriverManager.getConnection(URLConection, connectionController.getUserSource(), connectionController.getPasswordSource());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }    
    }

    public ArrayList<String> getDataComboOrigin(){
        startConnectionOrigin();
        ArrayList<String> result = new ArrayList<String>();
        String query = "";
        if (connectionController.getOptionSource().equals("Tables")){
            query = "SELECT TABLE_NAME AS name FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE' ORDER BY TABLE_NAME";
        } else if (connectionController.getOptionSource().equals("Views")){
            query = "SELECT TABLE_NAME AS name FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='VIEW' ORDER BY TABLE_NAME";
        }
        try {
            java.sql.Statement st = connectionOrigin.createStatement();
            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                result.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        closeConnectionOrigin();
        return result;
    }

    public ArrayList<String> getColumnOrigin(String tablename){
        startConnectionOrigin();
        ArrayList<String> result = new ArrayList<String>();
        String query = "SELECT COLUMN_NAME AS name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='" + tablename + "'";
        try {
            java.sql.Statement st = connectionOrigin.createStatement();
            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                result.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        closeConnectionOrigin();
        return result;
    }

    private void closeConnectionOrigin(){
        try {
            connectionOrigin.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    

    public static SQLController getInstance() {
        return instance;
    }

    public static void setInstance(SQLController instance) {
        SQLController.instance = instance;
    }

    public Connection getConnectionOrigin() {
        return connectionOrigin;
    }

    public void setConnectionOrigin(Connection connectionOrigin) {
        this.connectionOrigin = connectionOrigin;
    }
}
