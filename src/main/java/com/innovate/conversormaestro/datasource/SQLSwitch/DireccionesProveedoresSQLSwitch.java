package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DireccionesProveedoresSQLSwitch {
    private FinalList<Direccion> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Direccion> direcciones;
    private FormatUtils formatUtils = new FormatUtils();

    public void DireccionesSwitch(ArrayList<Relacion> relaciones){
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        direcciones = new ArrayList<Direccion>();
        Direccion direccion;

        for (int i = 0; i < nFilas; i++) {
            direccion = new Direccion();
            for (int j = 0; j < relaciones.size(); j++) {
                direccion.setCla("PR");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        direccion.setCod(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "den":
                        direccion.setDen(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        direccion.setDir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        direccion.setPob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        direccion.setNpro(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        direccion.setPro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        direccion.setPais(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "email":
                        direccion.setEmail(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        direccion.setRut(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tel":
                        direccion.setTel(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hab":
                        direccion.setHab(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per":
                        direccion.setPer(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(direccion);
            direcciones.add(direccion);
        }
        lista.setLista(direcciones);
    }
}
