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

import com.innovate.conversormaestro.model.Agente;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.Articulo;
import com.innovate.conversormaestro.model.Banco;
import com.innovate.conversormaestro.model.Cliente;
import com.innovate.conversormaestro.model.Contacto;
import com.innovate.conversormaestro.model.Cuenta;
import com.innovate.conversormaestro.model.DatoBancario;
import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FacturaEmitida;
import com.innovate.conversormaestro.model.FacturaRecibida;
import com.innovate.conversormaestro.model.Familia;
import com.innovate.conversormaestro.model.FormaPago;
import com.innovate.conversormaestro.model.MarcasArticulo;
import com.innovate.conversormaestro.model.Proveedor;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Stock;
import com.innovate.conversormaestro.model.Subfamilia;
import com.innovate.conversormaestro.model.Tables;

public class ExcelController {
    private static ExcelController excelController;
    private String PathSourceExcel;
    private ConnectionController connectionController;
    private ArrayList<Relacion> relaciones;

    private static ArrayList<Agente> agentes;
    private static ArrayList<Almacen> almacenes;
    private static ArrayList<Articulo> articulos;
    private static ArrayList<DatoBancario> bancoClientes;
    private static ArrayList<DatoBancario> bancoProveedores;
    private static ArrayList<Banco> bancoEmpresa;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Contacto> contactoClientes;
    private static ArrayList<Contacto> contactosProveedores;
    private static ArrayList<Cuenta> cuentasContables;
    private static ArrayList<Direccion> direccionesClientes;
    private static ArrayList<Direccion> direccionesProveedores;
    private static ArrayList<FacturaEmitida> facturasEmitidas;
    private static ArrayList<FacturaRecibida> facturasRecibidas;
    private static ArrayList<Familia> familias;
    private static ArrayList<FormaPago> formasPago;
    private static ArrayList<MarcasArticulo> marcasArticulos;
    private static ArrayList<Efecto> efectos;
    private static ArrayList<Proveedor> proveedores;
    private static ArrayList<Stock> stocks;
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

    public int devuelveNFilasExcel() {
        int result = 0;

        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);

            result = hssfSheet.getLastRowNum();

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

    public String devuelveValorCelda(int fila, String columna) {
        String result = "";
        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;
            HSSFRow hssfRow;
            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);
            hssfRow = hssfSheet.getRow(fila);
            for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                if (hssfRowCabecera.getCell(c).getStringCellValue().equals(columna)) {
                    System.out.println(hssfRowCabecera.getCell(c).getStringCellValue().equals(columna));
                    if (hssfRow.getCell(c) != null) {
                        hssfRow.getCell(c).setCellType(CellType.STRING);
                        System.out.println(hssfRow.getCell(c).getStringCellValue());
                        result = hssfRow.getCell(c).getStringCellValue();
                    }
                }
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error al leer el fichero excel");
        } catch (IOException ex) {
            System.out.println("Error al leer el fichero excel");
        } finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println("Error al leer el fichero excel");
            }
        }
        return result;
    }

    public void tableExcelDestination(String tablename) {
        switch (tablename) {
            case "Agentes":
                AgentesSwitch();
                break;
            case "Almacenes":
                AlmacenesSwitch();
                break;
            case "Articulos":
                ArticulosSwitch();
                break;
            case "Bancos de la empresa":
                BancoEmpresaSwitch();
                break;
            case "Clientes":
                ClientesSwitch();
                break;
            case "Contactos de clientes":
                ContactosClientesSwitch();
                break;
            case "Contactos de proveedores":
                ContactosProveedoresSwitch();
                break;
            case "Datos bancarios clientes":
                DatosBancariosClientesSwitch();
                break;
            case "Datos bancarios proveedores":
                DatosBancariosProveedoresSwitch();
                break;
            case "Direcciones de clientes":
                DireccionesClientesSwitch();
                break;
            case "Direcciones de proveedores":
                DireccionesProveedoresSwitch();
                break;
            case "Existencias":
                ExistenciasSwitch();
                break;
            case "Facturas emitidas":
                FacturasEmitidasSwitch();
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

    public void AgentesSwitch() {
        agentes = new ArrayList<Agente>();

        int nFilas = devuelveNFilasExcel();
        Agente agente;
        int longitud = 0;
        String cod;

        for (int i = 1; i <= nFilas; i++) {
            agente = new Agente();
            for (int j = 0; j < relaciones.size(); j++) {
                /*
                 * System.out.println(relaciones.get(j).getCampoOrigen());
                 * System.out.println(relaciones.get(j).getCampoDestino());
                 */
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        cod = devuelveValorCelda(i, relaciones.get(j).getCampoOrigen());
                        agente.setCod(cod);
                        break;
                    case "nom":
                        agente.setNom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        agente.setDir(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        agente.setPob(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        agente.setNpro(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        agente.setPro(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nif":
                        agente.setNif(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "te1":
                        agente.setTe1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "te2":
                        agente.setTe2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fax":
                        agente.setFax(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mov":
                        agente.setMov(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob1":
                        agente.setOb1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob2":
                        agente.setOb2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob3":
                        agente.setOb3(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        agente.setRut(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tip":
                        agente.setTip(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com":
                        agente.setCom(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co1":
                        agente.setCo1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        agente.setCo2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        agente.setCo3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        agente.setCo4(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        agente.setCo5(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lim":
                        agente.setLim(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pais":
                        agente.setPais(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tia":
                        agente.setTia(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "alt":
                        agente.setAlt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        agente.setFot(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web":
                        agente.setWeb(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xxx":
                        agente.setXxx(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut_crm":
                        agente.setRut_Crm(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vdi_crm":
                        agente.setVdi_Crm(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ldi_crm":
                        agente.setLdi_Crm(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tcu_crm":
                        agente.setTcu_Crm(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cud_crm":
                        agente.setCud_Crm(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "est_crm":
                        agente.setEst_Crm(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v01":
                        agente.setV01(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v02":
                        agente.setV02(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v03":
                        agente.setV03(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v04":
                        agente.setV04(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v05":
                        agente.setV05(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v06":
                        agente.setV06(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v07":
                        agente.setV07(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v08":
                        agente.setV08(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v09":
                        agente.setV09(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v10":
                        agente.setV10(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v11":
                        agente.setV11(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v12":
                        agente.setV12(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "historia":
                        agente.setHistoria(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ori":
                        agente.setLopd_Ori(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_otr_o":
                        agente.setLopd_Otr_O(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ces":
                        agente.setLopd_Ces(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_otr_c":
                        agente.setLopd_Otr_C(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "age_usu":
                        agente.setAge_Usu(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "age_ver_todo":
                        agente.setAge_Ver_Todo(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com_per":
                        agente.setCom_Per(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com_imp":
                        agente.setCom_Imp(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com_inc":
                        agente.setCom_Inc(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com_impinc":
                        agente.setCom_Impinc(
                                Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com_por":
                        agente.setCom_Por(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_acc":
                        agente.setWeb_Acc(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_psw":
                        agente.setWeb_Psw(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_todo":
                        agente.setWeb_Todo(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_crear":
                        agente.setWeb_Crear(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_pago":
                        agente.setWeb_Pago(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_dto":
                        agente.setWeb_Dto(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_edipre":
                        agente.setWeb_Edipre(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_acccob":
                        agente.setWeb_Acccob(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(agente);
            agentes.add(agente);
        }
    }

    public void AlmacenesSwitch() {
        almacenes = new ArrayList<Almacen>();
        int nFilas = devuelveNFilasExcel();
        Almacen almacen;
        int longitud = 0;

        for (int i = 1; i < nFilas; i++) {
            almacen = new Almacen();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "nom":
                        almacen.setNom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ser":
                        almacen.setSer(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "se2":
                        almacen.setSe2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "age":
                        almacen.setAge(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(almacen);
            almacenes.add(almacen);
        }
    }

    public void ArticulosSwitch() {
        articulos = new ArrayList<Articulo>();
        int nFilas = devuelveNFilasExcel();
        Articulo articulo;
        int longitud = 0;

        for (int i = 1; i < nFilas; i++) {
            articulo = new Articulo();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        articulo.setCod(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        articulo.setNom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fam":
                        articulo.setFam(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "obs":
                        articulo.setObs(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "min":
                        articulo.setMin(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "max":
                        articulo.setMax(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med":
                        articulo.setMed(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "uni":
                        articulo.setUni(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cla":
                        articulo.setCla(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "iva":
                        articulo.setIva(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ubi":
                        articulo.setUbi(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rea":
                        articulo.setRea(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rep":
                        articulo.setRep(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cos":
                        articulo.setCos(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pba":
                        articulo.setPba(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        articulo.setDtocom1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtocom2":
                        articulo.setDtocom2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven1":
                        articulo.setDtoven1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven2":
                        articulo.setDtoven2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        articulo.setDt1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        articulo.setDt2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        articulo.setDt3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        articulo.setDt4(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        articulo.setDt5(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co1":
                        articulo.setCo1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        articulo.setCo2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        articulo.setCo3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        articulo.setCo4(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        articulo.setCo5(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pmc":
                        articulo.setPmc(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upc":
                        articulo.setUpc(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufc":
                        articulo.setUfc(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pro":
                        articulo.setPro(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pmv":
                        articulo.setPmv(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upv":
                        articulo.setUpv(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufv":
                        articulo.setUfv(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exi":
                        articulo.setExi(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "vai":
                        articulo.setVai(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ent":
                        articulo.setEnt(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptc":
                        articulo.setPtc(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sal":
                        articulo.setSal(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptv":
                        articulo.setPtv(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        articulo.setMa1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        articulo.setMa2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        articulo.setMa3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        articulo.setMa4(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        articulo.setMa5(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        articulo.setD01(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        articulo.setD02(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        articulo.setD03(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        articulo.setD04(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        articulo.setD05(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cuc":
                        articulo.setCuc(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuv":
                        articulo.setCuv(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "bar":
                        articulo.setBar(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "p21":
                        articulo.setP21(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p22":
                        articulo.setP22(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p23":
                        articulo.setP23(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p24":
                        articulo.setP24(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p25":
                        articulo.setP25(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2":
                        articulo.setIv2(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        articulo.setIma(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "abr":
                        articulo.setAbr(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coi":
                        articulo.setCoi(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di1":
                        articulo.setDi1(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        articulo.setDi2(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sec":
                        articulo.setSec(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tem":
                        articulo.setTem(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ide":
                        articulo.setIde(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tra":
                        articulo.setTra(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coe":
                        articulo.setCoe(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "eim":
                        articulo.setEim(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "gru":
                        articulo.setGru(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pos":
                        articulo.setPos(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        articulo.setFot(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "trazab":
                        articulo.setTrazab(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "medida":
                        articulo.setMedida(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "num_med":
                        articulo.setNum_Med(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_1":
                        articulo.setMed_1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_2":
                        articulo.setMed_2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_3":
                        articulo.setMed_3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bultos":
                        articulo.setBultos(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "paquet":
                        articulo.setPaquet(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impues":
                        articulo.setImpues(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_Imp":
                        articulo.setArt_Imp(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sum_Imp":
                        articulo.setSum_Imp(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac_Can":
                        articulo.setFac_Can(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fac_Imp":
                        articulo.setFac_Imp(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec_Cre":
                        articulo.setFec_Cre(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "obsole":
                        articulo.setObsole(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per_Com":
                        articulo.setPer_Com(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per_Ven":
                        articulo.setPer_Ven(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "peso":
                        articulo.setPeso(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "volumen":
                        articulo.setVolumen(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "men_Sto":
                        articulo.setMen_Sto(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "con_Sto":
                        articulo.setCon_Sto(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "marca1":
                        articulo.setMarca1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "marca2":
                        articulo.setMarca2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ped_Tex":
                        articulo.setPed_Tex(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ped_Cos":
                        articulo.setPed_Cos(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "env":
                        articulo.setEnv(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v01":
                        articulo.setV01(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v02":
                        articulo.setV02(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v03":
                        articulo.setV03(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v04":
                        articulo.setV04(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v05":
                        articulo.setV05(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v06":
                        articulo.setV06(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v07":
                        articulo.setV07(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v08":
                        articulo.setV08(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v09":
                        articulo.setV09(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v10":
                        articulo.setV10(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v11":
                        articulo.setV11(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v12":
                        articulo.setV12(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevcom":
                        articulo.setCtadevcom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevven":
                        articulo.setCtadevven(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadtocom":
                        articulo.setCtadtocom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadtoven":
                        articulo.setCtadtoven(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "meses":
                        articulo.setMeses(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imaweb":
                        articulo.setImaweb(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fabpro":
                        articulo.setFabpro(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fabtip":
                        articulo.setFabtip(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nse":
                        articulo.setNse(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "historia":
                        articulo.setHistoria(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_Minped":
                        articulo.setArt_Minped(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_Subfam":
                        articulo.setArt_Subfam(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_Marca":
                        articulo.setArt_Marca(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Nov":
                        articulo.setWeb_Nov(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Fealno":
                        articulo.setWeb_Fealno(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Des":
                        articulo.setWeb_Des(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coefici":
                        articulo.setCoefici(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Sub":
                        articulo.setWeb_Sub(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Actd":
                        articulo.setWeb_Actd(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Acth":
                        articulo.setWeb_Acth(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "divs1":
                        articulo.setDivs1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "divs2":
                        articulo.setDivs2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Cat1":
                        articulo.setWeb_Cat1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Cat2":
                        articulo.setWeb_Cat2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Cat3":
                        articulo.setWeb_Cat3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ntv":
                        articulo.setNtv(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "agr":
                        articulo.setAgr(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com":
                        articulo.setCom(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hor":
                        articulo.setHor(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "come":
                        articulo.setCome(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tim":
                        articulo.setTim(Integer.parseInt(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dos":
                        articulo.setDos(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_Pro":
                        articulo.setNum_Pro(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_Com":
                        articulo.setNum_Com(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "csi":
                        articulo.setCsi(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "inc_Pre":
                        articulo.setInc_Pre(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "inc_Red":
                        articulo.setInc_Red(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Orcat1":
                        articulo.setWeb_Orcat1(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Orcat2":
                        articulo.setWeb_Orcat2(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Orcat3":
                        articulo.setWeb_Orcat3(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_Metat":
                        articulo.setWeb_Metat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Metad":
                        articulo.setWeb_Metad(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_Urla":
                        articulo.setWeb_Urla(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_H1":
                        articulo.setWeb_H1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_H2_1":
                        articulo.setWeb_H2_1(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_H2_2":
                        articulo.setWeb_H2_2(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sincro":
                        articulo.setSincro(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(articulo);
            articulos.add(articulo);
        }
    }

    public void BancoEmpresaSwitch() {
        System.out.println("En desarrollo");
    }

    public void ClientesSwitch() {
        System.out.println("En desarrollo");
    }

    public void ContactosClientesSwitch() {
        System.out.println("En desarrollo");
    }

    public void ContactosProveedoresSwitch() {
        System.out.println("En desarrollo");
    }

    public void DatosBancariosClientesSwitch() {
        System.out.println("En desarrollo");
    }

    public void DatosBancariosProveedoresSwitch() {
        System.out.println("En desarrollo");
    }

    public void DireccionesClientesSwitch() {
        System.out.println("En desarrollo");
    }

    public void DireccionesProveedoresSwitch() {
        System.out.println("En desarrollo");
    }

    public void ExistenciasSwitch() {
        System.out.println("En desarrollo");
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