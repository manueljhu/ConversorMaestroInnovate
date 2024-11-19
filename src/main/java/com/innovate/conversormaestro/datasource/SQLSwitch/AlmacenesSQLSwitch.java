package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class AlmacenesSQLSwitch {
    private FinalList<Almacen> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Almacen> almacenes;
    private FormatUtils formatUtils = new FormatUtils();
    private SQLController sqlController;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        int idalmacen = formatUtils.formatUpdate("ALMACE");
        
        if (sqlController.isBeEmpty()){
            idalmacen = 1;
        }
        
        for (int i = 0; i < nFilas; i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "id":
                        almacen.setId(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        almacen.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ser":
                        almacen.setSer(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "se2":
                        almacen.setSe2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "age":
                        almacen.setAge(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
