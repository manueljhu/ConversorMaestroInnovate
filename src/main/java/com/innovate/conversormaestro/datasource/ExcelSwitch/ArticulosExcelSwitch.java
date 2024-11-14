package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.model.Articulo;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ArticulosExcelSwitch {
    private FinalList<Articulo> lista;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Articulo> articulos;
    private FormatUtils formatUtils = new FormatUtils();
    private ConnectionController connectionController;
    String group;
    String account;

    public void Articulos(ArrayList<Relacion> relaciones) {
        connectionController = ConnectionController.getConectionController();
        int nFilas = excelUtils.devuelveNFilasExcel();
        lista = FinalList.getFinalList();
        articulos = new ArrayList<Articulo>();
        Articulo articulo;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();

        for (int i = 1; i <= nFilas; i++) {
            articulo = new Articulo();
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        articulo.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        articulo.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fam":
                        articulo.setFam(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "obs":
                        articulo.setObs(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "min":
                        articulo.setMin(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "max":
                        articulo.setMax(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med":
                        articulo.setMed(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "uni":
                        articulo.setUni(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cla":
                        articulo.setCla(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "iva":
                        articulo.setIva(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ubi":
                        articulo.setUbi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rea":
                        articulo.setRea(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rep":
                        articulo.setRep(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cos":
                        articulo.setCos(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pba":
                        articulo.setPba(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        articulo.setDtocom1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtocom2":
                        articulo.setDtocom2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven1":
                        articulo.setDtoven1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dtoven2":
                        articulo.setDtoven2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        articulo.setDt1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        articulo.setDt2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        articulo.setDt3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        articulo.setDt4(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        articulo.setDt5(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co1":
                        articulo.setCo1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        articulo.setCo2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        articulo.setCo3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        articulo.setCo4(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        articulo.setCo5(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pmc":
                        articulo.setPmc(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upc":
                        articulo.setUpc(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufc":
                        articulo.setUfc(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "pro":
                        articulo.setPro(formatUtils
                                .format6digits(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pmv":
                        articulo.setPmv(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upv":
                        articulo.setUpv(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufv":
                        articulo.setUfv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exi":
                        articulo.setExi(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "vai":
                        articulo.setVai(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ent":
                        articulo.setEnt(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptc":
                        articulo.setPtc(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sal":
                        articulo.setSal(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptv":
                        articulo.setPtv(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        articulo.setMa1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        articulo.setMa2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        articulo.setMa3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        articulo.setMa4(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        articulo.setMa5(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        articulo.setD01(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        articulo.setD02(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        articulo.setD03(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        articulo.setD04(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        articulo.setD05(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cuc":
                        articulo.setCuc(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cuv":
                        articulo.setCuv(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bar":
                        articulo.setBar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "p21":
                        articulo.setP21(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p22":
                        articulo.setP22(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p23":
                        articulo.setP23(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p24":
                        articulo.setP24(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p25":
                        articulo.setP25(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2":
                        articulo.setIv2(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        articulo.setIma(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "abr":
                        articulo.setAbr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coi":
                        articulo.setCoi(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di1":
                        articulo.setDi1(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        articulo.setDi2(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sec":
                        articulo.setSec(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tem":
                        articulo.setTem(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ide":
                        articulo.setIde(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tra":
                        articulo.setTra(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coe":
                        articulo.setCoe(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "eim":
                        articulo.setEim(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "gru":
                        articulo.setGru(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pos":
                        articulo.setPos(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fot":
                        articulo.setFot(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "trazab":
                        articulo.setTrazab(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "medida":
                        articulo.setMedida(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "num_med":
                        articulo.setNum_Med(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_1":
                        articulo.setMed_1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_2":
                        articulo.setMed_2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_3":
                        articulo.setMed_3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bultos":
                        articulo.setBultos(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "paquet":
                        articulo.setPaquet(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impues":
                        articulo.setImpues(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_imp":
                        articulo.setArt_Imp(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sum_imp":
                        articulo.setSum_Imp(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fac_can":
                        articulo.setFac_Can(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fac_imp":
                        articulo.setFac_Imp(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec_cre":
                        articulo.setFec_Cre(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "obsole":
                        articulo.setObsole(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per_com":
                        articulo.setPer_Com(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "per_ven":
                        articulo.setPer_Ven(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "peso":
                        articulo.setPeso(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "volumen":
                        articulo.setVolumen(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "men_sto":
                        articulo.setMen_Sto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "con_sto":
                        articulo.setCon_Sto(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "marca1":
                        articulo.setMarca1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "marca2":
                        articulo.setMarca2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ped_tex":
                        articulo.setPed_Tex(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ped_cos":
                        articulo.setPed_Cos(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "env":
                        articulo.setEnv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v01":
                        articulo.setV01(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v02":
                        articulo.setV02(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v03":
                        articulo.setV03(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v04":
                        articulo.setV04(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v05":
                        articulo.setV05(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v06":
                        articulo.setV06(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v07":
                        articulo.setV07(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v08":
                        articulo.setV08(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v09":
                        articulo.setV09(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v10":
                        articulo.setV10(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v11":
                        articulo.setV11(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "v12":
                        articulo.setV12(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ctadevcom":
                        articulo.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevven":
                        articulo.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtocom":
                        articulo.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadtoven":
                        articulo.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "meses":
                        articulo.setMeses(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imaweb":
                        articulo.setImaweb(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fabpro":
                        articulo.setFabpro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fabtip":
                        articulo.setFabtip(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nse":
                        articulo.setNse(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "historia":
                        articulo.setHistoria(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_minped":
                        articulo.setArt_Minped(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_subfam":
                        articulo.setArt_Subfam(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "art_marca":
                        articulo.setArt_Marca(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_nov":
                        articulo.setWeb_Nov(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_fealno":
                        articulo.setWeb_Fealno(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_des":
                        articulo.setWeb_Des(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "coefici":
                        articulo.setCoefici(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_sub":
                        articulo.setWeb_Sub(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_actd":
                        articulo.setWeb_Actd(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_acth":
                        articulo.setWeb_Acth(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "divs1":
                        articulo.setDivs1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "divs2":
                        articulo.setDivs2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_cat1":
                        articulo.setWeb_Cat1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_cat2":
                        articulo.setWeb_Cat2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_cat3":
                        articulo.setWeb_Cat3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ntv":
                        articulo.setNtv(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "agr":
                        articulo.setAgr(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com":
                        articulo.setCom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "hor":
                        articulo.setHor(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "come":
                        articulo.setCome(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tim":
                        articulo.setTim(
                                Integer.parseInt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dos":
                        articulo.setDos(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_pro":
                        articulo.setNum_Pro(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_com":
                        articulo.setNum_Com(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "csi":
                        articulo.setCsi(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "inc_pre":
                        articulo.setInc_Pre(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "inc_red":
                        articulo.setInc_Red(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat1":
                        articulo.setWeb_Orcat1(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat2":
                        articulo.setWeb_Orcat2(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat3":
                        articulo.setWeb_Orcat3(
                                Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_metat":
                        articulo.setWeb_Metat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_metad":
                        articulo.setWeb_Metad(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_urla":
                        articulo.setWeb_Urla(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_h1":
                        articulo.setWeb_H1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_h2_1":
                        articulo.setWeb_H2_1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "web_h2_2":
                        articulo.setWeb_H2_2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "sincro":
                        articulo.setSincro(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            // System.out.println(articulo);
            articulos.add(articulo);
        }
        lista.setLista(articulos);
    }
}
