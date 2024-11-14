package com.innovate.conversormaestro.datasource;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;

import com.innovate.conversormaestro.model.*;
import com.innovate.conversormaestro.datasource.ExcelSwitch.*;

public class ExcelController {
    private static ExcelController excelController;
    private String PathSourceExcel;
    private ConnectionController connectionController;
    private ArrayList<Relacion> relaciones;
    private String tablename;
    private String typeTransfer;
    private boolean beEmpty;

    private static AgentesExcelSwitch agentesSwitch;
    private static AlmacenesExcelSwitch almacenesSwitch;
    private static ArticulosExcelSwitch articulosSwitch;
    private static AsientosExcelSwitch asientosSwitch;
    private static BancoEmpresaExcelSwitch bancoEmpresaSwitch;
    private static ClientesExcelSwitch clientesSwitch;
    private static ContactosClientesExcelSwitch contactosClientesSwitch;
    private static ContactosProveedoresExcelSwitch contactosProveedoresSwitch;
    private static DatosBancariosClientesExcelSwitch datosBancariosClientesSwitch;
    private static DatosBancariosProveedoresExcelSwitch datosBancariosProveedoresSwitch;
    private static DireccionesClientesExcelSwitch direccionesClientesSwitch;
    private static DireccionesProveedoresExcelSwitch direccionesProveedoresSwitch;
    private static ExistenciasExcelSwitch existenciasSwitch;
    private static FacturasEmitidasExcelSwitch facturasEmitidasSwitch;
    private static FacturasRecibidasExcelSwitch facturasRecibidasSwitch;
    private static FamiliasExcelSwitch familiasSwitch;
    private static FormasPagoExcelSwitch formasPagoSwitch;
    private static MarcasArticuloExcelSwitch marcasArticuloSwitch;
    private static PlanContableExcelSwitch planContableSwitch;
    private static PrevisionesCobroExcelSwitch previsionesCobroSwitch;
    private static PrevisionesPagoExcelSwitch previsionesPagoSwitch;
    private static ProveedoresExcelSwitch proveedoresSwitch;
    private static SubFamiliasExcelSwitch subFamiliasSwitch;

    private ArrayList<T> lista = new ArrayList<T>();

    public ExcelController() {
        connectionController = ConnectionController.getConectionController();
    }

    public static ExcelController getExcelController() {
        if (excelController == null) {
            excelController = new ExcelController();
        }

        return excelController;
    }

    public ArrayList<Relacion> getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(ArrayList<Relacion> relaciones) {
        this.relaciones = relaciones;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getPathSourceExcel() {
        return PathSourceExcel;
    }

    public void setPathSourceExcel(String pathSourceExcel) {
        PathSourceExcel = pathSourceExcel;
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

    public ArrayList<String> getColumnOrigin() {
        ArrayList<String> result = new ArrayList<String>();

        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            hssfRowCabecera = hssfSheet.getRow(0);

            if (hssfRowCabecera == null) {
                System.out.println("No se encontró la cabecera de la hoja de cálculo");
            } else {
                for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                    /* System.out.println(hssfRowCabecera.getCell(c).getStringCellValue()); */
                    result.add(hssfRowCabecera.getCell(c).getStringCellValue());
                }
            }
            hssfWorkbook.close();

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println(
                        "Error in file processing after close it (Error al procesar el fichero después de cerrarlo): "
                                + ex);
            }
        }
        return result;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public void tableExcelDestination(String tablename) {
        switch (tablename) {
            case "Agentes":
                agentesSwitch = new AgentesExcelSwitch();
                agentesSwitch.Agentes(this.relaciones);
                break;
            case "Almacenes":
                almacenesSwitch = new AlmacenesExcelSwitch();
                almacenesSwitch.Almacenes(this.relaciones);
                break;
            case "Articulos":
                articulosSwitch = new ArticulosExcelSwitch();
                articulosSwitch.Articulos(this.relaciones);
                break;
            case "Asientos":
                asientosSwitch = new AsientosExcelSwitch();
                asientosSwitch.Asientos(this.relaciones);
                break;
            case "Bancos de la empresa":
                bancoEmpresaSwitch = new BancoEmpresaExcelSwitch();
                bancoEmpresaSwitch.Bancos(this.relaciones);
                break;
            case "Clientes":
                clientesSwitch = new ClientesExcelSwitch();
                clientesSwitch.Clientes(this.relaciones);
                break;
            case "Contactos de clientes":
                contactosClientesSwitch = new ContactosClientesExcelSwitch();
                contactosClientesSwitch.Contactos(this.relaciones);
                break;
            case "Contactos de proveedores":
                contactosProveedoresSwitch = new ContactosProveedoresExcelSwitch();
                contactosProveedoresSwitch.Contactos(this.relaciones);
                break;
            case "Datos bancarios clientes":
                datosBancariosClientesSwitch = new DatosBancariosClientesExcelSwitch();
                datosBancariosClientesSwitch.DatosBancarios(this.relaciones);
                break;
            case "Datos bancarios proveedores":
                datosBancariosProveedoresSwitch = new DatosBancariosProveedoresExcelSwitch();
                datosBancariosProveedoresSwitch.DatosBancarios(this.relaciones);
                break;
            case "Direcciones de clientes":
                direccionesClientesSwitch = new DireccionesClientesExcelSwitch();
                direccionesClientesSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Direcciones de proveedores":
                direccionesProveedoresSwitch = new DireccionesProveedoresExcelSwitch();
                direccionesProveedoresSwitch.DireccionesSwitch(this.relaciones);
                break;
            case "Existencias":
                existenciasSwitch = new ExistenciasExcelSwitch();
                existenciasSwitch.Existencias(this.relaciones);
                break;
            case "Facturas emitidas":
                facturasEmitidasSwitch = new FacturasEmitidasExcelSwitch();
                facturasEmitidasSwitch.FacturasEmitidas(this.relaciones);
                break;
            case "Facturas recibidas":
                facturasRecibidasSwitch = new FacturasRecibidasExcelSwitch();
                facturasRecibidasSwitch.FacturasRecibidas(this.relaciones);
                break;
            case "Familias":
                familiasSwitch = new FamiliasExcelSwitch();
                familiasSwitch.Familias(this.relaciones);
                break;
            case "Formas de pago":
                formasPagoSwitch = new FormasPagoExcelSwitch();
                formasPagoSwitch.FormasPago(this.relaciones);
                break;
            case "Marcas articulo":
                marcasArticuloSwitch = new MarcasArticuloExcelSwitch();
                marcasArticuloSwitch.MarcasArticulos(this.relaciones);
                break;
            case "Plan contable":
                planContableSwitch = new PlanContableExcelSwitch();
                planContableSwitch.PlanesContables(this.relaciones);
                break;
            case "Previsiones de cobro":
                previsionesCobroSwitch = new PrevisionesCobroExcelSwitch();
                System.out.println("Previsiones de cobro");
                previsionesCobroSwitch.PrevisionesCobro(this.relaciones);
                break;
            case "Previsiones de pago":
                previsionesPagoSwitch = new PrevisionesPagoExcelSwitch();
                previsionesPagoSwitch.PrevisionesPago(this.relaciones);
                break;
            case "Proveedores":
                proveedoresSwitch = new ProveedoresExcelSwitch();
                proveedoresSwitch.Proveedores(this.relaciones);
                break;
            case "Subfamilias":
                subFamiliasSwitch = new SubFamiliasExcelSwitch();
                subFamiliasSwitch.Subfamilias(this.relaciones);
                break;
        }
    }
}