package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FacturaRecibida;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class FacturasRecibidasSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<FacturaRecibida> lista;
    private ArrayList<FacturaRecibida> facturasRecibidas;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void FacturasRecibidas(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        facturasRecibidas = new ArrayList<FacturaRecibida>();
        FacturaRecibida facturaRecibida;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            facturaRecibida = new FacturaRecibida();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            facturaRecibida.setNum(formatUtils.format2digits6("FACREC",
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "fea":
                            facturaRecibida
                                    .setFea(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "doc":
                            facturaRecibida.setDoc(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "nuf":
                            facturaRecibida
                                    .setNuf(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fee":
                            facturaRecibida
                                    .setFee(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "gas":
                            facturaRecibida
                                    .setGas(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cue":
                            facturaRecibida.setCue(formatUtils.formatDigitFacRec(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "li1":
                            facturaRecibida
                                    .setLi1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "li2":
                            facturaRecibida
                                    .setLi2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt1":
                            facturaRecibida
                                    .setDt1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            facturaRecibida
                                    .setDt2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fuc":
                            facturaRecibida
                                    .setFuc(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "for":
                            facturaRecibida.setforpag(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fin":
                            facturaRecibida
                                    .setFin(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "alm":
                            facturaRecibida
                                    .setAlm(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            facturaRecibida
                                    .setCom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            facturaRecibida
                                    .setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nif":
                            facturaRecibida
                                    .setNif(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tra":
                            facturaRecibida
                                    .setTra(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba1eu":
                            facturaRecibida.setBa1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv1eu":
                            facturaRecibida.setIv1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re1eu":
                            facturaRecibida.setRe1Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba2eu":
                            facturaRecibida.setBa2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv2eu":
                            facturaRecibida.setIv2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re2eu":
                            facturaRecibida.setRe2Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba3eu":
                            facturaRecibida.setBa3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv3eu":
                            facturaRecibida.setIv3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re3eu":
                            facturaRecibida.setRe3Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba4eu":
                            facturaRecibida.setBa4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv4eu":
                            facturaRecibida.setIv4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re4eu":
                            facturaRecibida.setRe4Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ba5eu":
                            facturaRecibida.setBa5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iv5eu":
                            facturaRecibida.setIv5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "re5eu":
                            facturaRecibida.setRe5Eu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "exeeu":
                            facturaRecibida.setExeeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ulceu":
                            facturaRecibida.setUlceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "toceu":
                            facturaRecibida.setToceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "enteu":
                            facturaRecibida.setEnteu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imceu":
                            facturaRecibida.setImceu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imreu":
                            facturaRecibida.setImreu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tre":
                            facturaRecibida.setTre(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pre":
                            facturaRecibida
                                    .setPre(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ireeu":
                            facturaRecibida.setIreeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ivainc":
                            facturaRecibida.setIvainc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "entped":
                            facturaRecibida.setEntped(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tip":
                            facturaRecibida
                                    .setTip(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aut":
                            facturaRecibida
                                    .setAut(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "negativa":
                            facturaRecibida.setNegativa(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecope":
                            facturaRecibida.setFecope(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303":
                            facturaRecibida.setMod303(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303a":
                            facturaRecibida.setMod303A(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303b":
                            facturaRecibida.setMod303B(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod303c":
                            facturaRecibida.setMod303C(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mod347":
                            facturaRecibida.setMod347(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "usuario_bloqueo":
                            facturaRecibida.setUsuario_Bloqueo(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec_deb_pag":
                            facturaRecibida.setRec_Deb_Pag(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec_incluir":
                            facturaRecibida.setRec_Incluir(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec_antes_dto":
                            facturaRecibida.setRec_Antes_Dto(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec_iva_inc":
                            facturaRecibida.setRec_Iva_Inc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "moneda":
                            facturaRecibida.setMoneda(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            facturaRecibida.setCotiza(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "basmon":
                            facturaRecibida.setBasmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "totmon":
                            facturaRecibida.setTotmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "entmon":
                            facturaRecibida.setEntmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "obs_doc":
                            facturaRecibida.setObs_Doc(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "recargo":
                            facturaRecibida.setRecargo(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            facturaRecibida.setDiasmax(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            facturaRecibida.setFecini(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "suplidos":
                            facturaRecibida.setSuplidos(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva1":
                            facturaRecibida
                                    .setIva1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva2":
                            facturaRecibida
                                    .setIva2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva3":
                            facturaRecibida
                                    .setIva3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva4":
                            facturaRecibida
                                    .setIva4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iva5":
                            facturaRecibida
                                    .setIva5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec1":
                            facturaRecibida
                                    .setRec1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec2":
                            facturaRecibida
                                    .setRec2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec3":
                            facturaRecibida
                                    .setRec3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec4":
                            facturaRecibida
                                    .setRec4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rec5":
                            facturaRecibida
                                    .setRec5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "tipivaok":
                            facturaRecibida.setTipivaok(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "exento":
                            facturaRecibida.setExento(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cri_caja":
                            facturaRecibida.setCri_Caja(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ded_cie":
                            facturaRecibida.setDed_Cie(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiest":
                            facturaRecibida.setSiiest(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiact":
                            facturaRecibida.setSiiact(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitipfra":
                            facturaRecibida.setSiitipfra(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifrarec":
                            facturaRecibida.setSiifrarec(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siitiprec":
                            facturaRecibida.setSiitiprec(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesfra":
                            facturaRecibida.setSiidesfra(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinifemi":
                            facturaRecibida.setSiinifemi(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siicuoded":
                            facturaRecibida.setSiicuoded(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifecper":
                            facturaRecibida.setSiifecper(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatrec":
                            facturaRecibida.setSiidatrec(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatagr":
                            facturaRecibida.setSiidatagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siibasrec":
                            facturaRecibida.setSiibasrec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siicuorec":
                            facturaRecibida.setSiicuorec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siirecrec":
                            facturaRecibida.setSiirecrec(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siibascos":
                            facturaRecibida.setSiibascos(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiiss":
                            facturaRecibida.setSiiiss(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidatdes":
                            facturaRecibida.setSiidatdes(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifrarec1":
                            facturaRecibida.setSiifrarec1(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifrarec2":
                            facturaRecibida.setSiifrarec2(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinumacu":
                            facturaRecibida.setSiinumacu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinumresf":
                            facturaRecibida.setSiinumresf(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siidesman":
                            facturaRecibida.setSiidesman(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "patron":
                            facturaRecibida.setPatron(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siirefext":
                            facturaRecibida.setSiirefext(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinomensu":
                            facturaRecibida.setSiinomensu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siinifensu":
                            facturaRecibida.setSiinifensu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siifraiden":
                            facturaRecibida.setSiifraiden(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siimacro":
                            facturaRecibida.setSiimacro(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "siiregprev":
                            facturaRecibida.setSiiregprev(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeattipfac":
                            facturaRecibida.setAeattipfac(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeattipgas":
                            facturaRecibida.setAeattipgas(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "aeatimpcon":
                            facturaRecibida.setAeatimpcon(
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
            facturasRecibidas.add(facturaRecibida);
        }
        lista.setLista(facturasRecibidas);
    }
}
