package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Cliente;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class ClientesDBFSwitch {
    private DBFController dbfController;
    private FinalList<Cliente> lista;
    private ArrayList<Cliente> clientes;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void Clientes(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        clientes = new ArrayList<>();
        Cliente cliente;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            cliente = new Cliente();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            cliente.setCod(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            cliente.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "sno":
                            cliente.setSno(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dir":
                            cliente.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pob":
                            cliente.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "npro":
                            cliente.setNpro(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            cliente.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nif":
                            cliente.setNif(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "te1":
                            cliente.setTe1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "te2":
                            cliente.setTe2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fax":
                            cliente.setFax(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "mov":
                            cliente.setMov(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "per":
                            cliente.setPer(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "car":
                            cliente.setCar(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ter":
                            cliente.setTer(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "req":
                            cliente.setReq(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "red":
                            cliente.setRed(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dto":
                            cliente.setDto(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            cliente.setCom(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fin":
                            cliente.setFin(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fac":
                            cliente.setFac(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tar":
                            cliente.setTar(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "forpag":
                            cliente.setforpag(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "di1":
                            cliente.setDi1(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "di2":
                            cliente.setDi2(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "di3":
                            cliente.setDi3(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mnp":
                            cliente.setMnp(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "m30":
                            cliente.setM30(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vto":
                            cliente.setVto(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "inc":
                            cliente.setInc(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            cliente.setRie(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rut":
                            if (DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()).isEmpty()) {
                                cliente.setRut("");
                            } else {
                                cliente.setRut(formatUtils
                                        .format6digits(
                                                DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            }
                            break;
                        case "age":
                            if (DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()).isEmpty()) {
                                cliente.setRut("");
                            } else {
                                cliente.setAge(formatUtils
                                        .format6digits(
                                                DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            }
                            break;
                        case "nco":
                            cliente.setNco(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "alv":
                            cliente.setAlv(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fa1":
                            cliente.setFa1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fa2":
                            cliente.setFa2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tra":
                            cliente.setTra(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "mar":
                            cliente.setMar(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dt2":
                            cliente.setDt2(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tia":
                            cliente.setTia(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fo2":
                            cliente.setFo2(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d1b":
                            cliente.setD1B(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d2b":
                            cliente.setD2B(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d3b":
                            cliente.setD3B(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mnb":
                            cliente.setMnb(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imp":
                            cliente.setImp(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tre":
                            cliente.setTre(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ret":
                            cliente.setRet(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fgl":
                            cliente.setFgl(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ifg":
                            cliente.setIfg(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "web":
                            cliente.setWeb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "doc":
                            cliente.setDoc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fpd":
                            cliente.setFpd(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            cliente.setPais(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ext":
                            cliente.setExt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ob1":
                            cliente.setOb1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ob2":
                            cliente.setOb2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rediva1":
                            cliente.setRediva1(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rediva2":
                            cliente.setRediva2(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rediva3":
                            cliente.setRediva3(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rediva4":
                            cliente.setRediva4(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rediva5":
                            cliente.setRediva5(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi0ped":
                            cliente.setAvi0Ped(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi1ped":
                            cliente.setAvi1Ped(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi2ped":
                            cliente.setAvi2Ped(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi0alb":
                            cliente.setAvi0Alb(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi1alb":
                            cliente.setAvi1Alb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi2alb":
                            cliente.setAvi2Alb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi0fac":
                            cliente.setAvi0Fac(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi1fac":
                            cliente.setAvi1Fac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi2fac":
                            cliente.setAvi2Fac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi0rec":
                            cliente.setAvi0Rec(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi1rec":
                            cliente.setAvi1Rec(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi2rec":
                            cliente.setAvi2Rec(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi0pre":
                            cliente.setAvi0Pre(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi1pre":
                            cliente.setAvi1Pre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi2pre":
                            cliente.setAvi2Pre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ivainc":
                            cliente.setIvainc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fot":
                            cliente.setFot(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "env":
                            cliente.setEnv(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xxx":
                            cliente.setXxx(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fcr_crm":
                            cliente.setFcr_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tip_crm":
                            cliente.setTip_Crm(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ftr_crm":
                            cliente.setFtr_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tco_crm":
                            cliente.setTco_Crm(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ref_crm":
                            cliente.setRef_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vis_crm":
                            cliente.setVis_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pvi_crm":
                            cliente.setPvi_Crm(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lla_crm":
                            cliente.setLla_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pll_crm":
                            cliente.setPll_Crm(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ru1_crm":
                            cliente.setRu1_Crm(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ru2_crm":
                            cliente.setRu2_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ru3_crm":
                            cliente.setRu3_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "sec_crm":
                            cliente.setSec_Crm(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dias_crm":
                            cliente.setDias_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tpl_crm":
                            cliente.setTpl_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fna_crm":
                            cliente.setFna_Crm(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "imprap":
                            cliente.setImprap(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtorap":
                            cliente.setDtorap(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tar_art":
                            cliente.setTar_Art(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tar_fam":
                            cliente.setTar_Fam(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efactura":
                            cliente.setEfactura(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "perrap":
                            cliente.setPerrap(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "facedir":
                            cliente.setFacedir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facepob":
                            cliente.setFacepob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facenpro":
                            cliente.setFacenpro(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "facepro":
                            cliente.setFacepro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facepais":
                            cliente.setFacepais(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "facenom":
                            cliente.setFacenom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "faceape1":
                            cliente.setFaceape1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "faceape2":
                            cliente.setFaceape2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facefoj":
                            cliente.setFacefoj(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v01":
                            cliente.setV01(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v02":
                            cliente.setV02(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v03":
                            cliente.setV03(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v04":
                            cliente.setV04(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v05":
                            cliente.setV05(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v06":
                            cliente.setV06(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v07":
                            cliente.setV07(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v08":
                            cliente.setV08(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v09":
                            cliente.setV09(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v10":
                            cliente.setV10(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v11":
                            cliente.setV11(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v12":
                            cliente.setV12(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "historia":
                            cliente.setHistoria(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_ori":
                            cliente.setLopd_Ori(
                                    Float.parseFloat(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lopd_otr_o":
                            cliente.setLopd_Otr_O(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_ces":
                            cliente.setLopd_Ces(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_otr_c":
                            cliente.setLopd_Otr_C(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cli_facalb":
                            cliente.setCli_Facalb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cln_tarsub":
                            cliente.setCln_Tarsub(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cln_tarmar":
                            cliente.setCln_Tarmar(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cln_idioma":
                            cliente.setCln_Idioma(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "moneda":
                            cliente.setMoneda(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi0dep":
                            cliente.setAvi0Dep(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "avi_dep":
                            cliente.setAvi_Dep(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi_ped":
                            cliente.setAvi_Ped(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi_pre":
                            cliente.setAvi_Pre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi_alb":
                            cliente.setAvi_Alb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi_fac":
                            cliente.setAvi_Fac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "avi_rec":
                            cliente.setAvi_Rec(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_acc":
                            cliente.setWeb_Acc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_psw":
                            cliente.setWeb_Psw(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "obs_doc":
                            cliente.setObs_Doc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "actividad":
                            cliente.setActividad(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "emailweb":
                            cliente.setEmailweb(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_exepor":
                            cliente.setWeb_Exepor(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tip_rem":
                            cliente.setTip_Rem(
                                    Integer.parseInt(
                                            DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fec_man":
                            cliente.setFec_Man(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cri_caja":
                            cliente.setCri_Caja(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facemed":
                            cliente.setFacemed(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "faceiban":
                            cliente.setFaceiban(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facever":
                            cliente.setFacever(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "facepol":
                            cliente.setFacepol(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "por_efac":
                            cliente.setPor_Efac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "web_codact":
                            cliente.setWeb_Codact(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "sincro":
                            cliente.setSincro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            }
            /* System.out.println("Fila: " + i);
            System.out.println(cliente);
            System.out.println("----------------------------------------------------------"); */
            clientes.add(cliente);
        }
        lista.setLista(clientes);
    }
}
