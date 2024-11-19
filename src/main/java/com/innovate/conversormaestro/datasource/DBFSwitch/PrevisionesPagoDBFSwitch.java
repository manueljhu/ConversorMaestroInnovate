package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class PrevisionesPagoDBFSwitch {
    private FinalList<Efecto> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<Efecto> previsionespagos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void PrevisionesPago(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        previsionespagos = new ArrayList<Efecto>();
        Efecto previsionespago;

        for (int i = 0; i < nFilas; i++) {
            previsionespago = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionespago.setTip("P");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "num":
                        previsionespago.setNum(formatUtils.format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec":
                        previsionespago.setFec(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        previsionespago.setCue(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "con":
                        previsionespago.setCon(formatUtils.formatEfectCon(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R", "DBF", i));
                        break;
                    case "ban":
                        previsionespago.setBan(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        previsionespago.setVto(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac":
                        previsionespago.setFac(formatUtils.formatEfectFac(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "R"));
                        break;
                    case "rem":
                        previsionespago.setRem(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fre":
                        previsionespago.setFre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fpa":
                        previsionespago.setFpa(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dev":
                        previsionespago.setDev(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx1":
                        previsionespago.setXx1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx2":
                        previsionespago.setXx2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx3":
                        previsionespago.setXx3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impeu":
                        previsionespago.setImpeu(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pageu":
                        previsionespago.setPageu(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "car":
                        previsionespago.setCar(
                                Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imprem":
                        previsionespago.setImprem(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cueapu":
                        previsionespago
                                .setCueapu(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impdev":
                        previsionespago.setImpdev(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impgas":
                        previsionespago.setImpgas(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rie":
                        previsionespago.setRie(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        previsionespago.setRut(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu1":
                        previsionespago.setCu1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu2":
                        previsionespago.setCu2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu3":
                        previsionespago.setCu3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu4":
                        previsionespago.setCu4(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "serie":
                        previsionespago.setSerie(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impreso":
                        previsionespago
                                .setImpreso(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_tipagr":
                        previsionespago
                                .setEfe_Tipagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_docagr":
                        previsionespago
                                .setEfe_Docagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_nefagr":
                        previsionespago
                                .setEfe_Nefagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_genagr":
                        previsionespago
                                .setEfe_Genagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_ren":
                        previsionespago
                                .setEfe_Ren(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numefedev":
                        previsionespago
                                .setNumefedev(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        previsionespago.setMoneda(
                                Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        previsionespago.setCotiza(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impmon":
                        previsionespago.setImpmon(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "diasmax":
                        previsionespago.setDiasmax(
                                Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecini":
                        previsionespago
                                .setFecini(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(previsionespago);
            previsionespagos.add(previsionespago);
        }
        lista.setLista(previsionespagos);
    }
}
