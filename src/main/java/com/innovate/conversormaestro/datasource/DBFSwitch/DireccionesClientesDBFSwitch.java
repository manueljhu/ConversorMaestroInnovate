package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DireccionesClientesDBFSwitch {
    private FinalList<Direccion> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<Direccion> direcciones;
    private FormatUtils formatUtils = new FormatUtils();

    public void DireccionesSwitch(ArrayList<Relacion> relaciones){
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        direcciones = new ArrayList<Direccion>();
        Direccion direccion;

        for (int i = 1; i <= nFilas; i++) {
            direccion = new Direccion();
            for (int j = 0; j < relaciones.size(); j++) {
                direccion.setCla("CL");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        direccion.setCod(formatUtils.format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "den":
                        direccion.setDen(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        direccion.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        direccion.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        direccion.setNpro(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        direccion.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        direccion.setPais(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "email":
                        direccion.setEmail(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        direccion.setRut(formatUtils.format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tel":
                        direccion.setTel(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hab":
                        direccion.setHab(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per":
                        direccion.setPer(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(direccion);
            direcciones.add(direccion);
        }
        lista.setLista(direcciones);
    }
}
