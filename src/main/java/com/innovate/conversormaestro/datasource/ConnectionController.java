package com.innovate.conversormaestro.datasource;

import java.sql.Statement;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.innovate.conversormaestro.model.Tables;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ConnectionController {
    private FormatUtils formatUtils = new FormatUtils();
    private static ConnectionController instance = null;
    private Connection connectionDestination = null;
    private Connection connectionGP = null;
    private String SourceTab;

    // Conection to the destination database
    private String ServerDestination;
    private String UserDestination;
    private String PasswordDestination;
    private String EnterpriseDestination;
    private String ExerciseDestination;
    private String AccountDigitsDestination;
    private String GroupDigitsDestination;
    private String WarehouseDestination;

    // SQL conection to the source database
    private String ServerSource;
    private String UserSource;
    private String PasswordSource;
    private String DataBaseSource;
    private String OptionSource;

    // DBF conection to the source database
    private String PathSourceDBF;

    // Excel conection to the source database
    private String PathSourceExcel;

    ArrayList<Tables> tables;

    private ConnectionController() {
        tables = new ArrayList<Tables>();
        Tables table = new Tables();
        table = new Tables("AGENTG", "Agentes");
        tables.add(table);
        table = new Tables("ALMACE", "Almacenes");
        tables.add(table);
        table = new Tables("ARTICU", "Articulos");
        tables.add(table);
        table = new Tables("APUNXX", "Asientos");
        tables.add(table);
        table = new Tables("BANCOS", "Bancos de la empresa");
        tables.add(table);
        table = new Tables("CLIENT", "Clientes");
        tables.add(table);
        table = new Tables("CONTAC", "Contactos de clientes");
        tables.add(table);
        table = new Tables("CONTAC", "Contactos de proveedores");
        tables.add(table);
        table = new Tables("DATBAN", "Datos bancarios clientes");
        tables.add(table);
        table = new Tables("DATBAN", "Datos bancarios proveedores");
        tables.add(table);
        table = new Tables("DIRECC", "Direcciones de clientes");
        tables.add(table);
        table = new Tables("DIRECC", "Direcciones de proveedores");
        tables.add(table);
        table = new Tables("ALMAXX", "Existencias");
        tables.add(table);
        table = new Tables("FACEMI", "Facturas emitidas");
        tables.add(table);
        table = new Tables("FACREC", "Facturas recibidas");
        tables.add(table);
        table = new Tables("FAMILI", "Familias");
        tables.add(table);
        table = new Tables("FORPAG", "Formas de pago");
        tables.add(table);
        table = new Tables("MARART", "Marcas articulo");
        tables.add(table);
        table = new Tables("CUENTA", "Plan contable");
        tables.add(table);
        table = new Tables("EFECTO", "Previsiones de cobro");
        tables.add(table);
        table = new Tables("EFECTO", "Previsiones de pago");
        tables.add(table);
        table = new Tables("PROVEE", "Proveedores");
        tables.add(table);
        table = new Tables("SUBFAM", "Subfamilias");
        tables.add(table);

    }

    public static ConnectionController getConectionController() {
        if (instance == null) {
            instance = new ConnectionController();
        }
        return instance;
    }

    public boolean testConnectionDestination(String Server, String User, String Password, String Enterprise,
            String Exercise, String AccountDigits, String GroupDigits, String WarehouseDestination) {
        boolean result = false;
        String Servercon = Server;
        String[] ServerElements;
        Servercon = Servercon.replace("\\", "%");
        ServerElements = Servercon.split("%");
        String ServerIP = ServerElements[0];
        String ServerInstance = ServerElements[1];

        String URLConection = "jdbc:jtds:sqlserver://" + ServerIP + ";instance=" + ServerInstance
                + ";DatabaseName=GPBusiness" + Enterprise;
        System.out.println(URLConection);
        System.out.println(Password);
        result = testConnectionFinal(URLConection, User, Password);

        return result;
    }

    public boolean testConnectionOrigin(String Server, String User, String Password, String Databasename) {
        boolean result = false;

        String Servercon = Server;
        String[] ServerElements;
        Servercon = Servercon.replace("\\", "%");
        ServerElements = Servercon.split("%");
        String ServerIP = ServerElements[0];
        String ServerInstance = ServerElements[1];

        String URLConection = "jdbc:jtds:sqlserver://" + ServerIP + ";instance=" + ServerInstance + ";DatabaseName="
                + Databasename;

        result = testConnectionFinal(URLConection, User, Password);

        return result;
    }

    private boolean testConnectionFinal(String URLConection, String User, String Password) {
        Connection con = null;
        boolean result = false;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection(URLConection, User, Password);
            System.out.println(con);
            result = true;
        } catch (Exception e) {
            result = false;
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    public void saveCredentialsDestination(String ServerD, String UserD, String PasswordD, String EnterpriseD,
            String ExerciseD,
            String AccountDigitsD, String GroupDigitsD, String WarehouseDestinationD) {
        ServerDestination = ServerD;
        UserDestination = UserD;
        PasswordDestination = PasswordD;
        EnterpriseDestination = EnterpriseD;
        ExerciseDestination = ExerciseD;
        AccountDigitsDestination = AccountDigitsD;
        GroupDigitsDestination = GroupDigitsD;
        WarehouseDestination = WarehouseDestinationD;

        setApunTable();
        setAlmaTable();
        System.out.println();

        System.out.println("----------------------------------------");
        System.out.println("BBDD Destino \nServer: " + ServerDestination + "\nUser: " + UserDestination + "\nPassword: "
                + PasswordDestination + "\nEnterprise: " + EnterpriseDestination + "\nExercise: " + ExerciseDestination
                + "\nAccountDigits: " + AccountDigitsDestination + "\nGroupDigits: " + GroupDigitsDestination
                + "\nWarehouseDestination: " + WarehouseDestination);
    }

    public void saveCredentialsOriginSQL(String ServerO, String UserO, String PasswordO, String DatabaseO,
            String OptionO) {
        ServerSource = ServerO;
        UserSource = UserO;
        PasswordSource = PasswordO;
        DataBaseSource = DatabaseO;
        OptionSource = OptionO;
        SourceTab = "SQL";

        System.out.println("----------------------------------------");
        System.out.println("BBDD Origen \nServer: " + ServerSource + "\nUser: " + UserSource + "\nPassword: "
                + PasswordSource + "\nDatabase: " + DataBaseSource + "\nOption: " + OptionSource);
        // SQLController
    }

    public void saveCredentialsOriginDBF(String PathO) {
        PathSourceDBF = PathO;
        SourceTab = "DBF";

        System.out.println("----------------------------------------");
        System.out.println("DBF Origen: \nPath " + PathSourceDBF);
    }

    public void saveCredentialsOriginExcel(String PathO) {
        PathSourceExcel = PathO;
        SourceTab = "Excel";

        System.out.println("----------------------------------------");
        System.out.println("Excel Origen: \nPath " + PathSourceExcel);
    }

    public ArrayList<String> getDataComboDestination() {

        ArrayList<String> result = new ArrayList<String>();

        for (Tables table : tables) {
            result.add(table.getDescription());
        }

        return result;
    }

    public void setApunTable() {
        tables.get(3).setName("APUN" + ExerciseDestination.substring(ExerciseDestination.length() - 2));
    }

    public void setAlmaTable() {
        tables.get(12).setName("ALMA" + WarehouseDestination);
    }

    // Method to start the connection to the destination database
    public void startConnectionDestination() {
        String Servercon = getServerDestination();
        String[] ServerElements;
        Servercon = Servercon.replace("\\", "%");
        ServerElements = Servercon.split("%");
        String ServerIP = ServerElements[0];
        String ServerInstance = ServerElements[1];

        String URLConection = "jdbc:jtds:sqlserver://" + ServerIP + ";instance=" + ServerInstance
                + ";DatabaseName=GPBusiness" + getEnterpriseDestination();
        
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionDestination = DriverManager.getConnection(URLConection, getUserDestination(),
                    getPasswordDestination());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<String> getColumnDestination(String description) {
        String tablename = tables.get(getTableIndex(description)).getName();
        ArrayList<String> result = new ArrayList<String>();
        String query = "SELECT COLUMN_NAME AS name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='" + tablename
                + "' AND COLUMN_NAME <> 'id'";
        java.sql.Statement st;
        try {

            if (tablename.equals("FORPAG")) {
                startConnectionGP();
                st = connectionGP.createStatement();
            } else {
                startConnectionDestination();
                st = connectionDestination.createStatement();
            }

            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                result.add(rs.getString("name"));
            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
        if (tablename.equals("FORPAG")) {
            closeConnectionGP();
        } else {
            closeConnectionDestination();
        }

        return result;
    }

    public void startConnectionGP() {
        String Servercon = getServerDestination();
        String[] ServerElements;
        Servercon = Servercon.replace("\\", "%");
        ServerElements = Servercon.split("%");
        String ServerIP = ServerElements[0];
        String ServerInstance = ServerElements[1];

        String URLConection = "jdbc:jtds:sqlserver://" + ServerIP + ";instance=" + ServerInstance
                + ";DatabaseName=GPBusiness00";

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionGP = DriverManager.getConnection(URLConection, getUserDestination(), getPasswordDestination());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private int getTableIndex(String description) {
        int index = 0;
        for (Tables table : tables) {
            if (table.getDescription().equals(description)) {
                index = tables.indexOf(table);
            }
        }
        return index;
    }

    public void closeConnectionDestination() {
        try {
            connectionDestination.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void closeConnectionGP() {
        try {
            connectionGP.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ResultSet getDataQuery(String query){
        ResultSet rs = null;
        Statement st = null;
        
        try {
            startConnectionDestination();
            st = connectionDestination.createStatement();
            rs = st.executeQuery(query);

            System.out.println("Sale del getDataQuery");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        closeConnectionDestination();
        return rs;
    }

    public static ConnectionController getInstance() {
        return instance;
    }

    public static void setInstance(ConnectionController instance) {
        ConnectionController.instance = instance;
    }

    public String getServerDestination() {
        return ServerDestination;
    }

    public void setServerDestination(String serverDestination) {
        ServerDestination = serverDestination;
    }

    public String getUserDestination() {
        return UserDestination;
    }

    public void setUserDestination(String userDestination) {
        UserDestination = userDestination;
    }

    public String getPasswordDestination() {
        return PasswordDestination;
    }

    public void setPasswordDestination(String passwordDestination) {
        PasswordDestination = passwordDestination;
    }

    public String getEnterpriseDestination() {
        return EnterpriseDestination;
    }

    public void setEnterpriseDestination(String enterpriseDestination) {
        EnterpriseDestination = enterpriseDestination;
    }

    public String getExerciseDestination() {
        return ExerciseDestination;
    }

    public void setExerciseDestination(String exerciseDestination) {
        ExerciseDestination = exerciseDestination;
    }

    public String getAccountDigitsDestination() {
        return AccountDigitsDestination;
    }

    public void setAccountDigitsDestination(String accountDigitsDestination) {
        AccountDigitsDestination = accountDigitsDestination;
    }

    public String getGroupDigitsDestination() {
        return GroupDigitsDestination;
    }

    public void setGroupDigitsDestination(String groupDigitsDestination) {
        GroupDigitsDestination = groupDigitsDestination;
    }

    public String getWarehouseDestination() {
        return WarehouseDestination;
    }

    public void setWarehouseDestination(String warehouseDestination) {
        WarehouseDestination = warehouseDestination;
    }

    public String getServerSource() {
        return ServerSource;
    }

    public void setServerSource(String serverSource) {
        ServerSource = serverSource;
    }

    public String getUserSource() {
        return UserSource;
    }

    public void setUserSource(String userSource) {
        UserSource = userSource;
    }

    public String getPasswordSource() {
        return PasswordSource;
    }

    public void setPasswordSource(String passwordSource) {
        PasswordSource = passwordSource;
    }

    public String getDataBaseSource() {
        return DataBaseSource;
    }

    public void setDataBaseSource(String dataBaseSource) {
        DataBaseSource = dataBaseSource;
    }

    public String getOptionSource() {
        return OptionSource;
    }

    public void setOptionSource(String optionSource) {
        OptionSource = optionSource;
    }

    public String getPathSourceDBF() {
        return PathSourceDBF;
    }

    public void setPathSourceDBF(String pathSourceDBF) {
        PathSourceDBF = pathSourceDBF;
    }

    public String getPathSourceExcel() {
        return PathSourceExcel;
    }

    public void setPathSourceExcel(String pathSourceExcel) {
        PathSourceExcel = pathSourceExcel;
    }

    public String getSourceTab() {
        return SourceTab;
    }

    public void setSourceTab(String sourceTab) {
        SourceTab = sourceTab;
    }
}