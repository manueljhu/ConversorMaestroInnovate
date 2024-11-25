package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Subfamilia;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class SubFamiliasDBFSwitch {
    private DBFController dbfController;
    private ConnectionController connectionController;
    private FinalList<Subfamilia> lista;
    private ArrayList<Subfamilia> subfamilias = new ArrayList<>();
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void Subfamilias(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        subfamilias = new ArrayList<>();
        Subfamilia subfamilia;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            subfamilia = new Subfamilia();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            subfamilia.setCod(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nom":
                            subfamilia.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuc":
                            subfamilia.setCuc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuv":
                            subfamilia.setCuv(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "co1":
                            subfamilia.setCo1(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co2":
                            subfamilia.setCo2(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co3":
                            subfamilia.setCo3(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co4":
                            subfamilia.setCo4(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co5":
                            subfamilia.setCo5(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtocom1":
                            subfamilia.setDtocom1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtocom2":
                            subfamilia.setDtocom2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven1":
                            subfamilia.setDtoven1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven2":
                            subfamilia.setDtoven2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dt1":
                            subfamilia.setDt1(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            subfamilia.setDt2(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt3":
                            subfamilia.setDt3(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt4":
                            subfamilia.setDt4(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt5":
                            subfamilia.setDt5(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d01":
                            subfamilia.setD01(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d02":
                            subfamilia.setD02(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d03":
                            subfamilia.setD03(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d04":
                            subfamilia.setD04(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d05":
                            subfamilia.setD05(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma1":
                            subfamilia.setMa1(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma2":
                            subfamilia.setMa2(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma3":
                            subfamilia.setMa3(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma4":
                            subfamilia.setMa4(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma5":
                            subfamilia.setMa5(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ima":
                            subfamilia.setIma(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fot":
                            subfamilia.setFot(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "abr":
                            subfamilia.setAbr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pos":
                            subfamilia.setPos(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ctadevcom":
                            subfamilia.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadevven":
                            subfamilia.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtocom":
                            subfamilia.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtoven":
                            subfamilia.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "historia":
                            subfamilia.setHistoria(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fam":
                            subfamilia.setFam(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println();
            System.out.println("----------------------------------------------------------"); */
            subfamilias.add(subfamilia);
        }
        lista.setLista(subfamilias);
    }
}