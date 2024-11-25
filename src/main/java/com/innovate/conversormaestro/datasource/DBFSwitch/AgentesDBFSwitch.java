package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Agente;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class AgentesDBFSwitch {
    private DBFController dbfController;
    private FinalList<Agente> lista;
    private ArrayList<Agente> agentes;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void Agentes(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        agentes = new ArrayList<Agente>();
        Agente agente;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            agente = new Agente();
            for (int j = 0; j < relaciones.size(); j++) {
                try {

                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            agente.setCod(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            agente.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dir":
                            agente.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pob":
                            agente.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "npro":
                            agente.setNpro(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            agente.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nif":
                            agente.setNif(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "te1":
                            agente.setTe1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "te2":
                            agente.setTe2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fax":
                            agente.setFax(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "mov":
                            agente.setMov(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ob1":
                            agente.setOb1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ob2":
                            agente.setOb2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ob3":
                            agente.setOb3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut":
                            agente.setRut(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tip":
                            agente.setTip(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            agente.setCom(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co1":
                            agente.setCo1(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co2":
                            agente.setCo2(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co3":
                            agente.setCo3(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co4":
                            agente.setCo4(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co5":
                            agente.setCo5(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lim":
                            agente.setLim(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pais":
                            agente.setPais(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tia":
                            agente.setTia(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "alt":
                            agente.setAlt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fot":
                            agente.setFot(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web":
                            agente.setWeb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xxx":
                            agente.setXxx(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut_crm":
                            agente.setRut_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vdi_crm":
                            agente.setVdi_Crm(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ldi_crm":
                            agente.setLdi_Crm(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tcu_crm":
                            agente.setTcu_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cud_crm":
                            agente.setCud_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "est_crm":
                            agente.setEst_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v01":
                            agente.setV01(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v02":
                            agente.setV02(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v03":
                            agente.setV03(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v04":
                            agente.setV04(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v05":
                            agente.setV05(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v06":
                            agente.setV06(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v07":
                            agente.setV07(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v08":
                            agente.setV08(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v09":
                            agente.setV09(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v10":
                            agente.setV10(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v11":
                            agente.setV11(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v12":
                            agente.setV12(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "historia":
                            agente.setHistoria(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_ori":
                            agente.setLopd_Ori(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lopd_otr_o":
                            agente.setLopd_Otr_O(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_ces":
                            agente.setLopd_Ces(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_otr_c":
                            agente.setLopd_Otr_C(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "age_usu":
                            agente.setAge_Usu(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "age_ver_todo":
                            agente.setAge_Ver_Todo(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "com_per":
                            agente.setCom_Per(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com_imp":
                            agente.setCom_Imp(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com_inc":
                            agente.setCom_Inc(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com_impinc":
                            agente.setCom_Impinc(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com_por":
                            agente.setCom_Por(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "web_acc":
                            agente.setWeb_Acc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_psw":
                            agente.setWeb_Psw(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_todo":
                            agente.setWeb_Todo(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_crear":
                            agente.setWeb_Crear(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_pago":
                            agente.setWeb_Pago(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_dto":
                            agente.setWeb_Dto(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_edipre":
                            agente.setWeb_Edipre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_acccob":
                            agente.setWeb_Acccob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    dbfController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                dbfController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(agente);
            System.out.println("----------------------------------------------------------"); */
            agentes.add(agente);
        }
        lista.setLista(agentes);
    }

}
