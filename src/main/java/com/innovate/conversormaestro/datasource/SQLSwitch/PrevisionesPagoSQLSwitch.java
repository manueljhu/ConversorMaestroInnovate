package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class PrevisionesPagoSQLSwitch {
    private FinalList<Efecto> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Efecto> previsionespagos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void PrevisionesPago(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        previsionespagos = new ArrayList<Efecto>();
        Efecto previsionespago;

        for (int i = 0; i < nFilas; i++) {
            previsionespago = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionespago.setTip("P");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "num":
                        previsionespago.setNum(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec":
                        previsionespago.setFec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        previsionespago.setCue(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "con":
                        previsionespago.setCon(formatUtils.formatEfectCon(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R", "SQL", i));
                        break;
                    case "ban":
                        previsionespago.setBan(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        previsionespago.setVto(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac":
                        previsionespago.setFac(formatUtils.formatEfectFac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R"));
                        break;
                    case "rem":
                        previsionespago.setRem(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fre":
                        previsionespago.setFre(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fpa":
                        previsionespago.setFpa(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dev":
                        previsionespago.setDev(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx1":
                        previsionespago.setXx1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx2":
                        previsionespago.setXx2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx3":
                        previsionespago.setXx3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impeu":
                        previsionespago.setImpeu(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pageu":
                        previsionespago.setPageu(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "car":
                        previsionespago.setCar(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imprem":
                        previsionespago.setImprem(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cueapu":
                        previsionespago
                                .setCueapu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impdev":
                        previsionespago.setImpdev(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impgas":
                        previsionespago.setImpgas(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rie":
                        previsionespago.setRie(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        previsionespago.setRut(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu1":
                        previsionespago.setCu1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu2":
                        previsionespago.setCu2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu3":
                        previsionespago.setCu3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu4":
                        previsionespago.setCu4(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "serie":
                        previsionespago.setSerie(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impreso":
                        previsionespago
                                .setImpreso(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_tipagr":
                        previsionespago
                                .setEfe_Tipagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_docagr":
                        previsionespago
                                .setEfe_Docagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_nefagr":
                        previsionespago
                                .setEfe_Nefagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_genagr":
                        previsionespago
                                .setEfe_Genagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_ren":
                        previsionespago
                                .setEfe_Ren(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numefedev":
                        previsionespago
                                .setNumefedev(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        previsionespago.setMoneda(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        previsionespago.setCotiza(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impmon":
                        previsionespago.setImpmon(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "diasmax":
                        previsionespago.setDiasmax(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecini":
                        previsionespago
                                .setFecini(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(previsionespago);
            previsionespagos.add(previsionespago);
        }
        lista.setLista(previsionespagos);
    }
}
