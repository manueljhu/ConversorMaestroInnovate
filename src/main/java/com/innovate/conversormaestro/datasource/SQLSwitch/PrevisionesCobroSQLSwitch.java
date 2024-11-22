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

public class PrevisionesCobroSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Efecto> lista;
    private ArrayList<Efecto> previsionescobros;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PrevisionesCobro(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        previsionescobros = new ArrayList<Efecto>();
        Efecto previsionescobro;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            previsionescobro = new Efecto();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                previsionescobro.setTip("C");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            previsionescobro.setNum(formatUtils.format6digits(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "fec":
                            previsionescobro
                                    .setFec(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cue":
                            previsionescobro.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "con":
                            previsionescobro.setCon(formatUtils.formatEfectCon(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())), "E",
                                    "SQL", i));
                            break;
                        case "ban":
                            previsionescobro
                                    .setBan(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "vto":
                            previsionescobro
                                    .setVto(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fac":
                            previsionescobro.setFac(formatUtils.formatEfectFac(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())), "E"));
                            break;
                        case "rem":
                            previsionescobro
                                    .setRem(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fre":
                            previsionescobro
                                    .setFre(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fpa":
                            previsionescobro
                                    .setFpa(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dev":
                            previsionescobro
                                    .setDev(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx1":
                            previsionescobro
                                    .setXx1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx2":
                            previsionescobro
                                    .setXx2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xx3":
                            previsionescobro
                                    .setXx3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impeu":
                            previsionescobro.setImpeu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pageu":
                            previsionescobro.setPageu(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "car":
                            previsionescobro.setCar(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imprem":
                            previsionescobro.setImprem(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cueapu":
                            previsionescobro.setCueapu(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impdev":
                            previsionescobro.setImpdev(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impgas":
                            previsionescobro.setImpgas(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            previsionescobro
                                    .setRie(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rut":
                            previsionescobro
                                    .setRut(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu1":
                            previsionescobro
                                    .setCu1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu2":
                            previsionescobro
                                    .setCu2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu3":
                            previsionescobro
                                    .setCu3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cu4":
                            previsionescobro
                                    .setCu4(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "serie":
                            previsionescobro.setSerie(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impreso":
                            previsionescobro.setImpreso(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_tipagr":
                            previsionescobro.setEfe_Tipagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_docagr":
                            previsionescobro.setEfe_Docagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_nefagr":
                            previsionescobro.setEfe_Nefagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_genagr":
                            previsionescobro.setEfe_Genagr(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "efe_ren":
                            previsionescobro.setEfe_Ren(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "numefedev":
                            previsionescobro.setNumefedev(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "moneda":
                            previsionescobro.setMoneda(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            previsionescobro.setCotiza(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impmon":
                            previsionescobro.setImpmon(
                                    SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            previsionescobro.setDiasmax(
                                    SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            previsionescobro.setFecini(
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
            }
            /* System.out.println("Fila: " + i);
            System.out.println(previsionescobro);
            System.out.println("----------------------------------------------------------"); */
            previsionescobros.add(previsionescobro);
        }
        lista.setLista(previsionescobros);
    }
}