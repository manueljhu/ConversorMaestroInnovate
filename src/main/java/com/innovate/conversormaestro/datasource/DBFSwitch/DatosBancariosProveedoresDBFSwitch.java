package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.DatoBancario;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DatosBancariosProveedoresDBFSwitch {
    private FinalList<DatoBancario> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<DatoBancario> datosBancarios;
    private FormatUtils formatUtils = new FormatUtils();

    public void DatosBancarios(ArrayList<Relacion> relaciones){
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        datosBancarios = new ArrayList<DatoBancario>();
        DatoBancario datoBancario;

        for (int i = 1; i <= nFilas; i++) {
            datoBancario = new DatoBancario();
            for (int j = 0; j < relaciones.size(); j++) {
                datoBancario.setCla("PR");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        datoBancario.setCod(formatUtils.format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        datoBancario.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        datoBancario.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        datoBancario.setNpro(Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        datoBancario.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        datoBancario.setPais(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
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
            }
            //System.out.println(datoBancario);
            datosBancarios.add(datoBancario);
        }
        lista.setLista(datosBancarios);
    }
}
