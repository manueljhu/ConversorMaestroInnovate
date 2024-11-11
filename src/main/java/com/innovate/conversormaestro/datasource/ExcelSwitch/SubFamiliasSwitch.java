package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.model.Subfamilia;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class SubFamiliasSwitch {
    private FinalList<Subfamilia> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Subfamilia> subfamilias = new ArrayList<>();
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void Subfamilias(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        subfamilias = new ArrayList<>();
        Subfamilia subfamilia;

        for (int i = 1; i <= nFilas; i++) {
            subfamilia = new Subfamilia();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        subfamilia.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        subfamilia.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuc":
                        subfamilia.setCuc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cuv":
                        subfamilia.setCuv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "co1":
                        subfamilia.setCo1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        subfamilia.setCo2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        subfamilia.setCo3(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        subfamilia.setCo4(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        subfamilia.setCo5(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        subfamilia.setDtocom1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtocom2":
                        subfamilia.setDtocom2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven1":
                        subfamilia.setDtoven1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven2":
                        subfamilia.setDtoven2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        subfamilia.setDt1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        subfamilia.setDt2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        subfamilia.setDt3(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        subfamilia.setDt4(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        subfamilia.setDt5(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        subfamilia.setD01(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        subfamilia.setD02(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        subfamilia.setD03(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        subfamilia.setD04(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        subfamilia.setD05(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        subfamilia.setMa1(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        subfamilia.setMa2(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        subfamilia.setMa3(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        subfamilia.setMa4(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        subfamilia.setMa5(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        subfamilia.setIma(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        subfamilia.setFot(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "abr":
                        subfamilia.setAbr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pos":
                        subfamilia.setPos(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevcom":
                        subfamilia.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevven":
                        subfamilia.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtocom":
                        subfamilia.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtoven":
                        subfamilia.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "historia":
                        subfamilia.setHistoria(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fam":
                        subfamilia.setFam(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(subfamilia);
            subfamilias.add(subfamilia);
        }
        lista.setLista(subfamilias);
    }
}