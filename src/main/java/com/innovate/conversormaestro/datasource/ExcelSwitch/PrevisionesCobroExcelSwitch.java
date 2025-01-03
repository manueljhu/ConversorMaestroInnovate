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

public class PrevisionesCobroExcelSwitch {
    private ExcelController excelController;
    private ConnectionController connectionController;
    private FinalList<Efecto> lista;
    private ArrayList<Efecto> previsionescobros;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PrevisionesCobro(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        previsionescobros = new ArrayList<Efecto>();
        Efecto previsionescobro;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            previsionescobro = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionescobro.setTip("C");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            previsionescobro.setNum(formatUtils.format6digits(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fec":
                            previsionescobro
                                    .setFec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cue":
                            previsionescobro.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "con":
                            previsionescobro.setCon(formatUtils.formatEfectCon(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E", "Excel",
                                    i));
                            break;
                        case "ban":
                            previsionescobro
                                    .setBan(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vto":
                            previsionescobro
                                    .setVto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fac":
                            previsionescobro.setFac(formatUtils.formatEfectFac(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E"));
                            break;
                        case "rem":
                            previsionescobro
                                    .setRem(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fre":
                            previsionescobro
                                    .setFre(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fpa":
                            previsionescobro
                                    .setFpa(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dev":
                            previsionescobro
                                    .setDev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx1":
                            previsionescobro
                                    .setXx1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx2":
                            previsionescobro
                                    .setXx2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx3":
                            previsionescobro
                                    .setXx3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impeu":
                            previsionescobro.setImpeu(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pageu":
                            previsionescobro.setPageu(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "car":
                            previsionescobro.setCar(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imprem":
                            previsionescobro.setImprem(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cueapu":
                            previsionescobro
                                    .setCueapu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impdev":
                            previsionescobro.setImpdev(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impgas":
                            previsionescobro.setImpgas(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            previsionescobro
                                    .setRie(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut":
                            previsionescobro
                                    .setRut(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu1":
                            previsionescobro
                                    .setCu1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu2":
                            previsionescobro
                                    .setCu2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu3":
                            previsionescobro
                                    .setCu3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu4":
                            previsionescobro
                                    .setCu4(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "serie":
                            previsionescobro.setSerie(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impreso":
                            previsionescobro
                                    .setImpreso(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_tipagr":
                            previsionescobro.setEfe_Tipagr(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_docagr":
                            previsionescobro.setEfe_Docagr(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_nefagr":
                            previsionescobro.setEfe_Nefagr(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_genagr":
                            previsionescobro.setEfe_Genagr(
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_ren":
                            previsionescobro
                                    .setEfe_Ren(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "numefedev":
                            previsionescobro
                                    .setNumefedev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "moneda":
                            previsionescobro.setMoneda(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            previsionescobro.setCotiza(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impmon":
                            previsionescobro.setImpmon(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            previsionescobro.setDiasmax(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            previsionescobro
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
            System.out.println(previsionescobro);
            System.out.println("----------------------------------------------------------"); */
            previsionescobros.add(previsionescobro);
        }
        lista.setLista(previsionescobros);
    }
}