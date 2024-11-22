package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.Almacen;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class AlmacenesExcelSwitch {
    private ExcelController excelController;
    private FinalList<Almacen> lista;
    private ArrayList<Almacen> almacenes;
    private ExcelUtils excelUtils = new ExcelUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private int nErrors;
    private boolean newConvert;

    public void Almacenes(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        almacenes = new ArrayList<Almacen>();
        Almacen almacen;
        nErrors = 0;
        newConvert = true;
        int idalmacen = formatUtils.formatUpdate("ALMACE");

        if (excelController.isBeEmpty()) {
            idalmacen = 1;
        }

        for (int i = 1; i <= nFilas; i++) {
            almacen = new Almacen();
            almacen.setId(idalmacen);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "id":
                            almacen.setId(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
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
                } catch (Exception e) {
                    nErrors++;
                    excelController.setnErrors(nErrors);
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
