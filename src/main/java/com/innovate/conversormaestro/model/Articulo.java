package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class Articulo {
    private String cod;
    private String nom = "";
    private String fam = "";
    private String obs = "";
    private float min = 0.000000f;
    private float max = 0.000000f;
    private String med = "";
    private String uni = "";
    private String cla = "";
    private int iva = 0;
    private String ubi = "";
    private String rea = "";
    private String rep = "";
    private float cos = 0.000000f;
    private float pba = 0.000000f;
    private String dtocom1 = "P";
    private String dtocom2 = "P";
    private String dtoven1 = "P";
    private String dtoven2 = "P";
    private float dt1 = 0.00f;
    private float dt2 = 0.00f;
    private float dt3 = 0.00f;
    private float dt4 = 0.00f;
    private float dt5 = 0.00f;
    private float co1 = 0.00f;
    private float co2 = 0.00f;
    private float co3 = 0.00f;
    private float co4 = 0.00f;
    private float co5 = 0.00f;
    private float pmc = 0.000000f;
    private float upc = 0.000000f;
    private String ufc = "NULL";
    private String pro = "";
    private float pmv = 0.000000f;
    private float upv = 0.000000f;
    private String ufv = "NULL";
    private float exi = 0.000000f;
    private float vai = 0.000f;
    private float ent = 0.000000f;
    private float ptc = 0.000f;
    private float sal = 0.000000f;
    private float ptv = 0.000f;
    private float ma1 = 0.00f;
    private float ma2 = 0.00f;
    private float ma3 = 0.00f;
    private float ma4 = 0.00f;
    private float ma5 = 0.00f;
    private float d01 = 0.00f;
    private float d02 = 0.00f;
    private float d03 = 0.00f;
    private float d04 = 0.00f;
    private float d05 = 0.00f;
    private String cuc = "6000000000";
    private String cuv = "7000000000";
    private String bar = "";
    private float p21 = 0.000000f;
    private float p22 = 0.000000f;
    private float p23 = 0.000000f;
    private float p24 = 0.000000f;
    private float p25 = 0.000000f;
    private int iv2 = 0;
    private String ima = "";
    private String abr = "";
    private float coi = 0.000000f;
    private int di1 = 0;
    private int di2 = 0;
    private int sec = 1;
    private String tem = "";
    private float ide = 0.000000f;
    private String tra = "N";
    private String coe = "N";
    private String eim = "";
    private int gru = 1;
    private String pos = "";
    private String fot = "";
    private String trazab = "N";
    private String medida = "N";
    private int num_med = 0;
    private float med_1 = 0.000000f;
    private float med_2 = 0.000000f;
    private float med_3 = 0.000000f;
    private float bultos = 0.00f;
    private float paquet = 0.00f;
    private String impues = "N";
    private String art_imp = "";
    private String sum_imp = "N";
    private float fac_can = 0.000000f;
    private float fac_imp = 0.000000f;
    private String fec_cre = "NULL";
    private String obsole = "N";
    private String per_com = "S";
    private String per_ven = "S";
    private float peso = 0.000000f;
    private float volumen = 0.000000f;
    private String men_sto = "S";
    private String con_sto = "S";
    private String marca1 = "N";
    private String marca2 = "N";
    private String ped_tex = "N";
    private String ped_cos = "N";
    private String env = "N";
    private String v01 = "";
    private String v02 = "";
    private String v03 = "";
    private String v04 = "";
    private String v05 = "";
    private String v06 = "";
    private String v07 = "";
    private String v08 = "";
    private String v09 = "";
    private String v10 = "";
    private String v11 = "";
    private String v12 = "";
    private String ctadevcom = "6080000000";
    private String ctadevven = "7080000000";
    private String ctadtocom = "6000000000";
    private String ctadtoven = "7000000000";
    private float meses = 3;
    private String imaweb = "";
    private String fabpro = "";
    private String fabtip = "";
    private String nse = "N";
    private String historia = "";
    private float art_minped = 0.000000f;
    private String art_subfam = "";
    private String art_marca = "";
    private String web_nov = "N";
    private String web_fealno = "NULL";
    private String web_des = "N";
    private float coefici = 0.000000f;
    private String web_sub = "N";
    private String web_actd = "NULL";
    private String web_acth = "NULL";
    private String divs1 = "";
    private String divs2 = "";
    private float web_cat1 = 0;
    private float web_cat2 = 0;
    private float web_cat3 = 0;
    private String ntv = "";
    private String agr = "S";
    private String com = "";
    private String hor = "N";
    private float come = 0;
    private int tim = 1;
    private float dos = 1.000000f;
    private float num_pro = 0;
    private float num_com = 0;
    private String csi = "";
    private String inc_pre = "";
    private float inc_red = 0.00f;
    private float web_orcat1 = 0;
    private float web_orcat2 = 0;
    private float web_orcat3 = 0;
    private String web_metat = "";
    private String web_metad = "";
    private String web_urla = "";
    private String web_h1 = "";
    private String web_h2_1 = "";
    private String web_h2_2 = "";
    private String sincro = "X";

    private String cer_ret = "";
    private float cer_prebas = 0.000000f;
    private String cer_toxico = "";
    private String cer_numreg = "";
    private String cer_feccad = "NULL";
    private String cer_cattox = "";
    private String cer_numonu = "";
    private String cer_compon = "";
    private String cer_fictec = "";
    private String cer_fer = "";
    private String cer_tipabo = "";
    private String cer_riqnpk = "";
    private String cer_ffiseg = "NULL";
    private float cer_dosmax = 0.000000f;
    private String cer_plaseg = "";
    private String cer_exe_lq = "";
    private String cer_catemb = "";
    private String cer_clase = "";
    private float cer_coertc = 0.000000f;
    private String cer_tipfer = "";
    private String cer_tipest = "";
    private float cer_nitro = 0.000000f;
    private String cer_precur = "";
    private String cer_comp = "";
    private float cer_concen = 0.000000f;
    private String cer_cas = "";
    private String cer_uso = "";
    private String cer_pelma = "";
    private String cer_imppar = "";
    private String cer_dencom = "";
    private String cer_aspafi = "";
    private String cer_sigfit = "";

    private float dis_cai = 0.000000f;
    private float dis_cae = 0.000000f;
    private float dis_cas = 0.000000f;
    private float dis_pii = 0.000000f;
    private float dis_pie = 0.000000f;
    private float dis_pis = 0.000000f;
    private int dis_tar = 0;
    private String dis_tva = "";
    private String dis_pva = "";
    private float dis_vpa = 0.000000f;
    private float dis_vca = 0.000000f;
    private float dis_pun = 0.000000f;
    private String dis_utr = "";
    private String dis_env = "";
    private String dis_uniimp = "";
    private String dis_uniped = "";

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getFam() {
        return fam;
    }

    public String getObs() {
        return obs;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public String getMed() {
        return med;
    }

    public String getUni() {
        return uni;
    }

    public String getCla() {
        return cla;
    }

    public int getIva() {
        return iva;
    }

    public String getUbi() {
        return ubi;
    }

    public String getRea() {
        return rea;
    }

    public String getRep() {
        return rep;
    }

    public float getCos() {
        return cos;
    }

    public float getPba() {
        return pba;
    }

    public String getDtocom1() {
        return dtocom1;
    }

    public String getDtocom2() {
        return dtocom2;
    }

    public String getDtoven1() {
        return dtoven1;
    }

    public String getDtoven2() {
        return dtoven2;
    }

    public float getDt1() {
        return dt1;
    }

    public float getDt2() {
        return dt2;
    }

    public float getDt3() {
        return dt3;
    }

    public float getDt4() {
        return dt4;
    }

    public float getDt5() {
        return dt5;
    }

    public float getCo1() {
        return co1;
    }

    public float getCo2() {
        return co2;
    }

    public float getCo3() {
        return co3;
    }

    public float getCo4() {
        return co4;
    }

    public float getCo5() {
        return co5;
    }

    public float getPmc() {
        return pmc;
    }

    public float getUpc() {
        return upc;
    }

    public String getUfc() {
        return ufc;
    }

    public String getPro() {
        return pro;
    }

    public float getPmv() {
        return pmv;
    }

    public float getUpv() {
        return upv;
    }

    public String getUfv() {
        return ufv;
    }

    public float getExi() {
        return exi;
    }

    public float getVai() {
        return vai;
    }

    public float getEnt() {
        return ent;
    }

    public float getPtc() {
        return ptc;
    }

    public float getSal() {
        return sal;
    }

    public float getPtv() {
        return ptv;
    }

    public float getMa1() {
        return ma1;
    }

    public float getMa2() {
        return ma2;
    }

    public float getMa3() {
        return ma3;
    }

    public float getMa4() {
        return ma4;
    }

    public float getMa5() {
        return ma5;
    }

    public float getD01() {
        return d01;
    }

    public float getD02() {
        return d02;
    }

    public float getD03() {
        return d03;
    }

    public float getD04() {
        return d04;
    }

    public float getD05() {
        return d05;
    }

    public String getCuc() {
        return cuc;
    }

    public String getCuv() {
        return cuv;
    }

    public String getBar() {
        return bar;
    }

    public float getP21() {
        return p21;
    }

    public float getP22() {
        return p22;
    }

    public float getP23() {
        return p23;
    }

    public float getP24() {
        return p24;
    }

    public float getP25() {
        return p25;
    }

    public int getIv2() {
        return iv2;
    }

    public String getIma() {
        return ima;
    }

    public String getAbr() {
        return abr;
    }

    public float getCoi() {
        return coi;
    }

    public int getDi1() {
        return di1;
    }

    public int getDi2() {
        return di2;
    }

    public int getSec() {
        return sec;
    }

    public String getTem() {
        return tem;
    }

    public float getIde() {
        return ide;
    }

    public String getTra() {
        return tra;
    }

    public String getCoe() {
        return coe;
    }

    public String getEim() {
        return eim;
    }

    public int getGru() {
        return gru;
    }

    public String getPos() {
        return pos;
    }

    public String getFot() {
        return fot;
    }

    public String getTrazab() {
        return trazab;
    }

    public String getMedida() {
        return medida;
    }

    public int getNum_med() {
        return num_med;
    }

    public float getMed_1() {
        return med_1;
    }

    public float getMed_2() {
        return med_2;
    }

    public float getMed_3() {
        return med_3;
    }

    public float getBultos() {
        return bultos;
    }

    public float getPaquet() {
        return paquet;
    }

    public String getImpues() {
        return impues;
    }

    public String getArt_imp() {
        return art_imp;
    }

    public String getSum_imp() {
        return sum_imp;
    }

    public float getFac_can() {
        return fac_can;
    }

    public float getFac_imp() {
        return fac_imp;
    }

    public String getFec_cre() {
        return fec_cre;
    }

    public String getObsole() {
        return obsole;
    }

    public String getPer_com() {
        return per_com;
    }

    public String getPer_ven() {
        return per_ven;
    }

    public float getPeso() {
        return peso;
    }

    public float getVolumen() {
        return volumen;
    }

    public String getMen_sto() {
        return men_sto;
    }

    public String getCon_sto() {
        return con_sto;
    }

    public String getMarca1() {
        return marca1;
    }

    public String getMarca2() {
        return marca2;
    }

    public String getPed_tex() {
        return ped_tex;
    }

    public String getPed_cos() {
        return ped_cos;
    }

    public String getEnv() {
        return env;
    }

    public String getV01() {
        return v01;
    }

    public String getV02() {
        return v02;
    }

    public String getV03() {
        return v03;
    }

    public String getV04() {
        return v04;
    }

    public String getV05() {
        return v05;
    }

    public String getV06() {
        return v06;
    }

    public String getV07() {
        return v07;
    }

    public String getV08() {
        return v08;
    }

    public String getV09() {
        return v09;
    }

    public String getV10() {
        return v10;
    }

    public String getV11() {
        return v11;
    }

    public String getV12() {
        return v12;
    }

    public String getCtadevcom() {
        return ctadevcom;
    }

    public String getCtadevven() {
        return ctadevven;
    }

    public String getCtadtocom() {
        return ctadtocom;
    }

    public String getCtadtoven() {
        return ctadtoven;
    }

    public float getMeses() {
        return meses;
    }

    public String getImaweb() {
        return imaweb;
    }

    public String getFabpro() {
        return fabpro;
    }

    public String getFabtip() {
        return fabtip;
    }

    public String getNse() {
        return nse;
    }

    public String getHistoria() {
        return historia;
    }

    public float getArt_minped() {
        return art_minped;
    }

    public String getArt_subfam() {
        return art_subfam;
    }

    public String getArt_marca() {
        return art_marca;
    }

    public String getWeb_nov() {
        return web_nov;
    }

    public String getWeb_fealno() {
        return web_fealno;
    }

    public String getWeb_des() {
        return web_des;
    }

    public float getCoefici() {
        return coefici;
    }

    public String getWeb_sub() {
        return web_sub;
    }

    public String getWeb_actd() {
        return web_actd;
    }

    public String getWeb_acth() {
        return web_acth;
    }

    public String getDivs1() {
        return divs1;
    }

    public String getDivs2() {
        return divs2;
    }

    public float getWeb_cat1() {
        return web_cat1;
    }

    public float getWeb_cat2() {
        return web_cat2;
    }

    public float getWeb_cat3() {
        return web_cat3;
    }

    public String getNtv() {
        return ntv;
    }

    public String getAgr() {
        return agr;
    }

    public String getCom() {
        return com;
    }

    public String getHor() {
        return hor;
    }

    public float getCome() {
        return come;
    }

    public int getTim() {
        return tim;
    }

    public float getDos() {
        return dos;
    }

    public float getNum_pro() {
        return num_pro;
    }

    public float getNum_com() {
        return num_com;
    }

    public String getCsi() {
        return csi;
    }

    public String getInc_pre() {
        return inc_pre;
    }

    public float getInc_red() {
        return inc_red;
    }

    public float getWeb_orcat1() {
        return web_orcat1;
    }

    public float getWeb_orcat2() {
        return web_orcat2;
    }

    public float getWeb_orcat3() {
        return web_orcat3;
    }

    public String getWeb_metat() {
        return web_metat;
    }

    public String getWeb_metad() {
        return web_metad;
    }

    public String getWeb_urla() {
        return web_urla;
    }

    public String getWeb_h1() {
        return web_h1;
    }

    public String getWeb_h2_1() {
        return web_h2_1;
    }

    public String getWeb_h2_2() {
        return web_h2_2;
    }

    public String getSincro() {
        return sincro;
    }

    public String getCer_ret() {
        return cer_ret;
    }

    public float getCer_prebas() {
        return cer_prebas;
    }

    public String getCer_toxico() {
        return cer_toxico;
    }

    public String getCer_numreg() {
        return cer_numreg;
    }

    public String getCer_feccad() {
        return cer_feccad;
    }

    public String getCer_cattox() {
        return cer_cattox;
    }

    public String getCer_numonu() {
        return cer_numonu;
    }

    public String getCer_compon() {
        return cer_compon;
    }

    public String getCer_fictec() {
        return cer_fictec;
    }

    public String getCer_fer() {
        return cer_fer;
    }

    public String getCer_tipabo() {
        return cer_tipabo;
    }

    public String getCer_riqnpk() {
        return cer_riqnpk;
    }

    public String getCer_ffiseg() {
        return cer_ffiseg;
    }

    public float getCer_dosmax() {
        return cer_dosmax;
    }

    public String getCer_plaseg() {
        return cer_plaseg;
    }

    public String getCer_exe_lq() {
        return cer_exe_lq;
    }

    public String getCer_catemb() {
        return cer_catemb;
    }

    public String getCer_clase() {
        return cer_clase;
    }

    public float getCer_coertc() {
        return cer_coertc;
    }

    public String getCer_tipfer() {
        return cer_tipfer;
    }

    public String getCer_tipest() {
        return cer_tipest;
    }

    public float getCer_nitro() {
        return cer_nitro;
    }

    public String getCer_precur() {
        return cer_precur;
    }

    public String getCer_comp() {
        return cer_comp;
    }

    public float getCer_concen() {
        return cer_concen;
    }

    public String getCer_cas() {
        return cer_cas;
    }

    public String getCer_uso() {
        return cer_uso;
    }

    public String getCer_pelma() {
        return cer_pelma;
    }

    public String getCer_imppar() {
        return cer_imppar;
    }

    public String getCer_dencom() {
        return cer_dencom;
    }

    public String getCer_aspafi() {
        return cer_aspafi;
    }

    public String getCer_sigfit() {
        return cer_sigfit;
    }

    public float getDis_cai() {
        return dis_cai;
    }

    public float getDis_cae() {
        return dis_cae;
    }

    public float getDis_cas() {
        return dis_cas;
    }

    public float getDis_pii() {
        return dis_pii;
    }

    public float getDis_pie() {
        return dis_pie;
    }

    public float getDis_pis() {
        return dis_pis;
    }

    public int getDis_tar() {
        return dis_tar;
    }

    public String getDis_tva() {
        return dis_tva;
    }

    public String getDis_pva() {
        return dis_pva;
    }

    public float getDis_vpa() {
        return dis_vpa;
    }

    public float getDis_vca() {
        return dis_vca;
    }

    public float getDis_pun() {
        return dis_pun;
    }

    public String getDis_utr() {
        return dis_utr;
    }

    public String getDis_env() {
        return dis_env;
    }

    public String getDis_uniimp() {
        return dis_uniimp;
    }

    public String getDis_uniped() {
        return dis_uniped;
    }

    public void setCod(String cod) {
        if (cod.length() > 25) {
            this.cod = cod.trim().substring(0, 25).replace("'", "");
        } else {
            this.cod = cod.replace("'", "");
        }
    }

    public void setNom(String nom) {
        if (nom.length() > 50) {
            this.nom = nom.trim().substring(0, 50).replace("'", "");
        } else {
            this.nom = nom.replace("'", "");
        }
    }

    public void setFam(String fam) {
        if (fam.length() > 6) {
            this.fam = fam.trim().substring(0, 6).replace("'", "");
        } else {
            this.fam = fam.replace("'", "");
        }
    }

    public void setObs(String obs) {
        if (obs.length() > 30) {
            this.obs = obs.trim().substring(0, 30).replace("'", "");
        } else {
            this.obs = obs.replace("'", "");
        }
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public void setMed(String med) {
        if (med.length() > 15) {
            this.med = med.trim().substring(0, 15).replace("'", "");
        } else {
            this.med = med.replace("'", "");
        }
    }

    public void setUni(String uni) {
        if (uni.length() > 1) {
            this.uni = uni.trim().substring(0, 1).replace("'", "");
        } else {
            this.uni = uni.replace("'", "");
        }
    }

    public void setCla(String cla) {
        if (cla.length() > 15) {
            this.cla = cla.trim().substring(0, 15).replace("'", "");
        } else {
            this.cla = cla.replace("'", "");
        }
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setUbi(String ubi) {
        if (ubi.length() > 15) {
            this.ubi = ubi.trim().substring(0, 15).replace("'", "");
        } else {
            this.ubi = ubi.replace("'", "");
        }
    }

    public void setRea(String rea) {
        if (rea.length() > 25) {
            this.rea = rea.trim().substring(0, 25).replace("'", "");
        } else {
            this.rea = rea.replace("'", "");
        }
    }

    public void setRep(String rep) {
        if (rep.length() > 25) {
            this.rep = rep.trim().substring(0, 25).replace("'", "");
        } else {
            this.rep = rep.replace("'", "");
        }
    }

    public void setCos(float cos) {
        this.cos = cos;
    }

    public void setPba(float pba) {
        this.pba = pba;
    }

    public void setDtocom1(String dtocom1) {
        if (dtocom1.length() > 1) {
            this.dtocom1 = dtocom1.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtocom1 = dtocom1.replace("'", "");
        }
    }

    public void setDtocom2(String dtocom2) {
        if (dtocom2.length() > 1) {
            this.dtocom2 = dtocom2.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtocom2 = dtocom2.replace("'", "");
        }
    }

    public void setDtoven1(String dtoven1) {
        if (dtoven1.length() > 1) {
            this.dtoven1 = dtoven1.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtoven1 = dtoven1.replace("'", "");
        }
    }

    public void setDtoven2(String dtoven2) {
        if (dtoven2.length() > 1) {
            this.dtoven2 = dtoven2.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtoven2 = dtoven2.replace("'", "");
        }
    }

    public void setDt1(float dt1) {
        this.dt1 = dt1;
    }

    public void setDt2(float dt2) {
        this.dt2 = dt2;
    }

    public void setDt3(float dt3) {
        this.dt3 = dt3;
    }

    public void setDt4(float dt4) {
        this.dt4 = dt4;
    }

    public void setDt5(float dt5) {
        this.dt5 = dt5;
    }

    public void setCo1(float co1) {
        this.co1 = co1;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public void setCo3(float co3) {
        this.co3 = co3;
    }

    public void setCo4(float co4) {
        this.co4 = co4;
    }

    public void setCo5(float co5) {
        this.co5 = co5;
    }

    public void setPmc(float pmc) {
        this.pmc = pmc;
    }

    public void setUpc(float upc) {
        this.upc = upc;
    }

    public void setUfc(String ufc) {
        if (ufc == null || ufc.equals("NULL")) {
            this.ufc = "NULL";
        } else {
            this.ufc = "'" + ufc + "'";
        }
    }

    public void setPro(String pro) {
        if (pro.length() > 6) {
            this.pro = pro.trim().substring(0, 6).replace("'", "");
        } else {
            this.pro = pro.replace("'", "");
        }
    }

    public void setPmv(float pmv) {
        this.pmv = pmv;
    }

    public void setUpv(float upv) {
        this.upv = upv;
    }

    public void setUfv(String ufv) {
        if (ufv == null || ufv.equals("NULL")) {
            this.ufv = "NULL";
        } else {
            this.ufv = "'" + ufv + "'";
        }
    }

    public void setExi(float exi) {
        this.exi = exi;
    }

    public void setVai(float vai) {
        this.vai = vai;
    }

    public void setEnt(float ent) {
        this.ent = ent;
    }

    public void setPtc(float ptc) {
        this.ptc = ptc;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void setPtv(float ptv) {
        this.ptv = ptv;
    }

    public void setMa1(float ma1) {
        this.ma1 = ma1;
    }

    public void setMa2(float ma2) {
        this.ma2 = ma2;
    }

    public void setMa3(float ma3) {
        this.ma3 = ma3;
    }

    public void setMa4(float ma4) {
        this.ma4 = ma4;
    }

    public void setMa5(float ma5) {
        this.ma5 = ma5;
    }

    public void setD01(float d01) {
        this.d01 = d01;
    }

    public void setD02(float d02) {
        this.d02 = d02;
    }

    public void setD03(float d03) {
        this.d03 = d03;
    }

    public void setD04(float d04) {
        this.d04 = d04;
    }

    public void setD05(float d05) {
        this.d05 = d05;
    }

    public void setCuc(String cuc) {
        if (cuc.length() > 12) {
            this.cuc = cuc.trim().substring(0, 12).replace("'", "");
        } else {
            this.cuc = cuc.replace("'", "");
        }
    }

    public void setCuv(String cuv) {
        if (cuv.length() > 12) {
            this.cuv = cuv.trim().substring(0, 12).replace("'", "");
        } else {
            this.cuv = cuv.replace("'", "");
        }
    }

    public void setBar(String bar) {
        if (bar.length() > 25) {
            this.bar = bar.trim().substring(0, 25).replace("'", "");
        } else {
            this.bar = bar.replace("'", "");
        }
    }

    public void setP21(float p21) {
        this.p21 = p21;
    }

    public void setP22(float p22) {
        this.p22 = p22;
    }

    public void setP23(float p23) {
        this.p23 = p23;
    }

    public void setP24(float p24) {
        this.p24 = p24;
    }

    public void setP25(float p25) {
        this.p25 = p25;
    }

    public void setIv2(int iv2) {
        this.iv2 = iv2;
    }

    public void setIma(String ima) {
        if (ima.length() > 20) {
            this.ima = ima.trim().substring(0, 20).replace("'", "");
        } else {
            this.ima = ima.replace("'", "");
        }
    }

    public void setAbr(String abr) {
        if (abr.length() > 9) {
            this.abr = abr.trim().substring(0, 9).replace("'", "");
        } else {
            this.abr = abr.replace("'", "");
        }
    }

    public void setCoi(float coi) {
        this.coi = coi;
    }

    public void setDi1(int di1) {
        this.di1 = di1;
    }

    public void setDi2(int di2) {
        this.di2 = di2;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setTem(String tem) {
        if (tem.length() > 8) {
            this.tem = tem.trim().substring(0, 8).replace("'", "");
        } else {
            this.tem = tem.replace("'", "");
        }
    }

    public void setIde(float ide) {
        this.ide = ide;
    }

    public void setTra(String tra) {
        if (tra.length() > 1) {
            this.tra = tra.trim().substring(0, 1).replace("'", "");
        } else {
            this.tra = tra.replace("'", "");
        }
    }

    public void setCoe(String coe) {
        if (coe.length() > 1) {
            this.coe = coe.trim().substring(0, 1).replace("'", "");
        } else {
            this.coe = coe.replace("'", "");
        }
    }

    public void setEim(String eim) {
        if (eim.length() > 1) {
            this.eim = eim.trim().substring(0, 1).replace("'", "");
        } else {
            this.eim = eim.replace("'", "");
        }
    }

    public void setGru(int gru) {
        this.gru = gru;
    }

    public void setPos(String pos) {
        if (pos.length() > 4) {
            this.pos = pos.trim().substring(0, 4).replace("'", "");
        } else {
            this.pos = pos.replace("'", "");
        }
    }

    public void setFot(String fot) {
        if (fot.length() > 20) {
            this.fot = fot.trim().substring(0, 20).replace("'", "");
        } else {
            this.fot = fot.replace("'", "");
        }
    }

    public void setTrazab(String trazab) {
        if (trazab.length() > 1) {
            this.trazab = trazab.trim().substring(0, 1).replace("'", "");
        } else {
            this.trazab = trazab.replace("'", "");
        }
    }

    public void setMedida(String medida) {
        if (medida.length() > 1) {
            this.medida = medida.trim().substring(0, 1).replace("'", "");
        } else {
            this.medida = medida.replace("'", "");
        }
    }

    public void setNum_Med(int num_med) {
        this.num_med = num_med;
    }

    public void setMed_1(float med_1) {
        this.med_1 = med_1;
    }

    public void setMed_2(float med_2) {
        this.med_2 = med_2;
    }

    public void setMed_3(float med_3) {
        this.med_3 = med_3;
    }

    public void setBultos(float bultos) {
        this.bultos = bultos;
    }

    public void setPaquet(float paquet) {
        this.paquet = paquet;
    }

    public void setImpues(String impues) {
        if (impues.length() > 1) {
            this.impues = impues.trim().substring(0, 1).replace("'", "");
        } else {
            this.impues = impues.replace("'", "");
        }
    }

    public void setArt_Imp(String art_imp) {
        if (art_imp.length() > 25) {
            this.art_imp = art_imp.trim().substring(0, 25).replace("'", "");
        } else {
            this.art_imp = art_imp.replace("'", "");
        }
    }

    public void setSum_Imp(String sum_imp) {
        if (sum_imp.length() > 1) {
            this.sum_imp = sum_imp.trim().substring(0, 1).replace("'", "");
        } else {
            this.sum_imp = sum_imp.replace("'", "");
        }
    }

    public void setFac_Can(float fac_can) {
        this.fac_can = fac_can;
    }

    public void setFac_Imp(float fac_imp) {
        this.fac_imp = fac_imp;
    }

    public void setFec_Cre(String fec_cre) {
        if (fec_cre == null || fec_cre.equals("NULL")) {
            this.fec_cre = "NULL";
        } else {
            this.fec_cre = "'" + fec_cre + "'";
        }
    }

    public void setObsole(String obsole) {
        if (obsole.length() > 1) {
            this.obsole = obsole.trim().substring(0, 1).replace("'", "");
        } else {
            this.obsole = obsole.replace("'", "");
        }
    }

    public void setPer_Com(String per_com) {
        if (per_com.length() > 1) {
            this.per_com = per_com.trim().substring(0, 1).replace("'", "");
        } else {
            this.per_com = per_com.replace("'", "");
        }
    }

    public void setPer_Ven(String per_ven) {
        if (per_ven.length() > 1) {
            this.per_ven = per_ven.trim().substring(0, 1).replace("'", "");
        } else {
            this.per_ven = per_ven.replace("'", "");
        }
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public void setMen_Sto(String men_sto) {
        if (men_sto.length() > 1) {
            this.men_sto = men_sto.trim().substring(0, 1).replace("'", "");
        } else {
            this.men_sto = men_sto.replace("'", "");
        }
    }

    public void setCon_Sto(String con_sto) {
        if (con_sto.length() > 1) {
            this.con_sto = con_sto.trim().substring(0, 1).replace("'", "");
        } else {
            this.con_sto = con_sto.replace("'", "");
        }
    }

    public void setMarca1(String marca1) {
        if (marca1.length() > 1) {
            this.marca1 = marca1.trim().substring(0, 1).replace("'", "");
        } else {
            this.marca1 = marca1.replace("'", "");
        }
    }

    public void setMarca2(String marca2) {
        if (marca2.length() > 1) {
            this.marca2 = marca2.trim().substring(0, 1).replace("'", "");
        } else {
            this.marca2 = marca2.replace("'", "");
        }
    }

    public void setPed_Tex(String ped_tex) {
        if (ped_tex.length() > 1) {
            this.ped_tex = ped_tex.trim().substring(0, 1).replace("'", "");
        } else {
            this.ped_tex = ped_tex.replace("'", "");
        }
    }

    public void setPed_Cos(String ped_cos) {
        if (ped_cos.length() > 1) {
            this.ped_cos = ped_cos.trim().substring(0, 1).replace("'", "");
        } else {
            this.ped_cos = ped_cos.replace("'", "");
        }
    }

    public void setEnv(String env) {
        if (env.length() > 1) {
            this.env = env.trim().substring(0, 1).replace("'", "");
        } else {
            this.env = env.replace("'", "");
        }
    }

    public void setV01(String v01) {
        if (v01.length() > 50) {
            this.v01 = v01.trim().substring(0, 50).replace("'", "");
        } else {
            this.v01 = v01.replace("'", "");
        }
    }

    public void setV02(String v02) {
        if (v02.length() > 50) {
            this.v02 = v02.trim().substring(0, 50).replace("'", "");
        } else {
            this.v02 = v02.replace("'", "");
        }
    }

    public void setV03(String v03) {
        if (v03.length() > 50) {
            this.v03 = v03.trim().substring(0, 50).replace("'", "");
        } else {
            this.v03 = v03.replace("'", "");
        }
    }

    public void setV04(String v04) {
        if (v04.length() > 50) {
            this.v04 = v04.trim().substring(0, 50).replace("'", "");
        } else {
            this.v04 = v04.replace("'", "");
        }
    }

    public void setV05(String v05) {
        if (v05.length() > 50) {
            this.v05 = v05.trim().substring(0, 50).replace("'", "");
        } else {
            this.v05 = v05.replace("'", "");
        }
    }

    public void setV06(String v06) {
        if (v06.length() > 50) {
            this.v06 = v06.trim().substring(0, 50).replace("'", "");
        } else {
            this.v06 = v06.replace("'", "");
        }
    }

    public void setV07(String v07) {
        if (v07.length() > 50) {
            this.v07 = v07.trim().substring(0, 50).replace("'", "");
        } else {
            this.v07 = v07.replace("'", "");
        }
    }

    public void setV08(String v08) {
        if (v08.length() > 50) {
            this.v08 = v08.trim().substring(0, 50).replace("'", "");
        } else {
            this.v08 = v08.replace("'", "");
        }
    }

    public void setV09(String v09) {
        if (v09.length() > 50) {
            this.v09 = v09.trim().substring(0, 50).replace("'", "");
        } else {
            this.v09 = v09.replace("'", "");
        }
    }

    public void setV10(String v10) {
        if (v10.length() > 50) {
            this.v10 = v10.trim().substring(0, 50).replace("'", "");
        } else {
            this.v10 = v10.replace("'", "");
        }
    }

    public void setV11(String v11) {
        if (v11.length() > 50) {
            this.v11 = v11.trim().substring(0, 50).replace("'", "");
        } else {
            this.v11 = v11.replace("'", "");
        }
    }

    public void setV12(String v12) {
        if (v12.length() > 50) {
            this.v12 = v12.trim().substring(0, 50).replace("'", "");
        } else {
            this.v12 = v12.replace("'", "");
        }
    }

    public void setCtadevcom(String ctadevcom) {
        if (ctadevcom.length() > 12) {
            this.ctadevcom = ctadevcom.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadevcom = ctadevcom.replace("'", "");
        }
    }

    public void setCtadevven(String ctadevven) {
        if (ctadevven.length() > 12) {
            this.ctadevven = ctadevven.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadevven = ctadevven.replace("'", "");
        }
    }

    public void setCtadtocom(String ctadtocom) {
        if (ctadtocom.length() > 12) {
            this.ctadtocom = ctadtocom.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadtocom = ctadtocom.replace("'", "");
        }
    }

    public void setCtadtoven(String ctadtoven) {
        if (ctadtoven.length() > 12) {
            this.ctadtoven = ctadtoven.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadtoven = ctadtoven.replace("'", "");
        }
    }

    public void setMeses(float meses) {
        this.meses = meses;
    }

    public void setImaweb(String imaweb) {
        if (imaweb.length() > 20) {
            this.imaweb = imaweb.trim().substring(0, 20).replace("'", "");
        } else {
            this.imaweb = imaweb.replace("'", "");
        }
    }

    public void setFabpro(String fabpro) {
        if (fabpro.length() > 6) {
            this.fabpro = fabpro.trim().substring(0, 6).replace("'", "");
        } else {
            this.fabpro = fabpro.replace("'", "");
        }
    }

    public void setFabtip(String fabtip) {
        if (fabtip.length() > 1) {
            this.fabtip = fabtip.trim().substring(0, 1).replace("'", "");
        } else {
            this.fabtip = fabtip.replace("'", "");
        }
    }

    public void setNse(String nse) {
        if (nse.length() > 1) {
            this.nse = nse.trim().substring(0, 1).replace("'", "");
        } else {
            this.nse = nse.replace("'", "");
        }
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public void setArt_Minped(float art_minped) {
        this.art_minped = art_minped;
    }

    public void setArt_Subfam(String art_subfam) {
        if (art_subfam.length() > 6) {
            this.art_subfam = art_subfam.trim().substring(0, 6).replace("'", "");
        } else {
            this.art_subfam = art_subfam.replace("'", "");
        }
    }

    public void setArt_Marca(String art_marca) {
        if (art_marca.length() > 6) {
            this.art_marca = art_marca.trim().substring(0, 6).replace("'", "");
        } else {
            this.art_marca = art_marca.replace("'", "");
        }
    }

    public void setWeb_Nov(String web_nov) {
        if (web_nov.length() > 1) {
            this.web_nov = web_nov.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_nov = web_nov.replace("'", "");
        }
    }

    public void setWeb_Fealno(String web_fealno) {
        if (web_fealno == null || web_fealno.equals("NULL")) {
            this.web_fealno = "NULL";
        } else {
            this.web_fealno = "'" + web_fealno + "'";
        }
    }

    public void setWeb_Des(String web_des) {
        if (web_des.length() > 1) {
            this.web_des = web_des.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_des = web_des.replace("'", "");
        }
    }

    public void setCoefici(float coefici) {
        this.coefici = coefici;
    }

    public void setWeb_Sub(String web_sub) {
        if (web_sub.length() > 1) {
            this.web_sub = web_sub.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_sub = web_sub.replace("'", "");
        }
    }

    public void setWeb_Actd(String web_actd) {
        if (web_actd == null || web_actd.equals("NULL")) {
            this.web_actd = "NULL";
        } else {
            this.web_actd = "'" + web_actd + "'";
        }
    }

    public void setWeb_Acth(String web_acth) {
        if (web_acth == null || web_acth.equals("NULL")) {
            this.web_acth = "NULL";
        } else {
            this.web_acth = "'" + web_acth + "'";
        }
    }

    public void setDivs1(String divs1) {
        this.divs1 = divs1;
    }

    public void setDivs2(String divs2) {
        this.divs2 = divs2;
    }

    public void setWeb_Cat1(float web_cat1) {
        this.web_cat1 = web_cat1;
    }

    public void setWeb_Cat2(float web_cat2) {
        this.web_cat2 = web_cat2;
    }

    public void setWeb_Cat3(float web_cat3) {
        this.web_cat3 = web_cat3;
    }

    public void setNtv(String ntv) {
        if (ntv.length() > 50) {
            this.ntv = ntv.trim().substring(0, 50).replace("'", "");
        } else {
            this.ntv = ntv.replace("'", "");
        }
    }

    public void setAgr(String agr) {
        if (agr.length() > 1) {
            this.agr = agr.trim().substring(0, 1).replace("'", "");
        } else {
            this.agr = agr.replace("'", "");
        }
    }

    public void setCom(String com) {
        if (com.length() > 3) {
            this.com = com.trim().substring(0, 3).replace("'", "");
        } else {
            this.com = com.replace("'", "");
        }
    }

    public void setHor(String hor) {
        if (hor.length() > 1) {
            this.hor = hor.trim().substring(0, 1).replace("'", "");
        } else {
            this.hor = hor.replace("'", "");
        }
    }

    public void setCome(float come) {
        this.come = come;
    }

    public void setTim(int tim) {
        this.tim = tim;
    }

    public void setDos(float dos) {
        this.dos = dos;
    }

    public void setNum_Pro(float num_pro) {
        this.num_pro = num_pro;
    }

    public void setNum_Com(float num_com) {
        this.num_com = num_com;
    }

    public void setCsi(String csi) {
        if (csi.length() > 1) {
            this.csi = csi.trim().substring(0, 1).replace("'", "");
        } else {
            this.csi = csi.replace("'", "");
        }
    }

    public void setInc_Pre(String inc_pre) {
        if (inc_pre.length() > 1) {
            this.inc_pre = inc_pre.trim().substring(0, 1).replace("'", "");
        } else {
            this.inc_pre = inc_pre.replace("'", "");
        }
    }

    public void setInc_Red(float inc_red) {
        this.inc_red = inc_red;
    }

    public void setWeb_Orcat1(float web_orcat1) {
        this.web_orcat1 = web_orcat1;
    }

    public void setWeb_Orcat2(float web_orcat2) {
        this.web_orcat2 = web_orcat2;
    }

    public void setWeb_Orcat3(float web_orcat3) {
        this.web_orcat3 = web_orcat3;
    }

    public void setWeb_Metat(String web_metat) {
        if (web_metat.length() > 70) {
            this.web_metat = web_metat.trim().substring(0, 70).replace("'", "");
        } else {
            this.web_metat = web_metat.replace("'", "");
        }
    }

    public void setWeb_Metad(String web_metad) {
        if (web_metad.length() > 160) {
            this.web_metad = web_metad.trim().substring(0, 160).replace("'", "");
        } else {
            this.web_metad = web_metad.replace("'", "");
        }
    }

    public void setWeb_Urla(String web_urla) {
        if (web_urla.length() > 80) {
            this.web_urla = web_urla.trim().substring(0, 80).replace("'", "");
        } else {
            this.web_urla = web_urla.replace("'", "");
        }
    }

    public void setWeb_H1(String web_h1) {
        if (web_h1.length() > 80) {
            this.web_h1 = web_h1.trim().substring(0, 80).replace("'", "");
        } else {
            this.web_h1 = web_h1.replace("'", "");
        }
    }

    public void setWeb_H2_1(String web_h2_1) {
        if (web_h2_1.length() > 80) {
            this.web_h2_1 = web_h2_1.trim().substring(0, 80).replace("'", "");
        } else {
            this.web_h2_1 = web_h2_1.replace("'", "");
        }
    }

    public void setWeb_H2_2(String web_h2_2) {
        if (web_h2_2.length() > 80) {
            this.web_h2_2 = web_h2_2.trim().substring(0, 80).replace("'", "");
        } else {
            this.web_h2_2 = web_h2_2.replace("'", "");
        }
    }

    public void setSincro(String sincro) {
        if (sincro.length() > 1) {
            this.sincro = sincro.trim().substring(0, 1).replace("'", "");
        } else {
            this.sincro = sincro.replace("'", "");
        }
    }

    public void setCer_ret(String cer_ret) {
        if (cer_ret.length() > 1) {
            this.cer_ret = cer_ret.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_ret = cer_ret.replace("'", "");
        }
    }

    public void setCer_prebas(float cer_prebas) {
        this.cer_prebas = cer_prebas;
    }

    public void setCer_toxico(String cer_toxico) {
        if (cer_toxico.length() > 1) {
            this.cer_toxico = cer_toxico.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_toxico = cer_toxico.replace("'", "");
        }
    }

    public void setCer_numreg(String cer_numreg) {
        if (cer_numreg.length() > 20) {
            this.cer_numreg = cer_numreg.trim().substring(0, 20).replace("'", "");
        } else {
            this.cer_numreg = cer_numreg.replace("'", "");
        }
    }

    public void setCer_feccad(String cer_feccad) {
        this.cer_feccad = cer_feccad;
    }

    public void setCer_cattox(String cer_cattox) {
        if (cer_cattox.length() > 3) {
            this.cer_cattox = cer_cattox.trim().substring(0, 3).replace("'", "");
        } else {
            this.cer_cattox = cer_cattox.replace("'", "");
        }
    }

    public void setCer_numonu(String cer_numonu) {
        if (cer_numonu.length() > 6) {
            this.cer_numonu = cer_numonu.trim().substring(0, 6).replace("'", "");
        } else {
            this.cer_numonu = cer_numonu.replace("'", "");
        }
    }

    public void setCer_compon(String cer_compon) {
        if (cer_compon.length() > 16) {
            this.cer_compon = cer_compon.trim().substring(0, 16).replace("'", "");
        } else {
            this.cer_compon = cer_compon.replace("'", "");
        }
    }

    public void setCer_fictec(String cer_fictec) {
        if (cer_fictec.length() > 80) {
            this.cer_fictec = cer_fictec.trim().substring(0, 80).replace("'", "");
        } else {
            this.cer_fictec = cer_fictec.replace("'", "");
        }
    }

    public void setCer_Ret(String cer_ret) {
        if (cer_ret.length() > 1) {
            this.cer_ret = cer_ret.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_ret = cer_ret.replace("'", "");
        }
    }

    public void setCer_Prebas(float cer_prebas) {
        this.cer_prebas = cer_prebas;
    }

    public void setCer_Toxico(String cer_toxico) {
        if (cer_toxico.length() > 1) {
            this.cer_toxico = cer_toxico.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_toxico = cer_toxico.replace("'", "");
        }
    }

    public void setCer_Numreg(String cer_numreg) {
        if (cer_numreg.length() > 20) {
            this.cer_numreg = cer_numreg.trim().substring(0, 20).replace("'", "");
        } else {
            this.cer_numreg = cer_numreg.replace("'", "");
        }
    }

    public void setCer_Feccad(String cer_feccad) {
        if (cer_feccad == null || cer_feccad.equals("NULL")) {
            this.cer_feccad = "NULL";
        } else {
            this.cer_feccad = "'" + cer_feccad + "'";
        }
    }

    public void setCer_Cattox(String cer_cattox) {
        if (cer_cattox.length() > 3) {
            this.cer_cattox = cer_cattox.trim().substring(0, 3).replace("'", "");
        } else {
            this.cer_cattox = cer_cattox.replace("'", "");
        }
    }

    public void setCer_Numonu(String cer_numonu) {
        if (cer_numonu.length() > 6) {
            this.cer_numonu = cer_numonu.trim().substring(0, 6).replace("'", "");
        } else {
            this.cer_numonu = cer_numonu.replace("'", "");
        }
    }

    public void setCer_Compon(String cer_compon) {
        this.cer_compon = cer_compon;
    }

    public void setCer_Fictec(String cer_fictec) {
        if (cer_fictec.length() > 80) {
            this.cer_fictec = cer_fictec.trim().substring(0, 80).replace("'", "");
        } else {
            this.cer_fictec = cer_fictec.replace("'", "");
        }
    }

    public void setCer_Fer(String cer_fer) {
        if (cer_fer.length() > 1) {
            this.cer_fer = cer_fer.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_fer = cer_fer.replace("'", "");
        }
    }

    public void setCer_Tipabo(String cer_tipabo) {
        if (cer_tipabo.length() > 3) {
            this.cer_tipabo = cer_tipabo.trim().substring(0, 3).replace("'", "");
        } else {
            this.cer_tipabo = cer_tipabo.replace("'", "");
        }
    }

    public void setCer_Riqnpk(String cer_riqnpk) {
        if (cer_riqnpk.length() > 8) {
            this.cer_riqnpk = cer_riqnpk.trim().substring(0, 8).replace("'", "");
        } else {
            this.cer_riqnpk = cer_riqnpk.replace("'", "");
        }
    }

    public void setCer_Ffiseg(String cer_ffiseg) {
        if (cer_ffiseg == null || cer_ffiseg.equals("NULL")) {
            this.cer_ffiseg = "NULL";
        } else {
            this.cer_ffiseg = "'" + cer_ffiseg + "'";
        }
    }

    public void setCer_Dosmax(float cer_dosmax) {
        this.cer_dosmax = cer_dosmax;
    }

    public void setCer_Plaseg(String cer_plaseg) {
        if (cer_plaseg.length() > 50) {
            this.cer_plaseg = cer_plaseg.trim().substring(0, 50).replace("'", "");
        } else {
            this.cer_plaseg = cer_plaseg.replace("'", "");
        }
    }

    public void setCer_Exe_Lq(String cer_exe_lq) {
        if (cer_exe_lq.length() > 1) {
            this.cer_exe_lq = cer_exe_lq.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_exe_lq = cer_exe_lq.replace("'", "");
        }
    }

    public void setCer_Catemb(String cer_catemb) {
        if (cer_catemb.length() > 6) {
            this.cer_catemb = cer_catemb.trim().substring(0, 6).replace("'", "");
        } else {
            this.cer_catemb = cer_catemb.replace("'", "");
        }
    }

    public void setCer_Clase(String cer_clase) {
        if (cer_clase.length() > 3) {
            this.cer_clase = cer_clase.trim().substring(0, 3).replace("'", "");
        } else {
            this.cer_clase = cer_clase.replace("'", "");
        }
    }

    public void setCer_Coertc(float cer_coertc) {
        this.cer_coertc = cer_coertc;
    }

    public void setCer_Tipfer(String cer_tipfer) {
        if (cer_tipfer.length() > 1) {
            this.cer_tipfer = cer_tipfer.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_tipfer = cer_tipfer.replace("'", "");
        }
    }

    public void setCer_Tipest(String cer_tipest) {
        if (cer_tipest.length() > 3) {
            this.cer_tipest = cer_tipest.trim().substring(0, 3).replace("'", "");
        } else {
            this.cer_tipest = cer_tipest.replace("'", "");
        }
    }

    public void setCer_Nitro(float cer_nitro) {
        this.cer_nitro = cer_nitro;
    }

    public void setCer_Precur(String cer_precur) {
        if (cer_precur.length() > 1) {
            this.cer_precur = cer_precur.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_precur = cer_precur.replace("'", "");
        }
    }

    public void setCer_Comp(String cer_comp) {
        if (cer_comp.length() > 50) {
            this.cer_comp = cer_comp.trim().substring(0, 50).replace("'", "");
        } else {
            this.cer_comp = cer_comp.replace("'", "");
        }
    }

    public void setCer_Concen(float cer_concen) {
        this.cer_concen = cer_concen;
    }

    public void setCer_Cas(String cer_cas) {
        if (cer_cas.length() > 15) {
            this.cer_cas = cer_cas.trim().substring(0, 15).replace("'", "");
        } else {
            this.cer_cas = cer_cas.replace("'", "");
        }
    }

    public void setCer_Uso(String cer_uso) {
        if (cer_uso.length() > 50) {
            this.cer_uso = cer_uso.trim().substring(0, 50).replace("'", "");
        } else {
            this.cer_uso = cer_uso.replace("'", "");
        }
    }

    public void setCer_Pelma(String cer_pelma) {
        if (cer_pelma.length() > 1) {
            this.cer_pelma = cer_pelma.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_pelma = cer_pelma.replace("'", "");
        }
    }

    public void setCer_Imppar(String cer_imppar) {
        if (cer_imppar.length() > 1) {
            this.cer_imppar = cer_imppar.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_imppar = cer_imppar.replace("'", "");
        }
    }

    public void setCer_Dencom(String cer_dencom) {
        if (cer_dencom.length() > 1) {
            this.cer_dencom = cer_dencom.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_dencom = cer_dencom.replace("'", "");
        }
    }

    public void setCer_Aspafi(String cer_aspafi) {
        if (cer_aspafi.length() > 50) {
            this.cer_aspafi = cer_aspafi.trim().substring(0, 50).replace("'", "");
        } else {
            this.cer_aspafi = cer_aspafi.replace("'", "");
        }
    }

    public void setCer_Sigfit(String cer_sigfit) {
        if (cer_sigfit.length() > 1) {
            this.cer_sigfit = cer_sigfit.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_sigfit = cer_sigfit.replace("'", "");
        }
    }

    public void setDis_Cai(float dis_cai) {
        this.dis_cai = dis_cai;
    }

    public void setDis_Cae(float dis_cae) {
        this.dis_cae = dis_cae;
    }

    public void setDis_Cas(float dis_cas) {
        this.dis_cas = dis_cas;
    }

    public void setDis_Pii(float dis_pii) {
        this.dis_pii = dis_pii;
    }

    public void setDis_Pie(float dis_pie) {
        this.dis_pie = dis_pie;
    }

    public void setDis_Pis(float dis_pis) {
        this.dis_pis = dis_pis;
    }

    public void setDis_Tar(int dis_tar) {
        this.dis_tar = dis_tar;
    }

    public void setDis_Tva(String dis_tva) {
        if (dis_tva.length() > 1) {
            this.dis_tva = dis_tva.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_tva = dis_tva.replace("'", "");
        }
    }

    public void setDis_Pva(String dis_pva) {
        if (dis_pva.length() > 1) {
            this.dis_pva = dis_pva.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_pva = dis_pva.replace("'", "");
        }
    }

    public void setDis_Vpa(float dis_vpa) {
        this.dis_vpa = dis_vpa;
    }

    public void setDis_Vca(float dis_vca) {
        this.dis_vca = dis_vca;
    }

    public void setDis_Pun(float dis_pun) {
        this.dis_pun = dis_pun;
    }

    public void setDis_Utr(String dis_utr) {
        if (dis_utr.length() > 1) {
            this.dis_utr = dis_utr.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_utr = dis_utr.replace("'", "");
        }
    }

    public void setDis_Env(String dis_env) {
        if (dis_env.length() > 3) {
            this.dis_env = dis_env.trim().substring(0, 3).replace("'", "");
        } else {
            this.dis_env = dis_env.replace("'", "");
        }
    }

    public void setDis_Uniimp(String dis_uniimp) {
        if (dis_uniimp.length() > 1) {
            this.dis_uniimp = dis_uniimp.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_uniimp = dis_uniimp.replace("'", "");
        }
    }

    public void setDis_Uniped(String dis_uniped) {
        if (dis_uniped.length() > 1) {
            this.dis_uniped = dis_uniped.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_uniped = dis_uniped.replace("'", "");
        }
    }

    @Override
    public String toString() {
        String type = "";
        String GPVersion = "";
        ConnectionController connectionController = ConnectionController.getConectionController();
        if (connectionController.getSourceTab().equals("SQL")) {
            SQLController sqlController = SQLController.getSQLController();
            type = sqlController.getTypeTransfer();
        } else if (connectionController.getSourceTab().equals("DBF")) {
            DBFController dbfController = DBFController.getDBFController();
            type = dbfController.getTypeTransfer();
        } else if (connectionController.getSourceTab().equals("Excel")) {
            ExcelController excelController = ExcelController.getExcelController();
            type = excelController.getTypeTransfer();
        }

        GPVersion = connectionController.getGPVersionDestination();

        if (type.equals("Insert")) {
            if (GPVersion.equals("Fitosanitarios")) {
                return toInsertFit();
            } else if (GPVersion.equals("Distribucion")) {
                return toInsertDis();
            } else {
                return toInsert();
            }
        } else if (type.equals("Update")) {
            if (GPVersion.equals("Fitosanitarios")) {
                return toUpdateFit();
            } else if (GPVersion.equals("Distribucion")) {
                return toUpdateDis();
            } else {
                return toUpdate();
            }
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO ARTICU(cod, nom, fam, obs, min, max, med, uni, cla, iva, ubi, rea, rep, cos, pba, " +
                "dtocom1, dtocom2, dtoven1, dtoven2, dt1, dt2, dt3, dt4, dt5, co1, co2, co3, co4, co5, pmc, upc, ufc, pro, "
                +
                "pmv, upv, ufv, exi, vai, ent, ptc, sal, ptv, ma1, ma2, ma3, ma4, ma5, d01, d02, d03, d04, d05, cuc, cuv, bar, "
                +
                "p21, p22, p23, p24, p25, iv2, ima, abr, coi, di1, di2, sec, tem, ide, tra, coe, eim, gru, pos, fot, trazab, "
                +
                "medida, num_med, med_1, med_2, med_3, bultos, paquet, impues, art_imp, sum_imp, fac_can, fac_imp, fec_cre, obsole, "
                +
                "per_com, per_ven, peso, volumen, men_sto, con_sto, marca1, marca2, ped_tex, ped_cos, env, v01, v02, v03, v04, v05, "
                +
                "v06, v07, v08, v09, v10, v11, v12, ctadevcom, ctadevven, ctadtocom, ctadtoven, meses, imaweb, fabpro, fabtip, nse, "
                +
                "historia, art_minped, art_subfam, art_marca, web_nov, web_fealno, web_des, coefici, web_sub, web_actd, web_acth, divs1, "
                +
                "divs2, web_cat1, web_cat2, web_cat3, ntv, agr, com, hor, come, tim, dos, num_pro, num_com, csi, inc_pre, inc_red, "
                +
                "web_orcat1, web_orcat2, web_orcat3, web_metat, web_metad, web_urla, web_h1, web_h2_1, web_h2_2, sincro) VALUES ('"
                + cod + "','" + nom + "','" + fam + "','" + obs + "'," + min + "," + max + ",'" + med + "','" + uni
                + "','" + cla + "'," + iva + ",'" + ubi + "','" + rea + "','" + rep + "'," + cos + "," + pba + ",'"
                + dtocom1 + "','" + dtocom2 + "','" + dtoven1 + "','" + dtoven2 + "'," + dt1 + "," + dt2 + "," + dt3
                + "," + dt4 + "," + dt5 + "," + co1 + "," + co2 + "," + co3 + "," + co4 + "," + co5 + "," + pmc + ","
                + upc + "," + ufc + ",'" + pro + "'," + pmv + "," + upv + "," + ufv + "," + exi + "," + vai + ","
                + ent + "," + ptc + "," + sal + "," + ptv + "," + ma1 + "," + ma2 + "," + ma3 + "," + ma4 + "," + ma5
                + "," + d01 + "," + d02 + "," + d03 + "," + d04 + "," + d05 + ",'" + cuc + "','" + cuv + "','" + bar
                + "'," + p21 + "," + p22 + "," + p23 + "," + p24 + "," + p25 + "," + iv2 + ",'" + ima + "','" + abr
                + "'," + coi + "," + di1 + "," + di2 + "," + sec + ",'" + tem + "'," + ide + ",'" + tra + "','" + coe
                + "','" + eim + "'," + gru + ",'" + pos + "','" + fot + "','" + trazab + "','" + medida + "'," + num_med
                + "," + med_1 + "," + med_2 + "," + med_3 + "," + bultos + "," + paquet + ",'" + impues + "','"
                + art_imp + "','" + sum_imp + "'," + fac_can + "," + fac_imp + "," + fec_cre + ",'" + obsole + "','"
                + per_com + "','" + per_ven + "'," + peso + "," + volumen + ",'" + men_sto + "','" + con_sto + "','"
                + marca1 + "','" + marca2 + "','" + ped_tex + "','" + ped_cos + "','" + env + "','" + v01 + "','" + v02
                + "','" + v03 + "','" + v04 + "','" + v05 + "','" + v06 + "','" + v07 + "','" + v08 + "','" + v09
                + "','" + v10 + "','" + v11 + "','" + v12 + "','" + ctadevcom + "','" + ctadevven + "','" + ctadtocom
                + "','" + ctadtoven + "'," + meses + ",'" + imaweb + "','" + fabpro + "','" + fabtip + "','" + nse
                + "','" + historia + "'," + art_minped + ",'" + art_subfam + "','" + art_marca + "','" + web_nov + "',"
                + web_fealno + ",'" + web_des + "'," + coefici + ",'" + web_sub + "'," + web_actd + "," + web_acth
                + ",'" + divs1 + "','" + divs2 + "'," + web_cat1 + "," + web_cat2 + "," + web_cat3 + ",'" + ntv + "','"
                + agr + "','" + com + "','" + hor + "'," + come + "," + tim + "," + dos + "," + num_pro + "," + num_com
                + ",'" + csi + "','" + inc_pre + "'," + inc_red + "," + web_orcat1 + "," + web_orcat2 + "," + web_orcat3
                + ",'" + web_metat + "','" + web_metad + "','" + web_urla + "','" + web_h1 + "','" + web_h2_1 + "','"
                + web_h2_2 + "','" + sincro + "')";
    }

    public String toInsertFit() {
        return "INSERT INTO ARTICU(cod, nom, fam, obs, min, max, med, uni, cla, iva, ubi, rea, rep, cos, pba, " +
                "dtocom1, dtocom2, dtoven1, dtoven2, dt1, dt2, dt3, dt4, dt5, co1, co2, co3, co4, co5, pmc, upc, ufc, pro, "
                +
                "pmv, upv, ufv, exi, vai, ent, ptc, sal, ptv, ma1, ma2, ma3, ma4, ma5, d01, d02, d03, d04, d05, cuc, cuv, bar, "
                +
                "p21, p22, p23, p24, p25, iv2, ima, abr, coi, di1, di2, sec, tem, ide, tra, coe, eim, gru, pos, fot, trazab, "
                +
                "medida, num_med, med_1, med_2, med_3, bultos, paquet, impues, art_imp, sum_imp, fac_can, fac_imp, fec_cre, obsole, "
                +
                "per_com, per_ven, peso, volumen, men_sto, con_sto, marca1, marca2, ped_tex, ped_cos, env, v01, v02, v03, v04, v05, "
                +
                "v06, v07, v08, v09, v10, v11, v12, ctadevcom, ctadevven, ctadtocom, ctadtoven, meses, imaweb, fabpro, fabtip, nse, "
                +
                "historia, art_minped, art_subfam, art_marca, web_nov, web_fealno, web_des, coefici, web_sub, web_actd, web_acth, divs1, "
                +
                "divs2, web_cat1, web_cat2, web_cat3, ntv, agr, com, hor, come, tim, dos, num_pro, num_com, csi, inc_pre, inc_red, "
                +
                "web_orcat1, web_orcat2, web_orcat3, web_metat, web_metad, web_urla, web_h1, web_h2_1, web_h2_2, sincro, cer_ret, "
                +
                "cer_prebas, cer_toxico, cer_numreg, cer_feccad, cer_cattox, cer_numonu, cer_compon, cer_fictec, cer_fer, cer_tipabo, "
                +
                "cer_riqnpk, cer_ffiseg, cer_dosmax, cer_plaseg, cer_exe_lq, cer_catemb, cer_clase, cer_coertc, cer_tipfer, cer_tipest, "
                +
                "cer_nitro, cer_precur, cer_comp, cer_concen, cer_cas, cer_uso, cer_pelma, cer_imppar, cer_dencom, cer_aspafi, cer_sigfit"
                +
                ") VALUES ('"
                + cod + "','" + nom + "','" + fam + "','" + obs + "'," + min + "," + max + ",'" + med + "','" + uni
                + "','" + cla + "'," + iva + ",'" + ubi + "','" + rea + "','" + rep + "'," + cos + "," + pba + ",'"
                + dtocom1 + "','" + dtocom2 + "','" + dtoven1 + "','" + dtoven2 + "'," + dt1 + "," + dt2 + "," + dt3
                + "," + dt4 + "," + dt5 + "," + co1 + "," + co2 + "," + co3 + "," + co4 + "," + co5 + "," + pmc + ","
                + upc + "," + ufc + ",'" + pro + "'," + pmv + "," + upv + "," + ufv + "," + exi + "," + vai + ","
                + ent + "," + ptc + "," + sal + "," + ptv + "," + ma1 + "," + ma2 + "," + ma3 + "," + ma4 + "," + ma5
                + "," + d01 + "," + d02 + "," + d03 + "," + d04 + "," + d05 + ",'" + cuc + "','" + cuv + "','" + bar
                + "'," + p21 + "," + p22 + "," + p23 + "," + p24 + "," + p25 + "," + iv2 + ",'" + ima + "','" + abr
                + "'," + coi + "," + di1 + "," + di2 + "," + sec + ",'" + tem + "'," + ide + ",'" + tra + "','" + coe
                + "','" + eim + "'," + gru + ",'" + pos + "','" + fot + "','" + trazab + "','" + medida + "'," + num_med
                + "," + med_1 + "," + med_2 + "," + med_3 + "," + bultos + "," + paquet + ",'" + impues + "','"
                + art_imp + "','" + sum_imp + "'," + fac_can + "," + fac_imp + "," + fec_cre + ",'" + obsole + "','"
                + per_com + "','" + per_ven + "'," + peso + "," + volumen + ",'" + men_sto + "','" + con_sto + "','"
                + marca1 + "','" + marca2 + "','" + ped_tex + "','" + ped_cos + "','" + env + "','" + v01 + "','" + v02
                + "','" + v03 + "','" + v04 + "','" + v05 + "','" + v06 + "','" + v07 + "','" + v08 + "','" + v09
                + "','" + v10 + "','" + v11 + "','" + v12 + "','" + ctadevcom + "','" + ctadevven + "','" + ctadtocom
                + "','" + ctadtoven + "'," + meses + ",'" + imaweb + "','" + fabpro + "','" + fabtip + "','" + nse
                + "','" + historia + "'," + art_minped + ",'" + art_subfam + "','" + art_marca + "','" + web_nov + "',"
                + web_fealno + ",'" + web_des + "'," + coefici + ",'" + web_sub + "'," + web_actd + "," + web_acth
                + ",'" + divs1 + "','" + divs2 + "'," + web_cat1 + "," + web_cat2 + "," + web_cat3 + ",'" + ntv + "','"
                + agr + "','" + com + "','" + hor + "'," + come + "," + tim + "," + dos + "," + num_pro + "," + num_com
                + ",'" + csi + "','" + inc_pre + "'," + inc_red + "," + web_orcat1 + "," + web_orcat2 + "," + web_orcat3
                + ",'" + web_metat + "','" + web_metad + "','" + web_urla + "','" + web_h1 + "','" + web_h2_1 + "','"
                + web_h2_2 + "','" + sincro + "','" + cer_ret + "'," + cer_prebas + ",'" + cer_toxico + "','"
                + cer_numreg
                + "'," + cer_feccad + ",'" + cer_cattox + "','" + cer_numonu + "','" + cer_compon + "','" + cer_fictec
                + "','"
                + cer_fer + "','" + cer_tipabo + "','" + cer_riqnpk + "'," + cer_ffiseg + "," + cer_dosmax + ",'"
                + cer_plaseg + "','"
                + cer_exe_lq + "','" + cer_catemb + "','" + cer_clase + "'," + cer_coertc + ",'" + cer_tipfer + "','"
                + cer_tipest
                + "'," + cer_nitro + ",'" + cer_precur + "','" + cer_comp + "'," + cer_concen + ",'" + cer_cas + "','"
                + cer_uso
                + "','" + cer_pelma + "','" + cer_imppar + "','" + cer_dencom + "','" + cer_aspafi + "','" + cer_sigfit
                + "')";
    }

    public String toInsertDis() {
        return "INSERT INTO ARTICU(cod, nom, fam, obs, min, max, med, uni, cla, iva, ubi, rea, rep, cos, pba, " +
                "dtocom1, dtocom2, dtoven1, dtoven2, dt1, dt2, dt3, dt4, dt5, co1, co2, co3, co4, co5, pmc, upc, ufc, pro, "
                +
                "pmv, upv, ufv, exi, vai, ent, ptc, sal, ptv, ma1, ma2, ma3, ma4, ma5, d01, d02, d03, d04, d05, cuc, cuv, bar, "
                +
                "p21, p22, p23, p24, p25, iv2, ima, abr, coi, di1, di2, sec, tem, ide, tra, coe, eim, gru, pos, fot, trazab, "
                +
                "medida, num_med, med_1, med_2, med_3, bultos, paquet, impues, art_imp, sum_imp, fac_can, fac_imp, fec_cre, obsole, "
                +
                "per_com, per_ven, peso, volumen, men_sto, con_sto, marca1, marca2, ped_tex, ped_cos, env, v01, v02, v03, v04, v05, "
                +
                "v06, v07, v08, v09, v10, v11, v12, ctadevcom, ctadevven, ctadtocom, ctadtoven, meses, imaweb, fabpro, fabtip, nse, "
                +
                "historia, art_minped, art_subfam, art_marca, web_nov, web_fealno, web_des, coefici, web_sub, web_actd, web_acth, divs1, "
                +
                "divs2, web_cat1, web_cat2, web_cat3, ntv, agr, com, hor, come, tim, dos, num_pro, num_com, csi, inc_pre, inc_red, "
                +
                "web_orcat1, web_orcat2, web_orcat3, web_metat, web_metad, web_urla, web_h1, web_h2_1, web_h2_2, sincro, dis_cai, dis_cae, "
                +
                "dis_cas, dis_pii, dis_pie, dis_pis, dis_tar, dis_tva, dis_pva, dis_vpa, dis_vca, dis_pun, dis_utr, dis_env, dis_uniimp, "
                +
                "dis_uniped) VALUES ('"
                + cod + "','" + nom + "','" + fam + "','" + obs + "'," + min + "," + max + ",'" + med + "','" + uni
                + "','" + cla + "'," + iva + ",'" + ubi + "','" + rea + "','" + rep + "'," + cos + "," + pba + ",'"
                + dtocom1 + "','" + dtocom2 + "','" + dtoven1 + "','" + dtoven2 + "'," + dt1 + "," + dt2 + "," + dt3
                + "," + dt4 + "," + dt5 + "," + co1 + "," + co2 + "," + co3 + "," + co4 + "," + co5 + "," + pmc + ","
                + upc + "," + ufc + ",'" + pro + "'," + pmv + "," + upv + "," + ufv + "," + exi + "," + vai + ","
                + ent + "," + ptc + "," + sal + "," + ptv + "," + ma1 + "," + ma2 + "," + ma3 + "," + ma4 + "," + ma5
                + "," + d01 + "," + d02 + "," + d03 + "," + d04 + "," + d05 + ",'" + cuc + "','" + cuv + "','" + bar
                + "'," + p21 + "," + p22 + "," + p23 + "," + p24 + "," + p25 + "," + iv2 + ",'" + ima + "','" + abr
                + "'," + coi + "," + di1 + "," + di2 + "," + sec + ",'" + tem + "'," + ide + ",'" + tra + "','" + coe
                + "','" + eim + "'," + gru + ",'" + pos + "','" + fot + "','" + trazab + "','" + medida + "'," + num_med
                + "," + med_1 + "," + med_2 + "," + med_3 + "," + bultos + "," + paquet + ",'" + impues + "','"
                + art_imp + "','" + sum_imp + "'," + fac_can + "," + fac_imp + "," + fec_cre + ",'" + obsole + "','"
                + per_com + "','" + per_ven + "'," + peso + "," + volumen + ",'" + men_sto + "','" + con_sto + "','"
                + marca1 + "','" + marca2 + "','" + ped_tex + "','" + ped_cos + "','" + env + "','" + v01 + "','" + v02
                + "','" + v03 + "','" + v04 + "','" + v05 + "','" + v06 + "','" + v07 + "','" + v08 + "','" + v09
                + "','" + v10 + "','" + v11 + "','" + v12 + "','" + ctadevcom + "','" + ctadevven + "','" + ctadtocom
                + "','" + ctadtoven + "'," + meses + ",'" + imaweb + "','" + fabpro + "','" + fabtip + "','" + nse
                + "','" + historia + "'," + art_minped + ",'" + art_subfam + "','" + art_marca + "','" + web_nov + "',"
                + web_fealno + ",'" + web_des + "'," + coefici + ",'" + web_sub + "'," + web_actd + "," + web_acth
                + ",'" + divs1 + "','" + divs2 + "'," + web_cat1 + "," + web_cat2 + "," + web_cat3 + ",'" + ntv + "','"
                + agr + "','" + com + "','" + hor + "'," + come + "," + tim + "," + dos + "," + num_pro + "," + num_com
                + ",'" + csi + "','" + inc_pre + "'," + inc_red + "," + web_orcat1 + "," + web_orcat2 + "," + web_orcat3
                + ",'" + web_metat + "','" + web_metad + "','" + web_urla + "','" + web_h1 + "','" + web_h2_1 + "','"
                + web_h2_2 + "','" + sincro + "'," + dis_cai + "," + dis_cae + "," + dis_cas + "," + dis_pii + "," + dis_pie
                + "," + dis_pis + "," + dis_tar + ",'" + dis_tva + "','" + dis_pva + "'," + dis_vpa + "," + dis_vca + ","
                + dis_pun + ",'" + dis_utr + "','" + dis_env + "','" + dis_uniimp + "','" + dis_uniped + "')";
    }

    public String toUpdate() {
        return "UPDATE ARTICU SET nom='" + nom + "',fam='" + fam + "',obs='" + obs + "',min=" + min
                + ",max=" + max + ",med='" + med + "',uni='" + uni + "',cla='" + cla + "',iva=" + iva + ",ubi='" + ubi
                + "',rea='" + rea + "',rep='" + rep + "',cos=" + cos + ",pba=" + pba + ",dtocom1='" + dtocom1
                + "',dtocom2='" + dtocom2 + "',dtoven1='" + dtoven1 + "',dtoven2='" + dtoven2 + "',dt1=" + dt1 + ",dt2="
                + dt2 + ",dt3=" + dt3 + ",dt4=" + dt4 + ",dt5=" + dt5 + ",co1=" + co1 + ",co2=" + co2 + ",co3=" + co3
                + ",co4=" + co4 + ",co5=" + co5 + ",pmc=" + pmc + ",upc=" + upc + ",ufc=" + ufc + ",pro='" + pro
                + "',pmv=" + pmv + ",upv=" + upv + ",ufv=" + ufv + ",exi=" + exi + ",vai=" + vai + ",ent=" + ent
                + ",ptc=" + ptc + ",sal=" + sal + ",ptv=" + ptv + ",ma1=" + ma1 + ",ma2=" + ma2 + ",ma3=" + ma3
                + ",ma4=" + ma4 + ",ma5=" + ma5 + ",d01=" + d01 + ",d02=" + d02 + ",d03=" + d03 + ",d04=" + d04
                + ",d05=" + d05 + ",cuc='" + cuc + "',cuv='" + cuv + "',bar='" + bar + "',p21=" + p21 + ",p22=" + p22
                + ",p23=" + p23 + ",p24=" + p24 + ",p25=" + p25 + ",iv2=" + iv2 + ",ima='" + ima + "',abr='" + abr
                + "',coi=" + coi + ",di1=" + di1 + ",di2=" + di2 + ",sec=" + sec + ",tem='" + tem + "',ide=" + ide
                + ",tra='" + tra + "',coe='" + coe + "',eim='" + eim + "',gru=" + gru + ",pos='" + pos + "',fot='" + fot
                + "',trazab='" + trazab + "',medida='" + medida + "',num_med=" + num_med + ",med_1=" + med_1 + ",med_2="
                + med_2 + ",med_3=" + med_3 + ",bultos=" + bultos + ",paquet=" + paquet + ",impues='" + impues
                + "',art_imp='" + art_imp + "',sum_imp='" + sum_imp + "',fac_can=" + fac_can + ",fac_imp=" + fac_imp
                + ",fec_cre=" + fec_cre + ",obsole='" + obsole + "',per_com='" + per_com + "',per_ven='" + per_ven
                + "',peso=" + peso + ",volumen=" + volumen + ",men_sto='" + men_sto + "',con_sto='" + con_sto
                + "',marca1='" + marca1 + "',marca2='" + marca2 + "',ped_tex='" + ped_tex + "',ped_cos='" + ped_cos
                + "',env='" + env + "',v01='" + v01 + "',v02='" + v02 + "',v03='" + v03 + "',v04='" + v04 + "',v05='"
                + v05 + "',v06='" + v06 + "',v07='" + v07 + "',v08='" + v08 + "',v09='" + v09 + "',v10='" + v10
                + "',v11='" + v11 + "',v12='" + v12 + "',ctadevcom='" + ctadevcom + "',ctadevven='" + ctadevven
                + "',ctadtocom='" + ctadtocom + "',ctadtoven='" + ctadtoven + "',meses=" + meses + ",imaweb='" + imaweb
                + "',fabpro='" + fabpro + "',fabtip='" + fabtip + "',nse='" + nse + "',historia='" + historia
                + "',art_minped=" + art_minped + ",art_subfam='" + art_subfam + "',art_marca='" + art_marca
                + "',web_nov='" + web_nov + "',web_fealno=" + web_fealno + ",web_des='" + web_des + "',coefici="
                + coefici + ",web_sub='" + web_sub + "',web_actd=" + web_actd + ",web_acth=" + web_acth + ",divs1='"
                + divs1 + "',divs2='" + divs2 + "',web_cat1=" + web_cat1 + ",web_cat2=" + web_cat2 + ",web_cat3="
                + web_cat3 + ",ntv='" + ntv + "',agr='" + agr + "',com='" + com + "',hor='" + hor + "',come=" + come
                + ",tim=" + tim + ",dos=" + dos + ",num_pro=" + num_pro + ",num_com=" + num_com + ",csi='" + csi
                + "',inc_pre='" + inc_pre + "',inc_red=" + inc_red + ",web_orcat1=" + web_orcat1 + ",web_orcat2="
                + web_orcat2 + ",web_orcat3=" + web_orcat3 + ",web_metat='" + web_metat + "',web_metad='" + web_metad
                + "',web_urla='" + web_urla + "',web_h1='" + web_h1 + "',web_h2_1='" + web_h2_1 + "',web_h2_2='"
                + web_h2_2 + "',sincro='" + sincro + "' WHERE  cod='" + cod + "';";
    }

    public String toUpdateFit() {
        return "UPDATE ARTICU SET nom='" + nom + "',fam='" + fam + "',obs='" + obs + "',min=" + min
                + ",max=" + max + ",med='" + med + "',uni='" + uni + "',cla='" + cla + "',iva=" + iva + ",ubi='" + ubi
                + "',rea='" + rea + "',rep='" + rep + "',cos=" + cos + ",pba=" + pba + ",dtocom1='" + dtocom1
                + "',dtocom2='" + dtocom2 + "',dtoven1='" + dtoven1 + "',dtoven2='" + dtoven2 + "',dt1=" + dt1 + ",dt2="
                + dt2 + ",dt3=" + dt3 + ",dt4=" + dt4 + ",dt5=" + dt5 + ",co1=" + co1 + ",co2=" + co2 + ",co3=" + co3
                + ",co4=" + co4 + ",co5=" + co5 + ",pmc=" + pmc + ",upc=" + upc + ",ufc=" + ufc + ",pro='" + pro
                + "',pmv=" + pmv + ",upv=" + upv + ",ufv=" + ufv + ",exi=" + exi + ",vai=" + vai + ",ent=" + ent
                + ",ptc=" + ptc + ",sal=" + sal + ",ptv=" + ptv + ",ma1=" + ma1 + ",ma2=" + ma2 + ",ma3=" + ma3
                + ",ma4=" + ma4 + ",ma5=" + ma5 + ",d01=" + d01 + ",d02=" + d02 + ",d03=" + d03 + ",d04=" + d04
                + ",d05=" + d05 + ",cuc='" + cuc + "',cuv='" + cuv + "',bar='" + bar + "',p21=" + p21 + ",p22=" + p22
                + ",p23=" + p23 + ",p24=" + p24 + ",p25=" + p25 + ",iv2=" + iv2 + ",ima='" + ima + "',abr='" + abr
                + "',coi=" + coi + ",di1=" + di1 + ",di2=" + di2 + ",sec=" + sec + ",tem='" + tem + "',ide=" + ide
                + ",tra='" + tra + "',coe='" + coe + "',eim='" + eim + "',gru=" + gru + ",pos='" + pos + "',fot='" + fot
                + "',trazab='" + trazab + "',medida='" + medida + "',num_med=" + num_med + ",med_1=" + med_1 + ",med_2="
                + med_2 + ",med_3=" + med_3 + ",bultos=" + bultos + ",paquet=" + paquet + ",impues='" + impues
                + "',art_imp='" + art_imp + "',sum_imp='" + sum_imp + "',fac_can=" + fac_can + ",fac_imp=" + fac_imp
                + ",fec_cre=" + fec_cre + ",obsole='" + obsole + "',per_com='" + per_com + "',per_ven='" + per_ven
                + "',peso=" + peso + ",volumen=" + volumen + ",men_sto='" + men_sto + "',con_sto='" + con_sto
                + "',marca1='" + marca1 + "',marca2='" + marca2 + "',ped_tex='" + ped_tex + "',ped_cos='" + ped_cos
                + "',env='" + env + "',v01='" + v01 + "',v02='" + v02 + "',v03='" + v03 + "',v04='" + v04 + "',v05='"
                + v05 + "',v06='" + v06 + "',v07='" + v07 + "',v08='" + v08 + "',v09='" + v09 + "',v10='" + v10
                + "',v11='" + v11 + "',v12='" + v12 + "',ctadevcom='" + ctadevcom + "',ctadevven='" + ctadevven
                + "',ctadtocom='" + ctadtocom + "',ctadtoven='" + ctadtoven + "',meses=" + meses + ",imaweb='" + imaweb
                + "',fabpro='" + fabpro + "',fabtip='" + fabtip + "',nse='" + nse + "',historia='" + historia
                + "',art_minped=" + art_minped + ",art_subfam='" + art_subfam + "',art_marca='" + art_marca
                + "',web_nov='" + web_nov + "',web_fealno=" + web_fealno + ",web_des='" + web_des + "',coefici="
                + coefici + ",web_sub='" + web_sub + "',web_actd=" + web_actd + ",web_acth=" + web_acth + ",divs1='"
                + divs1 + "',divs2='" + divs2 + "',web_cat1=" + web_cat1 + ",web_cat2=" + web_cat2 + ",web_cat3="
                + web_cat3 + ",ntv='" + ntv + "',agr='" + agr + "',com='" + com + "',hor='" + hor + "',come=" + come
                + ",tim=" + tim + ",dos=" + dos + ",num_pro=" + num_pro + ",num_com=" + num_com + ",csi='" + csi
                + "',inc_pre='" + inc_pre + "',inc_red=" + inc_red + ",web_orcat1=" + web_orcat1 + ",web_orcat2="
                + web_orcat2 + ",web_orcat3=" + web_orcat3 + ",web_metat='" + web_metat + "',web_metad='" + web_metad
                + "',web_urla='" + web_urla + "',web_h1='" + web_h1 + "',web_h2_1='" + web_h2_1 + "',web_h2_2='"
                + web_h2_2 + "',sincro='" + sincro + "',cer_ret='" + cer_ret + "',cer_prebas=" + cer_prebas
                + ",cer_toxico='"
                + cer_toxico + "',cer_numreg='" + cer_numreg + "',cer_feccad=" + cer_feccad + ",cer_cattox='"
                + cer_cattox
                + "',cer_numonu='" + cer_numonu + "',cer_compon='" + cer_compon + "',cer_fictec='" + cer_fictec
                + "',cer_fer='"
                + cer_fer + "',cer_tipabo='" + cer_tipabo + "',cer_riqnpk='" + cer_riqnpk + "',cer_ffiseg=" + cer_ffiseg
                + ",cer_dosmax=" + cer_dosmax + ",cer_plaseg='" + cer_plaseg + "',cer_exe_lq='" + cer_exe_lq
                + "',cer_catemb='"
                + cer_catemb + "',cer_clase='" + cer_clase + "',cer_coertc=" + cer_coertc + ",cer_tipfer='" + cer_tipfer
                + "',cer_tipest='" + cer_tipest + "',cer_nitro=" + cer_nitro + ",cer_precur='" + cer_precur
                + "',cer_comp='"
                + cer_comp + "',cer_concen=" + cer_concen + ",cer_cas='" + cer_cas + "',cer_uso='" + cer_uso
                + "',cer_pelma='"
                + cer_pelma + "',cer_imppar='" + cer_imppar + "',cer_dencom='" + cer_dencom + "',cer_aspafi='"
                + cer_aspafi
                + "',cer_sigfit='" + cer_sigfit + "' WHERE  cod='" + cod + "'";
    }

    public String toUpdateDis() {
        return "UPDATE ARTICU SET nom='" + nom + "',fam='" + fam + "',obs='" + obs + "',min=" + min
                + ",max=" + max + ",med='" + med + "',uni='" + uni + "',cla='" + cla + "',iva=" + iva + ",ubi='" + ubi
                + "',rea='" + rea + "',rep='" + rep + "',cos=" + cos + ",pba=" + pba + ",dtocom1='" + dtocom1
                + "',dtocom2='" + dtocom2 + "',dtoven1='" + dtoven1 + "',dtoven2='" + dtoven2 + "',dt1=" + dt1 + ",dt2="
                + dt2 + ",dt3=" + dt3 + ",dt4=" + dt4 + ",dt5=" + dt5 + ",co1=" + co1 + ",co2=" + co2 + ",co3=" + co3
                + ",co4=" + co4 + ",co5=" + co5 + ",pmc=" + pmc + ",upc=" + upc + ",ufc=" + ufc + ",pro='" + pro
                + "',pmv=" + pmv + ",upv=" + upv + ",ufv=" + ufv + ",exi=" + exi + ",vai=" + vai + ",ent=" + ent
                + ",ptc=" + ptc + ",sal=" + sal + ",ptv=" + ptv + ",ma1=" + ma1 + ",ma2=" + ma2 + ",ma3=" + ma3
                + ",ma4=" + ma4 + ",ma5=" + ma5 + ",d01=" + d01 + ",d02=" + d02 + ",d03=" + d03 + ",d04=" + d04
                + ",d05=" + d05 + ",cuc='" + cuc + "',cuv='" + cuv + "',bar='" + bar + "',p21=" + p21 + ",p22=" + p22
                + ",p23=" + p23 + ",p24=" + p24 + ",p25=" + p25 + ",iv2=" + iv2 + ",ima='" + ima + "',abr='" + abr
                + "',coi=" + coi + ",di1=" + di1 + ",di2=" + di2 + ",sec=" + sec + ",tem='" + tem + "',ide=" + ide
                + ",tra='" + tra + "',coe='" + coe + "',eim='" + eim + "',gru=" + gru + ",pos='" + pos + "',fot='" + fot
                + "',trazab='" + trazab + "',medida='" + medida + "',num_med=" + num_med + ",med_1=" + med_1 + ",med_2="
                + med_2 + ",med_3=" + med_3 + ",bultos=" + bultos + ",paquet=" + paquet + ",impues='" + impues
                + "',art_imp='" + art_imp + "',sum_imp='" + sum_imp + "',fac_can=" + fac_can + ",fac_imp=" + fac_imp
                + ",fec_cre=" + fec_cre + ",obsole='" + obsole + "',per_com='" + per_com + "',per_ven='" + per_ven
                + "',peso=" + peso + ",volumen=" + volumen + ",men_sto='" + men_sto + "',con_sto='" + con_sto
                + "',marca1='" + marca1 + "',marca2='" + marca2 + "',ped_tex='" + ped_tex + "',ped_cos='" + ped_cos
                + "',env='" + env + "',v01='" + v01 + "',v02='" + v02 + "',v03='" + v03 + "',v04='" + v04 + "',v05='"
                + v05 + "',v06='" + v06 + "',v07='" + v07 + "',v08='" + v08 + "',v09='" + v09 + "',v10='" + v10
                + "',v11='" + v11 + "',v12='" + v12 + "',ctadevcom='" + ctadevcom + "',ctadevven='" + ctadevven
                + "',ctadtocom='" + ctadtocom + "',ctadtoven='" + ctadtoven + "',meses=" + meses + ",imaweb='" + imaweb
                + "',fabpro='" + fabpro + "',fabtip='" + fabtip + "',nse='" + nse + "',historia='" + historia
                + "',art_minped=" + art_minped + ",art_subfam='" + art_subfam + "',art_marca='" + art_marca
                + "',web_nov='" + web_nov + "',web_fealno=" + web_fealno + ",web_des='" + web_des + "',coefici="
                + coefici + ",web_sub='" + web_sub + "',web_actd=" + web_actd + ",web_acth=" + web_acth + ",divs1='"
                + divs1 + "',divs2='" + divs2 + "',web_cat1=" + web_cat1 + ",web_cat2=" + web_cat2 + ",web_cat3="
                + web_cat3 + ",ntv='" + ntv + "',agr='" + agr + "',com='" + com + "',hor='" + hor + "',come=" + come
                + ",tim=" + tim + ",dos=" + dos + ",num_pro=" + num_pro + ",num_com=" + num_com + ",csi='" + csi
                + "',inc_pre='" + inc_pre + "',inc_red=" + inc_red + ",web_orcat1=" + web_orcat1 + ",web_orcat2="
                + web_orcat2 + ",web_orcat3=" + web_orcat3 + ",web_metat='" + web_metat + "',web_metad='" + web_metad
                + "',web_urla='" + web_urla + "',web_h1='" + web_h1 + "',web_h2_1='" + web_h2_1 + "',web_h2_2='"
                + web_h2_2 + "',sincro='" + sincro + "',dis_cai='" + dis_cai + "',dis_cae='" + dis_cae + "',dis_cas='"
                + dis_cas + "',dis_pii='" + dis_pii + "',dis_pie='" + dis_pie + "',dis_pis='" + dis_pis + "',dis_tar='"
                + dis_tar + "',dis_tva='" + dis_tva + "',dis_pva='" + dis_pva + "',dis_vpa=" + dis_vpa + ",dis_vca="
                + dis_vca + ",dis_pun='" + dis_pun + "',dis_utr='" + dis_utr + "',dis_env='" + dis_env + "',dis_uniimp='"
                + dis_uniimp + "',dis_uniped='" + dis_uniped + "' WHERE  cod='" + cod + "'";
    }
}
