package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.FacturaEmitida;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FacturasEmitidasDBFSwitch {
    private FinalList<FacturaEmitida> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<FacturaEmitida> facturasEmitidas;
    private FormatUtils formatUtils = new FormatUtils();
    String group;
    String account;

    public void FacturasEmitidas(ArrayList<Relacion> relaciones){
        ConnectionController connectionController = ConnectionController.getConectionController(); 
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        facturasEmitidas = new ArrayList<FacturaEmitida>();
        FacturaEmitida facturaEmitida;

        for (int i = 1; i <= nFilas; i++) {
            facturaEmitida = new FacturaEmitida();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "num":
                        facturaEmitida.setNum(formatUtils.format2digits6("FACEMI", excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fea":
                        facturaEmitida.setFea(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "doc":
                        facturaEmitida.setDoc(formatUtils.format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fee":
                        facturaEmitida.setFee(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "gas":
                        facturaEmitida.setGas(formatUtils.format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cue":
                        facturaEmitida.setCue(formatUtils.formatDigitFacEmi(group, account,excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "li1":
                        facturaEmitida.setLi1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "li2":
                        facturaEmitida.setLi2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        facturaEmitida.setDt1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        facturaEmitida.setDt2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fuc":
                        facturaEmitida.setFuc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "forpag":
                        facturaEmitida.setforpag(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fin":
                        facturaEmitida.setFin(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "alm":
                        facturaEmitida.setAlm(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com":
                        facturaEmitida.setCom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        facturaEmitida.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nif":
                        facturaEmitida.setNif(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ba1eu":
                        facturaEmitida.setBa1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv1eu":
                        facturaEmitida.setIv1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re1eu":
                        facturaEmitida.setRe1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba2eu":
                        facturaEmitida.setBa2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2eu":
                        facturaEmitida.setIv2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re2eu":
                        facturaEmitida.setRe2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba3eu":
                        facturaEmitida.setBa3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv3eu":
                        facturaEmitida.setIv3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re3eu":
                        facturaEmitida.setRe3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba4eu":
                        facturaEmitida.setBa4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv4eu":
                        facturaEmitida.setIv4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re4eu":
                        facturaEmitida.setRe4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba5eu":
                        facturaEmitida.setBa5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv5eu":
                        facturaEmitida.setIv5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re5eu":
                        facturaEmitida.setRe5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "exeeu":
                        facturaEmitida.setExeeu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ulceu":
                        facturaEmitida.setUlceu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "toceu":
                        facturaEmitida.setToceu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "enteu":
                        facturaEmitida.setEnteu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imceu":
                        facturaEmitida.setImceu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imreu":
                        facturaEmitida.setImreu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tre":
                        facturaEmitida.setTre(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pre":
                        facturaEmitida.setPre(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ireeu":
                        facturaEmitida.setIreeu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "den":
                        facturaEmitida.setDen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        facturaEmitida.setRut(formatUtils.format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obr":
                        facturaEmitida.setObr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ivainc":
                        facturaEmitida.setIvainc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tra":
                        facturaEmitida.setTra(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "entped":
                        facturaEmitida.setEntped(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impuesto":
                        facturaEmitida.setImpuesto(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tip":
                        facturaEmitida.setTip(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web":
                        facturaEmitida.setWeb(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aut":
                        facturaEmitida.setAut(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "comis":
                        facturaEmitida.setComis(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "negativa":
                        facturaEmitida.setNegativa(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecope":
                        facturaEmitida.setFecope(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efacgen":
                        facturaEmitida.setEfacgen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efacenv":
                        facturaEmitida.setEfacenv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sno":
                        facturaEmitida.setSno(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        facturaEmitida.setDir(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        facturaEmitida.setPob(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        facturaEmitida.setNpro(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        facturaEmitida.setPro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        facturaEmitida.setPais(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mod303":
                        facturaEmitida.setMod303(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303a":
                        facturaEmitida.setMod303A(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303b":
                        facturaEmitida.setMod303B(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303c":
                        facturaEmitida.setMod303C(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod347":
                        facturaEmitida.setMod347(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "usuario_bloqueo":
                        facturaEmitida.setUsuario_Bloqueo(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "emi_deb_pag":
                        facturaEmitida.setEmi_Deb_Pag(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_incluir":
                        facturaEmitida.setEmi_Incluir(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_antes_dto":
                        facturaEmitida.setEmi_Antes_Dto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_iva_inc":
                        facturaEmitida.setEmi_Iva_Inc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        facturaEmitida.setMoneda(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        facturaEmitida.setCotiza(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "basmon":
                        facturaEmitida.setBasmon(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "totmon":
                        facturaEmitida.setTotmon(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "entmon":
                        facturaEmitida.setEntmon(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obs_doc":
                        facturaEmitida.setObs_Doc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "recargo":
                        facturaEmitida.setRecargo(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "retgar":
                        facturaEmitida.setRetgar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "porretgar":
                        facturaEmitida.setPorretgar(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impretgar":
                        facturaEmitida.setImpretgar(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipretgar":
                        facturaEmitida.setTipretgar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suplidos":
                        facturaEmitida.setSuplidos(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva1":
                        facturaEmitida.setIva1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva2":
                        facturaEmitida.setIva2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva3":
                        facturaEmitida.setIva3(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva4":
                        facturaEmitida.setIva4(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva5":
                        facturaEmitida.setIva5(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec1":
                        facturaEmitida.setRec1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec2":
                        facturaEmitida.setRec2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec3":
                        facturaEmitida.setRec3(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec4":
                        facturaEmitida.setRec4(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec5":
                        facturaEmitida.setRec5(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipivaok":
                        facturaEmitida.setTipivaok(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exento":
                        facturaEmitida.setExento(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numtic":
                        facturaEmitida.setNumtic(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cri_caja":
                        facturaEmitida.setCri_Caja(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ded_cie":
                        facturaEmitida.setDed_Cie(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cen_adm":
                        facturaEmitida.setCen_Adm(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiest":
                        facturaEmitida.setSiiest(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiact":
                        facturaEmitida.setSiiact(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipfra":
                        facturaEmitida.setSiitipfra(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi":
                        facturaEmitida.setSiifraemi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitiprec":
                        facturaEmitida.setSiitiprec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipsuj":
                        facturaEmitida.setSiitipsuj(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipnsu":
                        facturaEmitida.setSiitipnsu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipexe":
                        facturaEmitida.setSiitipexe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesfra":
                        facturaEmitida.setSiidesfra(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiimpnsu":
                        facturaEmitida.setSiiimpnsu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiimptai":
                        facturaEmitida.setSiiimptai(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiimpexe":
                        facturaEmitida.setSiiimpexe(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siinifemi":
                        facturaEmitida.setSiinifemi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiemiter":
                        facturaEmitida.setSiiemiter(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siicupon":
                        facturaEmitida.setSiicupon(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siivardes":
                        facturaEmitida.setSiivardes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatrec":
                        facturaEmitida.setSiidatrec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatinm":
                        facturaEmitida.setSiidatinm(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatagr":
                        facturaEmitida.setSiidatagr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siibasrec":
                        facturaEmitida.setSiibasrec(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siicuorec":
                        facturaEmitida.setSiicuorec(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siirecrec":
                        facturaEmitida.setSiirecrec(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siibascos":
                        facturaEmitida.setSiibascos(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siitraiva":
                        facturaEmitida.setSiitraiva(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientexe":
                        facturaEmitida.setSiientexe(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientcexe":
                        facturaEmitida.setSiientcexe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siienttsuj":
                        facturaEmitida.setSiienttsuj(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siientnsu":
                        facturaEmitida.setSiientnsu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siienttai":
                        facturaEmitida.setSiienttai(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientdes":
                        facturaEmitida.setSiientdes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiserexe":
                        facturaEmitida.setSiiserexe(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siisercexe":
                        facturaEmitida.setSiisercexe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siisertsuj":
                        facturaEmitida.setSiisertsuj(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siisernsu":
                        facturaEmitida.setSiisernsu(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siisertai":
                        facturaEmitida.setSiisertai(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiserdes":
                        facturaEmitida.setSiiserdes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatdes":
                        facturaEmitida.setSiidatdes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi1":
                        facturaEmitida.setSiifraemi1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi2":
                        facturaEmitida.setSiifraemi2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumacu":
                        facturaEmitida.setSiinumacu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumresf":
                        facturaEmitida.setSiinumresf(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinemiter":
                        facturaEmitida.setSiinemiter(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesman":
                        facturaEmitida.setSiidesman(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "patron":
                        facturaEmitida.setPatron(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siirefext":
                        facturaEmitida.setSiirefext(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinomensu":
                        facturaEmitida.setSiinomensu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinifensu":
                        facturaEmitida.setSiinifensu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesnoid":
                        facturaEmitida.setSiidesnoid(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraiden":
                        facturaEmitida.setSiifraiden(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siimergas":
                        facturaEmitida.setSiimergas(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesexen":
                        facturaEmitida.setSiidesexen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siimacro":
                        facturaEmitida.setSiimacro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiregprev":
                        facturaEmitida.setSiiregprev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siientdexe":
                        facturaEmitida.setSiientdexe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiserdexe":
                        facturaEmitida.setSiiserdexe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattipfac":
                        facturaEmitida.setAeattipfac(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattiping":
                        facturaEmitida.setAeattiping(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeatimpcon":
                        facturaEmitida.setAeatimpcon(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            //System.out.println(facturaEmitida);
            facturasEmitidas.add(facturaEmitida);
        }
        lista.setLista(facturasEmitidas);
    }
}
