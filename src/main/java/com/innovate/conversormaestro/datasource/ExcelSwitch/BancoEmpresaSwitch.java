package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Banco;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class BancoEmpresaSwitch {
    private ArrayList<Relacion> relaciones;
    private ExcelUtils excelUtils = new ExcelUtils();
    private static ArrayList<Banco> bancoEmpresa;

    public void Bancos(ArrayList<Relacion> relaciones){
        this.relaciones = relaciones;
        int nFilas = excelUtils.devuelveNFilasExcel();
        int longitud = 0;

        bancoEmpresa = new ArrayList<Banco>();
        Banco banco;
        String cod;

        for (int i = 0; i < nFilas; i++) {
            banco = new Banco();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "cue":
                        banco.setCue(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "des":
                        banco.setDes(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rie":
                        banco.setRie(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cta":
                        banco.setCta(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        banco.setDir(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        banco.setPob(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        banco.setNpro(Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        banco.setPro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suf":
                        banco.setSuf(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        banco.setEmail(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "iban":
                        banco.setIban(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "swift":
                        banco.setSwift(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(banco);
            bancoEmpresa.add(banco);
        }
    }
}
