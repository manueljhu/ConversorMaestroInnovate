package com.innovate.conversormaestro.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import com.innovate.conversormaestro.model.*;
import com.innovate.conversormaestro.datasource.SQLSwitch.*;
public class SQLController {

    private static SQLController sqlController;
    private ConnectionController connectionController;
    private ArrayList<Relacion> relaciones;
    private String tablename;
    private String tablenameOrigin;
	private String typeTransfer;
	private boolean beEmpty;

    private static AgentesSQLSwitch agentesSwitch;
    private static AlmacenesSQLSwitch almacenesSwitch;
    private static ArticulosSQLSwitch articulosSwitch;
    private static AsientosSQLSwitch asientosSwitch;
    private static BancoEmpresaSQLSwitch bancoEmpresaSwitch;
    private static ClientesSQLSwitch clientesSwitch;
    private static ContactosClientesSQLSwitch contactosClientesSwitch;
    private static ContactosProveedoresSQLSwitch contactosProveedoresSwitch;
    private static DatosBancariosClientesSQLSwitch datosBancariosClientesSwitch;
    private static DatosBancariosProveedoresSQLSwitch datosBancariosProveedoresSwitch;
    private static DireccionesClientesSQLSwitch direccionesClientesSwitch;
    private static DireccionesProveedoresSQLSwitch direccionesProveedoresSwitch;
    private static ExistenciasSQLSwitch existenciasSwitch;
    private static FacturasEmitidasSQLSwitch facturasEmitidasSwitch;
    private static FacturasRecibidasSQLSwitch facturasRecibidasSwitch;
    private static FamiliasSQLSwitch familiasSwitch;
    private static FormasPagoSQLSwitch formasPagoSwitch;
    private static MarcasArticuloSQLSwitch marcasArticuloSwitch;
    private static PlanContableSQLSwitch planContableSwitch;
    private static PrevisionesCobroSQLSwitch previsionesCobroSwitch;
    private static PrevisionesPagoSQLSwitch previsionesPagoSwitch;
    private static ProveedoresSQLSwitch proveedoresSwitch;
    private static SubFamiliasSQLSwitch subFamiliasSwitch;

    public SQLController() {
        connectionController = ConnectionController.getConectionController();
    }

    public static SQLController getSQLController() {
        if (sqlController == null) {
            sqlController = new SQLController();
        }
        return sqlController;
    }

    public ArrayList<Relacion> getRelaciones() {
		return relaciones;
	}

	public void setRelaciones(ArrayList<Relacion> relaciones) {
		this.relaciones = relaciones;
	}

    public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

    public String getTablenameOrigin() {
        return tablenameOrigin;
    }

    public void setTablenameOrigin(String tablenameOrigin) {
        this.tablenameOrigin = tablenameOrigin;
    }

    Connection connectionOrigin = null;

    public String getTypeTransfer() {
		return typeTransfer;
	}

	public void setTypeTransfer(String typeTransfer) {
		this.typeTransfer = typeTransfer;
	}

	public boolean isBeEmpty() {
		return beEmpty;
	}

	public void setBeEmpty(boolean beEmpty) {
		this.beEmpty = beEmpty;
	}


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

    @SuppressWarnings("exports")
    public Connection getConnectionOrigin() {
        return connectionOrigin;
    }

    @SuppressWarnings("exports")
    public void setConnectionOrigin(Connection connectionOrigin) {
        this.connectionOrigin = connectionOrigin;
    }

    public void tableSQLDestination(String tablename) {
        switch (tablename) {
            case "Agentes":
                agentesSwitch = new AgentesSQLSwitch();
                agentesSwitch.Agentes(this.relaciones);
                break;
            case "Almacenes":
                almacenesSwitch = new AlmacenesSQLSwitch();
                almacenesSwitch.Almacenes(this.relaciones);
                break;
            case "Articulos":
                articulosSwitch = new ArticulosSQLSwitch();
                articulosSwitch.Articulos(this.relaciones);
                break;
            case "Asientos":
                asientosSwitch = new AsientosSQLSwitch();
                asientosSwitch.Asientos(this.relaciones);
                break;
            case "Bancos de la empresa":
                bancoEmpresaSwitch = new BancoEmpresaSQLSwitch();
                bancoEmpresaSwitch.Bancos(this.relaciones);
                break;
            case "Clientes":
                clientesSwitch = new ClientesSQLSwitch();
                clientesSwitch.Clientes(this.relaciones);
                break;
            case "Contactos de clientes":
                contactosClientesSwitch = new ContactosClientesSQLSwitch();
                contactosClientesSwitch.Contactos(this.relaciones);
                break;
            case "Contactos de proveedores":
                contactosProveedoresSwitch = new ContactosProveedoresSQLSwitch();
                contactosProveedoresSwitch.Contactos(this.relaciones);
                break;
            case "Datos bancarios clientes":
                datosBancariosClientesSwitch = new DatosBancariosClientesSQLSwitch();
                datosBancariosClientesSwitch.DatosBancarios(this.relaciones);
                break;
            case "Datos bancarios proveedores":
                datosBancariosProveedoresSwitch = new DatosBancariosProveedoresSQLSwitch();
                datosBancariosProveedoresSwitch.DatosBancarios(this.relaciones);
                break;
            case "Direcciones de clientes":
                direccionesClientesSwitch = new DireccionesClientesSQLSwitch();
                direccionesClientesSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Direcciones de proveedores":
                direccionesProveedoresSwitch = new DireccionesProveedoresSQLSwitch();
                direccionesProveedoresSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Existencias":
                existenciasSwitch = new ExistenciasSQLSwitch();
                existenciasSwitch.Existencias(this.relaciones);
                break;
            case "Facturas emitidas":
                facturasEmitidasSwitch = new FacturasEmitidasSQLSwitch();
                facturasEmitidasSwitch.FacturasEmitidas(this.relaciones);
                break;
            case "Facturas recibidas":
                facturasRecibidasSwitch = new FacturasRecibidasSQLSwitch();
                facturasRecibidasSwitch.FacturasRecibidas(this.relaciones);
                break;
            case "Familias":
                familiasSwitch = new FamiliasSQLSwitch();
                familiasSwitch.Familias(this.relaciones);
                break;
            case "Formas de pago":
                formasPagoSwitch = new FormasPagoSQLSwitch();
                formasPagoSwitch.FormasPago(this.relaciones);
                break;
            case "Marcas articulo":
                marcasArticuloSwitch = new MarcasArticuloSQLSwitch();
                marcasArticuloSwitch.MarcasArticulos(this.relaciones);
                break;
            case "Plan contable":
                planContableSwitch = new PlanContableSQLSwitch();
                planContableSwitch.PlanesContables(this.relaciones);
                break;
            case "Previsiones de cobro":
                previsionesCobroSwitch = new PrevisionesCobroSQLSwitch();
                System.out.println("Previsiones de cobro");
                previsionesCobroSwitch.PrevisionesCobro(this.relaciones);
                break;
            case "Previsiones de pago":
                previsionesPagoSwitch = new PrevisionesPagoSQLSwitch();
                previsionesPagoSwitch.PrevisionesPago(this.relaciones);
                break;
            case "Proveedores":
                proveedoresSwitch = new ProveedoresSQLSwitch();
                proveedoresSwitch.Proveedores(this.relaciones);
                break;
            case "Subfamilias":
                subFamiliasSwitch = new SubFamiliasSQLSwitch();
                subFamiliasSwitch.Subfamilias(this.relaciones);
                break;
        }
    }
}
