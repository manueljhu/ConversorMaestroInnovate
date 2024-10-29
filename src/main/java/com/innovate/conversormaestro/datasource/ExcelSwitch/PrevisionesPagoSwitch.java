package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Efecto;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class PrevisionesPagoSwitch {
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Efecto> previsionespagos;
    private FormatUtils formatUtils = new FormatUtils();

    public void PrevisionesPago(ArrayList<Relacion> relaciones) {
        int nFilas = excelUtils.devuelveNFilasExcel();

        previsionespagos = new ArrayList<Efecto>();
        Efecto previsionespago;

        for (int i = 0; i < nFilas; i++) {
            previsionespago = new Efecto();
            for (int j = 0; j < relaciones.size(); j++) {
                previsionespago.setTip("P");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "num":
                        previsionespago.setNum(formatUtils.format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec":
                        previsionespago.setFec(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        previsionespago.setCue(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "con":
                        previsionespago.setCon(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ban":
                        previsionespago.setBan(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "vto":
                        previsionespago.setVto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac":
                        previsionespago.setFac(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rem":
                        previsionespago.setRem(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fre":
                        previsionespago.setFre(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fpa":
                        previsionespago.setFpa(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dev":
                        previsionespago.setDev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx1":
                        previsionespago.setXx1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx2":
                        previsionespago.setXx2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "xx3":
                        previsionespago.setXx3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impeu":
                        previsionespago.setImpeu(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pageu":
                        previsionespago.setPageu(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "car":
                        previsionespago.setCar(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imprem":
                        previsionespago.setImprem(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cueapu":
                        previsionespago
                                .setCueapu(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "impdev":
                        previsionespago.setImpdev(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impgas":
                        previsionespago.setImpgas(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rie":
                        previsionespago.setRie(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rut":
                        previsionespago.setRut(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu1":
                        previsionespago.setCu1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu2":
                        previsionespago.setCu2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu3":
                        previsionespago.setCu3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cu4":
                        previsionespago.setCu4(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "serie":
                        previsionespago.setSerie(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impreso":
                        previsionespago
                                .setImpreso(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_tipagr":
                        previsionespago
                                .setEfe_Tipagr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_docagr":
                        previsionespago
                                .setEfe_Docagr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_nefagr":
                        previsionespago
                                .setEfe_Nefagr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_genagr":
                        previsionespago
                                .setEfe_Genagr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "efe_ren":
                        previsionespago
                                .setEfe_Ren(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "numefedev":
                        previsionespago
                                .setNumefedev(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        previsionespago.setMoneda(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        previsionespago.setCotiza(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impmon":
                        previsionespago.setImpmon(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "diasmax":
                        previsionespago.setDiasmax(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecini":
                        previsionespago
                                .setFecini(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(previsionespago);
            previsionespagos.add(previsionespago);
        }
    }
}
