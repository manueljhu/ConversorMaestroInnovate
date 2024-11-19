package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.DatoBancario;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class DatosBancariosProveedoresSQLSwitch {
    private FinalList<DatoBancario> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<DatoBancario> datosBancarios;
    private FormatUtils formatUtils = new FormatUtils();

    public void DatosBancarios(ArrayList<Relacion> relaciones){
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        datosBancarios = new ArrayList<DatoBancario>();
        DatoBancario datoBancario;

        for (int i = 0; i < nFilas; i++) {
            datoBancario = new DatoBancario();
            for (int j = 0; j < relaciones.size(); j++) {
                datoBancario.setCla("PR");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        datoBancario.setCod(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        datoBancario.setDir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        datoBancario.setPob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        datoBancario.setNpro(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        datoBancario.setPro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pais":
                        datoBancario.setPais(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iban":
                        datoBancario.setIban(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "bic":
                        datoBancario.setBic(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu1":
                        datoBancario.setCu1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu2":
                        datoBancario.setCu2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu3":
                        datoBancario.setCu3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu4":
                        datoBancario.setCu4(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hab":
                        datoBancario.setHab(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "bban":
                        datoBancario.setBban(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "trem":
                        datoBancario.setTrem(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "epri":
                        datoBancario.setEpri(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nman":
                        datoBancario.setNman(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fman":
                        datoBancario.setFman(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(datoBancario);
            datosBancarios.add(datoBancario);
        }
        lista.setLista(datosBancarios);
    }
}
