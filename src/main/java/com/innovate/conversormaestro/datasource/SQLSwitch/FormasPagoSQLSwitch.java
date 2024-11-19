package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.FormaPago;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FormasPagoSQLSwitch {
    private SQLController sqlController;
    private FinalList<FormaPago> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<FormaPago> formasPago;
    private FormatUtils formatUtils = new FormatUtils();

    public void FormasPago(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        formasPago = new ArrayList<FormaPago>();
        FormaPago formaPago;
        int idforpag = formatUtils.formatUpdate("FORPAG");

        if (sqlController.isBeEmpty()){
            idforpag = 1;
        }

        for (int i = 0; i < nFilas; i++) {
            formaPago = new FormaPago();
            formaPago.setId(idforpag);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "id":
                        formaPago.setId(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        formaPago.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "di1":
                        formaPago.setDi1(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        formaPago.setDi2(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        formaPago.setDir(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "npa":
                        formaPago.setNpa(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mes":
                        formaPago.setMes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        formaPago.setVto(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inc":
                        formaPago.setInc(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cad":
                        formaPago.setCad(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cob":
                        formaPago.setCob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        formaPago.setCar(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "porcobdir":
                        formaPago.setPorcobdir(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inclib":
                        formaPago.setInclib(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "reppro":
                        formaPago.setReppro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuecobdir":
                        formaPago.setCuecobdir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            idforpag++;
            //System.out.println(formaPago);
            formasPago.add(formaPago);
        }
        lista.setLista(formasPago);
    }   
}