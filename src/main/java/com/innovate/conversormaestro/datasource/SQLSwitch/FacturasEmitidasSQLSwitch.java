package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FacturaEmitida;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class FacturasEmitidasSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<FacturaEmitida> lista;
    private ArrayList<FacturaEmitida> facturasEmitidas;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void FacturasEmitidas(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        facturasEmitidas = new ArrayList<FacturaEmitida>();
        FacturaEmitida facturaEmitida;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            facturaEmitida = new FacturaEmitida();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            facturaEmitida.setNum(formatUtils.format2digits6("FACEMI",
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "fea":
                            facturaEmitida
                                    .setFea(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "doc":
                            facturaEmitida.setDoc(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "fee":
                            facturaEmitida
                                    .setFee(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "gas":
                            facturaEmitida.setGas(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "cue":
                            facturaEmitida.setCue(formatUtils.formatDigitFacEmi(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "li1":
                            facturaEmitida
                                    .setLi1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "li2":
                            facturaEmitida
                                    .setLi2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt1":
                            facturaEmitida
                                    .setDt1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            facturaEmitida
                                    .setDt2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fuc":
                            facturaEmitida
                                    .setFuc(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "forpag":
                            facturaEmitida.setforpag(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fin":
                            facturaEmitida
                                    .setFin(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "alm":
                            facturaEmitida
                                    .setAlm(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            facturaEmitida
                                    .setCom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            facturaEmitida
                                    .setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nif":
                            facturaEmitida
                                    .setNif(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba1eu":
                            facturaEmitida.setBa1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv1eu":
                            facturaEmitida.setIv1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re1eu":
                            facturaEmitida.setRe1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba2eu":
                            facturaEmitida.setBa2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv2eu":
                            facturaEmitida.setIv2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re2eu":
                            facturaEmitida.setRe2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba3eu":
                            facturaEmitida.setBa3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv3eu":
                            facturaEmitida.setIv3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re3eu":
                            facturaEmitida.setRe3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba4eu":
                            facturaEmitida.setBa4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv4eu":
                            facturaEmitida.setIv4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re4eu":
                            facturaEmitida.setRe4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba5eu":
                            facturaEmitida.setBa5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv5eu":
                            facturaEmitida.setIv5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re5eu":
                            facturaEmitida.setRe5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "exeeu":
                            facturaEmitida.setExeeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ulceu":
                            facturaEmitida.setUlceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "toceu":
                            facturaEmitida.setToceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "enteu":
                            facturaEmitida.setEnteu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imceu":
                            facturaEmitida.setImceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imreu":
                            facturaEmitida.setImreu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tre":
                            facturaEmitida.setTre(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pre":
                            facturaEmitida
                                    .setPre(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ireeu":
                            facturaEmitida.setIreeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "den":
                            facturaEmitida
                                    .setDen(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rut":
                            facturaEmitida.setRut(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "obr":
                            facturaEmitida
                                    .setObr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ivainc":
                            facturaEmitida.setIvainc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tra":
                            facturaEmitida
                                    .setTra(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "entped":
                            facturaEmitida.setEntped(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impuesto":
                            facturaEmitida.setImpuesto(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tip":
                            facturaEmitida
                                    .setTip(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "web":
                            facturaEmitida
                                    .setWeb(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aut":
                            facturaEmitida
                                    .setAut(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "comis":
                            facturaEmitida.setComis(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "negativa":
                            facturaEmitida.setNegativa(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecope":
                            facturaEmitida.setFecope(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efacgen":
                            facturaEmitida.setEfacgen(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efacenv":
                            facturaEmitida.setEfacenv(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "sno":
                            facturaEmitida
                                    .setSno(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dir":
                            facturaEmitida
                                    .setDir(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pob":
                            facturaEmitida
                                    .setPob(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "npro":
                            facturaEmitida.setNpro(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            facturaEmitida
                                    .setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pais":
                            facturaEmitida
                                    .setPais(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303":
                            facturaEmitida.setMod303(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303a":
                            facturaEmitida.setMod303A(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303b":
                            facturaEmitida.setMod303B(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303c":
                            facturaEmitida.setMod303C(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod347":
                            facturaEmitida.setMod347(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "usuario_bloqueo":
                            facturaEmitida.setUsuario_Bloqueo(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "emi_deb_pag":
                            facturaEmitida.setEmi_Deb_Pag(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "emi_incluir":
                            facturaEmitida.setEmi_Incluir(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "emi_antes_dto":
                            facturaEmitida.setEmi_Antes_Dto(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "emi_iva_inc":
                            facturaEmitida.setEmi_Iva_Inc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "moneda":
                            facturaEmitida.setMoneda(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            facturaEmitida.setCotiza(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "basmon":
                            facturaEmitida.setBasmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "totmon":
                            facturaEmitida.setTotmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "entmon":
                            facturaEmitida.setEntmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "obs_doc":
                            facturaEmitida.setObs_Doc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "recargo":
                            facturaEmitida.setRecargo(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "retgar":
                            facturaEmitida.setRetgar(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "porretgar":
                            facturaEmitida.setPorretgar(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impretgar":
                            facturaEmitida.setImpretgar(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tipretgar":
                            facturaEmitida.setTipretgar(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "suplidos":
                            facturaEmitida.setSuplidos(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva1":
                            facturaEmitida
                                    .setIva1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva2":
                            facturaEmitida
                                    .setIva2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva3":
                            facturaEmitida
                                    .setIva3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva4":
                            facturaEmitida
                                    .setIva4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva5":
                            facturaEmitida
                                    .setIva5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec1":
                            facturaEmitida
                                    .setRec1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec2":
                            facturaEmitida
                                    .setRec2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec3":
                            facturaEmitida
                                    .setRec3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec4":
                            facturaEmitida
                                    .setRec4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec5":
                            facturaEmitida
                                    .setRec5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tipivaok":
                            facturaEmitida.setTipivaok(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "exento":
                            facturaEmitida.setExento(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "numtic":
                            facturaEmitida.setNumtic(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cri_caja":
                            facturaEmitida.setCri_Caja(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ded_cie":
                            facturaEmitida.setDed_Cie(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cen_adm":
                            facturaEmitida.setCen_Adm(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiest":
                            facturaEmitida.setSiiest(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiact":
                            facturaEmitida.setSiiact(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitipfra":
                            facturaEmitida.setSiitipfra(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifraemi":
                            facturaEmitida.setSiifraemi(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitiprec":
                            facturaEmitida.setSiitiprec(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitipsuj":
                            facturaEmitida.setSiitipsuj(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitipnsu":
                            facturaEmitida.setSiitipnsu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitipexe":
                            facturaEmitida.setSiitipexe(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesfra":
                            facturaEmitida.setSiidesfra(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiimpnsu":
                            facturaEmitida.setSiiimpnsu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiimptai":
                            facturaEmitida.setSiiimptai(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiimpexe":
                            facturaEmitida.setSiiimpexe(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinifemi":
                            facturaEmitida.setSiinifemi(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiemiter":
                            facturaEmitida.setSiiemiter(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siicupon":
                            facturaEmitida.setSiicupon(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siivardes":
                            facturaEmitida.setSiivardes(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatrec":
                            facturaEmitida.setSiidatrec(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatinm":
                            facturaEmitida.setSiidatinm(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatagr":
                            facturaEmitida.setSiidatagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siibasrec":
                            facturaEmitida.setSiibasrec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siicuorec":
                            facturaEmitida.setSiicuorec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siirecrec":
                            facturaEmitida.setSiirecrec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siibascos":
                            facturaEmitida.setSiibascos(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitraiva":
                            facturaEmitida.setSiitraiva(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siientexe":
                            facturaEmitida.setSiientexe(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siientcexe":
                            facturaEmitida.setSiientcexe(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siienttsuj":
                            facturaEmitida.setSiienttsuj(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siientnsu":
                            facturaEmitida.setSiientnsu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siienttai":
                            facturaEmitida.setSiienttai(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siientdes":
                            facturaEmitida.setSiientdes(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiserexe":
                            facturaEmitida.setSiiserexe(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siisercexe":
                            facturaEmitida.setSiisercexe(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siisertsuj":
                            facturaEmitida.setSiisertsuj(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siisernsu":
                            facturaEmitida.setSiisernsu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siisertai":
                            facturaEmitida.setSiisertai(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiserdes":
                            facturaEmitida.setSiiserdes(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatdes":
                            facturaEmitida.setSiidatdes(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifraemi1":
                            facturaEmitida.setSiifraemi1(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifraemi2":
                            facturaEmitida.setSiifraemi2(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinumacu":
                            facturaEmitida.setSiinumacu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinumresf":
                            facturaEmitida.setSiinumresf(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinemiter":
                            facturaEmitida.setSiinemiter(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesman":
                            facturaEmitida.setSiidesman(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "patron":
                            facturaEmitida.setPatron(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siirefext":
                            facturaEmitida.setSiirefext(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinomensu":
                            facturaEmitida.setSiinomensu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinifensu":
                            facturaEmitida.setSiinifensu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesnoid":
                            facturaEmitida.setSiidesnoid(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifraiden":
                            facturaEmitida.setSiifraiden(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siimergas":
                            facturaEmitida.setSiimergas(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesexen":
                            facturaEmitida.setSiidesexen(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siimacro":
                            facturaEmitida.setSiimacro(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiregprev":
                            facturaEmitida.setSiiregprev(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siientdexe":
                            facturaEmitida.setSiientdexe(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiserdexe":
                            facturaEmitida.setSiiserdexe(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeattipfac":
                            facturaEmitida.setAeattipfac(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeattiping":
                            facturaEmitida.setAeattiping(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeatimpcon":
                            facturaEmitida.setAeatimpcon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    sqlController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                sqlController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(facturaEmitida);
            System.out.println("----------------------------------------------------------"); */
            facturasEmitidas.add(facturaEmitida);
        }
        lista.setLista(facturasEmitidas);
    }
}
