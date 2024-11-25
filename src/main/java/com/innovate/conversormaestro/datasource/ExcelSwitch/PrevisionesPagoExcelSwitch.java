package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class PrevisionesPagoExcelSwitch {
    private ExcelController excelController;
    private ConnectionController connectionController;
    private FinalList<Efecto> lista;
    private ArrayList<Efecto> previsionespagos;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PrevisionesPago(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        previsionespagos = new ArrayList<Efecto>();
        Efecto previsionespago;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            previsionespago = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionespago.setTip("P");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            previsionespago.setNum(formatUtils.format6digits(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fec":
                            previsionespago
                                    .setFec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cue":
                            previsionespago.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "con":
                            previsionespago.setCon(formatUtils.formatEfectCon(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R", "Excel",
                                    i));
                            break;
                        case "ban":
                            previsionespago
                                    .setBan(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vto":
                            previsionespago
                                    .setVto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fac":
                            previsionespago.setFac(formatUtils.formatEfectFac(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R"));
                            break;
                        case "rem":
                            previsionespago
                                    .setRem(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fre":
                            previsionespago
                                    .setFre(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fpa":
                            previsionespago
                                    .setFpa(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dev":
                            previsionespago
                                    .setDev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx1":
                            previsionespago
                                    .setXx1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx2":
                            previsionespago
                                    .setXx2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx3":
                            previsionespago
                                    .setXx3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impeu":
                            previsionespago.setImpeu(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pageu":
                            previsionespago.setPageu(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "car":
                            previsionespago.setCar(
                                    Integer.parseInt(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imprem":
                            previsionespago.setImprem(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cueapu":
                            previsionespago
                                    .setCueapu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impdev":
                            previsionespago.setImpdev(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impgas":
                            previsionespago.setImpgas(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            previsionespago
                                    .setRie(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut":
                            previsionespago
                                    .setRut(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu1":
                            previsionespago
                                    .setCu1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu2":
                            previsionespago
                                    .setCu2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu3":
                            previsionespago
                                    .setCu3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu4":
                            previsionespago
                                    .setCu4(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "serie":
                            previsionespago.setSerie(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impreso":
                            previsionespago
                                    .setImpreso(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_tipagr":
                            previsionespago
                                    .setEfe_Tipagr(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_docagr":
                            previsionespago
                                    .setEfe_Docagr(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_nefagr":
                            previsionespago
                                    .setEfe_Nefagr(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_genagr":
                            previsionespago
                                    .setEfe_Genagr(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_ren":
                            previsionespago
                                    .setEfe_Ren(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "numefedev":
                            previsionespago
                                    .setNumefedev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "moneda":
                            previsionespago.setMoneda(
                                    Integer.parseInt(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            previsionespago.setCotiza(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impmon":
                            previsionespago.setImpmon(
                                    Float.parseFloat(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            previsionespago.setDiasmax(
                                    Integer.parseInt(
                                            excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            previsionespago
                                    .setFecini(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println(previsionespago);
            System.out.println("----------------------------------------------------------"); */
            previsionespagos.add(previsionespago);
        }
        lista.setLista(previsionespagos);
    }
}
