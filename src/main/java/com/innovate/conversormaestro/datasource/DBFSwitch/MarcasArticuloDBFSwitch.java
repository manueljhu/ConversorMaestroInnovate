package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.MarcasArticulo;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class MarcasArticuloDBFSwitch {
    private FinalList<MarcasArticulo> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<MarcasArticulo> marcasArticulos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void MarcasArticulos(ArrayList<Relacion> relaciones){
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        marcasArticulos = new ArrayList<MarcasArticulo>();
        MarcasArticulo marcasArticulo;

        for (int i = 0; i < nFilas; i++) {
            marcasArticulo = new MarcasArticulo();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        marcasArticulo.setCod(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        marcasArticulo.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuc":
                        marcasArticulo.setCuc(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuv":
                        marcasArticulo.setCuv(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "co1":
                        marcasArticulo.setCo1(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        marcasArticulo.setCo2(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        marcasArticulo.setCo3(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        marcasArticulo.setCo4(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        marcasArticulo.setCo5(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        marcasArticulo.setDtocom1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtocom2":
                        marcasArticulo.setDtocom2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven1":
                        marcasArticulo.setDtoven1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven2":
                        marcasArticulo.setDtoven2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        marcasArticulo.setDt1(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        marcasArticulo.setDt2(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        marcasArticulo.setDt3(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        marcasArticulo.setDt4(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        marcasArticulo.setDt5(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        marcasArticulo.setD01(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        marcasArticulo.setD02(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        marcasArticulo.setD03(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        marcasArticulo.setD04(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        marcasArticulo.setD05(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        marcasArticulo.setMa1(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        marcasArticulo.setMa2(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        marcasArticulo.setMa3(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        marcasArticulo.setMa4(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        marcasArticulo.setMa5(Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        marcasArticulo.setIma(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        marcasArticulo.setFot(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "abr":
                        marcasArticulo.setAbr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pos":
                        marcasArticulo.setPos(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevcom":
                        marcasArticulo.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevven":
                        marcasArticulo.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtocom":
                        marcasArticulo.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtoven":
                        marcasArticulo.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "historia":
                        marcasArticulo.setHistoria(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(marcasArticulo);
            marcasArticulos.add(marcasArticulo);
        }
        lista.setLista(marcasArticulos);
    }
}