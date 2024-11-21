package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class Cliente {
    private String cod = "";
    private String nom = "";
    private String sno = "";
    private String dir = "";
    private String pob = "";
    private int npro = 0;
    private String pro = "";
    private String nif = "";
    private String te1 = "";
    private String te2 = "";
    private String fax = "";
    private String mov = "";
    private String per = "";
    private String car = "";
    private String ter = "";
    private String req = "N";
    private String red = "N";
    private float dto = 0.00f;
    private int com = 1;
    private float fin = 0.00f;
    private float fac = 0.00f;
    private int tar = 1;
    private int forpag = 1;
    private int di1 = 0;
    private int di2 = 0;
    private int di3 = 0;
    private int mnp = 0;
    private String m30 = "";
    private int vto = 0;
    private float inc = 0;
    private float rie = 0.000f;
    private String rut = "000001";
    private String age = "1";
    private int nco = 1;
    private String alv = "S";
    private String fa1 = "";
    private String fa2 = "";
    private String tra = "N";
    private String mar = "N";
    private float dt2 = 0.0f;
    private String tia = "N";
    private int fo2 = 1;
    private int d1b = 0;
    private int d2b = 0;
    private int d3b = 0;
    private int mnb = 0;
    private float imp = 0.00F;
    private int tre = 0;
    private float ret = 0.000F;
    private String fgl = "";
    private float ifg = 0.00F;
    private String web = "";
    private String doc = "I";
    private String fpd = "N";
    private float pais = 0;
    private String ext = "";
    private String ob1 = "";
    private String ob2 = "";
    private int rediva1 = 1;
    private int rediva2 = 2;
    private int rediva3 = 3;
    private int rediva4 = 4;
    private int rediva5 = 5;
    private int avi0ped = 1;
    private String avi1ped = "";
    private String avi2ped = "";
    private int avi0alb = 1;
    private String avi1alb = "";
    private String avi2alb = "";
    private int avi0fac = 1;
    private String avi1fac = "";
    private String avi2fac = "";
    private int avi0rec = 0;
    private String avi1rec = "";
    private String avi2rec = "";
    private int avi0pre = 0;
    private String avi1pre = "";
    private String avi2pre = "";
    private String ivainc = "N";
    private String fot = "";
    private String env = "N";
    private String xxx = "";
    private String fcr_crm = "NULL";
    private float tip_crm = 1;
    private String ftr_crm = "NULL";
    private float tco_crm = 0;
    private String ref_crm = "";
    private String vis_crm = "S";
    private float pvi_crm = 0;
    private String lla_crm = "S";
    private float pll_crm = 0;
    private String ru1_crm = "000001";
    private String ru2_crm = "";
    private String ru3_crm = "";
    private float sec_crm = 0;
    private String dias_crm = "SSSSS";
    private String tpl_crm = "N";
    private String fna_crm = "NULL";
    private float imprap = 0.000F;
    private float dtorap = 0.00F;
    private String tar_art = "";
    private String tar_fam = "";
    private String efactura = "N";
    private int perrap = 0;
    private String facedir = "";
    private String facepob = "";
    private int facenpro = 0;
    private String facepro = "";
    private float facepais = 0;
    private String facenom = "";
    private String faceape1 = "";
    private String faceape2 = "";
    private String facefoj = "J";
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
    private String historia = "";
    private float lopd_ori = 0;
    private String lopd_otr_o = "";
    private String lopd_ces = "";
    private String lopd_otr_c = "";
    private String cli_facalb = "";
    private String cln_tarsub = "";
    private String cln_tarmar = "";
    private int cln_idioma = 1;
    private int moneda = 1;
    private int avi0dep = 1;
    private String avi_dep = "";
    private String avi_ped = "";
    private String avi_pre = "";
    private String avi_alb = "";
    private String avi_fac = "";
    private String avi_rec = "";
    private String web_acc = "N";
    private String web_psw = "";
    private String obs_doc = "";
    private String actividad = "";
    private String emailweb = "";
    private String web_exepor = "N";
    private int tip_rem = 2;
    private String fec_man = "NULL";
    private String cri_caja = "S";
    private String facemed = "";
    private String faceiban = "";
    private String facever = "";
    private String facepol = "";
    private String por_efac = "001";
    private String web_codact = "";
    private String sincro = "X";

    public String getCod() {
        return this.cod;
    }

    public String getNom() {
        return this.nom;
    }

    public String getSno() {
        return this.sno;
    }

    public String getDir() {
        return this.dir;
    }

    public String getPob() {
        return this.pob;
    }

    public int getNpro() {
        return this.npro;
    }

    public String getPro() {
        return this.pro;
    }

    public String getNif() {
        return this.nif;
    }

    public String getTe1() {
        return this.te1;
    }

    public String getTe2() {
        return this.te2;
    }

    public String getFax() {
        return this.fax;
    }

    public String getMov() {
        return this.mov;
    }

    public String getPer() {
        return this.per;
    }

    public String getCar() {
        return this.car;
    }

    public String getTer() {
        return this.ter;
    }

    public String getReq() {
        return this.req;
    }

    public String getRed() {
        return this.red;
    }

    public float getDto() {
        return this.dto;
    }

    public int getCom() {
        return this.com;
    }

    public float getFin() {
        return this.fin;
    }

    public float getFac() {
        return this.fac;
    }

    public int getTar() {
        return this.tar;
    }

    public int getforpag() {
        return this.forpag;
    }

    public int getDi1() {
        return this.di1;
    }

    public int getDi2() {
        return this.di2;
    }

    public int getDi3() {
        return this.di3;
    }

    public int getMnp() {
        return this.mnp;
    }

    public String getM30() {
        return this.m30;
    }

    public int getVto() {
        return this.vto;
    }

    public float getInc() {
        return this.inc;
    }

    public float getRie() {
        return this.rie;
    }

    public String getRut() {
        return this.rut;
    }

    public String getAge() {
        return this.age;
    }

    public int getNco() {
        return this.nco;
    }

    public String getAlv() {
        return this.alv;
    }

    public String getFa1() {
        return this.fa1;
    }

    public String getFa2() {
        return this.fa2;
    }

    public String getTra() {
        return this.tra;
    }

    public String getMar() {
        return this.mar;
    }

    public float getDt2() {
        return this.dt2;
    }

    public String getTia() {
        return this.tia;
    }

    public int getFo2() {
        return this.fo2;
    }

    public int getD1B() {
        return this.d1b;
    }

    public int getD2B() {
        return this.d2b;
    }

    public int getD3B() {
        return this.d3b;
    }

    public int getMnb() {
        return this.mnb;
    }

    public float getImp() {
        return this.imp;
    }

    public int getTre() {
        return this.tre;
    }

    public float getRet() {
        return this.ret;
    }

    public String getFgl() {
        return this.fgl;
    }

    public float getIfg() {
        return this.ifg;
    }

    public String getWeb() {
        return this.web;
    }

    public String getDoc() {
        return this.doc;
    }

    public String getFpd() {
        return this.fpd;
    }

    public float getPais() {
        return this.pais;
    }

    public String getExt() {
        return this.ext;
    }

    public String getOb1() {
        return this.ob1;
    }

    public String getOb2() {
        return this.ob2;
    }

    public int getRediva1() {
        return this.rediva1;
    }

    public int getRediva2() {
        return this.rediva2;
    }

    public int getRediva3() {
        return this.rediva3;
    }

    public int getRediva4() {
        return this.rediva4;
    }

    public int getRediva5() {
        return this.rediva5;
    }

    public int getAvi0Ped() {
        return this.avi0ped;
    }

    public String getAvi1Ped() {
        return this.avi1ped;
    }

    public String getAvi2Ped() {
        return this.avi2ped;
    }

    public int getAvi0Alb() {
        return this.avi0alb;
    }

    public String getAvi1Alb() {
        return this.avi1alb;
    }

    public String getAvi2Alb() {
        return this.avi2alb;
    }

    public int getAvi0Fac() {
        return this.avi0fac;
    }

    public String getAvi1Fac() {
        return this.avi1fac;
    }

    public String getAvi2Fac() {
        return this.avi2fac;
    }

    public int getAvi0Rec() {
        return this.avi0rec;
    }

    public String getAvi1Rec() {
        return this.avi1rec;
    }

    public String getAvi2Rec() {
        return this.avi2rec;
    }

    public int getAvi0Pre() {
        return this.avi0pre;
    }

    public String getAvi1Pre() {
        return this.avi1pre;
    }

    public String getAvi2Pre() {
        return this.avi2pre;
    }

    public String getIvainc() {
        return this.ivainc;
    }

    public String getFot() {
        return this.fot;
    }

    public String getEnv() {
        return this.env;
    }

    public String getXxx() {
        return this.xxx;
    }

    public String getFcr_Crm() {
        return this.fcr_crm;
    }

    public float getTip_Crm() {
        return this.tip_crm;
    }

    public String getFtr_Crm() {
        return this.ftr_crm;
    }

    public float getTco_Crm() {
        return this.tco_crm;
    }

    public String getRef_Crm() {
        return this.ref_crm;
    }

    public String getVis_Crm() {
        return this.vis_crm;
    }

    public float getPvi_Crm() {
        return this.pvi_crm;
    }

    public String getLla_Crm() {
        return this.lla_crm;
    }

    public float getPll_Crm() {
        return this.pll_crm;
    }

    public String getRu1_Crm() {
        return this.ru1_crm;
    }

    public String getRu2_Crm() {
        return this.ru2_crm;
    }

    public String getRu3_Crm() {
        return this.ru3_crm;
    }

    public float getSec_Crm() {
        return this.sec_crm;
    }

    public String getDias_Crm() {
        return this.dias_crm;
    }

    public String getTpl_Crm() {
        return this.tpl_crm;
    }

    public String getFna_Crm() {
        return this.fna_crm;
    }

    public float getImprap() {
        return this.imprap;
    }

    public float getDtorap() {
        return this.dtorap;
    }

    public String getTar_Art() {
        return this.tar_art;
    }

    public String getTar_Fam() {
        return this.tar_fam;
    }

    public String getEfactura() {
        return this.efactura;
    }

    public int getPerrap() {
        return this.perrap;
    }

    public String getFacedir() {
        return this.facedir;
    }

    public String getFacepob() {
        return this.facepob;
    }

    public int getFacenpro() {
        return this.facenpro;
    }

    public String getFacepro() {
        return this.facepro;
    }

    public float getFacepais() {
        return this.facepais;
    }

    public String getFacenom() {
        return this.facenom;
    }

    public String getFaceape1() {
        return this.faceape1;
    }

    public String getFaceape2() {
        return this.faceape2;
    }

    public String getFacefoj() {
        return this.facefoj;
    }

    public String getV01() {
        return this.v01;
    }

    public String getV02() {
        return this.v02;
    }

    public String getV03() {
        return this.v03;
    }

    public String getV04() {
        return this.v04;
    }

    public String getV05() {
        return this.v05;
    }

    public String getV06() {
        return this.v06;
    }

    public String getV07() {
        return this.v07;
    }

    public String getV08() {
        return this.v08;
    }

    public String getV09() {
        return this.v09;
    }

    public String getV10() {
        return this.v10;
    }

    public String getV11() {
        return this.v11;
    }

    public String getV12() {
        return this.v12;
    }

    public String getHistoria() {
        return this.historia;
    }

    public float getLopd_Ori() {
        return this.lopd_ori;
    }

    public String getLopd_Otr_O() {
        return this.lopd_otr_o;
    }

    public String getLopd_Ces() {
        return this.lopd_ces;
    }

    public String getLopd_Otr_C() {
        return this.lopd_otr_c;
    }

    public String getCli_Facalb() {
        return this.cli_facalb;
    }

    public String getCln_Tarsub() {
        return this.cln_tarsub;
    }

    public String getCln_Tarmar() {
        return this.cln_tarmar;
    }

    public int getCln_Idioma() {
        return this.cln_idioma;
    }

    public int getMoneda() {
        return this.moneda;
    }

    public int getAvi0Dep() {
        return this.avi0dep;
    }

    public String getAvi_Dep() {
        return this.avi_dep;
    }

    public String getAvi_Ped() {
        return this.avi_ped;
    }

    public String getAvi_Pre() {
        return this.avi_pre;
    }

    public String getAvi_Alb() {
        return this.avi_alb;
    }

    public String getAvi_Fac() {
        return this.avi_fac;
    }

    public String getAvi_Rec() {
        return this.avi_rec;
    }

    public String getWeb_Acc() {
        return this.web_acc;
    }

    public String getWeb_Psw() {
        return this.web_psw;
    }

    public String getObs_Doc() {
        return this.obs_doc;
    }

    public String getActividad() {
        return this.actividad;
    }

    public String getEmailweb() {
        return this.emailweb;
    }

    public String getWeb_Exepor() {
        return this.web_exepor;
    }

    public int getTip_Rem() {
        return this.tip_rem;
    }

    public String getFec_Man() {
        return this.fec_man;
    }

    public String getCri_Caja() {
        return this.cri_caja;
    }

    public String getFacemed() {
        return this.facemed;
    }

    public String getFaceiban() {
        return this.faceiban;
    }

    public String getFacever() {
        return this.facever;
    }

    public String getFacepol() {
        return this.facepol;
    }

    public String getPor_Efac() {
        return this.por_efac;
    }

    public String getWeb_Codact() {
        return this.web_codact;
    }

    public String getSincro() {
        return this.sincro;
    }

    public void setCod(String cod) {
        if (cod.length() > 6) {
            this.cod = cod.trim().substring(0, 6).replace("'", "");
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

    public void setSno(String sno) {
        if (sno.length() > 50) {
            this.sno = sno.trim().substring(0, 50).replace("'", "");
        } else {
            this.sno = sno.replace("'", "");
        }
    }

    public void setDir(String dir) {
        if (dir.length() > 50) {
            this.dir = dir.trim().substring(0, 50).replace("'", "");
        } else {
            this.dir = dir.replace("'", "");
        }
    }

    public void setPob(String pob) {
        if (pob.length() > 50) {
            this.pob = pob.trim().substring(0, 50).replace("'", "");
        } else {
            this.pob = pob.replace("'", "");
        }
    }

    public void setNpro(int npro) {
        this.npro = npro;
    }

    public void setPro(String pro) {
        if (pro.length() > 40) {
            this.pro = pro.trim().substring(0, 40).replace("'", "");
        } else {
            this.pro = pro.replace("'", "");
        }
    }

    public void setNif(String nif) {
        if (nif.length() > 15) {
            this.nif = nif.trim().substring(0, 15).replace("'", "");
        } else {
            this.nif = nif.replace("'", "");
        }
    }

    public void setTe1(String te1) {
        if (te1.length() > 18) {
            this.te1 = te1.trim().substring(0, 18).replace("'", "");
        } else {
            this.te1 = te1.replace("'", "");
        }
    }

    public void setTe2(String te2) {
        if (te2.length() > 18) {
            this.te2 = te2.trim().substring(0, 18).replace("'", "");
        } else {
            this.te2 = te2.replace("'", "");
        }
    }

    public void setFax(String fax) {
        if (fax.length() > 18) {
            this.fax = fax.trim().substring(0, 18).replace("'", "");
        } else {
            this.fax = fax.replace("'", "");
        }
    }

    public void setMov(String mov) {
        if (mov.length() > 18) {
            this.mov = mov.trim().substring(0, 18).replace("'", "");
        } else {
            this.mov = mov.replace("'", "");
        }
    }

    public void setPer(String per) {
        if (per.length() > 50) {
            this.per = per.trim().substring(0, 50).replace("'", "");
        } else {
            this.per = per.replace("'", "");
        }
    }

    public void setCar(String car) {
        if (car.length() > 15) {
            this.car = car.trim().substring(0, 15).replace("'", "");
        } else {
            this.car = car.replace("'", "");
        }
    }

    public void setTer(String ter) {
        if (ter.length() > 18) {
            this.ter = ter.trim().substring(0, 18).replace("'", "");
        } else {
            this.ter = ter.replace("'", "");
        }
    }

    public void setReq(String req) {
        if (req.length() > 1) {
            this.req = req.trim().substring(0, 1).replace("'", "");
        } else {
            this.req = req.replace("'", "");
        }
    }

    public void setRed(String red) {
        if (red.length() > 1) {
            this.red = red.trim().substring(0, 1).replace("'", "");
        } else {
            this.red = red.replace("'", "");
        }
    }

    public void setDto(float dto) {
        this.dto = dto;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public void setFin(float fin) {
        this.fin = fin;
    }

    public void setFac(float fac) {
        this.fac = fac;
    }

    public void setTar(int tar) {
        this.tar = tar;
    }

    public void setforpag(int forpag) {
        this.forpag = forpag;
    }

    public void setDi1(int di1) {
        this.di1 = di1;
    }

    public void setDi2(int di2) {
        this.di2 = di2;
    }

    public void setDi3(int di3) {
        this.di3 = di3;
    }

    public void setMnp(int mnp) {
        this.mnp = mnp;
    }

    public void setM30(String m30) {
        if (m30.length() > 1) {
            this.m30 = m30.trim().substring(0, 1).replace("'", "");
        } else {
            this.m30 = m30.replace("'", "");
        }
    }

    public void setVto(int vto) {
        this.vto = vto;
    }

    public void setInc(float inc) {
        this.inc = inc;
    }

    public void setRie(float rie) {
        this.rie = rie;
    }

    public void setRut(String rut) {
        if (rut.length() > 6) {
            this.rut = rut.trim().substring(0, 6).replace("'", "");
        } else {
            this.rut = rut.replace("'", "");
        }
    }

    public void setAge(String age) {
        if (age.length() > 6) {
            this.age = age.trim().substring(0, 6).replace("'", "");
        } else {
            this.age = age.replace("'", "");
        }
    }

    public void setNco(int nco) {
        this.nco = nco;
    }

    public void setAlv(String alv) {
        if (alv.length() > 1) {
            this.alv = alv.trim().substring(0, 1).replace("'", "");
        } else {
            this.alv = alv.replace("'", "");
        }
    }

    public void setFa1(String fa1) {
        if (fa1.length() > 8) {
            this.fa1 = fa1.trim().substring(0, 8).replace("'", "");
        } else {
            this.fa1 = fa1.replace("'", "");
        }
    }

    public void setFa2(String fa2) {
        if (fa2.length() > 8) {
            this.fa2 = fa2.trim().substring(0, 8).replace("'", "");
        } else {
            this.fa2 = fa2.replace("'", "");
        }
    }

    public void setTra(String tra) {
        if (tra.length() > 1) {
            this.tra = tra.trim().substring(0, 1).replace("'", "");
        } else {
            this.tra = tra.replace("'", "");
        }
    }

    public void setMar(String mar) {
        if (mar.length() > 1) {
            this.mar = mar.trim().substring(0, 1).replace("'", "");
        } else {
            this.mar = mar.replace("'", "");
        }
    }

    public void setDt2(float dt2) {
        this.dt2 = dt2;
    }

    public void setTia(String tia) {
        if (tia.length() > 1) {
            this.tia = tia.trim().substring(0, 1).replace("'", "");
        } else {
            this.tia = tia.replace("'", "");
        }
    }

    public void setFo2(int fo2) {
        this.fo2 = fo2;
    }

    public void setD1B(int d1b) {
        this.d1b = d1b;
    }

    public void setD2B(int d2b) {
        this.d2b = d2b;
    }

    public void setD3B(int d3b) {
        this.d3b = d3b;
    }

    public void setMnb(int mnb) {
        this.mnb = mnb;
    }

    public void setImp(float imp) {
        this.imp = imp;
    }

    public void setTre(int tre) {
        this.tre = tre;
    }

    public void setRet(float ret) {
        this.ret = ret;
    }

    public void setFgl(String fgl) {
        if (fgl.length() > 1) {
            this.fgl = fgl.trim().substring(0, 1).replace("'", "");
        } else {
            this.fgl = fgl.replace("'", "");
        }
    }

    public void setIfg(float ifg) {
        this.ifg = ifg;
    }

    public void setWeb(String web) {
        if (web.length() > 80) {
            this.web = web.trim().substring(0, 80).replace("'", "");
        } else {
            this.web = web.replace("'", "");
        }
    }

    public void setDoc(String doc) {
        if (doc.length() > 1) {
            this.doc = doc.trim().substring(0, 1).replace("'", "");
        } else {
            this.doc = doc.replace("'", "");
        }
    }

    public void setFpd(String fpd) {
        if (fpd.length() > 1) {
            this.fpd = fpd.trim().substring(0, 1).replace("'", "");
        } else {
            this.fpd = fpd.replace("'", "");
        }
    }

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setExt(String ext) {
        if (ext.length() > 6) {
            this.ext = ext.trim().substring(0, 6).replace("'", "");
        } else {
            this.ext = ext.replace("'", "");
        }
    }

    public void setOb1(String ob1) {
        if (ob1.length() > 70) {
            this.ob1 = ob1.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob1 = ob1.replace("'", "");
        }
    }

    public void setOb2(String ob2) {
        if (ob2.length() > 70) {
            this.ob2 = ob2.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob2 = ob2.replace("'", "");
        }
    }

    public void setRediva1(int rediva1) {
        this.rediva1 = rediva1;
    }

    public void setRediva2(int rediva2) {
        this.rediva2 = rediva2;
    }

    public void setRediva3(int rediva3) {
        this.rediva3 = rediva3;
    }

    public void setRediva4(int rediva4) {
        this.rediva4 = rediva4;
    }

    public void setRediva5(int rediva5) {
        this.rediva5 = rediva5;
    }

    public void setAvi0Ped(int avi0ped) {
        this.avi0ped = avi0ped;
    }

    public void setAvi1Ped(String avi1ped) {
        if (avi1ped.length() > 80) {
            this.avi1ped = avi1ped.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi1ped = avi1ped.replace("'", "");
        }
    }

    public void setAvi2Ped(String avi2ped) {
        if (avi2ped.length() > 80) {
            this.avi2ped = avi2ped.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi2ped = avi2ped.replace("'", "");
        }
    }

    public void setAvi0Alb(int avi0alb) {
        this.avi0alb = avi0alb;
    }

    public void setAvi1Alb(String avi1alb) {
        if (avi1alb.length() > 80) {
            this.avi1alb = avi1alb.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi1alb = avi1alb.replace("'", "");
        }
    }

    public void setAvi2Alb(String avi2alb) {
        if (avi2alb.length() > 80) {
            this.avi2alb = avi2alb.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi2alb = avi2alb.replace("'", "");
        }
    }

    public void setAvi0Fac(int avi0fac) {
        this.avi0fac = avi0fac;
    }

    public void setAvi1Fac(String avi1fac) {
        if (avi1fac.length() > 80) {
            this.avi1fac = avi1fac.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi1fac = avi1fac.replace("'", "");
        }
    }

    public void setAvi2Fac(String avi2fac) {
        if (avi2fac.length() > 80) {
            this.avi2fac = avi2fac.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi2fac = avi2fac.replace("'", "");
        }
    }

    public void setAvi0Rec(int avi0rec) {
        this.avi0rec = avi0rec;
    }

    public void setAvi1Rec(String avi1rec) {
        if (avi1rec.length() > 80) {
            this.avi1rec = avi1rec.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi1rec = avi1rec.replace("'", "");
        }
    }

    public void setAvi2Rec(String avi2rec) {
        if (avi2rec.length() > 80) {
            this.avi2rec = avi2rec.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi2rec = avi2rec.replace("'", "");
        }
    }

    public void setAvi0Pre(int avi0pre) {
        this.avi0pre = avi0pre;
    }

    public void setAvi1Pre(String avi1pre) {
        if (avi1pre.length() > 80) {
            this.avi1pre = avi1pre.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi1pre = avi1pre.replace("'", "");
        }
    }

    public void setAvi2Pre(String avi2pre) {
        if (avi2pre.length() > 80) {
            this.avi2pre = avi2pre.trim().substring(0, 80).replace("'", "");
        } else {
            this.avi2pre = avi2pre.replace("'", "");
        }
    }

    public void setIvainc(String ivainc) {
        if (ivainc.length() > 1) {
            this.ivainc = ivainc.trim().substring(0, 1).replace("'", "");
        } else {
            this.ivainc = ivainc.replace("'", "");
        }
    }

    public void setFot(String fot) {
        if (fot.length() > 20) {
            this.fot = fot.trim().substring(0, 20).replace("'", "");
        } else {
            this.fot = fot.replace("'", "");
        }
    }

    public void setEnv(String env) {
        if (env.length() > 1) {
            this.env = env.trim().substring(0, 1).replace("'", "");
        } else {
            this.env = env.replace("'", "");
        }
    }

    public void setXxx(String xxx) {
        if (xxx.length() > 60) {
            this.xxx = xxx.trim().substring(0, 60).replace("'", "");
        } else {
            this.xxx = xxx.replace("'", "");
        }
    }

    public void setFcr_Crm(String fcr_crm) {
        if (fcr_crm == null || fcr_crm.equals("NULL")) {
            this.fcr_crm = "NULL";
        } else {
            this.fcr_crm = "'" + fcr_crm + "'";
        }
    }

    public void setTip_Crm(float tip_crm) {
        this.tip_crm = tip_crm;
    }

    public void setFtr_Crm(String ftr_crm) {
        if (ftr_crm == null || ftr_crm.equals("NULL")) {
            this.ftr_crm = "NULL";
        } else {
            this.ftr_crm = "'" + ftr_crm + "'";
        }
    }

    public void setTco_Crm(float tco_crm) {
        this.tco_crm = tco_crm;
    }

    public void setRef_Crm(String ref_crm) {
        if (ref_crm.length() > 6) {
            this.ref_crm = ref_crm.trim().substring(0, 6).replace("'", "");
        } else {
            this.ref_crm = ref_crm.replace("'", "");
        }
    }

    public void setVis_Crm(String vis_crm) {
        if (vis_crm.length() > 1) {
            this.vis_crm = vis_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.vis_crm = vis_crm.replace("'", "");
        }
    }

    public void setPvi_Crm(float pvi_crm) {
        this.pvi_crm = pvi_crm;
    }

    public void setLla_Crm(String lla_crm) {
        if (lla_crm.length() > 1) {
            this.lla_crm = lla_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.lla_crm = lla_crm.replace("'", "");
        }
    }

    public void setPll_Crm(float pll_crm) {
        this.pll_crm = pll_crm;
    }

    public void setRu1_Crm(String ru1_crm) {
        if (ru1_crm.length() > 6) {
            this.ru1_crm = ru1_crm.trim().substring(0, 6).replace("'", "");
        } else {
            this.ru1_crm = ru1_crm.replace("'", "");
        }
    }

    public void setRu2_Crm(String ru2_crm) {
        if (ru2_crm.length() > 6) {
            this.ru2_crm = ru2_crm.trim().substring(0, 6).replace("'", "");
        } else {
            this.ru2_crm = ru2_crm.replace("'", "");
        }
    }

    public void setRu3_Crm(String ru3_crm) {
        if (ru3_crm.length() > 6) {
            this.ru3_crm = ru3_crm.trim().substring(0, 6).replace("'", "");
        } else {
            this.ru3_crm = ru3_crm.replace("'", "");
        }
    }

    public void setSec_Crm(float sec_crm) {
        this.sec_crm = sec_crm;
    }

    public void setDias_Crm(String dias_crm) {
        if (dias_crm.length() > 6) {
            this.dias_crm = dias_crm.trim().substring(0, 6).replace("'", "");
        } else {
            this.dias_crm = dias_crm.replace("'", "");
        }
    }

    public void setTpl_Crm(String tpl_crm) {
        if (tpl_crm.length() > 1) {
            this.tpl_crm = tpl_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.tpl_crm = tpl_crm.replace("'", "");
        }
    }

    public void setFna_Crm(String fna_crm) {
        if (fna_crm == null || fna_crm.equals("NULL")) {
            this.fna_crm = "NULL";
        } else {
            this.fna_crm = "'" + fna_crm + "'";
        }
    }

    public void setImprap(float imprap) {
        this.imprap = imprap;
    }

    public void setDtorap(float dtorap) {
        this.dtorap = dtorap;
    }

    public void setTar_Art(String tar_art) {
        if (tar_art.length() > 6) {
            this.tar_art = tar_art.trim().substring(0, 6).replace("'", "");
        } else {
            this.tar_art = tar_art.replace("'", "");
        }
    }

    public void setTar_Fam(String tar_fam) {
        if (tar_fam.length() > 6) {
            this.tar_fam = tar_fam.trim().substring(0, 6).replace("'", "");
        } else {
            this.tar_fam = tar_fam.replace("'", "");
        }
    }

    public void setEfactura(String efactura) {
        if (efactura.length() > 1) {
            this.efactura = efactura.trim().substring(0, 1).replace("'", "");
        } else {
            this.efactura = efactura.replace("'", "");
        }
    }

    public void setPerrap(int perrap) {
        this.perrap = perrap;
    }

    public void setFacedir(String facedir) {
        if (facedir.length() > 50) {
            this.facedir = facedir.trim().substring(0, 50).replace("'", "");
        } else {
            this.facedir = facedir.replace("'", "");
        }
    }

    public void setFacepob(String facepob) {
        if (facepob.length() > 50) {
            this.facepob = facepob.trim().substring(0, 50).replace("'", "");
        } else {
            this.facepob = facepob.replace("'", "");
        }
    }

    public void setFacenpro(int facenpro) {
        this.facenpro = facenpro;
    }

    public void setFacepro(String facepro) {
        if (facepro.length() > 40) {
            this.facepro = facepro.trim().substring(0, 40).replace("'", "");
        } else {
            this.facepro = facepro.replace("'", "");
        }
    }

    public void setFacepais(float facepais) {
        this.facepais = facepais;
    }

    public void setFacenom(String facenom) {
        if (facenom.length() > 30) {
            this.facenom = facenom.trim().substring(0, 30).replace("'", "");
        } else {
            this.facenom = facenom.replace("'", "");
        }
    }

    public void setFaceape1(String faceape1) {
        if (faceape1.length() > 30) {
            this.faceape1 = faceape1.trim().substring(0, 30).replace("'", "");
        } else {
            this.faceape1 = faceape1.replace("'", "");
        }
    }

    public void setFaceape2(String faceape2) {
        if (faceape2.length() > 30) {
            this.faceape2 = faceape2.trim().substring(0, 30).replace("'", "");
        } else {
            this.faceape2 = faceape2.replace("'", "");
        }
    }

    public void setFacefoj(String facefoj) {
        if (facefoj.length() > 1) {
            this.facefoj = facefoj.trim().substring(0, 1).replace("'", "");
        } else {
            this.facefoj = facefoj.replace("'", "");
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

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public void setLopd_Ori(float lopd_ori) {
        this.lopd_ori = lopd_ori;
    }

    public void setLopd_Otr_O(String lopd_otr_o) {
        if (lopd_otr_o.length() > 100) {
            this.lopd_otr_o = lopd_otr_o.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_otr_o = lopd_otr_o.replace("'", "");
        }
    }

    public void setLopd_Ces(String lopd_ces) {
        if (lopd_ces.length() > 100) {
            this.lopd_ces = lopd_ces.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_ces = lopd_ces.replace("'", "");
        }
    }

    public void setLopd_Otr_C(String lopd_otr_c) {
        if (lopd_otr_c.length() > 100) {
            this.lopd_otr_c = lopd_otr_c.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_otr_c = lopd_otr_c.replace("'", "");
        }
    }

    public void setCli_Facalb(String cli_facalb) {
        if (cli_facalb.length() > 6) {
            this.cli_facalb = cli_facalb.trim().substring(0, 6).replace("'", "");
        } else {
            this.cli_facalb = cli_facalb.replace("'", "");
        }
    }

    public void setCln_Tarsub(String cln_tarsub) {
        if (cln_tarsub.length() > 6) {
            this.cln_tarsub = cln_tarsub.trim().substring(0, 6).replace("'", "");
        } else {
            this.cln_tarsub = cln_tarsub.replace("'", "");
        }
    }

    public void setCln_Tarmar(String cln_tarmar) {
        if (cln_tarmar.length() > 6) {
            this.cln_tarmar = cln_tarmar.trim().substring(0, 6).replace("'", "");
        } else {
            this.cln_tarmar = cln_tarmar.replace("'", "");
        }
    }

    public void setCln_Idioma(int cln_idioma) {
        this.cln_idioma = cln_idioma;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public void setAvi0Dep(int avi0dep) {
        this.avi0dep = avi0dep;
    }

    public void setAvi_Dep(String avi_dep) {
        this.avi_dep = avi_dep;
    }

    public void setAvi_Ped(String avi_ped) {
        this.avi_ped = avi_ped;
    }

    public void setAvi_Pre(String avi_pre) {
        this.avi_pre = avi_pre;
    }

    public void setAvi_Alb(String avi_alb) {
        this.avi_alb = avi_alb;
    }

    public void setAvi_Fac(String avi_fac) {
        this.avi_fac = avi_fac;
    }

    public void setAvi_Rec(String avi_rec) {
        this.avi_rec = avi_rec;
    }

    public void setWeb_Acc(String web_acc) {
        if (web_acc.length() > 1) {
            this.web_acc = web_acc.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_acc = web_acc.replace("'", "");
        }
    }

    public void setWeb_Psw(String web_psw) {
        if (web_psw.length() > 15) {
            this.web_psw = web_psw.trim().substring(0, 15).replace("'", "");
        } else {
            this.web_psw = web_psw.replace("'", "");
        }
    }

    public void setObs_Doc(String obs_doc) {
        this.obs_doc = obs_doc;
    }

    public void setActividad(String actividad) {
        if (actividad.length() > 50) {
            this.actividad = actividad.trim().substring(0, 50).replace("'", "");
        } else {
            this.actividad = actividad.replace("'", "");
        }
    }

    public void setEmailweb(String emailweb) {
        if (emailweb.length() > 60) {
            this.emailweb = emailweb.trim().substring(0, 60).replace("'", "");
        } else {
            this.emailweb = emailweb.replace("'", "");
        }
    }

    public void setWeb_Exepor(String web_exepor) {
        if (web_exepor.length() > 1) {
            this.web_exepor = web_exepor.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_exepor = web_exepor.replace("'", "");
        }
    }

    public void setTip_Rem(int tip_rem) {
        this.tip_rem = tip_rem;
    }

    public void setFec_Man(String fec_man) {
        if (fec_man == null || fec_man.equals("NULL")) {
            this.fec_man = "NULL";
        } else {
            this.fec_man = "'" + fec_man + "'";
        }
    }

    public void setCri_Caja(String cri_caja) {
        if (cri_caja.length() > 1) {
            this.cri_caja = cri_caja.trim().substring(0, 1).replace("'", "");
        } else {
            this.cri_caja = cri_caja.replace("'", "");
        }
    }

    public void setFacemed(String facemed) {
        if (facemed.length() > 3) {
            this.facemed = facemed.trim().substring(0, 3).replace("'", "");
        } else {
            this.facemed = facemed.replace("'", "");
        }
    }

    public void setFaceiban(String faceiban) {
        if (faceiban.length() > 34) {
            this.faceiban = faceiban.trim().substring(0, 34).replace("'", "");
        } else {
            this.faceiban = faceiban.replace("'", "");
        }
    }

    public void setFacever(String facever) {
        if (facever.length() > 10) {
            this.facever = facever.trim().substring(0, 10).replace("'", "");
        } else {
            this.facever = facever.replace("'", "");
        }
    }

    public void setFacepol(String facepol) {
        if (facepol.length() > 10) {
            this.facepol = facepol.trim().substring(0, 10).replace("'", "");
        } else {
            this.facepol = facepol.replace("'", "");
        }
    }

    public void setPor_Efac(String por_efac) {
        if (por_efac.length() > 8) {
            this.por_efac = por_efac.trim().substring(0, 8).replace("'", "");
        } else {
            this.por_efac = por_efac.replace("'", "");
        }
    }

    public void setWeb_Codact(String web_codact) {
        if (web_codact.length() > 20) {
            this.web_codact = web_codact.trim().substring(0, 20).replace("'", "");
        } else {
            this.web_codact = web_codact.replace("'", "");
        }
    }

    public void setSincro(String sincro) {
        if (sincro.length() > 1) {
            this.sincro = sincro.trim().substring(0, 1).replace("'", "");
        } else {
            this.sincro = sincro.replace("'", "");
        }
    }

    @Override
    public String toString() {
        String type = "";
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
        
        if (type.equals("Insert")) {
            return toInsert();
        } else if (type.equals("Update")) {
            return toUpdate();
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO CLIENT (cod,nom,sno,dir,pob,npro,pro,nif,te1,te2,fax,mov,per,car,ter,req,red,dto,com,fin,fac,tar,"
                +
                "[for],di1,di2,di3,mnp,m30,vto,inc,rie,rut,age,nco,alv,fa1,fa2,tra,mar,dt2,tia,fo2,d1b,d2b,d3b,mnb,imp,tre,ret,fgl,ifg,web,"
                +
                "doc,fpd,pais,ext,ob1,ob2,rediva1,rediva2,rediva3,rediva4,rediva5,avi0ped,avi1ped,avi2ped,avi0alb,avi1alb,avi2alb,avi0fac,"
                +
                "avi1fac,avi2fac,avi0rec,avi1rec,avi2rec,avi0pre,avi1pre,avi2pre,ivainc,fot,env,xxx,fcr_crm,tip_crm,ftr_crm,tco_crm,ref_crm,"
                +
                "vis_crm,pvi_crm,lla_crm,pll_crm,ru1_crm,ru2_crm,ru3_crm,sec_crm,dias_crm,tpl_crm,fna_crm,imprap,dtorap,tar_art,tar_fam,"
                +
                "efactura,perrap,facedir,facepob,facenpro,facepro,facepais,facenom,faceape1,faceape2,facefoj,v01,v02,v03,v04,v05,v06,v07,"
                +
                "v08,v09,v10,v11,v12,historia,lopd_ori,lopd_otr_o,lopd_ces,lopd_otr_c,cli_facalb,cln_tarsub,cln_tarmar,cln_idioma,moneda,"
                +
                "avi0dep,avi_dep,avi_ped,avi_pre,avi_alb,avi_fac,avi_rec,web_acc,web_psw,obs_doc,actividad,emailweb,web_exepor,tip_rem,"
                +
                "fec_man,cri_caja,facemed,faceiban,facever,facepol,por_efac,web_codact,sincro) VALUES ('" + cod + "','"
                + nom + "','" + sno + "','" + dir + "','" + pob + "'," + npro + ",'" + pro + "','" + nif + "','" + te1
                + "','" + te2 + "','" + fax + "','" + mov + "','" + per + "','" + car + "','" + ter + "','" + req
                + "','" + red + "'," + dto + "," + com + "," + fin + "," + fac + "," + tar + "," + forpag + "," + di1
                + "," + di2 + "," + di3 + "," + mnp + ",'" + m30 + "'," + vto + "," + inc + "," + rie + ",'" + rut
                + "','" + age + "'," + nco + ",'" + alv + "','" + fa1 + "','" + fa2 + "','" + tra + "','" + mar + "',"
                + dt2 + ",'" + tia + "'," + fo2 + "," + d1b + "," + d2b + "," + d3b + "," + mnb + "," + imp + "," + tre
                + "," + ret + ",'" + fgl + "'," + ifg + ",'" + web + "','" + doc + "','" + fpd + "'," + pais + ",'"
                + ext + "','" + ob1 + "','" + ob2 + "'," + rediva1 + "," + rediva2 + "," + rediva3 + "," + rediva4 + ","
                + rediva5 + "," + avi0ped + ",'" + avi1ped + "','" + avi2ped + "'," + avi0alb + ",'" + avi1alb + "','"
                + avi2alb + "'," + avi0fac + ",'" + avi1fac + "','" + avi2fac + "'," + avi0rec + ",'" + avi1rec + "','"
                + avi2rec + "'," + avi0pre + ",'" + avi1pre + "','" + avi2pre + "','" + ivainc + "','" + fot + "','"
                + env + "','" + xxx + "'," + fcr_crm + "," + tip_crm + "," + ftr_crm + "," + tco_crm + ",'"
                + ref_crm + "','" + vis_crm + "'," + pvi_crm + ",'" + lla_crm + "'," + pll_crm + ",'" + ru1_crm + "','"
                + ru2_crm + "','" + ru3_crm + "'," + sec_crm + ",'" + dias_crm + "','" + tpl_crm + "'," + fna_crm
                + "," + imprap + "," + dtorap + ",'" + tar_art + "','" + tar_fam + "','" + efactura + "'," + perrap
                + ",'" + facedir + "','" + facepob + "'," + facenpro + ",'" + facepro + "'," + facepais + ",'" + facenom
                + "','" + faceape1 + "','" + faceape2 + "','" + facefoj + "','" + v01 + "','" + v02 + "','" + v03
                + "','" + v04 + "','" + v05 + "','" + v06 + "','" + v07 + "','" + v08 + "','" + v09 + "','" + v10
                + "','" + v11 + "','" + v12 + "','" + historia + "'," + lopd_ori + ",'" + lopd_otr_o + "','" + lopd_ces
                + "','" + lopd_otr_c + "','" + cli_facalb + "','" + cln_tarsub + "','" + cln_tarmar + "'," + cln_idioma
                + "," + moneda + "," + avi0dep + ",'" + avi_dep + "','" + avi_ped + "','" + avi_pre + "','" + avi_alb
                + "','" + avi_fac + "','" + avi_rec + "','" + web_acc + "','" + web_psw + "','" + obs_doc + "','"
                + actividad + "','" + emailweb + "','" + web_exepor + "'," + tip_rem + "," + fec_man + ",'" + cri_caja
                + "','" + facemed + "','" + faceiban + "','" + facever + "','" + facepol + "','" + por_efac + "','"
                + web_codact + "','" + sincro + "');";
    }

    public String toUpdate() {
        return "UPDATE CLIENT SET nom='" + nom + "',sno='" + sno + "',dir='" + dir + "',pob='" + pob
                + "',npro=" + npro + ",pro='" + pro + "',nif='" + nif + "',te1='" + te1 + "',te2='" + te2 + "',fax='"
                + fax + "',mov='" + mov + "',per='" + per + "',car='" + car + "',ter='" + ter + "',req='" + req
                + "',red='" + red + "',dto=" + dto + ",com=" + com + ",fin=" + fin + ",fac=" + fac + ",tar=" + tar
                + ",[for]=" + forpag + ",di1=" + di1 + ",di2=" + di2 + ",di3=" + di3 + ",mnp=" + mnp + ",m30='" + m30
                + "',vto=" + vto + ",inc=" + inc + ",rie=" + rie + ",rut='" + rut + "',age='" + age + "',nco=" + nco
                + ",alv='" + alv + "',fa1='" + fa1 + "',fa2='" + fa2 + "',tra='" + tra + "',mar='" + mar + "',dt2="
                + dt2 + ",tia='" + tia + "',fo2=" + fo2 + ",d1b=" + d1b + ",d2b=" + d2b + ",d3b=" + d3b + ",mnb=" + mnb
                + ",imp=" + imp + ",tre=" + tre + ",ret=" + ret + ",fgl='" + fgl + "',ifg=" + ifg + ",web='" + web
                + "',doc='" + doc + "',fpd='" + fpd + "',pais=" + pais + ",ext='" + ext + "',ob1='" + ob1 + "',ob2='"
                + ob2 + "',rediva1=" + rediva1 + ",rediva2=" + rediva2 + ",rediva3=" + rediva3 + ",rediva4=" + rediva4
                + ",rediva5=" + rediva5 + ",avi0ped=" + avi0ped + ",avi1ped='" + avi1ped + "',avi2ped='" + avi2ped
                + "',avi0alb=" + avi0alb + ",avi1alb='" + avi1alb + "',avi2alb='" + avi2alb + "',avi0fac=" + avi0fac
                + ",avi1fac='" + avi1fac + "',avi2fac='" + avi2fac + "',avi0rec=" + avi0rec + ",avi1rec='" + avi1rec
                + "',avi2rec='" + avi2rec + "',avi0pre=" + avi0pre + ",avi1pre='" + avi1pre + "',avi2pre='" + avi2pre
                + "',ivainc='" + ivainc + "',fot='" + fot + "',env='" + env + "',xxx='" + xxx + "',fcr_crm=" + fcr_crm
                + ",tip_crm=" + tip_crm + ",ftr_crm=" + ftr_crm + ",tco_crm=" + tco_crm + ",ref_crm='" + ref_crm
                + "',vis_crm='" + vis_crm + "',pvi_crm=" + pvi_crm + ",lla_crm='" + lla_crm + "',pll_crm=" + pll_crm
                + ",ru1_crm='" + ru1_crm + "',ru2_crm='" + ru2_crm + "',ru3_crm='" + ru3_crm + "',sec_crm=" + sec_crm
                + ",dias_crm='" + dias_crm + "',tpl_crm='" + tpl_crm + "',fna_crm=" + fna_crm + ",imprap=" + imprap
                + ",dtorap=" + dtorap + ",tar_art='" + tar_art + "',tar_fam='" + tar_fam + "',efactura='" + efactura
                + "',perrap=" + perrap + ",facedir='" + facedir + "',facepob='" + facepob + "',facenpro=" + facenpro
                + ",facepro='" + facepro + "',facepais=" + facepais + ",facenom='" + facenom + "',faceape1='" + faceape1
                + "',faceape2='" + faceape2 + "',facefoj='" + facefoj + "',v01='" + v01 + "',v02='" + v02 + "',v03='"
                + v03 + "',v04='" + v04 + "',v05='" + v05 + "',v06='" + v06 + "',v07='" + v07 + "',v08='" + v08
                + "',v09='" + v09 + "',v10='" + v10 + "',v11='" + v11 + "',v12='" + v12 + "',historia='" + historia
                + "',lopd_ori=" + lopd_ori + ",lopd_otr_o='" + lopd_otr_o + "',lopd_ces='" + lopd_ces + "',lopd_otr_c='"
                + lopd_otr_c + "',cli_facalb='" + cli_facalb + "',cln_tarsub='" + cln_tarsub + "',cln_tarmar='"
                + cln_tarmar + "',cln_idioma=" + cln_idioma + ",moneda=" + moneda + ",avi0dep=" + avi0dep + ",avi_dep='"
                + avi_dep + "',avi_ped='" + avi_ped + "',avi_pre='" + avi_pre + "',avi_alb='" + avi_alb + "',avi_fac='"
                + avi_fac + "',avi_rec='" + avi_rec + "',web_acc='" + web_acc + "',web_psw='" + web_psw + "',obs_doc='"
                + obs_doc + "',actividad='" + actividad + "',emailweb='" + emailweb + "',web_exepor='" + web_exepor
                + "',tip_rem=" + tip_rem + ",fec_man=" + fec_man + ",cri_caja='" + cri_caja + "',facemed='" + facemed
                + "',faceiban='" + faceiban + "',facever='" + facever + "',facepol='" + facepol + "',por_efac='"
                + por_efac + "',web_codact='" + web_codact + "',sincro='" + sincro + "' WHERE cod='" + cod + "';";
    }
}
