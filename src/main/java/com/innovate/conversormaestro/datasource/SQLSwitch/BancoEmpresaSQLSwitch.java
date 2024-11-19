package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Banco;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class BancoEmpresaSQLSwitch {
    private FinalList<Banco> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private static ArrayList<Banco> bancoEmpresa;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void Bancos(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        bancoEmpresa = new ArrayList<Banco>();
        Banco banco;

        for (int i = 0; i < nFilas; i++) {
            banco = new Banco();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cue":
                        banco.setCue(formatUtils.formatDigitGroupAccount(group, account,SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "des":
                        banco.setDes(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rie":
                        banco.setRie(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cta":
                        banco.setCta(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dir":
                        banco.setDir(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pob":
                        banco.setPob(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "npro":
                        banco.setNpro(
                                Integer.parseInt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        banco.setPro(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suf":
                        banco.setSuf(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        banco.setEmail(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "iban":
                        banco.setIban(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "swift":
                        banco.setSwift(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(banco);
            bancoEmpresa.add(banco);
        }
        lista.setLista(bancoEmpresa);
    }
}
