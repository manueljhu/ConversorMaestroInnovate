package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Banco;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class BancoEmpresaDBFSwitch {
    private FinalList<Banco> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private static ArrayList<Banco> bancoEmpresa;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void Bancos(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        bancoEmpresa = new ArrayList<Banco>();
        Banco banco;

        for (int i = 0; i < nFilas; i++) {
            banco = new Banco();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cue":
                        banco.setCue(formatUtils.formatDigitGroupAccount(group, account,DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "des":
                        banco.setDes(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rie":
                        banco.setRie(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cta":
                        banco.setCta(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        banco.setDir(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        banco.setPob(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        banco.setNpro(
                                Integer.parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        banco.setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suf":
                        banco.setSuf(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        banco.setEmail(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "iban":
                        banco.setIban(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "swift":
                        banco.setSwift(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(banco);
            bancoEmpresa.add(banco);
        }
        lista.setLista(bancoEmpresa);
    }
}
