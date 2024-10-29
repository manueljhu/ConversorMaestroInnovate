package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Apunte;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class AsientosSwitch {
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Apunte> asientos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group = connectionController.getGroupDigitsDestination();
    String account = connectionController.getAccountDigitsDestination();

    public void Asientos(ArrayList<Relacion> relaciones) {
        int nFilas = excelUtils.devuelveNFilasExcel();

        asientos = new ArrayList<Apunte>();
        Apunte asiento;

        for (int i = 0; i < nFilas; i++) {
            asiento = new Apunte();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "num":
                        asiento.setNum(formatUtils
                                .format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec":
                        asiento.setFec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        asiento.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "con":
                        asiento.setCon(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sig":
                        asiento.setSig(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mar":
                        asiento.setMar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac":
                        asiento.setFac(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "doc":
                        asiento.setDoc(formatUtils
                                .format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "xxx":
                        asiento.setXxx(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impeu":
                        asiento.setImpeu(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "acl":
                        asiento.setAcl(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cen":
                        asiento.setCen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ren":
                        asiento.setRen(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "met":
                        asiento.setMet(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "apu_tipdoc":
                        asiento.setApu_Tipdoc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "apu_numdoc":
                        asiento.setApu_Numdoc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "anno_efe":
                        asiento.setAnno_Efe(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            System.out.println(asiento);
            asientos.add(asiento);
        }
    }
}
