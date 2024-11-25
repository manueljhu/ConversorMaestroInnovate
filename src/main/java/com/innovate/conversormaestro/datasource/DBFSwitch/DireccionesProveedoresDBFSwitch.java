package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Direccion;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class DireccionesProveedoresDBFSwitch {
    private DBFController dbfController;
    private FinalList<Direccion> lista;
    private ArrayList<Direccion> direcciones;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void DireccionesSwitch(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        direcciones = new ArrayList<Direccion>();
        Direccion direccion;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            direccion = new Direccion();
            for (int j = 0; j < relaciones.size(); j++) {
                direccion.setCla("PR");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            direccion.setCod(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
                            direccion.setNpro(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            direccion.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            direccion.setPais(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "email":
                            direccion.setEmail(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut":
                            direccion.setRut(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
                } catch (Exception e) {
                    nErrors++;
                    dbfController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                dbfController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(direccion);
            System.out.println("----------------------------------------------------------"); */
            direcciones.add(direccion);
        }
        lista.setLista(direcciones);
    }
}
