package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class AlmacenesSQLSwitch {
    private SQLController sqlController;
    private FinalList<Almacen> lista;
    private ArrayList<Almacen> almacenes;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        int idalmacen = formatUtils.formatUpdate("ALMACE");
        nErrors = 0;
        newConvert = true;

        if (sqlController.isBeEmpty()) {
            idalmacen = 1;
        }

        for (int i = 0; i < listaObjetos.size(); i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "id":
                            almacen.setId(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            almacen.setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ser":
                            almacen.setSer(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "se2":
                            almacen.setSe2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "age":
                            almacen.setAge(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    sqlController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
            }
            /* System.out.println("Fila: " + i);
            System.out.println(almacen);
            System.out.println("----------------------------------------------------------"); */
            idalmacen++;
            almacenes.add(almacen);
        }
        lista.setLista(almacenes);
    }
}