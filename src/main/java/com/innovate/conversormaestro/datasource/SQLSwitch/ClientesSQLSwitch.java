package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Cliente;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ClientesSQLSwitch {
    private FinalList<Cliente> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Cliente> clientes;
    private FormatUtils formatUtils = new FormatUtils();

    public void Clientes(ArrayList<Relacion> relaciones) {
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        clientes = new ArrayList<>();
        Cliente cliente;

        for (int i = 0; i < nFilas; i++) {
            cliente = new Cliente();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        cliente.setCod(formatUtils
                                .format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        cliente.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sno":
                        cliente.setSno(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        cliente.setDir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        cliente.setPob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        cliente.setNpro(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        cliente.setPro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nif":
                        cliente.setNif(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "te1":
                        cliente.setTe1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "te2":
                        cliente.setTe2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fax":
                        cliente.setFax(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mov":
                        cliente.setMov(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per":
                        cliente.setPer(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        cliente.setCar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ter":
                        cliente.setTer(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "req":
                        cliente.setReq(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "red":
                        cliente.setRed(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dto":
                        cliente.setDto(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com":
                        cliente.setCom(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fin":
                        cliente.setFin(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fac":
                        cliente.setFac(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tar":
                        cliente.setTar(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "forpag":
                        cliente.setforpag(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di1":
                        cliente.setDi1(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        cliente.setDi2(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di3":
                        cliente.setDi3(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mnp":
                        cliente.setMnp(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "m30":
                        cliente.setM30(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        cliente.setVto(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inc":
                        cliente.setInc(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rie":
                        cliente.setRie(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rut":
                        if (SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()).isEmpty()) {
                            cliente.setRut("");
                        } else {
                            cliente.setRut(formatUtils
                                    .format6digits(
                                            SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        }
                        break;
                    case "age":
                        if (SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()).isEmpty()) {
                            cliente.setRut("");
                        } else {
                            cliente.setAge(formatUtils
                                    .format6digits(
                                            SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        }
                        break;
                    case "nco":
                        cliente.setNco(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "alv":
                        cliente.setAlv(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fa1":
                        cliente.setFa1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fa2":
                        cliente.setFa2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tra":
                        cliente.setTra(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mar":
                        cliente.setMar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt2":
                        cliente.setDt2(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tia":
                        cliente.setTia(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fo2":
                        cliente.setFo2(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d1b":
                        cliente.setD1B(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d2b":
                        cliente.setD2B(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d3b":
                        cliente.setD3B(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mnb":
                        cliente.setMnb(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imp":
                        cliente.setImp(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tre":
                        cliente.setTre(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ret":
                        cliente.setRet(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fgl":
                        cliente.setFgl(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ifg":
                        cliente.setIfg(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web":
                        cliente.setWeb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "doc":
                        cliente.setDoc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fpd":
                        cliente.setFpd(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        cliente.setPais(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ext":
                        cliente.setExt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob1":
                        cliente.setOb1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob2":
                        cliente.setOb2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rediva1":
                        cliente.setRediva1(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rediva2":
                        cliente.setRediva2(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rediva3":
                        cliente.setRediva3(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rediva4":
                        cliente.setRediva4(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rediva5":
                        cliente.setRediva5(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi0ped":
                        cliente.setAvi0Ped(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi1ped":
                        cliente.setAvi1Ped(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi2ped":
                        cliente.setAvi2Ped(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi0alb":
                        cliente.setAvi0Alb(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi1alb":
                        cliente.setAvi1Alb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi2alb":
                        cliente.setAvi2Alb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi0fac":
                        cliente.setAvi0Fac(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi1fac":
                        cliente.setAvi1Fac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi2fac":
                        cliente.setAvi2Fac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi0rec":
                        cliente.setAvi0Rec(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi1rec":
                        cliente.setAvi1Rec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi2rec":
                        cliente.setAvi2Rec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi0pre":
                        cliente.setAvi0Pre(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi1pre":
                        cliente.setAvi1Pre(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi2pre":
                        cliente.setAvi2Pre(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ivainc":
                        cliente.setIvainc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        cliente.setFot(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "env":
                        cliente.setEnv(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xxx":
                        cliente.setXxx(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fcr_crm":
                        cliente.setFcr_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tip_crm":
                        cliente.setTip_Crm(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ftr_crm":
                        cliente.setFtr_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tco_crm":
                        cliente.setTco_Crm(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ref_crm":
                        cliente.setRef_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vis_crm":
                        cliente.setVis_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pvi_crm":
                        cliente.setPvi_Crm(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lla_crm":
                        cliente.setLla_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pll_crm":
                        cliente.setPll_Crm(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ru1_crm":
                        cliente.setRu1_Crm(formatUtils
                                .format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ru2_crm":
                        cliente.setRu2_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ru3_crm":
                        cliente.setRu3_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sec_crm":
                        cliente.setSec_Crm(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dias_crm":
                        cliente.setDias_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tpl_crm":
                        cliente.setTpl_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fna_crm":
                        cliente.setFna_Crm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "imprap":
                        cliente.setImprap(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtorap":
                        cliente.setDtorap(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tar_art":
                        cliente.setTar_Art(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tar_fam":
                        cliente.setTar_Fam(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efactura":
                        cliente.setEfactura(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "perrap":
                        cliente.setPerrap(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "facedir":
                        cliente.setFacedir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facepob":
                        cliente.setFacepob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facenpro":
                        cliente.setFacenpro(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "facepro":
                        cliente.setFacepro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facepais":
                        cliente.setFacepais(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "facenom":
                        cliente.setFacenom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "faceape1":
                        cliente.setFaceape1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "faceape2":
                        cliente.setFaceape2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facefoj":
                        cliente.setFacefoj(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v01":
                        cliente.setV01(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v02":
                        cliente.setV02(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v03":
                        cliente.setV03(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v04":
                        cliente.setV04(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v05":
                        cliente.setV05(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v06":
                        cliente.setV06(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v07":
                        cliente.setV07(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v08":
                        cliente.setV08(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v09":
                        cliente.setV09(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v10":
                        cliente.setV10(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v11":
                        cliente.setV11(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v12":
                        cliente.setV12(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "historia":
                        cliente.setHistoria(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ori":
                        cliente.setLopd_Ori(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_otr_o":
                        cliente.setLopd_Otr_O(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ces":
                        cliente.setLopd_Ces(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_otr_c":
                        cliente.setLopd_Otr_C(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cli_facalb":
                        cliente.setCli_Facalb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cln_tarsub":
                        cliente.setCln_Tarsub(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cln_tarmar":
                        cliente.setCln_Tarmar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cln_idioma":
                        cliente.setCln_Idioma(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "moneda":
                        cliente.setMoneda(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi0dep":
                        cliente.setAvi0Dep(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "avi_dep":
                        cliente.setAvi_Dep(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi_ped":
                        cliente.setAvi_Ped(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi_pre":
                        cliente.setAvi_Pre(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi_alb":
                        cliente.setAvi_Alb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi_fac":
                        cliente.setAvi_Fac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "avi_rec":
                        cliente.setAvi_Rec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_acc":
                        cliente.setWeb_Acc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_psw":
                        cliente.setWeb_Psw(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "obs_doc":
                        cliente.setObs_Doc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "actividad":
                        cliente.setActividad(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emailweb":
                        cliente.setEmailweb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_exepor":
                        cliente.setWeb_Exepor(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tip_rem":
                        cliente.setTip_Rem(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec_man":
                        cliente.setFec_Man(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cri_caja":
                        cliente.setCri_Caja(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facemed":
                        cliente.setFacemed(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "faceiban":
                        cliente.setFaceiban(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facever":
                        cliente.setFacever(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "facepol":
                        cliente.setFacepol(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "por_efac":
                        cliente.setPor_Efac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_codact":
                        cliente.setWeb_Codact(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sincro":
                        cliente.setSincro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println("----------------------------------------------");
            // System.out.println(cliente);
            clientes.add(cliente);
        }
        lista.setLista(clientes);
    }
}
