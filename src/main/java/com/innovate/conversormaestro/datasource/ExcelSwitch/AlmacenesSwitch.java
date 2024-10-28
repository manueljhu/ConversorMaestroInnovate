package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class AlmacenesSwitch {
private ArrayList<Relacion> relaciones;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Almacen> almacenes;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        this.relaciones = relaciones;
        int nFilas = excelUtils.devuelveNFilasExcel();
        int longitud = 0;
        
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;

        for (int i = 1; i < nFilas; i++) {
            almacen = new Almacen();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "nom":
                        almacen.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ser":
                        almacen.setSer(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "se2":
                        almacen.setSe2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "age":
                        almacen.setAge(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(almacen);
            almacenes.add(almacen);
        }
        
    }
}
