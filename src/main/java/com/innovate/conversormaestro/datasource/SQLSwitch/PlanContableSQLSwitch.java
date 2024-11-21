package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Cuenta;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class PlanContableSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Cuenta> lista;
    private ArrayList<Cuenta> planesContables;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    String group;
    String account;

    public void PlanesContables(ArrayList<Relacion> relaciones){
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController(); 
        lista = FinalList.getFinalList();
        planesContables = new ArrayList<Cuenta>();
        Cuenta planContable;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());

        for (int i = 0; i < listaObjetos.size(); i++) {
            planContable = new Cuenta();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "cue":
                        planContable.setCue(formatUtils.formatDigitPlanCon(group, account, SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "nom":
                        planContable.setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nif":
                        planContable.setNif(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "deb":
                        planContable.setDeb(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "hab":
                        planContable.setHab(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dir":
                        planContable.setDir(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pob":
                        planContable.setPob(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "npro":
                        planContable.setNpro(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        planContable.setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cont1":
                        planContable.setCont1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cont2":
                        planContable.setCont2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cont3":
                        planContable.setCont3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cont4":
                        planContable.setCont4(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cont5":
                        planContable.setCont5(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons1":
                        planContable.setCons1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons2":
                        planContable.setCons2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons3":
                        planContable.setCons3(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons4":
                        planContable.setCons4(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons5":
                        planContable.setCons5(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons6":
                        planContable.setCons6(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons7":
                        planContable.setCons7(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons8":
                        planContable.setCons8(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons9":
                        planContable.setCons9(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cons10":
                        planContable.setCons10(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pais":
                        planContable.setPais(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "gru":
                        planContable.setGru(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nifr":
                        planContable.setNifr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tdoc":
                        planContable.setTdoc(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_Ori":
                        planContable.setLopd_Ori(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_Otr_O":
                        planContable.setLopd_Otr_O(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_Ces":
                        planContable.setLopd_Ces(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_Otr_C":
                        planContable.setLopd_Otr_C(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cue_Apoyo":
                        planContable.setCue_Apoyo(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lap_Den":
                        planContable.setLap_Den(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lap_Con":
                        planContable.setLap_Con(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lap_Cta":
                        planContable.setLap_Cta(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ope_Tip":
                        planContable.setOpe_Tip(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ope_Cla":
                        planContable.setOpe_Cla(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ope_Pla":
                        planContable.setOpe_Pla(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ope_Des":
                        planContable.setOpe_Des(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cta":
                        planContable.setCta(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "suf":
                        planContable.setSuf(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iban":
                        planContable.setIban(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "swift":
                        planContable.setSwift(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cri_Caja":
                        planContable.setCri_Caja(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siidesfac":
                        planContable.setSiidesfac(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "patron":
                        planContable.setPatron(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "patron_Cv":
                        planContable.setPatron_Cv(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            /* System.out.println("Fila: " + i);
            System.out.println(marcasArticulo);
            System.out.println("----------------------------------------------------------"); */
            planesContables.add(planContable);
        }
        lista.setLista(planesContables);
    }
}