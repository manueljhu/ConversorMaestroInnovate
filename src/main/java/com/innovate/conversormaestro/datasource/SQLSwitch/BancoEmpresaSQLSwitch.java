package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Banco;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;
import com.innovate.conversormaestro.utils.LogUtils;

public class BancoEmpresaSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Banco> lista;
    private ArrayList<Banco> bancoEmpresa;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    private String group;
    private String account;
    private int nErrors;
    private boolean newConvert;

    public void Bancos(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        bancoEmpresa = new ArrayList<Banco>();
        Banco banco;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = true;

        for (int i = 0; i < listaObjetos.size(); i++) {
            banco = new Banco();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "cue":
                            banco.setCue(formatUtils.formatDigitGroupAccount(group, account,
                                    SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                            break;
                        case "des":
                            banco.setDes(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "rie":
                            banco.setRie(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cta":
                            banco.setCta(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dir":
                            banco.setDir(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pob":
                            banco.setPob(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "npro":
                            banco.setNpro(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            banco.setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "suf":
                            banco.setSuf(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "email":
                            banco.setEmail(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "iban":
                            banco.setIban(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "swift":
                            banco.setSwift(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    sqlController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                sqlController.setnErrors(nErrors);
            }
            /* System.out.println("Fila: " + i);
            System.out.println(banco);
            System.out.println("----------------------------------------------------------"); */
            bancoEmpresa.add(banco);
        }
        lista.setLista(bancoEmpresa);
    }
}
