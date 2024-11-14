package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Stock;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class ExistenciasExcelSwitch {
    private FinalList<Stock> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Stock> existencias;

    public void Existencias(ArrayList<Relacion> relaciones) {
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        existencias = new ArrayList<Stock>();
        Stock existencia;

        for (int i = 1; i <= nFilas; i++) {
            existencia = new Stock();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        existencia.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exi":
                        existencia.setExi(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ent":
                        existencia.setEnt(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sal":
                        existencia.setSal(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ubi":
                        existencia.setUbi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ide":
                        existencia.setIde(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "min":
                        existencia.setMin(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "max":
                        existencia.setMax(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            //System.out.println(existencia);
            existencias.add(existencia);
        }
        lista.setLista(existencias);
    }
}
