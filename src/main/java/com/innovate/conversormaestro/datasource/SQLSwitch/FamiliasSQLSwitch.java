package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Familia;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FamiliasSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Familia> lista;
    private ArrayList<Familia> familias;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    String group;
    String account;

    public void Familias(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        familias = new ArrayList<Familia>();
        Familia familia;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());

        for (int i = 0; i < listaObjetos.size(); i++) {
            familia = new Familia();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        familia.setCod(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        familia.setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cuc":
                        familia.setCuc(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "cuv":
                        familia.setCuv(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "co1":
                        familia.setCo1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        familia.setCo2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        familia.setCo3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        familia.setCo4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        familia.setCo5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        familia.setDtocom1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom2":
                        familia.setDtocom2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtoven1":
                        familia.setDtoven1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtoven2":
                        familia.setDtoven2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt1":
                        familia.setDt1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        familia.setDt2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        familia.setDt3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        familia.setDt4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        familia.setDt5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        familia.setD01(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        familia.setD02(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        familia.setD03(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        familia.setD04(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        familia.setD05(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        familia.setMa1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        familia.setMa2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        familia.setMa3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        familia.setMa4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        familia.setMa5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        familia.setIma(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fot":
                        familia.setFot(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "abr":
                        familia.setAbr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pos":
                        familia.setPos(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevcom":
                        familia.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadevven":
                        familia.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadtocom":
                        familia.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadtoven":
                        familia.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "historia":
                        familia.setHistoria(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipima":
                        familia.setTipima(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            /* System.out.println("Fila: " + i);
            System.out.println(familia);
            System.out.println("----------------------------------------------------------"); */
            familias.add(familia);
        }
        lista.setLista(familias);
    }
}