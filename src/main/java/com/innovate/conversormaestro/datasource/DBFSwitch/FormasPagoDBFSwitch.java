package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.FormaPago;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FormasPagoDBFSwitch {
    private DBFController dbfController = DBFController.getDBFController();
    private FinalList<FormaPago> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<FormaPago> formasPago;
    private FormatUtils formatUtils = new FormatUtils();

    public void FormasPago(ArrayList<Relacion> relaciones) {
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        formasPago = new ArrayList<FormaPago>();
        FormaPago formaPago;
        int idforpag = formatUtils.formatUpdate("FORPAG");

        if (dbfController.isBeEmpty()){
            idforpag = 1;
        }

        for (int i = 1; i <= nFilas; i++) {
            formaPago = new FormaPago();
            formaPago.setId(idforpag);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "id":
                        formaPago.setId(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        formaPago.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "di1":
                        formaPago.setDi1(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        formaPago.setDi2(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        formaPago.setDir(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "npa":
                        formaPago.setNpa(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "mes":
                        formaPago.setMes(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        formaPago.setVto(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inc":
                        formaPago.setInc(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cad":
                        formaPago.setCad(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cob":
                        formaPago.setCob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        formaPago.setCar(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "porcobdir":
                        formaPago.setPorcobdir(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inclib":
                        formaPago.setInclib(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "reppro":
                        formaPago.setReppro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuecobdir":
                        formaPago.setCuecobdir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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