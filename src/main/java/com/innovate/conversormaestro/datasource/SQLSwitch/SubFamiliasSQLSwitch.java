package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Subfamilia;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class SubFamiliasSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Subfamilia> lista;
    private ArrayList<Subfamilia> subfamilias = new ArrayList<>();
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void Subfamilias(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        subfamilias = new ArrayList<>();
        Subfamilia subfamilia;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            subfamilia = new Subfamilia();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            subfamilia
                                    .setCod(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            subfamilia
                                    .setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cuc":
                            subfamilia
                                    .setCuc(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cuv":
                            subfamilia
                                    .setCuv(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co1":
                            subfamilia
                                    .setCo1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co2":
                            subfamilia
                                    .setCo2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co3":
                            subfamilia
                                    .setCo3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co4":
                            subfamilia
                                    .setCo4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co5":
                            subfamilia
                                    .setCo5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtocom1":
                            subfamilia.setDtocom1(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtocom2":
                            subfamilia.setDtocom2(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtoven1":
                            subfamilia.setDtoven1(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtoven2":
                            subfamilia.setDtoven2(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt1":
                            subfamilia
                                    .setDt1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            subfamilia
                                    .setDt2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt3":
                            subfamilia
                                    .setDt3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt4":
                            subfamilia
                                    .setDt4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt5":
                            subfamilia
                                    .setDt5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d01":
                            subfamilia
                                    .setD01(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d02":
                            subfamilia
                                    .setD02(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d03":
                            subfamilia
                                    .setD03(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d04":
                            subfamilia
                                    .setD04(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d05":
                            subfamilia
                                    .setD05(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma1":
                            subfamilia
                                    .setMa1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma2":
                            subfamilia
                                    .setMa2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma3":
                            subfamilia
                                    .setMa3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma4":
                            subfamilia
                                    .setMa4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma5":
                            subfamilia
                                    .setMa5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ima":
                            subfamilia
                                    .setIma(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fot":
                            subfamilia
                                    .setFot(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "abr":
                            subfamilia
                                    .setAbr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pos":
                            subfamilia
                                    .setPos(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadevcom":
                            subfamilia.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "ctadevven":
                            subfamilia.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "ctadtocom":
                            subfamilia.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "ctadtoven":
                            subfamilia.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "historia":
                            subfamilia.setHistoria(
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fam":
                            subfamilia
                                    .setFam(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
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
            System.out.println(subfamilia);
            System.out.println("----------------------------------------------------------"); */
            subfamilias.add(subfamilia);
        }
        lista.setLista(subfamilias);
    }
}