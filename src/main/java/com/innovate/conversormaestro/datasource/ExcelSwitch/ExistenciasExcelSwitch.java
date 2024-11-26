package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Stock;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class ExistenciasExcelSwitch {
    private ExcelController excelController;
    private FinalList<Stock> lista;
    private ArrayList<Stock> existencias;
    private ExcelUtils excelUtils = new ExcelUtils();
    private int nErrors;
    private boolean newConvert;

    public void Existencias(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        existencias = new ArrayList<Stock>();
        Stock existencia;
        nErrors = 0;
        newConvert = true;

        for (int i = 1; i <= nFilas; i++) {
            existencia = new Stock();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            existencia.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "exi":
                            existencia.setExi(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ent":
                            existencia.setEnt(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "sal":
                            existencia.setSal(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ubi":
                            existencia.setUbi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ide":
                            existencia.setIde(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "min":
                            existencia.setMin(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "max":
                            existencia.setMax(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;

                        case "dis_cae":
                            existencia.setDis_cae(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cas":
                            existencia.setDis_cas(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cai":
                            existencia.setDis_cai(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pii":
                            existencia.setDis_pii(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pie":
                            existencia.setDis_pie(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pis":
                            existencia.setDis_pis(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
            System.out.println(existencia);
            System.out.println("----------------------------------------------------------"); */
            existencias.add(existencia);
        }
        lista.setLista(existencias);
    }
}
