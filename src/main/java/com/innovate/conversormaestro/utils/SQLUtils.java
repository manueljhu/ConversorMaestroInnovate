package com.innovate.conversormaestro.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Relacion;

public class SQLUtils {
    private ConnectionController connectionController;

    public int devuelveNFilasSQL(String tablename) {
        int result = 0;
        connectionController = ConnectionController.getConectionController();
        String query = "SELECT COUNT(*) AS total_filas FROM " + tablename;
        result = connectionController.getNRows(query);
        return result;
    }

    public List<Hashtable<String,Object>> devuelveListaObjetos(ArrayList<Relacion> relaciones, String tablename) {
        List<Hashtable<String,Object>> finalList;
        String names = "";
        int cont = 0;
        if (relaciones.size() <= 1){
            names = relaciones.get(0).getCampoOrigen();
        } else {
            for (Relacion relacion : relaciones) {
                if (cont == relaciones.size() - 1) {
                    names += relacion.getCampoOrigen();
                } else {
                    names += relacion.getCampoOrigen() + ", ";
                }
                cont++;
            }
        }
        
        System.out.println("names: " + names);
        connectionController = ConnectionController.getConectionController();
        String query = "SELECT " + names + " FROM " + tablename;
        //replantear esto
        finalList = connectionController.getDataOrigin(query);
        
        return finalList;
    }

    public String devuelveString(Object objeto) {
        String result = "";
        if (objeto != null) {
            result = objeto.toString();
        } else {
            result = null;
        }
        return result;
    }

    public Integer devuelveInteger(Object objeto) {
        Integer result = 0;
        if (objeto != null) {
            result = Integer.parseInt(objeto.toString());
        } else {
            result = 0;
        }
        return result;
    }

    public Float devuelveFloat(Object objeto) {
        Float result = 0.0f;
        if (objeto != null) {
            result = Float.parseFloat(objeto.toString());
        } else {
            result = 0.0f;
        }
        return result;
    }
}