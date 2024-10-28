package com.innovate.conversormaestro.datasource;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

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

    private static ArrayList<FacturaEmitida> facturasEmitidas;
    private static ArrayList<FacturaRecibida> facturasRecibidas;
    private static ArrayList<Familia> familias;
    private static ArrayList<FormaPago> formasPago;
    private static ArrayList<MarcasArticulo> marcasArticulos;
    private static ArrayList<Cuenta> cuentasContables;
    private static ArrayList<Efecto> efectos;
    private static ArrayList<Proveedor> proveedores;
    private static ArrayList<Subfamilia> subfamiliaArticulos;

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
                FacturasRecibidasSwitch();
                break;
            case "Familias":
                FamiliasSwitch();
                break;
            case "Formas de pago":
                FormasPagoSwitch();
                break;
            case "Marcas articulo":
                MarcasArticuloSwitch();
                break;
            case "Plan contable":
                PlanContableSwitch();
                break;
            case "Previsiones de cobro y de pago":
                PrevisionesCobroPagoSwitch();
                break;
            case "Proveedores":
                ProveedoresSwitch();
                break;
            case "Subfamilias":
                SubfamiliasSwitch();
                break;
            default:
                break;
        }
    }

    public void FacturasEmitidasSwitch() {
        System.out.println("En desarrollo");
    }

    public void FacturasRecibidasSwitch() {
        System.out.println("En desarrollo");
    }

    public void FamiliasSwitch() {
        System.out.println("En desarrollo");
    }

    public void FormasPagoSwitch() {
        System.out.println("En desarrollo");
    }

    public void MarcasArticuloSwitch() {
        System.out.println("En desarrollo");
    }

    public void PlanContableSwitch() {
        System.out.println("En desarrollo");
    }

    public void PrevisionesCobroPagoSwitch() {
        System.out.println("En desarrollo");
    }

    public void ProveedoresSwitch() {
        System.out.println("En desarrollo");
    }

    public void SubfamiliasSwitch() {
        System.out.println("En desarrollo");
    }

}