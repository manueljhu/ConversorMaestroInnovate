package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class AlmacenesSwitch {
    private FinalList<Almacen> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Almacen> almacenes;
    private FormatUtils formatUtils = new FormatUtils();

    public void Almacenes(ArrayList<Relacion> relaciones) {
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        
        int idalmacen = formatUtils.formatUpdate("ALMACE");
        for (int i = 1; i <= nFilas; i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
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
            idalmacen++;
            System.out.println(almacen);
            almacenes.add(almacen);
        }
        lista.setLista(almacenes);
    }
}
