package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.MarcasArticulo;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class MarcasArticuloSQLSwitch {
    private FinalList<MarcasArticulo> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<MarcasArticulo> marcasArticulos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void MarcasArticulos(ArrayList<Relacion> relaciones){
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        marcasArticulos = new ArrayList<MarcasArticulo>();
        MarcasArticulo marcasArticulo;

        for (int i = 0; i < nFilas; i++) {
            marcasArticulo = new MarcasArticulo();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        marcasArticulo.setCod(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        marcasArticulo.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuc":
                        marcasArticulo.setCuc(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuv":
                        marcasArticulo.setCuv(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "co1":
                        marcasArticulo.setCo1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        marcasArticulo.setCo2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        marcasArticulo.setCo3(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        marcasArticulo.setCo4(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        marcasArticulo.setCo5(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        marcasArticulo.setDtocom1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtocom2":
                        marcasArticulo.setDtocom2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven1":
                        marcasArticulo.setDtoven1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven2":
                        marcasArticulo.setDtoven2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        marcasArticulo.setDt1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        marcasArticulo.setDt2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        marcasArticulo.setDt3(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        marcasArticulo.setDt4(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        marcasArticulo.setDt5(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        marcasArticulo.setD01(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        marcasArticulo.setD02(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        marcasArticulo.setD03(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        marcasArticulo.setD04(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        marcasArticulo.setD05(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        marcasArticulo.setMa1(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        marcasArticulo.setMa2(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        marcasArticulo.setMa3(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        marcasArticulo.setMa4(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        marcasArticulo.setMa5(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        marcasArticulo.setIma(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        marcasArticulo.setFot(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "abr":
                        marcasArticulo.setAbr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pos":
                        marcasArticulo.setPos(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevcom":
                        marcasArticulo.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevven":
                        marcasArticulo.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtocom":
                        marcasArticulo.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtoven":
                        marcasArticulo.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "historia":
                        marcasArticulo.setHistoria(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(marcasArticulo);
            marcasArticulos.add(marcasArticulo);
        }
        lista.setLista(marcasArticulos);
    }
}