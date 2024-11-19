package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.FacturaEmitida;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FacturasEmitidasSQLSwitch {
    private FinalList<FacturaEmitida> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<FacturaEmitida> facturasEmitidas;
    private FormatUtils formatUtils = new FormatUtils();
    String group;
    String account;

    public void FacturasEmitidas(ArrayList<Relacion> relaciones){
        ConnectionController connectionController = ConnectionController.getConectionController(); 
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        facturasEmitidas = new ArrayList<FacturaEmitida>();
        FacturaEmitida facturaEmitida;

        for (int i = 0; i < nFilas; i++) {
            facturaEmitida = new FacturaEmitida();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "num":
                        facturaEmitida.setNum(formatUtils.format2digits6("FACEMI", SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fea":
                        facturaEmitida.setFea(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "doc":
                        facturaEmitida.setDoc(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fee":
                        facturaEmitida.setFee(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "gas":
                        facturaEmitida.setGas(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cue":
                        facturaEmitida.setCue(formatUtils.formatDigitFacEmi(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "li1":
                        facturaEmitida.setLi1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "li2":
                        facturaEmitida.setLi2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        facturaEmitida.setDt1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        facturaEmitida.setDt2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fuc":
                        facturaEmitida.setFuc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "forpag":
                        facturaEmitida.setforpag(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fin":
                        facturaEmitida.setFin(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "alm":
                        facturaEmitida.setAlm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com":
                        facturaEmitida.setCom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        facturaEmitida.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nif":
                        facturaEmitida.setNif(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ba1eu":
                        facturaEmitida.setBa1Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv1eu":
                        facturaEmitida.setIv1Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re1eu":
                        facturaEmitida.setRe1Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba2eu":
                        facturaEmitida.setBa2Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2eu":
                        facturaEmitida.setIv2Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re2eu":
                        facturaEmitida.setRe2Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba3eu":
                        facturaEmitida.setBa3Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv3eu":
                        facturaEmitida.setIv3Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re3eu":
                        facturaEmitida.setRe3Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba4eu":
                        facturaEmitida.setBa4Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv4eu":
                        facturaEmitida.setIv4Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re4eu":
                        facturaEmitida.setRe4Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba5eu":
                        facturaEmitida.setBa5Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv5eu":
                        facturaEmitida.setIv5Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re5eu":
                        facturaEmitida.setRe5Eu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "exeeu":
                        facturaEmitida.setExeeu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ulceu":
                        facturaEmitida.setUlceu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "toceu":
                        facturaEmitida.setToceu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "enteu":
                        facturaEmitida.setEnteu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imceu":
                        facturaEmitida.setImceu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imreu":
                        facturaEmitida.setImreu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tre":
                        facturaEmitida.setTre(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pre":
                        facturaEmitida.setPre(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ireeu":
                        facturaEmitida.setIreeu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "den":
                        facturaEmitida.setDen(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        facturaEmitida.setRut(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obr":
                        facturaEmitida.setObr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ivainc":
                        facturaEmitida.setIvainc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tra":
                        facturaEmitida.setTra(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "entped":
                        facturaEmitida.setEntped(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impuesto":
                        facturaEmitida.setImpuesto(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tip":
                        facturaEmitida.setTip(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web":
                        facturaEmitida.setWeb(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aut":
                        facturaEmitida.setAut(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "comis":
                        facturaEmitida.setComis(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "negativa":
                        facturaEmitida.setNegativa(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecope":
                        facturaEmitida.setFecope(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efacgen":
                        facturaEmitida.setEfacgen(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efacenv":
                        facturaEmitida.setEfacenv(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sno":
                        facturaEmitida.setSno(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        facturaEmitida.setDir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        facturaEmitida.setPob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        facturaEmitida.setNpro(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        facturaEmitida.setPro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        facturaEmitida.setPais(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mod303":
                        facturaEmitida.setMod303(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303a":
                        facturaEmitida.setMod303A(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303b":
                        facturaEmitida.setMod303B(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303c":
                        facturaEmitida.setMod303C(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod347":
                        facturaEmitida.setMod347(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "usuario_bloqueo":
                        facturaEmitida.setUsuario_Bloqueo(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "emi_deb_pag":
                        facturaEmitida.setEmi_Deb_Pag(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_incluir":
                        facturaEmitida.setEmi_Incluir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_antes_dto":
                        facturaEmitida.setEmi_Antes_Dto(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "emi_iva_inc":
                        facturaEmitida.setEmi_Iva_Inc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        facturaEmitida.setMoneda(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        facturaEmitida.setCotiza(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "basmon":
                        facturaEmitida.setBasmon(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "totmon":
                        facturaEmitida.setTotmon(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "entmon":
                        facturaEmitida.setEntmon(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obs_doc":
                        facturaEmitida.setObs_Doc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "recargo":
                        facturaEmitida.setRecargo(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "retgar":
                        facturaEmitida.setRetgar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "porretgar":
                        facturaEmitida.setPorretgar(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impretgar":
                        facturaEmitida.setImpretgar(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipretgar":
                        facturaEmitida.setTipretgar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suplidos":
                        facturaEmitida.setSuplidos(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva1":
                        facturaEmitida.setIva1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva2":
                        facturaEmitida.setIva2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva3":
                        facturaEmitida.setIva3(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva4":
                        facturaEmitida.setIva4(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva5":
                        facturaEmitida.setIva5(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec1":
                        facturaEmitida.setRec1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec2":
                        facturaEmitida.setRec2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec3":
                        facturaEmitida.setRec3(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec4":
                        facturaEmitida.setRec4(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec5":
                        facturaEmitida.setRec5(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipivaok":
                        facturaEmitida.setTipivaok(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exento":
                        facturaEmitida.setExento(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numtic":
                        facturaEmitida.setNumtic(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cri_caja":
                        facturaEmitida.setCri_Caja(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ded_cie":
                        facturaEmitida.setDed_Cie(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cen_adm":
                        facturaEmitida.setCen_Adm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiest":
                        facturaEmitida.setSiiest(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiact":
                        facturaEmitida.setSiiact(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipfra":
                        facturaEmitida.setSiitipfra(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi":
                        facturaEmitida.setSiifraemi(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitiprec":
                        facturaEmitida.setSiitiprec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipsuj":
                        facturaEmitida.setSiitipsuj(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipnsu":
                        facturaEmitida.setSiitipnsu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipexe":
                        facturaEmitida.setSiitipexe(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesfra":
                        facturaEmitida.setSiidesfra(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiimpnsu":
                        facturaEmitida.setSiiimpnsu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiimptai":
                        facturaEmitida.setSiiimptai(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiimpexe":
                        facturaEmitida.setSiiimpexe(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siinifemi":
                        facturaEmitida.setSiinifemi(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiemiter":
                        facturaEmitida.setSiiemiter(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siicupon":
                        facturaEmitida.setSiicupon(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siivardes":
                        facturaEmitida.setSiivardes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatrec":
                        facturaEmitida.setSiidatrec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatinm":
                        facturaEmitida.setSiidatinm(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatagr":
                        facturaEmitida.setSiidatagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siibasrec":
                        facturaEmitida.setSiibasrec(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siicuorec":
                        facturaEmitida.setSiicuorec(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siirecrec":
                        facturaEmitida.setSiirecrec(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siibascos":
                        facturaEmitida.setSiibascos(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siitraiva":
                        facturaEmitida.setSiitraiva(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientexe":
                        facturaEmitida.setSiientexe(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientcexe":
                        facturaEmitida.setSiientcexe(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siienttsuj":
                        facturaEmitida.setSiienttsuj(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siientnsu":
                        facturaEmitida.setSiientnsu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siienttai":
                        facturaEmitida.setSiienttai(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siientdes":
                        facturaEmitida.setSiientdes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiserexe":
                        facturaEmitida.setSiiserexe(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siisercexe":
                        facturaEmitida.setSiisercexe(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siisertsuj":
                        facturaEmitida.setSiisertsuj(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siisernsu":
                        facturaEmitida.setSiisernsu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siisertai":
                        facturaEmitida.setSiisertai(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiserdes":
                        facturaEmitida.setSiiserdes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatdes":
                        facturaEmitida.setSiidatdes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi1":
                        facturaEmitida.setSiifraemi1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraemi2":
                        facturaEmitida.setSiifraemi2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumacu":
                        facturaEmitida.setSiinumacu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumresf":
                        facturaEmitida.setSiinumresf(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinemiter":
                        facturaEmitida.setSiinemiter(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesman":
                        facturaEmitida.setSiidesman(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "patron":
                        facturaEmitida.setPatron(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siirefext":
                        facturaEmitida.setSiirefext(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinomensu":
                        facturaEmitida.setSiinomensu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinifensu":
                        facturaEmitida.setSiinifensu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesnoid":
                        facturaEmitida.setSiidesnoid(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraiden":
                        facturaEmitida.setSiifraiden(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siimergas":
                        facturaEmitida.setSiimergas(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesexen":
                        facturaEmitida.setSiidesexen(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siimacro":
                        facturaEmitida.setSiimacro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiregprev":
                        facturaEmitida.setSiiregprev(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siientdexe":
                        facturaEmitida.setSiientdexe(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiserdexe":
                        facturaEmitida.setSiiserdexe(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattipfac":
                        facturaEmitida.setAeattipfac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattiping":
                        facturaEmitida.setAeattiping(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeatimpcon":
                        facturaEmitida.setAeatimpcon(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            //System.out.println(facturaEmitida);
            facturasEmitidas.add(facturaEmitida);
        }
        lista.setLista(facturasEmitidas);
    }
}
