package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ExcelController;

public class Proveedor {
    public String cod = "";
    public String nom = "";
    public String dir = "";
    public int npro = 0;
    public String pob = " -";
    public String pro = "";
    public String nif = "";
    public String te1 = "";
    public String te2 = "";
    public String fax = "";
    public String mov = "";
    public String ter = "";
    public String per = "";
    public String car = "";
    public int forpag = 1;
    public float dto = 0.00F;
    public String red = "N";
    public String por = "";
    public String poa = "P";
    public String ctg = "6000000000";
    public String mar = "N";
    public float dt2 = 0.00F;
    public int di1 = 0;
    public int di2 = 0;
    public int di3 = 0;
    public int mnp = 0;
    public String tia = "n";
    public int tre = 0;
    public float ret = 0.00F;
    public String ob1 = "";
    public String ob2 = "";
    public String ob3 = "";
    public String web = "";
    public String ext = "";
    public int rediva1 = 1;
    public int rediva2 = 2;
    public int rediva3 = 3;
    public int rediva4 = 4;
    public int rediva5 = 5;
    public int avi0ped = 1;
    public String avi1ped = "";
    public String avi2ped = "";
    public int avi0alb = 1;
    public String avi1alb = "";
    public String avi2alb = "";
    public int avi0fac = 1;
    public String avi1fac = "";
    public String avi2fac = "";
    public int avi0rec = 0;
    public String avi1rec = "";
    public String avi2rec = "";
    public String ivainc = "N";
    public String fot = "";
    public String doc = "I";
    public float pais = 0;
    public String xxx = "";
    public float imprap = 0.000F;
    public float dtorap = 0.00F;
    public int perrap = 0;
    public String v01 = "";
    public String v02 = "";
    public String v03 = "";
    public String v04 = "";
    public String v05 = "";
    public String v06 = "";
    public String v07 = "";
    public String v08 = "";
    public String v09 = "";
    public String v10 = "";
    public String v11 = "";
    public String v12 = "";
    public String historia = "";
    public float lopd_ori = 0;
    public String lopd_Otr_O = "";
    public String lopd_Ces = "";
    public String lopd_Otr_C = "";
    public int pro_idioma = 1;
    public int moneda = 1;
    public String avi_Ped = "";
    public String avi_Alb = "";
    public String avi_Fac = "";
    public String avi_Rec = "";
    public String actividad = "";
    public String contrato = "";
    public String fec_Eval = "NULL";
    public String res_Eval = "N";
    public String fec_Apro = "NULL";
    public float nota_Eval = 0;
    public String product1 = "";
    public String product2 = "";
    public String obs_Cal = "";
    public String cer_Cal = "N";
    public String cer_Med = "N";
    public String cer_Pre = "N";
    public float perval = 0;
    public int diasmax = 0;
    public String autof = "N";
    public int tip_Rem = 2;
    public String cri_Caja = "N";

    public Proveedor() {
    }

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public int getNpro() {
        return npro;
    }

    public String getPob() {
        return pob;
    }

    public String getPro() {
        return pro;
    }

    public String getNif() {
        return nif;
    }

    public String getTe1() {
        return te1;
    }

    public String getTe2() {
        return te2;
    }

    public String getFax() {
        return fax;
    }

    public String getMov() {
        return mov;
    }

    public String getTer() {
        return ter;
    }

    public String getPer() {
        return per;
    }

    public String getCar() {
        return car;
    }

    public int getForpag() {
        return forpag;
    }

    public float getDto() {
        return dto;
    }

    public String getRed() {
        return red;
    }

    public String getPor() {
        return por;
    }

    public String getPoa() {
        return poa;
    }

    public String getCtg() {
        return ctg;
    }

    public String getMar() {
        return mar;
    }

    public float getDt2() {
        return dt2;
    }

    public int getDi1() {
        return di1;
    }

    public int getDi2() {
        return di2;
    }

    public int getDi3() {
        return di3;
    }

    public int getMnp() {
        return mnp;
    }

    public String getTia() {
        return tia;
    }

    public int getTre() {
        return tre;
    }

    public float getRet() {
        return ret;
    }

    public String getOb1() {
        return ob1;
    }

    public String getOb2() {
        return ob2;
    }

    public String getOb3() {
        return ob3;
    }

    public String getWeb() {
        return web;
    }

    public String getExt() {
        return ext;
    }

    public int getRediva1() {
        return rediva1;
    }

    public int getRediva2() {
        return rediva2;
    }

    public int getRediva3() {
        return rediva3;
    }

    public int getRediva4() {
        return rediva4;
    }

    public int getRediva5() {
        return rediva5;
    }

    public int getAvi0ped() {
        return avi0ped;
    }

    public String getAvi1ped() {
        return avi1ped;
    }

    public String getAvi2ped() {
        return avi2ped;
    }

    public int getAvi0alb() {
        return avi0alb;
    }

    public String getAvi1alb() {
        return avi1alb;
    }

    public String getAvi2alb() {
        return avi2alb;
    }

    public int getAvi0fac() {
        return avi0fac;
    }

    public String getAvi1fac() {
        return avi1fac;
    }

    public String getAvi2fac() {
        return avi2fac;
    }

    public int getAvi0rec() {
        return avi0rec;
    }

    public String getAvi1rec() {
        return avi1rec;
    }

    public String getAvi2rec() {
        return avi2rec;
    }

    public String getIvainc() {
        return ivainc;
    }

    public String getFot() {
        return fot;
    }

    public String getDoc() {
        return doc;
    }

    public float getPais() {
        return pais;
    }

    public String getXxx() {
        return xxx;
    }

    public float getImprap() {
        return imprap;
    }

    public float getDtorap() {
        return dtorap;
    }

    public int getPerrap() {
        return perrap;
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

    public String getHistoria() {
        return historia;
    }

    public float getLopd_ori() {
        return lopd_ori;
    }

    public String getLopd_Otr_O() {
        return lopd_Otr_O;
    }

    public String getLopd_Ces() {
        return lopd_Ces;
    }

    public String getLopd_Otr_C() {
        return lopd_Otr_C;
    }

    public int getPro_idioma() {
        return pro_idioma;
    }

    public int getMoneda() {
        return moneda;
    }

    public String getAvi_Ped() {
        return avi_Ped;
    }

    public String getAvi_Alb() {
        return avi_Alb;
    }

    public String getAvi_Fac() {
        return avi_Fac;
    }

    public String getAvi_Rec() {
        return avi_Rec;
    }

    public String getActividad() {
        return actividad;
    }

    public String getContrato() {
        return contrato;
    }

    public String getFec_Eval() {
        return fec_Eval;
    }

    public String getRes_Eval() {
        return res_Eval;
    }

    public String getFec_Apro() {
        return fec_Apro;
    }

    public float getNota_Eval() {
        return nota_Eval;
    }

    public String getProduct1() {
        return product1;
    }

    public String getProduct2() {
        return product2;
    }

    public String getObs_Cal() {
        return obs_Cal;
    }

    public String getCer_Cal() {
        return cer_Cal;
    }

    public String getCer_Med() {
        return cer_Med;
    }

    public String getCer_Pre() {
        return cer_Pre;
    }

    public float getPerval() {
        return perval;
    }

    public int getDiasmax() {
        return diasmax;
    }

    public String getAutof() {
        return autof;
    }

    public int getTip_Rem() {
        return tip_Rem;
    }

    public String getCri_Caja() {
        return cri_Caja;
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

    public void setDir(String dir) {
        if (dir.length() > 50) {
            this.dir = dir.trim().substring(0, 50).replace("'", "");
        } else {
            this.dir = dir.replace("'", "");
        }
    }

    public void setNpro(int npro) {
        this.npro = npro;
    }

    public void setPob(String pob) {
        if (pob.length() > 50) {
            this.pob = pob.trim().substring(0, 50).replace("'", "");
        } else {
            this.pob = pob.replace("'", "");
        }
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

    public void setTer(String ter) {
        if (ter.length() > 18) {
            this.ter = ter.trim().substring(0, 18).replace("'", "");
        } else {
            this.ter = ter.replace("'", "");
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
        if (car.length() > 30) {
            this.car = car.trim().substring(0, 30).replace("'", "");
        } else {
            this.car = car.replace("'", "");
        }
    }

    public void setForpag(int forpag) {
        this.forpag = forpag;
    }

    public void setDto(float dto) {
        this.dto = dto;
    }

    public void setRed(String red) {
        if (red.length() > 1) {
            this.red = red.trim().substring(0, 1).replace("'", "");
        } else {
            this.red = red.replace("'", "");
        }
    }

    public void setPor(String por) {
        if (por.length() > 1) {
            this.por = por.trim().substring(0, 1).replace("'", "");
        } else {
            this.por = por.replace("'", "");
        }
    }

    public void setPoa(String poa) {
        if (poa.length() > 1) {
            this.poa = poa.trim().substring(0, 1).replace("'", "");
        } else {
            this.poa = poa.replace("'", "");
        }
    }

    public void setCtg(String ctg) {
        if (ctg.length() > 12) {
            this.ctg = ctg.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctg = ctg.replace("'", "");
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

    public void setTia(String tia) {
        if (tia.length() > 1) {
            this.tia = tia.trim().substring(0, 1).replace("'", "");
        } else {
            this.tia = tia.replace("'", "");
        }
    }

    public void setTre(int tre) {
        this.tre = tre;
    }

    public void setRet(float ret) {
        this.ret = ret;
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

    public void setOb3(String ob3) {
        if (ob3.length() > 70) {
            this.ob3 = ob3.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob3 = ob3.replace("'", "");
        }
    }

    public void setWeb(String web) {
        if (web.length() > 80) {
            this.web = web.trim().substring(0, 80).replace("'", "");
        } else {
            this.web = web.replace("'", "");
        }
    }

    public void setExt(String ext) {
        if (ext.length() > 6) {
            this.ext = ext.trim().substring(0, 6).replace("'", "");
        } else {
            this.ext = ext.replace("'", "");
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

    public void setDoc(String doc) {
        if (doc.length() > 1) {
            this.doc = doc.trim().substring(0, 1).replace("'", "");
        } else {
            this.doc = doc.replace("'", "");
        }
    }

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setXxx(String xxx) {
        if (xxx.length() > 60) {
            this.xxx = xxx.trim().substring(0, 60).replace("'", "");
        } else {
            this.xxx = xxx.replace("'", "");
        }
    }

    public void setImprap(float imprap) {
        this.imprap = imprap;
    }

    public void setDtorap(float dtorap) {
        this.dtorap = dtorap;
    }

    public void setPerrap(int perrap) {
        this.perrap = perrap;
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
            this.lopd_Otr_O = lopd_otr_o.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_Otr_O = lopd_otr_o.replace("'", "");
        }
    }

    public void setLopd_Ces(String lopd_ces) {
        if (lopd_ces.length() > 100) {
            this.lopd_Ces = lopd_ces.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_Ces = lopd_ces.replace("'", "");
        }
    }

    public void setLopd_Otr_C(String lopd_otr_c) {
        if (lopd_otr_c.length() > 100) {
            this.lopd_Otr_C = lopd_otr_c.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_Otr_C = lopd_otr_c.replace("'", "");
        }
    }

    public void setPro_Idioma(int pro_idioma) {
        this.pro_idioma = pro_idioma;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public void setAvi_Ped(String avi_ped) {
        this.avi_Ped = avi_ped;
    }

    public void setAvi_Alb(String avi_alb) {
        this.avi_Alb = avi_alb;
    }

    public void setAvi_Fac(String avi_fac) {
        this.avi_Fac = avi_fac;
    }

    public void setAvi_Rec(String avi_rec) {
        this.avi_Rec = avi_rec;
    }

    public void setActividad(String actividad) {
        if (actividad.length() > 50) {
            this.actividad = actividad.trim().substring(0, 50).replace("'", "");
        } else {
            this.actividad = actividad.replace("'", "");
        }
    }

    public void setContrato(String contrato) {
        if (contrato.length() > 20) {
            this.contrato = contrato.trim().substring(0, 20).replace("'", "");
        } else {
            this.contrato = contrato.replace("'", "");
        }
    }

    public void setFec_Eval(String fec_eval) {
        if (fec_eval != null) {
            this.fec_Eval = "'" + fec_eval + "'";
        } else {
            this.fec_Eval = "NULL";
        }
    }

    public void setRes_Eval(String res_eval) {
        if (res_eval.length() > 1) {
            this.res_Eval = res_eval.trim().substring(0, 1).replace("'", "");
        } else {
            this.res_Eval = res_eval.replace("'", "");
        }
    }

    public void setFec_Apro(String fec_apro) {
        if (fec_apro != null) {
            this.fec_Apro = "'" + fec_apro + "'";
        } else {
            this.fec_Apro = "NULL";
        }
    }

    public void setNota_Eval(float nota_eval) {
        this.nota_Eval = nota_eval;
    }

    public void setProduct1(String product1) {
        if (product1.length() > 80) {
            this.product1 = product1.trim().substring(0, 80).replace("'", "");
        } else {
            this.product1 = product1.replace("'", "");
        }
    }

    public void setProduct2(String product2) {
        if (product2.length() > 80) {
            this.product2 = product2.trim().substring(0, 80).replace("'", "");
        } else {
            this.product2 = product2.replace("'", "");
        }
    }

    public void setObs_Cal(String obs_cal) {
        this.obs_Cal = obs_cal;
    }

    public void setCer_Cal(String cer_cal) {
        if (cer_cal.length() > 1) {
            this.cer_Cal = cer_cal.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_Cal = cer_cal.replace("'", "");
        }
    }

    public void setCer_Med(String cer_med) {
        if (cer_med.length() > 1) {
            this.cer_Med = cer_med.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_Med = cer_med.replace("'", "");
        }
    }

    public void setCer_Pre(String cer_pre) {
        if (cer_pre.length() > 1) {
            this.cer_Pre = cer_pre.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_Pre = cer_pre.replace("'", "");
        }
    }

    public void setPerval(float perval) {
        this.perval = perval;
    }

    public void setDiasmax(int diasmax) {
        this.diasmax = diasmax;
    }

    public void setAutof(String autof) {
        if (autof.length() > 1) {
            this.autof = autof.trim().substring(0, 1).replace("'", "");
        } else {
            this.autof = autof.replace("'", "");
        }
    }

    public void setTip_Rem(int tip_rem) {
        this.tip_Rem = tip_rem;
    }

    public void setCri_Caja(String cri_caja) {
        if (cri_caja.length() > 1) {
            this.cri_Caja = cri_caja.trim().substring(0, 1).replace("'", "");
        } else {
            this.cri_Caja = cri_caja.replace("'", "");
        }
    }

    @Override
    public String toString() {
        ExcelController excelController = ExcelController.getExcelController();
        String type = excelController.getTypeTransfer();
        if (type.equals("Insert")) {
            return toInsert();
        } else if (type.equals("Update")) {
            return toUpdate();
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO PROVEE (cod,nom,dir,npro,pob,pro,nif,te1,te2,fax,mov,ter,per,car,[for],dto,red,por,poa,ctg,"
                +
                "mar,dt2,di1,di2,di3,mnp,tia,tre,ret,ob1,ob2,ob3,web,ext,rediva1,rediva2,rediva3,rediva4,rediva5,avi0ped,avi1ped,"
                +
                "avi2ped,avi0alb,avi1alb,avi2alb,avi0fac,avi1fac,avi2fac,avi0rec,avi1rec,avi2rec,ivainc,fot,doc,pais,xxx,imprap,"
                +
                "dtorap,perrap,v01,v02,v03,v04,v05,v06,v07,v08,v09,v10,v11,v12,historia,lopd_ori,lopd_otr_o,lopd_ces,lopd_otr_c,"
                +
                "pro_idioma,moneda,avi_ped,avi_alb,avi_fac,avi_rec,actividad,contrato,fec_eval,res_eval,fec_apro,nota_eval,product1,"
                +
                "product2,obs_cal,cer_cal,cer_med,cer_pre,perval,diasmax,autof,tip_rem,cri_caja) VALUES " +
                "('" + cod + "','" + nom + "','" + dir + "'," + npro + ",'" + pob + "','" + pro + "','" + nif + "','"
                + te1 + "','" + te2 + "','" + fax + "','" + mov + "','" + ter + "','" + per + "','" + car + "',"
                + forpag + "," + dto + ",'" + red + "','" + por + "','" + poa + "','" + ctg + "','" + mar + "'," + dt2
                + "," + di1 + "," + di2 + "," + di3 + "," + mnp + ",'" + tia + "'," + tre + "," + ret + ",'" + ob1
                + "','" + ob2 + "','" + ob3 + "','" + web + "','" + ext + "'," + rediva1 + "," + rediva2 + "," + rediva3
                + "," + rediva4 + "," + rediva5 + "," + avi0ped + ",'" + avi1ped + "','" + avi2ped + "'," + avi0alb
                + ",'" + avi1alb + "','" + avi2alb + "'," + avi0fac + ",'" + avi1fac + "','" + avi2fac + "'," + avi0rec
                + ",'" + avi1rec + "','" + avi2rec + "','" + ivainc + "','" + fot + "','" + doc + "'," + pais + ",'"
                + xxx + "'," + imprap + "," + dtorap + "," + perrap + ",'" + v01 + "','" + v02 + "','" + v03 + "','"
                + v04 + "','" + v05 + "','" + v06 + "','" + v07 + "','" + v08 + "','" + v09 + "','" + v10 + "','" + v11
                + "','" + v12 + "','" + historia + "'," + lopd_ori + ",'" + lopd_Otr_O + "','" + lopd_Ces + "','"
                + lopd_Otr_C + "'," + pro_idioma + "," + moneda + ",'" + avi_Ped + "','" + avi_Alb + "','" + avi_Fac
                + "','" + avi_Rec + "','" + actividad + "','" + contrato + "'," + fec_Eval + ",'" + res_Eval + "',"
                + fec_Apro + "," + nota_Eval + ",'" + product1 + "','" + product2 + "','" + obs_Cal + "','" + cer_Cal
                + "','" + cer_Med + "','" + cer_Pre + "'," + perval + "," + diasmax + ",'" + autof + "'," + tip_Rem
                + ",'" + cri_Caja + "')";
    }

    public String toUpdate() {
        return "UPDATE PROVEE SET nom='" + nom + "',dir='" + dir + "',npro=" + npro + ",pob='" + pob
                + "',pro='" + pro + "',nif='" + nif + "',te1='" + te1 + "',te2='" + te2 + "',fax='" + fax + "',mov='"
                + mov + "',ter='" + ter + "',per='" + per + "',car='" + car + "',[for]=" + forpag + ",dto=" + dto
                + ",red='" + red + "',por='" + por + "',poa='" + poa + "',ctg='" + ctg + "',mar='" + mar + "',dt2="
                + dt2 + ",di1=" + di1 + ",di2=" + di2 + ",di3=" + di3 + ",mnp=" + mnp + ",tia='" + tia + "',tre=" + tre
                + ",ret=" + ret + ",ob1='" + ob1 + "',ob2='" + ob2 + "',ob3='" + ob3 + "',web='" + web + "',ext='" + ext
                + "',rediva1=" + rediva1 + ",rediva2=" + rediva2 + ",rediva3=" + rediva3 + ",rediva4=" + rediva4
                + ",rediva5=" + rediva5 + ",avi0ped=" + avi0ped + ",avi1ped='" + avi1ped + "',avi2ped='" + avi2ped
                + "',avi0alb=" + avi0alb + ",avi1alb='" + avi1alb + "',avi2alb='" + avi2alb + "',avi0fac=" + avi0fac
                + ",avi1fac='" + avi1fac + "',avi2fac='" + avi2fac + "',avi0rec=" + avi0rec + ",avi1rec='" + avi1rec
                + "',avi2rec='" + avi2rec + "',ivainc='" + ivainc + "',fot='" + fot + "',doc='" + doc + "',pais=" + pais
                + ",xxx='" + xxx + "',imprap=" + imprap + ",dtorap=" + dtorap + ",perrap=" + perrap + ",v01='" + v01
                + "',v02='" + v02 + "',v03='" + v03 + "',v04='" + v04 + "',v05='" + v05 + "',v06='" + v06 + "',v07='"
                + v07 + "',v08='" + v08 + "',v09='" + v09 + "',v10='" + v10 + "',v11='" + v11 + "',v12='" + v12
                + "',historia='" + historia + "',lopd_ori=" + lopd_ori + ",lopd_otr_o='" + lopd_Otr_O + "',lopd_ces='"
                + lopd_Ces + "',lopd_otr_c='" + lopd_Otr_C + "',pro_idioma=" + pro_idioma + ",moneda=" + moneda
                + ",avi_ped='" + avi_Ped + "',avi_alb='" + avi_Alb + "',avi_fac='" + avi_Fac + "',avi_rec='" + avi_Rec
                + "',actividad='" + actividad + "',contrato='" + contrato + "',fec_eval=" + fec_Eval + ",res_eval='"
                + res_Eval + "',fec_apro=" + fec_Apro + ",nota_eval=" + nota_Eval + ",product1='" + product1
                + "',product2='" + product2 + "',obs_cal='" + obs_Cal + "',cer_cal='" + cer_Cal + "',cer_med='"
                + cer_Med + "',cer_pre='" + cer_Pre + "',perval=" + perval + ",diasmax=" + diasmax + ",autof='" + autof
                + "',tip_rem=" + tip_Rem + ",cri_caja='" + cri_Caja + "' WHERE cod='" + cod + "';";
    }
}
