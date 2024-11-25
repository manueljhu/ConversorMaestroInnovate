package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.Apunte;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class AsientosExcelSwitch {
    private ExcelController excelController;
    private ConnectionController connectionController;
    private FinalList<Apunte> lista;
    private ArrayList<Apunte> asientos;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void Asientos(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        asientos = new ArrayList<Apunte>();
        Apunte asiento;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            asiento = new Apunte();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            asiento.setNum(formatUtils
                                    .format6digits(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fec":
                            asiento.setFec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cue":
                            asiento.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "con":
                            asiento.setCon(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "sig":
                            asiento.setSig(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "mar":
                            asiento.setMar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fac":
                            asiento.setFac(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "doc":
                            asiento.setDoc(formatUtils
                                    .format6digits(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "xxx":
                            asiento.setXxx(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impeu":
                            asiento.setImpeu(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "acl":
                            asiento.setAcl(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cen":
                            asiento.setCen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ren":
                            asiento.setRen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "met":
                            asiento.setMet(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "apu_tipdoc":
                            asiento.setApu_Tipdoc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "apu_numdoc":
                            asiento.setApu_Numdoc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "anno_efe":
                            asiento.setAnno_Efe(
                                    Integer.parseInt(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    excelController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                excelController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(asiento);
            System.out.println("----------------------------------------------------------"); */
            asientos.add(asiento);
        }
        lista.setLista(asientos);
    }
}
