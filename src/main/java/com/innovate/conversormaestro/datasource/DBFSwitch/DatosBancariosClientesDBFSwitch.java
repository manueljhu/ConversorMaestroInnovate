package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.DatoBancario;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class DatosBancariosClientesDBFSwitch {
    private DBFController dbfController;
    private FinalList<DatoBancario> lista;
    private ArrayList<DatoBancario> datosBancarios;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void DatosBancarios(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        datosBancarios = new ArrayList<DatoBancario>();
        DatoBancario datoBancario;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            datoBancario = new DatoBancario();
            for (int j = 0; j < relaciones.size(); j++) {
                datoBancario.setCla("CL");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cod":
                            datoBancario.setCod(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dir":
                            datoBancario.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pob":
                            datoBancario.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "npro":
                            datoBancario.setNpro(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            datoBancario.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            datoBancario.setPais(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iban":
                            datoBancario.setIban(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "bic":
                            datoBancario.setBic(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu1":
                            datoBancario.setCu1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu2":
                            datoBancario.setCu2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu3":
                            datoBancario.setCu3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu4":
                            datoBancario.setCu4(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "hab":
                            datoBancario.setHab(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "bban":
                            datoBancario.setBban(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "trem":
                            datoBancario.setTrem(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "epri":
                            datoBancario.setEpri(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "nman":
                            datoBancario.setNman(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fman":
                            datoBancario.setFman(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println(datoBancario);
            System.out.println("----------------------------------------------------------"); */
            datosBancarios.add(datoBancario);
        }
        lista.setLista(datosBancarios);
    }
}