package com.innovate.conversormaestro.datasource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFUtils;

import com.innovate.conversormaestro.model.*;
import com.innovate.conversormaestro.datasource.DBFSwitch.*;

public class DBFController {
    private static DBFController dbfController;
    private String PathSourceDBF;
    private ArrayList<Relacion> relaciones;
    private String tablename;
    private String typeTransfer;
    private boolean beEmpty;

    private int actualRow;
    private String actualColumn;
    private int nErrors;

    private static AgentesDBFSwitch agentesSwitch;
    private static AlmacenesDBFSwitch almacenesSwitch;
    private static ArticulosDBFSwitch articulosSwitch;
    private static AsientosDBFSwitch asientosSwitch;
    private static BancoEmpresaDBFSwitch bancoEmpresaSwitch;
    private static ClientesDBFSwitch clientesSwitch;
    private static ContactosClientesDBFSwitch contactosClientesSwitch;
    private static ContactosProveedoresDBFSwitch contactosProveedoresSwitch;
    private static DatosBancariosClientesDBFSwitch datosBancariosClientesSwitch;
    private static DatosBancariosProveedoresDBFSwitch datosBancariosProveedoresSwitch;
    private static DireccionesClientesDBFSwitch direccionesClientesSwitch;
    private static DireccionesProveedoresDBFSwitch direccionesProveedoresSwitch;
    private static ExistenciasDBFSwitch existenciasSwitch;
    private static FacturasEmitidasDBFSwitch facturasEmitidasSwitch;
    private static FacturasRecibidasDBFSwitch facturasRecibidasSwitch;
    private static FamiliasDBFSwitch familiasSwitch;
    private static FormasPagoDBFSwitch formasPagoSwitch;
    private static MarcasArticuloDBFSwitch marcasArticuloSwitch;
    private static PlanContableDBFSwitch planContableSwitch;
    private static PrevisionesCobroDBFSwitch previsionesCobroSwitch;
    private static PrevisionesPagoDBFSwitch previsionesPagoSwitch;
    private static ProveedoresDBFSwitch proveedoresSwitch;
    private static SubFamiliasDBFSwitch subFamiliasSwitch;

    public DBFController() {
    }

    public static DBFController getDBFController() {
        if (dbfController == null) {
            dbfController = new DBFController();
        }

        return dbfController;
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

    public String getPathSourceDBF() {
        return PathSourceDBF;
    }

    public void setPathSourceDBF(String pathSourceDBF) {
        PathSourceDBF = pathSourceDBF;
    }

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

    public int getActualRow() {
        return actualRow;
    }

    public void setActualRow(int actualRow) {
        this.actualRow = actualRow;
    }

    public String getActualColumn() {
        return actualColumn;
    }

    public void setActualColumn(String actualColumn) {
        this.actualColumn = actualColumn;
    }

    public int getnErrors() {
        return nErrors;
    }

    public void setnErrors(int nErrors) {
        this.nErrors = nErrors;
    }

    public ArrayList<String> getColumnOrigin() {
        ArrayList<String> result = new ArrayList<String>();

        DBFReader reader = null;

        try {
            reader = new DBFReader(new FileInputStream(new File(PathSourceDBF)), StandardCharsets.UTF_8);

            int numberOfFields = reader.getFieldCount();

            for (int i = 0; i < numberOfFields; i++) {
                DBFField field = reader.getField(i);
                result.add(field.getName());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file was not found " + fileNotFoundException);
        } catch (DBFException e) {
            System.out.println("Error reading the file " + e);
        } finally {
            try {
                DBFUtils.close(reader);
            } catch (DBFException e) {
                System.out.println("Error closing the file " + e);
            }

        }
        return result;
    }

    public void tableDBFDestination(String tablename) {
        switch (tablename) {
            case "Agentes":
                agentesSwitch = new AgentesDBFSwitch();
                agentesSwitch.Agentes(this.relaciones);
                break;
            case "Almacenes":
                almacenesSwitch = new AlmacenesDBFSwitch();
                almacenesSwitch.Almacenes(this.relaciones);
                break;
            case "Articulos":
                articulosSwitch = new ArticulosDBFSwitch();
                articulosSwitch.Articulos(this.relaciones);
                break;
            case "Asientos":
                asientosSwitch = new AsientosDBFSwitch();
                asientosSwitch.Asientos(this.relaciones);
                break;
            case "Bancos de la empresa":
                bancoEmpresaSwitch = new BancoEmpresaDBFSwitch();
                bancoEmpresaSwitch.Bancos(this.relaciones);
                break;
            case "Clientes":
                clientesSwitch = new ClientesDBFSwitch();
                clientesSwitch.Clientes(this.relaciones);
                break;
            case "Contactos de clientes":
                contactosClientesSwitch = new ContactosClientesDBFSwitch();
                contactosClientesSwitch.Contactos(this.relaciones);
                break;
            case "Contactos de proveedores":
                contactosProveedoresSwitch = new ContactosProveedoresDBFSwitch();
                contactosProveedoresSwitch.Contactos(this.relaciones);
                break;
            case "Datos bancarios clientes":
                datosBancariosClientesSwitch = new DatosBancariosClientesDBFSwitch();
                datosBancariosClientesSwitch.DatosBancarios(this.relaciones);
                break;
            case "Datos bancarios proveedores":
                datosBancariosProveedoresSwitch = new DatosBancariosProveedoresDBFSwitch();
                datosBancariosProveedoresSwitch.DatosBancarios(this.relaciones);
                break;
            case "Direcciones de clientes":
                direccionesClientesSwitch = new DireccionesClientesDBFSwitch();
                direccionesClientesSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Direcciones de proveedores":
                direccionesProveedoresSwitch = new DireccionesProveedoresDBFSwitch();
                direccionesProveedoresSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Existencias":
                existenciasSwitch = new ExistenciasDBFSwitch();
                existenciasSwitch.Existencias(this.relaciones);
                break;
            case "Facturas emitidas":
                facturasEmitidasSwitch = new FacturasEmitidasDBFSwitch();
                facturasEmitidasSwitch.FacturasEmitidas(this.relaciones);
                break;
            case "Facturas recibidas":
                facturasRecibidasSwitch = new FacturasRecibidasDBFSwitch();
                facturasRecibidasSwitch.FacturasRecibidas(this.relaciones);
                break;
            case "Familias":
                familiasSwitch = new FamiliasDBFSwitch();
                familiasSwitch.Familias(this.relaciones);
                break;
            case "Formas de pago":
                formasPagoSwitch = new FormasPagoDBFSwitch();
                formasPagoSwitch.FormasPago(this.relaciones);
                break;
            case "Marcas articulo":
                marcasArticuloSwitch = new MarcasArticuloDBFSwitch();
                marcasArticuloSwitch.MarcasArticulos(this.relaciones);
                break;
            case "Plan contable":
                planContableSwitch = new PlanContableDBFSwitch();
                planContableSwitch.PlanesContables(this.relaciones);
                break;
            case "Previsiones de cobro":
                previsionesCobroSwitch = new PrevisionesCobroDBFSwitch();
                System.out.println("Previsiones de cobro");
                previsionesCobroSwitch.PrevisionesCobro(this.relaciones);
                break;
            case "Previsiones de pago":
                previsionesPagoSwitch = new PrevisionesPagoDBFSwitch();
                previsionesPagoSwitch.PrevisionesPago(this.relaciones);
                break;
            case "Proveedores":
                proveedoresSwitch = new ProveedoresDBFSwitch();
                proveedoresSwitch.Proveedores(this.relaciones);
                break;
            case "Subfamilias":
                subFamiliasSwitch = new SubFamiliasDBFSwitch();
                subFamiliasSwitch.Subfamilias(this.relaciones);
                break;
        }
    }
}