package com.innovate.conversormaestro.datasource;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import com.innovate.conversormaestro.model.*;
import com.innovate.conversormaestro.datasource.ExcelSwitch.*;

public class ExcelController {
    private static ExcelController excelController;
    private String PathSourceExcel;
    private ConnectionController connectionController;
    private ArrayList<Relacion> relaciones;

    private static AgentesSwitch agentesSwitch = new AgentesSwitch();
    private static AlmacenesSwitch almacenesSwitch = new AlmacenesSwitch();
    private static ArticulosSwitch articulosSwitch = new ArticulosSwitch();
    private static AsientosSwitch asientosSwitch = new AsientosSwitch();
    private static BancoEmpresaSwitch bancoEmpresaSwitch = new BancoEmpresaSwitch();
    private static ClientesSwitch clientesSwitch = new ClientesSwitch();
    private static ContactosClientesSwitch contactosClientesSwitch = new ContactosClientesSwitch();
    private static ContactosProveedoresSwitch contactosProveedoresSwitch = new ContactosProveedoresSwitch();
    private static DatosBancariosClientesSwitch datosBancariosClientesSwitch = new DatosBancariosClientesSwitch();
    private static DatosBancariosProveedoresSwitch datosBancariosProveedoresSwitch = new DatosBancariosProveedoresSwitch();
    private static DireccionesClientesSwitch direccionesClientesSwitch = new DireccionesClientesSwitch();
    private static DireccionesProveedoresSwitch direccionesProveedoresSwitch = new DireccionesProveedoresSwitch();
    private static ExistenciasSwitch existenciasSwitch = new ExistenciasSwitch();
    private static FacturasEmitidasSwitch facturasEmitidasSwitch = new FacturasEmitidasSwitch();
    private static FacturasRecibidasSwitch facturasRecibidasSwitch = new FacturasRecibidasSwitch();
    private static FamiliasSwitch familiasSwitch = new FamiliasSwitch();
    private static FormasPagoSwitch formasPagoSwitch = new FormasPagoSwitch();
    private static MarcasArticuloSwitch marcasArticuloSwitch = new MarcasArticuloSwitch();
    private static PlanContableSwitch planContableSwitch = new PlanContableSwitch();
    private static PrevisionesCobroSwitch previsionesCobroSwitch = new PrevisionesCobroSwitch();
    private static PrevisionesPagoSwitch previsionesPagoSwitch = new PrevisionesPagoSwitch();
    private static ProveedoresSwitch proveedoresSwitch = new ProveedoresSwitch();
    private static SubFamiliasSwitch subFamiliasSwitch = new SubFamiliasSwitch();

    private ExcelController() {
        connectionController = ConnectionController.getConectionController();
        PathSourceExcel = connectionController.getPathSourceExcel();
    }

    public static ExcelController getExcelController() {
        if (excelController == null) {
            excelController = new ExcelController();
        }

        return excelController;
    }

    public void setRelaciones(ArrayList<Relacion> relaciones) {
        this.relaciones = relaciones;
    }

    public void readExcelFile() {

        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);

            /*
             * for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
             * System.out.println(hssfRowCabecera.getCell(c).getStringCellValue());
             * }
             */

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
    }

    public String getPathSourceExcel() {
        return PathSourceExcel;
    }

    public ArrayList<String> getColumnOrigin() {
        ArrayList<String> result = new ArrayList<String>();

        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);

            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                /* System.out.println(hssfRowCabecera.getCell(c).getStringCellValue()); */
                result.add(hssfRowCabecera.getCell(c).getStringCellValue());
            }

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

    public void tableExcelDestination(String tablename) {
        switch (tablename) {
            case "Agentes":
                agentesSwitch.Agentes(relaciones);
                break;
            case "Almacenes":
                almacenesSwitch.Almacenes(relaciones);
                break;
            case "Articulos":
                articulosSwitch.Articulos(relaciones);;
                break;
            case "Asientos":
                asientosSwitch.Asientos(relaciones);
                break;
            case "Bancos de la empresa":
                bancoEmpresaSwitch.Bancos(relaciones);
                break;
            case "Clientes":
                clientesSwitch.Clientes(relaciones);
                break;
            case "Contactos de clientes":
                contactosClientesSwitch.Contactos(relaciones);
                break;
            case "Contactos de proveedores":
                contactosProveedoresSwitch.Contactos(relaciones);
                break;
            case "Datos bancarios clientes":
                datosBancariosClientesSwitch.DatosBancarios(relaciones);
                break;
            case "Datos bancarios proveedores":
                datosBancariosProveedoresSwitch.DatosBancarios(relaciones);
                break;
            case "Direcciones de clientes":
                direccionesClientesSwitch.DireccionesSwitch(relaciones);
                break;
            case "Direcciones de proveedores":
                direccionesProveedoresSwitch.DireccionesSwitch(relaciones);
                break;
            case "Existencias":
                existenciasSwitch.Existencias(relaciones);
                break;
            case "Facturas emitidas":
                facturasEmitidasSwitch.FacturasEmitidas(relaciones);
                break;
            case "Facturas recibidas":
                facturasRecibidasSwitch.FacturasRecibidas(relaciones);
                break;
            case "Familias":
                familiasSwitch.Familias(relaciones);
                break;
            case "Formas de pago":
                formasPagoSwitch.FormasPago(relaciones);
                break;
            case "Marcas articulo":
                marcasArticuloSwitch.MarcasArticulos(relaciones);
                break;
            case "Plan contable":
                planContableSwitch.PlanesContables(relaciones);
                break;
            case "Previsiones de cobro":
                previsionesCobroSwitch.PrevisionesCobro(relaciones);
                break;
            case "Previsiones de pago":
                previsionesPagoSwitch.PrevisionesPago(relaciones);
                break;
            case "Proveedores":
                proveedoresSwitch.Proveedores(relaciones);
                break;
            case "Subfamilias":
                subFamiliasSwitch.Subfamilias(relaciones);
                break;
        }
    }
}