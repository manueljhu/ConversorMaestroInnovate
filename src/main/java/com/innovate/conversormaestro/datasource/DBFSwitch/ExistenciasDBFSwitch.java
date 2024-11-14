package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Stock;
import com.innovate.conversormaestro.utils.DBFUtils;

public class ExistenciasDBFSwitch {
    private FinalList<Stock> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<Stock> existencias;

    public void Existencias(ArrayList<Relacion> relaciones) {
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        existencias = new ArrayList<Stock>();
        Stock existencia;

        for (int i = 1; i <= nFilas; i++) {
            existencia = new Stock();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        existencia.setCod(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exi":
                        existencia.setExi(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ent":
                        existencia.setEnt(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sal":
                        existencia.setSal(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ubi":
                        existencia.setUbi(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ide":
                        existencia.setIde(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "min":
                        existencia.setMin(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "max":
                        existencia.setMax(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            //System.out.println(existencia);
            existencias.add(existencia);
        }
        lista.setLista(existencias);
    }
}
