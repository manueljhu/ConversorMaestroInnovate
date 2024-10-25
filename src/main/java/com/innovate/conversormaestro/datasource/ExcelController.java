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

    private ExcelController(){
		connectionController = ConnectionController.getConectionController();
		PathSourceExcel = connectionController.getPathSourceExcel();
    }

    public static ExcelController getExcelController(){
        if(excelController == null){
            excelController = new ExcelController();
        }

        return excelController;
    }

    public void setRelaciones(ArrayList<Relacion> relaciones){
        this.relaciones = relaciones;
    }

    public void readExcelFile(){
        
        InputStream excelStream = null;
        try {
            excelStream = new FileInputStream(PathSourceExcel);

            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            HSSFRow hssfRowCabecera;

            HSSFCell cell;
            hssfRowCabecera = hssfSheet.getRow(0);

            /* for (int c = 0; c < hssfRowCabecera.getLastCellNum(); c++) {
                System.out.println(hssfRowCabecera.getCell(c).getStringCellValue());
            } */

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file not exists (No se encontró el fichero): " + fileNotFoundException);
        } catch (IOException ex) {
            System.out.println("Error in file procesing (Error al procesar el fichero): " + ex);
        } finally {
            try {
                excelStream.close();
            } catch (IOException ex) {
                System.out.println("Error in file processing after close it (Error al procesar el fichero después de cerrarlo): " + ex);
            }
        }
    }

    public String getPathSourceExcel(){
		return PathSourceExcel;
	}

    public ArrayList<String> getColumnOrigin(){
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
                System.out.println("Error in file processing after close it (Error al procesar el fichero después de cerrarlo): " + ex);
            }
        }
        return result;
    }

    public int devuelveNFilasExcel(){
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
                System.out.println("Error in file processing after close it (Error al procesar el fichero después de cerrarlo): " + ex);
            }
        }
        return result;
    }

    public String devuelveValorCelda(int fila, String columna){
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
                if(hssfRowCabecera.getCell(c).getStringCellValue().equals(columna)){
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

    public void tableExcelDestination(String tablename){
        switch (tablename) {
            case "Agentes":
                AgentesSwitch();
                break;
            /*case "Almacenes":
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
                break;*/
        }
    }

    public void AgentesSwitch(){
        agentes = new ArrayList<Agente>();
        
        int nFilas = devuelveNFilasExcel();
        Agente agente;
        int longitud = 0;
        String cod;

        for (int i = 1; i <= nFilas; i++) {
            agente = new Agente();
            for (int j = 0; j < relaciones.size() ; j++) {
                /* System.out.println(relaciones.get(j).getCampoOrigen());
                System.out.println(relaciones.get(j).getCampoDestino()); */
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
                        agente.setCom_Impinc(Float.parseFloat(devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
        }
    }

    public void Almacen(){
        almacenes = new ArrayList<Almacen>();
    }
}