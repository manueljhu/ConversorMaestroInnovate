package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.DatoBancario;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DatosBancariosProveedoresSQLSwitch {
    private SQLController sqlController;
    private FinalList<DatoBancario> lista;
    private ArrayList<DatoBancario> datosBancarios;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();

    public void DatosBancarios(ArrayList<Relacion> relaciones){
        sqlController = SQLController.getSQLController();
        lista = FinalList.getFinalList();
        datosBancarios = new ArrayList<DatoBancario>();
        DatoBancario datoBancario;
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());

        for (int i = 0; i < listaObjetos.size(); i++) {
            datoBancario = new DatoBancario();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                datoBancario.setCla("PR");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        datoBancario.setCod(formatUtils.format6digits(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "dir":
                        datoBancario.setDir(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pob":
                        datoBancario.setPob(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "npro":
                        datoBancario.setNpro(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        datoBancario.setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pais":
                        datoBancario.setPais(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iban":
                        datoBancario.setIban(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bic":
                        datoBancario.setBic(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cu1":
                        datoBancario.setCu1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cu2":
                        datoBancario.setCu2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cu3":
                        datoBancario.setCu3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cu4":
                        datoBancario.setCu4(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "hab":
                        datoBancario.setHab(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bban":
                        datoBancario.setBban(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "trem":
                        datoBancario.setTrem(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "epri":
                        datoBancario.setEpri(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nman":
                        datoBancario.setNman(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fman":
                        datoBancario.setFman(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            /* System.out.println("Fila: " + i);
            System.out.println(datoBancario);
            System.out.println("----------------------------------------------------------"); */
            datosBancarios.add(datoBancario);
        }
        lista.setLista(datosBancarios);
    }
}