package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.MarcasArticulo;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class MarcasArticuloExcelSwitch {
    private ExcelController excelController;
    private ConnectionController connectionController;
    private FinalList<MarcasArticulo> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private ArrayList<MarcasArticulo> marcasArticulos;
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void MarcasArticulos(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        marcasArticulos = new ArrayList<MarcasArticulo>();
        MarcasArticulo marcasArticulo;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            marcasArticulo = new MarcasArticulo();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            marcasArticulo.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nom":
                            marcasArticulo.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuc":
                            marcasArticulo.setCuc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuv":
                            marcasArticulo.setCuv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "co1":
                            marcasArticulo.setCo1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co2":
                            marcasArticulo.setCo2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co3":
                            marcasArticulo.setCo3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co4":
                            marcasArticulo.setCo4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "co5":
                            marcasArticulo.setCo5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dtocom1":
                            marcasArticulo
                                    .setDtocom1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtocom2":
                            marcasArticulo
                                    .setDtocom2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven1":
                            marcasArticulo
                                    .setDtoven1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dtoven2":
                            marcasArticulo
                                    .setDtoven2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dt1":
                            marcasArticulo.setDt1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt2":
                            marcasArticulo.setDt2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt3":
                            marcasArticulo.setDt3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt4":
                            marcasArticulo.setDt4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dt5":
                            marcasArticulo.setDt5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d01":
                            marcasArticulo.setD01(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d02":
                            marcasArticulo.setD02(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d03":
                            marcasArticulo.setD03(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d04":
                            marcasArticulo.setD04(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "d05":
                            marcasArticulo.setD05(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma1":
                            marcasArticulo.setMa1(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma2":
                            marcasArticulo.setMa2(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma3":
                            marcasArticulo.setMa3(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma4":
                            marcasArticulo.setMa4(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ma5":
                            marcasArticulo.setMa5(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ima":
                            marcasArticulo.setIma(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fot":
                            marcasArticulo.setFot(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "abr":
                            marcasArticulo.setAbr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pos":
                            marcasArticulo.setPos(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ctadevcom":
                            marcasArticulo.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadevven":
                            marcasArticulo.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtocom":
                            marcasArticulo.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ctadtoven":
                            marcasArticulo.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                    excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "historia":
                            marcasArticulo
                                    .setHistoria(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println();
            System.out.println("----------------------------------------------------------"); */
            marcasArticulos.add(marcasArticulo);
        }
        lista.setLista(marcasArticulos);
    }
}