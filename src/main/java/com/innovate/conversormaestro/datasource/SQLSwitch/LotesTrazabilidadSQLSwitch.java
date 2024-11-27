package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.LoteTrazabilidad;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.LogUtils;
import com.innovate.conversormaestro.utils.SQLUtils;

public class LotesTrazabilidadSQLSwitch {
    private SQLController sqlController;
    private FinalList<LoteTrazabilidad> lista;
    private ArrayList<LoteTrazabilidad> lotesTrazabilidad = new ArrayList<>();
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private int nErrors;
    private boolean newConvert;

    public void LotesTrazabilidad(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        lista = FinalList.getFinalList();
        lotesTrazabilidad = new ArrayList<>();
        LoteTrazabilidad loteTrazabilidad;
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());
        nErrors = 0;
        newConvert = false;

        for (int i = 0; i < listaObjetos.size(); i++) {
            loteTrazabilidad = new LoteTrazabilidad();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);

            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "lot":
                            loteTrazabilidad.setLot(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "art":
                            loteTrazabilidad.setArt(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pais":
                            loteTrazabilidad.setPais(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            loteTrazabilidad.setCom(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ven":
                            loteTrazabilidad.setVen(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            loteTrazabilidad.setPro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cad":
                            loteTrazabilidad.setCad(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cos":
                            loteTrazabilidad.setCos(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cosact":
                            loteTrazabilidad.setCosact(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ffa":
                            loteTrazabilidad.setFfa(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "alm":
                            loteTrazabilidad.setAlm(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v01":
                            loteTrazabilidad.setV01(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v02":
                            loteTrazabilidad.setV02(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v03":
                            loteTrazabilidad.setV03(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v04":
                            loteTrazabilidad.setV04(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v05":
                            loteTrazabilidad.setV05(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v06":
                            loteTrazabilidad.setV06(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v07":
                            loteTrazabilidad.setV07(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v08":
                            loteTrazabilidad.setV08(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v09":
                            loteTrazabilidad.setV09(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v10":
                            loteTrazabilidad.setV10(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v11":
                            loteTrazabilidad.setV11(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v12":
                            loteTrazabilidad.setV12(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;

                        case "dis_cac":
                            loteTrazabilidad.setDis_cac(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cav":
                            loteTrazabilidad.setDis_cav(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pic":
                            loteTrazabilidad.setDis_pic(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_piv":
                            loteTrazabilidad.setDis_piv(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_tra":
                            loteTrazabilidad.setDis_tra(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
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
            /*
             * System.out.println("Fila: " + i);
             * System.out.println(loteTrazabilidad);
             * System.out.println(
             * "----------------------------------------------------------");
             */
            lotesTrazabilidad.add(loteTrazabilidad);
        }
        lista.setLista(lotesTrazabilidad);
    }
}
