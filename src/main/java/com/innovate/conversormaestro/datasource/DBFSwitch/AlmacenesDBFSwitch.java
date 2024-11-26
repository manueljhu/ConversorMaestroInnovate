package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class AlmacenesDBFSwitch {
    private DBFController dbfController;
    private FinalList<Almacen> lista;
    private ArrayList<Almacen> almacenes;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        int idalmacen = formatUtils.formatUpdate("ALMACE");
        nErrors = 0;
        newConvert = true;

        if (dbfController.isBeEmpty()) {
            idalmacen = 1;
        }

        for (int i = 0; i < nFilas; i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "id":
                            almacen.setId(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "nom":
                            almacen.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ser":
                            almacen.setSer(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "se2":
                            almacen.setSe2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "age":
                            almacen.setAge(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cer_tipo":
                            almacen.setCer_tipo(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cer_ropo":
                            almacen.setCer_ropo(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
            System.out.println(almacen);
            System.out.println("----------------------------------------------------------"); */
            idalmacen++;
            almacenes.add(almacen);
        }
        lista.setLista(almacenes);
    }
}
