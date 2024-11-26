package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Stock;
import com.innovate.conversormaestro.utils.LogUtils;
import com.innovate.conversormaestro.utils.SQLUtils;

public class ExistenciasSQLSwitch {
    private SQLController sqlController;
    private FinalList<Stock> lista;
    private ArrayList<Stock> existencias;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private int nErrors;
    private boolean newConvert;

    public void Existencias(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        lista = FinalList.getFinalList();
        existencias = new ArrayList<Stock>();
        Stock existencia;
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            existencia = new Stock();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            existencia
                                    .setCod(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "exi":
                            existencia
                                    .setExi(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ent":
                            existencia
                                    .setEnt(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "sal":
                            existencia
                                    .setSal(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ubi":
                            existencia
                                    .setUbi(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ide":
                            existencia
                                    .setIde(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "min":
                            existencia
                                    .setMin(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "max":
                            existencia
                                    .setMax(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;

                        case "dis_cai":
                            existencia
                                    .setDis_cai(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cae":
                            existencia
                                    .setDis_cae(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cas":
                            existencia
                                    .setDis_cas(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pii":
                            existencia
                                    .setDis_pii(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pie":
                            existencia
                                    .setDis_pie(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pis":
                            existencia
                                    .setDis_pis(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
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
                sqlController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(existencia);
            System.out.println("----------------------------------------------------------"); */
            existencias.add(existencia);
        }
        lista.setLista(existencias);
    }
}
