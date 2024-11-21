package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Articulo;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ArticulosSQLSwitch {
    private SQLController sqlController;
    private ConnectionController connectionController;
    private FinalList<Articulo> lista;
    private ArrayList<Articulo> articulos;
    private List<Hashtable<String, Object>> listaObjetos;
    private SQLUtils SQLUtils = new SQLUtils();
    private FormatUtils formatUtils = new FormatUtils();
    String group;
    String account;

    public void Articulos(ArrayList<Relacion> relaciones) {
        sqlController = SQLController.getSQLController();
        connectionController = ConnectionController.getConectionController();
        lista = FinalList.getFinalList();
        articulos = new ArrayList<Articulo>();
        Articulo articulo;
        group = connectionController.getGroupDigitsDestination();
        account = connectionController.getAccountDigitsDestination();
        listaObjetos = null;
        listaObjetos = SQLUtils.devuelveListaObjetos(relaciones, sqlController.getTablenameOrigin());

        for (int i = 0; i < listaObjetos.size(); i++) {
            articulo = new Articulo();
            Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
            hashtable = listaObjetos.get(i);
            for (int j = 0; j < relaciones.size(); j++) {
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        articulo.setCod(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        articulo.setNom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fam":
                        articulo.setFam(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obs":
                        articulo.setObs(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "min":
                        articulo.setMin(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "max":
                        articulo.setMax(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med":
                        articulo.setMed(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "uni":
                        articulo.setUni(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cla":
                        articulo.setCla(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva":
                        articulo.setIva(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ubi":
                        articulo.setUbi(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rea":
                        articulo.setRea(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rep":
                        articulo.setRep(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cos":
                        articulo.setCos(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pba":
                        articulo.setPba(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom1":
                        articulo.setDtocom1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtocom2":
                        articulo.setDtocom2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtoven1":
                        articulo.setDtoven1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dtoven2":
                        articulo.setDtoven2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt1":
                        articulo.setDt1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        articulo.setDt2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt3":
                        articulo.setDt3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt4":
                        articulo.setDt4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt5":
                        articulo.setDt5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co1":
                        articulo.setCo1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co2":
                        articulo.setCo2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co3":
                        articulo.setCo3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co4":
                        articulo.setCo4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "co5":
                        articulo.setCo5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pmc":
                        articulo.setPmc(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upc":
                        articulo.setUpc(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufc":
                        articulo.setUfc(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pro":
                        articulo.setPro(formatUtils.format6digits(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "pmv":
                        articulo.setPmv(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "upv":
                        articulo.setUpv(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ufv":
                        articulo.setUfv(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "exi":
                        articulo.setExi(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "vai":
                        articulo.setVai(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ent":
                        articulo.setEnt(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptc":
                        articulo.setPtc(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sal":
                        articulo.setSal(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ptv":
                        articulo.setPtv(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma1":
                        articulo.setMa1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma2":
                        articulo.setMa2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma3":
                        articulo.setMa3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma4":
                        articulo.setMa4(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ma5":
                        articulo.setMa5(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d01":
                        articulo.setD01(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d02":
                        articulo.setD02(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d03":
                        articulo.setD03(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d04":
                        articulo.setD04(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "d05":
                        articulo.setD05(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cuc":
                        articulo.setCuc(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "cuv":
                        articulo.setCuv(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "bar":
                        articulo.setBar(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p21":
                        articulo.setP21(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p22":
                        articulo.setP22(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p23":
                        articulo.setP23(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p24":
                        articulo.setP24(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "p25":
                        articulo.setP25(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2":
                        articulo.setIv2(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ima":
                        articulo.setIma(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "abr":
                        articulo.setAbr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "coi":
                        articulo.setCoi(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di1":
                        articulo.setDi1(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "di2":
                        articulo.setDi2(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sec":
                        articulo.setSec(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tem":
                        articulo.setTem(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ide":
                        articulo.setIde(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tra":
                        articulo.setTra(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "coe":
                        articulo.setCoe(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "eim":
                        articulo.setEim(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "gru":
                        articulo.setGru(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pos":
                        articulo.setPos(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fot":
                        articulo.setFot(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "trazab":
                        articulo.setTrazab(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "medida":
                        articulo.setMedida(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_med":
                        articulo.setNum_Med(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_1":
                        articulo.setMed_1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_2":
                        articulo.setMed_2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "med_3":
                        articulo.setMed_3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "bultos":
                        articulo.setBultos(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "paquet":
                        articulo.setPaquet(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "impues":
                        articulo.setImpues(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_imp":
                        articulo.setArt_Imp(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sum_imp":
                        articulo.setSum_Imp(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fac_can":
                        articulo.setFac_Can(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fac_imp":
                        articulo.setFac_Imp(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fec_cre":
                        articulo.setFec_Cre(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obsole":
                        articulo.setObsole(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "per_com":
                        articulo.setPer_Com(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "per_ven":
                        articulo.setPer_Ven(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "peso":
                        articulo.setPeso(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "volumen":
                        articulo.setVolumen(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "men_sto":
                        articulo.setMen_Sto(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "con_sto":
                        articulo.setCon_Sto(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "marca1":
                        articulo.setMarca1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "marca2":
                        articulo.setMarca2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ped_tex":
                        articulo.setPed_Tex(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ped_cos":
                        articulo.setPed_Cos(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "env":
                        articulo.setEnv(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v01":
                        articulo.setV01(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v02":
                        articulo.setV02(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v03":
                        articulo.setV03(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v04":
                        articulo.setV04(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v05":
                        articulo.setV05(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v06":
                        articulo.setV06(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v07":
                        articulo.setV07(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v08":
                        articulo.setV08(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v09":
                        articulo.setV09(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v10":
                        articulo.setV10(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v11":
                        articulo.setV11(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "v12":
                        articulo.setV12(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ctadevcom":
                        articulo.setCtadevcom(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadevven":
                        articulo.setCtadevven(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadtocom":
                        articulo.setCtadtocom(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "ctadtoven":
                        articulo.setCtadtoven(formatUtils.formatDigitGroupAccount(group, account,
                                SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen()))));
                        break;
                    case "meses":
                        articulo.setMeses(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imaweb":
                        articulo.setImaweb(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fabpro":
                        articulo.setFabpro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fabtip":
                        articulo.setFabtip(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nse":
                        articulo.setNse(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "historia":
                        articulo.setHistoria(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_minped":
                        articulo.setArt_Minped(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_subfam":
                        articulo.setArt_Subfam(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "art_marca":
                        articulo.setArt_Marca(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_nov":
                        articulo.setWeb_Nov(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_fealno":
                        articulo.setWeb_Fealno(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_des":
                        articulo.setWeb_Des(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "coefici":
                        articulo.setCoefici(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_sub":
                        articulo.setWeb_Sub(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_actd":
                        articulo.setWeb_Actd(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_acth":
                        articulo.setWeb_Acth(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "divs1":
                        articulo.setDivs1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "divs2":
                        articulo.setDivs2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_cat1":
                        articulo.setWeb_Cat1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_cat2":
                        articulo.setWeb_Cat2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_cat3":
                        articulo.setWeb_Cat3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ntv":
                        articulo.setNtv(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "agr":
                        articulo.setAgr(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "com":
                        articulo.setCom(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "hor":
                        articulo.setHor(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "come":
                        articulo.setCome(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tim":
                        articulo.setTim(SQLUtils.devuelveInteger(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dos":
                        articulo.setDos(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_pro":
                        articulo.setNum_Pro(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "num_com":
                        articulo.setNum_Com(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "csi":
                        articulo.setCsi(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inc_pre":
                        articulo.setInc_Pre(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "inc_red":
                        articulo.setInc_Red(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat1":
                        articulo.setWeb_Orcat1(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat2":
                        articulo.setWeb_Orcat2(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_orcat3":
                        articulo.setWeb_Orcat3(SQLUtils.devuelveFloat(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_metat":
                        articulo.setWeb_Metat(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_metad":
                        articulo.setWeb_Metad(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_urla":
                        articulo.setWeb_Urla(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_h1":
                        articulo.setWeb_H1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_h2_1":
                        articulo.setWeb_H2_1(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "web_h2_2":
                        articulo.setWeb_H2_2(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                    case "sincro":
                        articulo.setSincro(SQLUtils.devuelveString(hashtable.get(relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            /* System.out.println("Fila: " + i); 
            System.out.println(articulo);
            System.out.println("----------------------------------------------------------"); */
            articulos.add(articulo);
        }
        lista.setLista(articulos);
    }
}