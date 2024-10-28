package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class DireccionesClientesSwitch {
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Direccion> direcciones;

    public void DireccionesSwitch(ArrayList<Relacion> relaciones){
        int nFilas = excelUtils.devuelveNFilasExcel();

        direcciones = new ArrayList<Direccion>();
        Direccion direccion;

        for (int i = 0; i < nFilas; i++) {
            direccion = new Direccion();
            for (int j = 0; j < relaciones.size(); j++) {
                direccion.setCla("CL");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        direccion.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "den":
                        direccion.setDen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        direccion.setDir(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        direccion.setPob(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        direccion.setNpro(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        direccion.setPro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        direccion.setPais(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "email":
                        direccion.setEmail(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        direccion.setRut(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tel":
                        direccion.setTel(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hab":
                        direccion.setHab(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per":
                        direccion.setPer(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(direccion);
            direcciones.add(direccion);
        }
    }
}
