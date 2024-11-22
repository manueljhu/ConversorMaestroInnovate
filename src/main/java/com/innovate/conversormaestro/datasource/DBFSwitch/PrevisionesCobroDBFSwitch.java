package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class PrevisionesCobroDBFSwitch {
    private DBFController dbfController;
    private ConnectionController connectionController;
    private FinalList<Efecto> lista;
    private ArrayList<Efecto> previsionescobros;
    private DBFUtils DBFUtils = new DBFUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void PrevisionesCobro(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        previsionescobros = new ArrayList<Efecto>();
        Efecto previsionescobro;
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < nFilas; i++) {
            previsionescobro = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionescobro.setTip("C");
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "num":
                            previsionescobro.setNum(formatUtils
                                    .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fec":
                            previsionescobro.setFec(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cue":
                            previsionescobro.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "con":
                            previsionescobro.setCon(formatUtils.formatEfectCon(
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E", "DBF", i));
                            break;
                        case "ban":
                            previsionescobro.setBan(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "vto":
                            previsionescobro.setVto(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fac":
                            previsionescobro.setFac(formatUtils.formatEfectFac(
                                    DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E"));
                            break;
                        case "rem":
                            previsionescobro.setRem(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fre":
                            previsionescobro.setFre(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "fpa":
                            previsionescobro.setFpa(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "dev":
                            previsionescobro.setDev(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx1":
                            previsionescobro.setXx1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx2":
                            previsionescobro.setXx2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "xx3":
                            previsionescobro.setXx3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impeu":
                            previsionescobro.setImpeu(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pageu":
                            previsionescobro.setPageu(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "car":
                            previsionescobro.setCar(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "imprem":
                            previsionescobro.setImprem(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cueapu":
                            previsionescobro
                                    .setCueapu(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "impdev":
                            previsionescobro.setImpdev(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impgas":
                            previsionescobro.setImpgas(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            previsionescobro.setRie(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "rut":
                            previsionescobro.setRut(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu1":
                            previsionescobro.setCu1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu2":
                            previsionescobro.setCu2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu3":
                            previsionescobro.setCu3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cu4":
                            previsionescobro.setCu4(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "serie":
                            previsionescobro.setSerie(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impreso":
                            previsionescobro
                                    .setImpreso(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_tipagr":
                            previsionescobro
                                    .setEfe_Tipagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_docagr":
                            previsionescobro
                                    .setEfe_Docagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_nefagr":
                            previsionescobro
                                    .setEfe_Nefagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_genagr":
                            previsionescobro
                                    .setEfe_Genagr(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "efe_ren":
                            previsionescobro
                                    .setEfe_Ren(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "numefedev":
                            previsionescobro
                                    .setNumefedev(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "moneda":
                            previsionescobro.setMoneda(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cotiza":
                            previsionescobro.setCotiza(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "impmon":
                            previsionescobro.setImpmon(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "diasmax":
                            previsionescobro.setDiasmax(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "fecini":
                            previsionescobro
                                    .setFecini(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    dbfController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }

            }
            /* System.out.println("Fila: " + i);
            System.out.println(previsionescobro);
            System.out.println("----------------------------------------------------------"); */
            previsionescobros.add(previsionescobro);
        }
        lista.setLista(previsionescobros);
    }
}