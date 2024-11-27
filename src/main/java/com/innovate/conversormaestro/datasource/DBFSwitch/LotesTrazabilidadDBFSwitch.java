package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.LoteTrazabilidad;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.LogUtils;
import com.innovate.conversormaestro.utils.DBFUtils;

public class LotesTrazabilidadDBFSwitch {
    private DBFController dbfController;
    private FinalList<LoteTrazabilidad> lista;
    private ArrayList<LoteTrazabilidad> lotesTrazabilidad = new ArrayList<>();
    private DBFUtils DBFUtils = new DBFUtils();
    private int nErrors;
    private boolean newConvert;

    public void LotesTrazabilidad(ArrayList<Relacion> relaciones) {
        dbfController = DBFController.getDBFController();
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        lotesTrazabilidad = new ArrayList<>();
        LoteTrazabilidad loteTrazabilidad;
        nErrors = 0;
        newConvert = false;

        for (int i = 0; i < nFilas; i++) {
            loteTrazabilidad = new LoteTrazabilidad();
            for (int j = 0; j < relaciones.size(); j++) {
                try {
                    switch (relaciones.get(j).getCampoDestino()) {
                        case "lot":
                            loteTrazabilidad
                                    .setLot(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "art":
                            loteTrazabilidad
                                    .setArt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            loteTrazabilidad.setPais(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            loteTrazabilidad.setCom(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ven":
                            loteTrazabilidad.setVen(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            loteTrazabilidad
                                    .setPro(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cad":
                            loteTrazabilidad
                                    .setCad(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cos":
                            loteTrazabilidad.setCos(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cosact":
                            loteTrazabilidad
                                    .setCosact(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ffa":
                            loteTrazabilidad
                                    .setFfa(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "alm":
                            loteTrazabilidad.setAlm(Integer
                                    .parseInt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v01":
                            loteTrazabilidad
                                    .setV01(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v02":
                            loteTrazabilidad
                                    .setV02(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v03":
                            loteTrazabilidad
                                    .setV03(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v04":
                            loteTrazabilidad
                                    .setV04(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v05":
                            loteTrazabilidad
                                    .setV05(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v06":
                            loteTrazabilidad
                                    .setV06(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v07":
                            loteTrazabilidad
                                    .setV07(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v08":
                            loteTrazabilidad
                                    .setV08(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v09":
                            loteTrazabilidad
                                    .setV09(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v10":
                            loteTrazabilidad
                                    .setV10(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v11":
                            loteTrazabilidad
                                    .setV11(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v12":
                            loteTrazabilidad
                                    .setV12(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;

                        case "dis_cac":
                            loteTrazabilidad.setDis_cac(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cav":
                            loteTrazabilidad.setDis_cav(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pic":
                            loteTrazabilidad.setDis_pic(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_piv":
                            loteTrazabilidad.setDis_piv(Float
                                    .parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_tra":
                            loteTrazabilidad
                                    .setDis_tra(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
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
                dbfController.setnErrors(nErrors);
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
