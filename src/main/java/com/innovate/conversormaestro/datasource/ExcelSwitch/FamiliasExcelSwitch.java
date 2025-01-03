package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.Familia;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class FamiliasExcelSwitch {
    private ExcelController excelController;
    private ConnectionController connectionController;
    private FinalList<Familia> lista;
    private ArrayList<Familia> familias;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void Familias(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        familias = new ArrayList<Familia>();
        Familia familia;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            familia = new Familia();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            familia.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nom":
                            familia.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuc":
                            familia.setCuc(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cuv":
                            familia.setCuv(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co1":
                            familia.setCo1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co2":
                            familia.setCo2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co3":
                            familia.setCo3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co4":
                            familia.setCo4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co5":
                            familia.setCo5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtocom1":
                            familia.setDtocom1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtocom2":
                            familia.setDtocom2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven1":
                            familia.setDtoven1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven2":
                            familia.setDtoven2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dt1":
                            familia.setDt1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            familia.setDt2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt3":
                            familia.setDt3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt4":
                            familia.setDt4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt5":
                            familia.setDt5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d01":
                            familia.setD01(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d02":
                            familia.setD02(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d03":
                            familia.setD03(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d04":
                            familia.setD04(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d05":
                            familia.setD05(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma1":
                            familia.setMa1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma2":
                            familia.setMa2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma3":
                            familia.setMa3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma4":
                            familia.setMa4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma5":
                            familia.setMa5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ima":
                            familia.setIma(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fot":
                            familia.setFot(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "abr":
                            familia.setAbr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pos":
                            familia.setPos(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ctadevcom":
                            familia.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadevven":
                            familia.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtocom":
                            familia.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtoven":
                            familia.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "historia":
                            familia.setHistoria(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "tipima":
                            familia.setTipima(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
            /*
             * System.out.println("Fila: " + i);
             * System.out.println(familia);
             * System.out.println(
             * "----------------------------------------------------------");
             */
            familias.add(familia);
        }
        lista.setLista(familias);
    }
}