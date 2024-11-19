package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class PrevisionesCobroSQLSwitch {
    private FinalList<Efecto> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Efecto> previsionescobros;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void PrevisionesCobro(ArrayList<Relacion> relaciones){
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        previsionescobros = new ArrayList<Efecto>();
        Efecto previsionescobro;

        for (int i = 0; i < nFilas; i++) {
            previsionescobro = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionescobro.setTip("C");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "num":
                        previsionescobro.setNum(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec":
                        previsionescobro.setFec(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        previsionescobro.setCue(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "con":
                        previsionescobro.setCon(formatUtils.formatEfectCon(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E", "SQL", i));
                        break;
                    case "ban":
                        previsionescobro.setBan(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        previsionescobro.setVto(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac":
                        previsionescobro.setFac(formatUtils.formatEfectFac(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()), "E"));
                        break;
                    case "rem":
                        previsionescobro.setRem(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fre":
                        previsionescobro.setFre(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fpa":
                        previsionescobro.setFpa(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dev":
                        previsionescobro.setDev(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx1":
                        previsionescobro.setXx1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx2":
                        previsionescobro.setXx2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx3":
                        previsionescobro.setXx3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impeu":
                        previsionescobro.setImpeu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pageu":
                        previsionescobro.setPageu(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "car":
                        previsionescobro.setCar(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imprem":
                        previsionescobro.setImprem(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cueapu":
                        previsionescobro.setCueapu(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impdev":
                        previsionescobro.setImpdev(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impgas":
                        previsionescobro.setImpgas(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rie":
                        previsionescobro.setRie(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        previsionescobro.setRut(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu1":
                        previsionescobro.setCu1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu2":
                        previsionescobro.setCu2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu3":
                        previsionescobro.setCu3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu4":
                        previsionescobro.setCu4(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "serie":
                        previsionescobro.setSerie(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impreso":
                        previsionescobro.setImpreso(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_tipagr":
                        previsionescobro.setEfe_Tipagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_docagr":
                        previsionescobro.setEfe_Docagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_nefagr":
                        previsionescobro.setEfe_Nefagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_genagr":
                        previsionescobro.setEfe_Genagr(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_ren":
                        previsionescobro.setEfe_Ren(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numefedev":
                        previsionescobro.setNumefedev(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        previsionescobro.setMoneda(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        previsionescobro.setCotiza(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impmon":
                        previsionescobro.setImpmon(Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "diasmax":
                        previsionescobro.setDiasmax(Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecini":
                        previsionescobro.setFecini(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(previsionescobro);
            previsionescobros.add(previsionescobro);
        }
        lista.setLista(previsionescobros);
    }
}