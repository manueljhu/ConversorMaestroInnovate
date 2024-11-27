package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.LoteTrazabilidad;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.LogUtils;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class LotesTrazabilidadExcelSwitch {
    private ExcelController excelController;
    private FinalList<LoteTrazabilidad> lista;
    private ArrayList<LoteTrazabilidad> lotesTrazabilidad = new ArrayList<>();
    private ExcelUtils excelUtils = new ExcelUtils();
    private int nErrors;
    private boolean newConvert;

    public void LotesTrazabilidad(ArrayList<Relacion> relaciones) {
        excelController = ExcelController.getExcelController();
        int nFilas = excelUtils.devuelveNFilasExcel();
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
                                    .setLot(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "art":
                            loteTrazabilidad
                                    .setArt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "pais":
                            loteTrazabilidad.setPais(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "com":
                            loteTrazabilidad.setCom(Float
                            .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "ven":
                            loteTrazabilidad.setVen(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "pro":
                            loteTrazabilidad
                                    .setPro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cad":
                            loteTrazabilidad
                                    .setCad(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "cos":
                            loteTrazabilidad.setCos(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "cosact":
                            loteTrazabilidad
                                    .setCosact(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "ffa":
                            loteTrazabilidad
                                    .setFfa(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "alm":
                            loteTrazabilidad.setAlm(Integer
                                    .parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "v01":
                            loteTrazabilidad
                                    .setV01(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v02":
                            loteTrazabilidad
                                    .setV02(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v03":
                            loteTrazabilidad
                                    .setV03(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v04":
                            loteTrazabilidad
                                    .setV04(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v05":
                            loteTrazabilidad
                                    .setV05(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v06":
                            loteTrazabilidad
                                    .setV06(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v07":
                            loteTrazabilidad
                                    .setV07(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v08":
                            loteTrazabilidad
                                    .setV08(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v09":
                            loteTrazabilidad
                                    .setV09(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v10":
                            loteTrazabilidad
                                    .setV10(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v11":
                            loteTrazabilidad
                                    .setV11(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                        case "v12":
                            loteTrazabilidad
                                    .setV12(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;

                        case "dis_cac":
                            loteTrazabilidad.setDis_cac(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_cav":
                            loteTrazabilidad.setDis_cav(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_pic":
                            loteTrazabilidad.setDis_pic(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_piv":
                            loteTrazabilidad.setDis_piv(Float
                                    .parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                            break;
                        case "dis_tra":
                            loteTrazabilidad
                                    .setDis_tra(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                            break;
                    }
                } catch (Exception e) {
                    nErrors++;
                    excelController.setnErrors(nErrors);
                    String mensaje = "Error en la fila " + i + " columna " + relaciones.get(j).getCampoOrigen() + ": "
                            + e.getMessage();
                    LogUtils logUtils = new LogUtils();
                    logUtils.WriteLog(mensaje, newConvert);
                    newConvert = false;
                }
                excelController.setnErrors(nErrors);
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
