package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class AlmacenesDBFSwitch {
    private FinalList<Almacen> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<Almacen> almacenes;
    private FormatUtils formatUtils = new FormatUtils();
    private DBFController dbfController;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        int idalmacen = formatUtils.formatUpdate("ALMACE");
        
        if (dbfController.isBeEmpty()){
            idalmacen = 1;
        }
        
        for (int i = 1; i <= nFilas; i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "id":
                        almacen.setId(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
                }
            }
            idalmacen++;
            //System.out.println(almacen);
            almacenes.add(almacen);
        }
        lista.setLista(almacenes);
    }
}
