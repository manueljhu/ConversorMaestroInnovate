package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DireccionesClientesSQLSwitch {
    private SQLController sqlController;
    private FinalList<Direccion> lista; 
    private ArrayList<Direccion> direcciones;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();

    public void DireccionesSwitch(ArrayList<Relacion> relaciones){
        sqlController = SQLController.getSQLController();
        lista = FinalList.getFinalList();
        direcciones = new ArrayList<Direccion>();
        Direccion direccion;
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());

        for (int i = 0; i < listaObjetos.size(); i++) {
            direccion = new Direccion();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                direccion.setCla("CL");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        direccion.setCod(formatUtils.format6digits(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "den":
                        direccion.setDen(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        direccion.setDir(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pob":
                        direccion.setPob(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "npro":
                        direccion.setNpro(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        direccion.setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pais":
                        direccion.setPais(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "email":
                        direccion.setEmail(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rut":
                        direccion.setRut(formatUtils.format6digits(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "tel":
                        direccion.setTel(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "hab":
                        direccion.setHab(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "per":
                        direccion.setPer(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            /* System.out.println("Fila: " + i);
            System.out.println(direccion);
            System.out.println("----------------------------------------------------------"); */
            direcciones.add(direccion);
        }
        lista.setLista(direcciones);
    }
}
