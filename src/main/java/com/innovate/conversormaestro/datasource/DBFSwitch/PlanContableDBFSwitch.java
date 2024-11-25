package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Cuenta;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class PlanContableDBFSwitch {
    private DBFController dbfController;
    private ConnectionController connectionController;
    private FinalList<Cuenta> lista;
    private ArrayList<Cuenta> planesContables;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PlanesContables(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        planesContables = new ArrayList<Cuenta>();
        Cuenta planContable;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            planContable = new Cuenta();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cue":
                            planContable.setCue(formatUtils.formatDigitPlanCon(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            planContable.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nif":
                            planContable.setNif(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "deb":
                            planContable.setDeb(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "hab":
                            planContable.setHab(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dir":
                            planContable.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pob":
                            planContable.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "npro":
                            planContable.setNpro(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            planContable.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cont1":
                            planContable.setCont1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cont2":
                            planContable.setCont2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cont3":
                            planContable.setCont3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cont4":
                            planContable.setCont4(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cont5":
                            planContable.setCont5(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons1":
                            planContable.setCons1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons2":
                            planContable.setCons2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons3":
                            planContable.setCons3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons4":
                            planContable.setCons4(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons5":
                            planContable.setCons5(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons6":
                            planContable.setCons6(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons7":
                            planContable.setCons7(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons8":
                            planContable.setCons8(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons9":
                            planContable.setCons9(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cons10":
                            planContable.setCons10(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            planContable.setPais(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "gru":
                            planContable.setGru(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nifr":
                            planContable.setNifr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tdoc":
                            planContable.setTdoc(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lopd_Ori":
                            planContable.setLopd_Ori(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "lopd_Otr_O":
                            planContable
                                    .setLopd_Otr_O(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_Ces":
                            planContable
                                    .setLopd_Ces(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lopd_Otr_C":
                            planContable
                                    .setLopd_Otr_C(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cue_Apoyo":
                            planContable
                                    .setCue_Apoyo(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lap_Den":
                            planContable.setLap_Den(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lap_Con":
                            planContable.setLap_Con(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "lap_Cta":
                            planContable.setLap_Cta(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ope_Tip":
                            planContable.setOpe_Tip(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ope_Cla":
                            planContable.setOpe_Cla(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ope_Pla":
                            planContable.setOpe_Pla(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ope_Des":
                            planContable.setOpe_Des(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cta":
                            planContable.setCta(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "suf":
                            planContable.setSuf(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "iban":
                            planContable.setIban(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "swift":
                            planContable.setSwift(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cri_Caja":
                            planContable
                                    .setCri_Caja(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "siidesfac":
                            planContable
                                    .setSiidesfac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "patron":
                            planContable.setPatron(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "patron_Cv":
                            planContable
                                    .setPatron_Cv(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println(planContable);
            System.out.println("----------------------------------------------------------"); */
            planesContables.add(planContable);
        }
        lista.setLista(planesContables);
    }
}