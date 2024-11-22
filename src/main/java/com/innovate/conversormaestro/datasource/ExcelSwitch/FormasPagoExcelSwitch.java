package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.FormaPago;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class FormasPagoExcelSwitch {
    private ExcelController excelController;
    private FinalList<FormaPago> lista;
    private ArrayList<FormaPago> formasPago;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void FormasPago(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        formasPago = new ArrayList<FormaPago>();
        FormaPago formaPago;
        int idforpag = formatUtils.formatUpdate("FORPAG");
        nErrors = 0;
        newConvert = true;

        if (excelController.isBeEmpty()) {
            idforpag = 1;
        }

        for (int i = 1; i <= nFilas; i++) {
            formaPago = new FormaPago();
            formaPago.setId(idforpag);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "id":
                            formaPago.setId(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            formaPago.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "di1":
                            formaPago.setDi1(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "di2":
                            formaPago.setDi2(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dir":
                            formaPago.setDir(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "npa":
                            formaPago.setNpa(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "mes":
                            formaPago.setMes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vto":
                            formaPago.setVto(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "inc":
                            formaPago.setInc(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cad":
                            formaPago.setCad(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cob":
                            formaPago.setCob(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "car":
                            formaPago.setCar(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "porcobdir":
                            formaPago.setPorcobdir(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "inclib":
                            formaPago.setInclib(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "reppro":
                            formaPago.setReppro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cuecobdir":
                            formaPago
                                    .setCuecobdir(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            }
            /* System.out.println("Fila: " + i);
            System.out.println();
            System.out.println("----------------------------------------------------------"); */
            idforpag++;
            formasPago.add(formaPago);
        }
        lista.setLista(formasPago);
    }
}