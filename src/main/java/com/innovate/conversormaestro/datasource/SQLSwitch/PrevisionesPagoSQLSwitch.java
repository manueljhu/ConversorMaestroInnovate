package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class PrevisionesPagoSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Efecto> lista;
    private ArrayList<Efecto> previsionespagos;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PrevisionesPago(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        previsionespagos = new ArrayList<Efecto>();
        Efecto previsionespago;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            previsionespago = new Efecto();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                previsionespago.setTip("P");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            previsionespago.setNum(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "fec":
                            previsionespago
                                    .setFec(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cue":
                            previsionespago.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "con":
                            previsionespago.setCon(formatUtils.formatEfectCon(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())), "R",
                                    "SQL", i));
                            break;
                        case "ban":
                            previsionespago
                                    .setBan(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "vto":
                            previsionespago
                                    .setVto(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fac":
                            previsionespago.setFac(formatUtils.formatEfectFac(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())), "R"));
                            break;
                        case "rem":
                            previsionespago
                                    .setRem(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fre":
                            previsionespago
                                    .setFre(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fpa":
                            previsionespago
                                    .setFpa(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dev":
                            previsionespago
                                    .setDev(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx1":
                            previsionespago
                                    .setXx1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx2":
                            previsionespago
                                    .setXx2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx3":
                            previsionespago
                                    .setXx3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impeu":
                            previsionespago.setImpeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pageu":
                            previsionespago.setPageu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "car":
                            previsionespago.setCar(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imprem":
                            previsionespago.setImprem(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cueapu":
                            previsionespago
                                    .setCueapu(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impdev":
                            previsionespago.setImpdev(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impgas":
                            previsionespago.setImpgas(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            previsionespago
                                    .setRie(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rut":
                            previsionespago
                                    .setRut(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu1":
                            previsionespago
                                    .setCu1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu2":
                            previsionespago
                                    .setCu2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu3":
                            previsionespago
                                    .setCu3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu4":
                            previsionespago
                                    .setCu4(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "serie":
                            previsionespago.setSerie(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impreso":
                            previsionespago
                                    .setImpreso(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_tipagr":
                            previsionespago
                                    .setEfe_Tipagr(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_docagr":
                            previsionespago
                                    .setEfe_Docagr(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_nefagr":
                            previsionespago
                                    .setEfe_Nefagr(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_genagr":
                            previsionespago
                                    .setEfe_Genagr(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_ren":
                            previsionespago
                                    .setEfe_Ren(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "numefedev":
                            previsionespago
                                    .setNumefedev(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "moneda":
                            previsionespago.setMoneda(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            previsionespago.setCotiza(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impmon":
                            previsionespago.setImpmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            previsionespago.setDiasmax(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            previsionespago
                                    .setFecini(
                                            SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
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
            System.out.println(previsionespago);
            System.out.println("----------------------------------------------------------"); */
            previsionespagos.add(previsionespago);
        }
        lista.setLista(previsionespagos);
    }
}
