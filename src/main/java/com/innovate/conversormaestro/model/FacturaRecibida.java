package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ExcelController;

public class FacturaRecibida {
    private String num = "";
    private String fea = "NULL";
    private String doc = "";
    private String nuf = "";
    private String fee = "NULL";
    private String gas = "01";
    private String cue = "";
    private String li1 = "";
    private String li2 = "";
    private float dt1 = 0.00f;
    private float dt2 = 0.00f;
    private String fuc = "NULL";
    private String forpag = "01";
    private float fin = 0.00f;
    private String alm = "01";
    private String com = "";
    private String nom = "";
    private String nif = "";
    private String tra = "";
    private float ba1eu = 0.000f;
    private float iv1eu = 0.000f;
    private float re1eu = 0.000f;
    private float ba2eu = 0.000f;
    private float iv2eu = 0.000f;
    private float re2eu = 0.000f;
    private float ba3eu = 0.000f;
    private float iv3eu = 0.000f;
    private float re3eu = 0.000f;
    private float ba4eu = 0.000f;
    private float iv4eu = 0.000f;
    private float re4eu = 0.000f;
    private float ba5eu = 0.000f;
    private float iv5eu = 0.000f;
    private float re5eu = 0.000f;
    private float exeeu = 0.000f;
    private float ulceu = 0.000f;
    private float toceu = 0.000f;
    private float enteu = 0.000f;
    private float imceu = 0.000f;
    private float imreu = 0.000f;
    private int tre = 0;
    private float pre = 0.00f;
    private float ireeu = 0.000f;
    private String ivainc = "N";
    private float entped = 0.000f;
    private String tip = "D";
    private String aut = "";
    private int negativa = 0;
    private String fecope = "NULL";
    private String mod303 = "";
    private String mod303a = "";
    private String mod303b = "";
    private String mod303c = "";
    private String mod347 = "";
    private int usuario_bloqueo = 0;
    private String rec_deb_pag = "D";
    private String rec_incluir = "N";
    private String rec_antes_dto = "N";
    private String rec_iva_inc = "N";
    private int moneda = 1;
    private float cotiza = 1.000000f;
    private float basmon = 0.000f;
    private float totmon = 0.000f;
    private float entmon = 0.000f;
    private String obs_doc = "";
    private String recargo = "N";
    private int diasmax = 0;
    private String fecini = "NULL";
    private float suplidos = 0.000000f;
    private float iva1 = 0.00f;
    private float iva2 = 0.00f;
    private float iva3 = 0.00f;
    private float iva4 = 0.00f;
    private float iva5 = 0.00f;
    private float rec1 = 0.00f;
    private float rec2 = 0.00f;
    private float rec3 = 0.00f;
    private float rec4 = 0.00f;
    private float rec5 = 0.00f;
    private String tipivaok = "s";
    private String exento = "N";
    private String cri_caja = "N";
    private String ded_cie = "";
    private String siiest = "";
    private String siiact = "";
    private String siitipfra = "";
    private String siifrarec = "";
    private String siitiprec = "";
    private String siidesfra = "";
    private String siinifemi = "";
    private float siicuoded = 0.000000f;
    private String siifecper = "NULL";
    private String siidatrec = "";
    private String siidatagr = "";
    private float siibasrec = 0.000000f;
    private float siicuorec = 0.000000f;
    private float siirecrec = 0.000000f;
    private float siibascos = 0.000000f;
    private String siiiss = "";
    private String siidatdes = "";
    private String siifrarec1 = "";
    private String siifrarec2 = "";
    private String siinumacu = "";
    private String siinumresf = "";
    private String siidesman = "";
    private String patron = "";
    private String siirefext = "";
    private String siinomensu = "";
    private String siinifensu = "";
    private String siifraiden = "";
    private String siimacro = "";
    private String siiregprev = "";
    private String aeattipfac = "";
    private String aeattipgas = "";
    private float aeatimpcon = 0.000000f;

    public String getNum() {
        return this.num;
    }

    public String getFea() {
        return this.fea;
    }

    public String getDoc() {
        return this.doc;
    }

    public String getNuf() {
        return this.nuf;
    }

    public String getFee() {
        return this.fee;
    }

    public String getGas() {
        return this.gas;
    }

    public String getCue() {
        return this.cue;
    }

    public String getLi1() {
        return this.li1;
    }

    public String getLi2() {
        return this.li2;
    }

    public float getDt1() {
        return this.dt1;
    }

    public float getDt2() {
        return this.dt2;
    }

    public String getFuc() {
        return this.fuc;
    }

    public String getforpag() {
        return this.forpag;
    }

    public float getFin() {
        return this.fin;
    }

    public String getAlm() {
        return this.alm;
    }

    public String getCom() {
        return this.com;
    }

    public String getNom() {
        return this.nom;
    }

    public String getNif() {
        return this.nif;
    }

    public String getTra() {
        return this.tra;
    }

    public float getBa1Eu() {
        return this.ba1eu;
    }

    public float getIv1Eu() {
        return this.iv1eu;
    }

    public float getRe1Eu() {
        return this.re1eu;
    }

    public float getBa2Eu() {
        return this.ba2eu;
    }

    public float getIv2Eu() {
        return this.iv2eu;
    }

    public float getRe2Eu() {
        return this.re2eu;
    }

    public float getBa3Eu() {
        return this.ba3eu;
    }

    public float getIv3Eu() {
        return this.iv3eu;
    }

    public float getRe3Eu() {
        return this.re3eu;
    }

    public float getBa4Eu() {
        return this.ba4eu;
    }

    public float getIv4Eu() {
        return this.iv4eu;
    }

    public float getRe4Eu() {
        return this.re4eu;
    }

    public float getBa5Eu() {
        return this.ba5eu;
    }

    public float getIv5Eu() {
        return this.iv5eu;
    }

    public float getRe5Eu() {
        return this.re5eu;
    }

    public float getExeeu() {
        return this.exeeu;
    }

    public float getUlceu() {
        return this.ulceu;
    }

    public float getToceu() {
        return this.toceu;
    }

    public float getEnteu() {
        return this.enteu;
    }

    public float getImceu() {
        return this.imceu;
    }

    public float getImreu() {
        return this.imreu;
    }

    public int getTre() {
        return this.tre;
    }

    public float getPre() {
        return this.pre;
    }

    public float getIreeu() {
        return this.ireeu;
    }

    public String getIvainc() {
        return this.ivainc;
    }

    public float getEntped() {
        return this.entped;
    }

    public String getTip() {
        return this.tip;
    }

    public String getAut() {
        return this.aut;
    }

    public int getNegativa() {
        return this.negativa;
    }

    public String getFecope() {
        return this.fecope;
    }

    public String getMod303() {
        return this.mod303;
    }

    public String getMod303A() {
        return this.mod303a;
    }

    public String getMod303B() {
        return this.mod303b;
    }

    public String getMod303C() {
        return this.mod303c;
    }

    public String getMod347() {
        return this.mod347;
    }

    public int getUsuario_Bloqueo() {
        return this.usuario_bloqueo;
    }

    public String getRec_Deb_Pag() {
        return this.rec_deb_pag;
    }

    public String getRec_Incluir() {
        return this.rec_incluir;
    }

    public String getRec_Antes_Dto() {
        return this.rec_antes_dto;
    }

    public String getRec_Iva_Inc() {
        return this.rec_iva_inc;
    }

    public int getMoneda() {
        return this.moneda;
    }

    public float getCotiza() {
        return this.cotiza;
    }

    public float getBasmon() {
        return this.basmon;
    }

    public float getTotmon() {
        return this.totmon;
    }

    public float getEntmon() {
        return this.entmon;
    }

    public String getObs_Doc() {
        return this.obs_doc;
    }

    public String getRecargo() {
        return this.recargo;
    }

    public int getDiasmax() {
        return this.diasmax;
    }

    public String getFecini() {
        return this.fecini;
    }

    public float getSuplidos() {
        return this.suplidos;
    }

    public float getIva1() {
        return this.iva1;
    }

    public float getIva2() {
        return this.iva2;
    }

    public float getIva3() {
        return this.iva3;
    }

    public float getIva4() {
        return this.iva4;
    }

    public float getIva5() {
        return this.iva5;
    }

    public float getRec1() {
        return this.rec1;
    }

    public float getRec2() {
        return this.rec2;
    }

    public float getRec3() {
        return this.rec3;
    }

    public float getRec4() {
        return this.rec4;
    }

    public float getRec5() {
        return this.rec5;
    }

    public String getTipivaok() {
        return this.tipivaok;
    }

    public String getExento() {
        return this.exento;
    }

    public String getCri_Caja() {
        return this.cri_caja;
    }

    public String getDed_Cie() {
        return this.ded_cie;
    }

    public String getSiiest() {
        return this.siiest;
    }

    public String getSiiact() {
        return this.siiact;
    }

    public String getSiitipfra() {
        return this.siitipfra;
    }

    public String getSiifrarec() {
        return this.siifrarec;
    }

    public String getSiitiprec() {
        return this.siitiprec;
    }

    public String getSiidesfra() {
        return this.siidesfra;
    }

    public String getSiinifemi() {
        return this.siinifemi;
    }

    public float getSiicuoded() {
        return this.siicuoded;
    }

    public String getSiifecper() {
        return this.siifecper;
    }

    public String getSiidatrec() {
        return this.siidatrec;
    }

    public String getSiidatagr() {
        return this.siidatagr;
    }

    public float getSiibasrec() {
        return this.siibasrec;
    }

    public float getSiicuorec() {
        return this.siicuorec;
    }

    public float getSiirecrec() {
        return this.siirecrec;
    }

    public float getSiibascos() {
        return this.siibascos;
    }

    public String getSiiiss() {
        return this.siiiss;
    }

    public String getSiidatdes() {
        return this.siidatdes;
    }

    public String getSiifrarec1() {
        return this.siifrarec1;
    }

    public String getSiifrarec2() {
        return this.siifrarec2;
    }

    public String getSiinumacu() {
        return this.siinumacu;
    }

    public String getSiinumresf() {
        return this.siinumresf;
    }

    public String getSiidesman() {
        return this.siidesman;
    }

    public String getPatron() {
        return this.patron;
    }

    public String getSiirefext() {
        return this.siirefext;
    }

    public String getSiinomensu() {
        return this.siinomensu;
    }

    public String getSiinifensu() {
        return this.siinifensu;
    }

    public String getSiifraiden() {
        return this.siifraiden;
    }

    public String getSiimacro() {
        return this.siimacro;
    }

    public String getSiiregprev() {
        return this.siiregprev;
    }

    public String getAeattipfac() {
        return this.aeattipfac;
    }

    public String getAeattipgas() {
        return this.aeattipgas;
    }

    public float getAeatimpcon() {
        return this.aeatimpcon;
    }

    public void setNum(String num) {
        if (num.length() > 9) {
            this.num = num.trim().substring(0, 9).replace("'", "");
        } else {
            this.num = num.replace("'", "");
        }
    }

    public void setFea(String fea) {
        if (fea != null) {
            this.fea = "'" + fea + "'";
        } else {
            this.fea = "NULL";
        }
    }

    public void setDoc(String doc) {
        if (doc.length() > 6) {
            this.doc = doc.trim().substring(0, 6).replace("'", "");
        } else {
            this.doc = doc.replace("'", "");
        }
    }

    public void setNuf(String nuf) {
        if (nuf.length() > 60) {
            this.nuf = nuf.trim().substring(0, 60).replace("'", "");
        } else {
            this.nuf = nuf.replace("'", "");
        }
    }

    public void setFee(String fee) {
        if (fee != null) {
            this.fee = "'" + fee + "'";
        } else {
            this.fee = "NULL";
        }
    }

    public void setGas(String gas) {
        if (gas.length() > 2) {
            this.gas = gas.trim().substring(0, 2).replace("'", "");
        } else {
            this.gas = gas.replace("'", "");
        }
    }

    public void setCue(String cue) {
        if (cue.length() > 12) {
            this.cue = cue.trim().substring(0, 12).replace("'", "");
        } else {
            this.cue = cue.replace("'", "");
        }
    }

    public void setLi1(String li1) {
        if (li1.length() > 80) {
            this.li1 = li1.trim().substring(0, 80).replace("'", "");
        } else {
            this.li1 = li1.replace("'", "");
        }
    }

    public void setLi2(String li2) {
        if (li2.length() > 80) {
            this.li2 = li2.trim().substring(0, 80).replace("'", "");
        } else {
            this.li2 = li2.replace("'", "");
        }
    }

    public void setDt1(float dt1) {
        this.dt1 = dt1;
    }

    public void setDt2(float dt2) {
        this.dt2 = dt2;
    }

    public void setFuc(String fuc) {
        if (fuc != null) {
            this.fuc = "'" + fuc + "'";
        } else {
            this.fuc = "NULL";
        }
    }

    public void setforpag(String forpag) {
        if (forpag.length() > 2) {
            this.forpag = forpag.trim().substring(0, 2).replace("'", "");
        } else {
            this.forpag = forpag.replace("'", "");
        }
    }

    public void setFin(float fin) {
        this.fin = fin;
    }

    public void setAlm(String alm) {
        if (alm.length() > 2) {
            this.alm = alm.trim().substring(0, 2).replace("'", "");
        } else {
            this.alm = alm.replace("'", "");
        }
    }

    public void setCom(String com) {
        if (com.length() > 1) {
            this.com = com.trim().substring(0, 1).replace("'", "");
        } else {
            this.com = com.replace("'", "");
        }
    }

    public void setNom(String nom) {
        if (nom.length() > 50) {
            this.nom = nom.trim().substring(0, 50).replace("'", "");
        } else {
            this.nom = nom.replace("'", "");
        }
    }

    public void setNif(String nif) {
        if (nif.length() > 15) {
            this.nif = nif.trim().substring(0, 15).replace("'", "");
        } else {
            this.nif = nif.replace("'", "");
        }
    }

    public void setTra(String tra) {
        if (tra.length() > 6) {
            this.tra = tra.trim().substring(0, 6).replace("'", "");
        } else {
            this.tra = tra.replace("'", "");
        }
    }

    public void setBa1Eu(float ba1eu) {
        this.ba1eu = ba1eu;
    }

    public void setIv1Eu(float iv1eu) {
        this.iv1eu = iv1eu;
    }

    public void setRe1Eu(float re1eu) {
        this.re1eu = re1eu;
    }

    public void setBa2Eu(float ba2eu) {
        this.ba2eu = ba2eu;
    }

    public void setIv2Eu(float iv2eu) {
        this.iv2eu = iv2eu;
    }

    public void setRe2Eu(float re2eu) {
        this.re2eu = re2eu;
    }

    public void setBa3Eu(float ba3eu) {
        this.ba3eu = ba3eu;
    }

    public void setIv3Eu(float iv3eu) {
        this.iv3eu = iv3eu;
    }

    public void setRe3Eu(float re3eu) {
        this.re3eu = re3eu;
    }

    public void setBa4Eu(float ba4eu) {
        this.ba4eu = ba4eu;
    }

    public void setIv4Eu(float iv4eu) {
        this.iv4eu = iv4eu;
    }

    public void setRe4Eu(float re4eu) {
        this.re4eu = re4eu;
    }

    public void setBa5Eu(float ba5eu) {
        this.ba5eu = ba5eu;
    }

    public void setIv5Eu(float iv5eu) {
        this.iv5eu = iv5eu;
    }

    public void setRe5Eu(float re5eu) {
        this.re5eu = re5eu;
    }

    public void setExeeu(float exeeu) {
        this.exeeu = exeeu;
    }

    public void setUlceu(float ulceu) {
        this.ulceu = ulceu;
    }

    public void setToceu(float toceu) {
        this.toceu = toceu;
    }

    public void setEnteu(float enteu) {
        this.enteu = enteu;
    }

    public void setImceu(float imceu) {
        this.imceu = imceu;
    }

    public void setImreu(float imreu) {
        this.imreu = imreu;
    }

    public void setTre(int tre) {
        this.tre = tre;
    }

    public void setPre(float pre) {
        this.pre = pre;
    }

    public void setIreeu(float ireeu) {
        this.ireeu = ireeu;
    }

    public void setIvainc(String ivainc) {
        if (ivainc.length() > 1) {
            this.ivainc = ivainc.trim().substring(0, 1).replace("'", "");
        } else {
            this.ivainc = ivainc.replace("'", "");
        }
    }

    public void setEntped(float entped) {
        this.entped = entped;
    }

    public void setTip(String tip) {
        if (tip.length() > 1) {
            this.tip = tip.trim().substring(0, 1).replace("'", "");
        } else {
            this.tip = tip.replace("'", "");
        }
    }

    public void setAut(String aut) {
        if (aut.length() > 12) {
            this.aut = aut.trim().substring(0, 12).replace("'", "");
        } else {
            this.aut = aut.replace("'", "");
        }
    }

    public void setNegativa(int negativa) {
        this.negativa = negativa;
    }

    public void setFecope(String fecope) {
        if (fecope != null) {
            this.fecope = "'" + fecope + "'";
        } else {
            this.fecope = "NULL";
        }
    }

    public void setMod303(String mod303) {
        if (mod303.length() > 1) {
            this.mod303 = mod303.trim().substring(0, 1).replace("'", "");
        } else {
            this.mod303 = mod303.replace("'", "");
        }
    }

    public void setMod303A(String mod303a) {
        if (mod303a.length() > 1) {
            this.mod303a = mod303a.trim().substring(0, 1).replace("'", "");
        } else {
            this.mod303a = mod303a.replace("'", "");
        }
    }

    public void setMod303B(String mod303b) {
        if (mod303b.length() > 1) {
            this.mod303b = mod303b.trim().substring(0, 1).replace("'", "");
        } else {
            this.mod303b = mod303b.replace("'", "");
        }
    }

    public void setMod303C(String mod303c) {
        if (mod303c.length() > 1) {
            this.mod303c = mod303c.trim().substring(0, 1).replace("'", "");
        } else {
            this.mod303c = mod303c.replace("'", "");
        }
    }

    public void setMod347(String mod347) {
        if (mod347.length() > 1) {
            this.mod347 = mod347.trim().substring(0, 1).replace("'", "");
        } else {
            this.mod347 = mod347.replace("'", "");
        }
    }

    public void setUsuario_Bloqueo(int usuario_bloqueo) {
        this.usuario_bloqueo = usuario_bloqueo;
    }

    public void setRec_Deb_Pag(String rec_deb_pag) {
        if (rec_deb_pag.length() > 1) {
            this.rec_deb_pag = rec_deb_pag.trim().substring(0, 1).replace("'", "");
        } else {
            this.rec_deb_pag = rec_deb_pag.replace("'", "");
        }
    }

    public void setRec_Incluir(String rec_incluir) {
        if (rec_incluir.length() > 1) {
            this.rec_incluir = rec_incluir.trim().substring(0, 1).replace("'", "");
        } else {
            this.rec_incluir = rec_incluir.replace("'", "");
        }
    }

    public void setRec_Antes_Dto(String rec_antes_dto) {
        if (rec_antes_dto.length() > 1) {
            this.rec_antes_dto = rec_antes_dto.trim().substring(0, 1).replace("'", "");
        } else {
            this.rec_antes_dto = rec_antes_dto.replace("'", "");
        }
    }

    public void setRec_Iva_Inc(String rec_iva_inc) {
        if (rec_iva_inc.length() > 1) {
            this.rec_iva_inc = rec_iva_inc.trim().substring(0, 1).replace("'", "");
        } else {
            this.rec_iva_inc = rec_iva_inc.replace("'", "");
        }
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public void setCotiza(float cotiza) {
        this.cotiza = cotiza;
    }

    public void setBasmon(float basmon) {
        this.basmon = basmon;
    }

    public void setTotmon(float totmon) {
        this.totmon = totmon;
    }

    public void setEntmon(float entmon) {
        this.entmon = entmon;
    }

    public void setObs_Doc(String obs_doc) {
        this.obs_doc = obs_doc;
    }

    public void setRecargo(String recargo) {
        if (recargo.length() > 1) {
            this.recargo = recargo.trim().substring(0, 1).replace("'", "");
        } else {
            this.recargo = recargo.replace("'", "");
        }
    }

    public void setDiasmax(int diasmax) {
        this.diasmax = diasmax;
    }

    public void setFecini(String fecini) {
        if (fecini != null) {
            this.fecini = "'" + fecini + "'";
        } else {
            this.fecini = "NULL";
        }
    }

    public void setSuplidos(float suplidos) {
        this.suplidos = suplidos;
    }

    public void setIva1(float iva1) {
        this.iva1 = iva1;
    }

    public void setIva2(float iva2) {
        this.iva2 = iva2;
    }

    public void setIva3(float iva3) {
        this.iva3 = iva3;
    }

    public void setIva4(float iva4) {
        this.iva4 = iva4;
    }

    public void setIva5(float iva5) {
        this.iva5 = iva5;
    }

    public void setRec1(float rec1) {
        this.rec1 = rec1;
    }

    public void setRec2(float rec2) {
        this.rec2 = rec2;
    }

    public void setRec3(float rec3) {
        this.rec3 = rec3;
    }

    public void setRec4(float rec4) {
        this.rec4 = rec4;
    }

    public void setRec5(float rec5) {
        this.rec5 = rec5;
    }

    public void setTipivaok(String tipivaok) {
        if (tipivaok.length() > 1) {
            this.tipivaok = tipivaok.trim().substring(0, 1).replace("'", "");
        } else {
            this.tipivaok = tipivaok.replace("'", "");
        }
    }

    public void setExento(String exento) {
        if (exento.length() > 1) {
            this.exento = exento.trim().substring(0, 1).replace("'", "");
        } else {
            this.exento = exento.replace("'", "");
        }
    }

    public void setCri_Caja(String cri_caja) {
        if (cri_caja.length() > 1) {
            this.cri_caja = cri_caja.trim().substring(0, 1).replace("'", "");
        } else {
            this.cri_caja = cri_caja.replace("'", "");
        }
    }

    public void setDed_Cie(String ded_cie) {
        if (ded_cie.length() > 1) {
            this.ded_cie = ded_cie.trim().substring(0, 1).replace("'", "");
        } else {
            this.ded_cie = ded_cie.replace("'", "");
        }
    }

    public void setSiiest(String siiest) {
        if (siiest.length() > 1) {
            this.siiest = siiest.trim().substring(0, 1).replace("'", "");
        } else {
            this.siiest = siiest.replace("'", "");
        }
    }

    public void setSiiact(String siiact) {
        if (siiact.length() > 1) {
            this.siiact = siiact.trim().substring(0, 1).replace("'", "");
        } else {
            this.siiact = siiact.replace("'", "");
        }
    }

    public void setSiitipfra(String siitipfra) {
        if (siitipfra.length() > 3) {
            this.siitipfra = siitipfra.trim().substring(0, 3).replace("'", "");
        } else {
            this.siitipfra = siitipfra.replace("'", "");
        }
    }

    public void setSiifrarec(String siifrarec) {
        if (siifrarec.length() > 3) {
            this.siifrarec = siifrarec.trim().substring(0, 3).replace("'", "");
        } else {
            this.siifrarec = siifrarec.replace("'", "");
        }
    }

    public void setSiitiprec(String siitiprec) {
        if (siitiprec.length() > 3) {
            this.siitiprec = siitiprec.trim().substring(0, 3).replace("'", "");
        } else {
            this.siitiprec = siitiprec.replace("'", "");
        }
    }

    public void setSiidesfra(String siidesfra) {
        if (siidesfra.length() > 3) {
            this.siidesfra = siidesfra.trim().substring(0, 3).replace("'", "");
        } else {
            this.siidesfra = siidesfra.replace("'", "");
        }
    }

    public void setSiinifemi(String siinifemi) {
        if (siinifemi.length() > 9) {
            this.siinifemi = siinifemi.trim().substring(0, 9).replace("'", "");
        } else {
            this.siinifemi = siinifemi.replace("'", "");
        }
    }

    public void setSiicuoded(float siicuoded) {
        this.siicuoded = siicuoded;
    }

    public void setSiifecper(String siifecper) {
        if (siifecper != null) {
            this.siifecper = "'" + siifecper + "'";
        } else {
            this.siifecper = "NULL";
        }
    }

    public void setSiidatrec(String siidatrec) {
        this.siidatrec = siidatrec;
    }

    public void setSiidatagr(String siidatagr) {
        this.siidatagr = siidatagr;
    }

    public void setSiibasrec(float siibasrec) {
        this.siibasrec = siibasrec;
    }

    public void setSiicuorec(float siicuorec) {
        this.siicuorec = siicuorec;
    }

    public void setSiirecrec(float siirecrec) {
        this.siirecrec = siirecrec;
    }

    public void setSiibascos(float siibascos) {
        this.siibascos = siibascos;
    }

    public void setSiiiss(String siiiss) {
        this.siiiss = siiiss;
    }

    public void setSiidatdes(String siidatdes) {
        this.siidatdes = siidatdes;
    }

    public void setSiifrarec1(String siifrarec1) {
        if (siifrarec1.length() > 3) {
            this.siifrarec1 = siifrarec1.trim().substring(0, 3).replace("'", "");
        } else {
            this.siifrarec1 = siifrarec1.replace("'", "");
        }
    }

    public void setSiifrarec2(String siifrarec2) {
        if (siifrarec2.length() > 3) {
            this.siifrarec2 = siifrarec2.trim().substring(0, 3).replace("'", "");
        } else {
            this.siifrarec2 = siifrarec2.replace("'", "");
        }
    }

    public void setSiinumacu(String siinumacu) {
        if (siinumacu.length() > 15) {
            this.siinumacu = siinumacu.trim().substring(0, 15).replace("'", "");
        } else {
            this.siinumacu = siinumacu.replace("'", "");
        }
    }

    public void setSiinumresf(String siinumresf) {
        if (siinumresf.length() > 60) {
            this.siinumresf = siinumresf.trim().substring(0, 60).replace("'", "");
        } else {
            this.siinumresf = siinumresf.replace("'", "");
        }
    }

    public void setSiidesman(String siidesman) {
        this.siidesman = siidesman;
    }

    public void setPatron(String patron) {
        if (patron.length() > 3) {
            this.patron = patron.trim().substring(0, 3).replace("'", "");
        } else {
            this.patron = patron.replace("'", "");
        }
    }

    public void setSiirefext(String siirefext) {
        if (siirefext.length() > 60) {
            this.siirefext = siirefext.trim().substring(0, 60).replace("'", "");
        } else {
            this.siirefext = siirefext.replace("'", "");
        }
    }

    public void setSiinomensu(String siinomensu) {
        if (siinomensu.length() > 120) {
            this.siinomensu = siinomensu.trim().substring(0, 120).replace("'", "");
        } else {
            this.siinomensu = siinomensu.replace("'", "");
        }
    }

    public void setSiinifensu(String siinifensu) {
        if (siinifensu.length() > 9) {
            this.siinifensu = siinifensu.trim().substring(0, 9).replace("'", "");
        } else {
            this.siinifensu = siinifensu.replace("'", "");
        }
    }

    public void setSiifraiden(String siifraiden) {
        if (siifraiden.length() > 1) {
            this.siifraiden = siifraiden.trim().substring(0, 1).replace("'", "");
        } else {
            this.siifraiden = siifraiden.replace("'", "");
        }
    }

    public void setSiimacro(String siimacro) {
        if (siimacro.length() > 1) {
            this.siimacro = siimacro.trim().substring(0, 1).replace("'", "");
        } else {
            this.siimacro = siimacro.replace("'", "");
        }
    }

    public void setSiiregprev(String siiregprev) {
        if (siiregprev.length() > 1) {
            this.siiregprev = siiregprev.trim().substring(0, 1).replace("'", "");
        } else {
            this.siiregprev = siiregprev.replace("'", "");
        }
    }

    public void setAeattipfac(String aeattipfac) {
        if (aeattipfac.length() > 3) {
            this.aeattipfac = aeattipfac.trim().substring(0, 3).replace("'", "");
        } else {
            this.aeattipfac = aeattipfac.replace("'", "");
        }
    }

    public void setAeattipgas(String aeattipgas) {
        if (aeattipgas.length() > 3) {
            this.aeattipgas = aeattipgas.trim().substring(0, 3).replace("'", "");
        } else {
            this.aeattipgas = aeattipgas.replace("'", "");
        }
    }

    public void setAeatimpcon(float aeatimpcon) {
        this.aeatimpcon = aeatimpcon;
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
        return "INSERT INTO FACREC (num,fea,doc,nuf,fee,gas,cue,li1,li2,dt1,dt2,fuc,[for],fin,alm,com,nom,nif,tra,ba1eu,iv1eu,"
                +
                "re1eu,ba2eu,iv2eu,re2eu,ba3eu,iv3eu,re3eu,ba4eu,iv4eu,re4eu,ba5eu,iv5eu,re5eu,exeeu,ulceu,toceu,enteu,imceu,imreu,tre,"
                +
                "pre,ireeu,ivainc,entped,tip,aut,negativa,fecope,mod303,mod303a,mod303b,mod303c,mod347,usuario_bloqueo,rec_deb_pag,"
                +
                "rec_incluir,rec_antes_dto,rec_iva_inc,moneda,cotiza,basmon,totmon,entmon,obs_doc,recargo,diasmax,fecini,suplidos,iva1,"
                +
                "iva2,iva3,iva4,iva5,rec1,rec2,rec3,rec4,rec5,tipivaok,exento,cri_caja,ded_cie,siiest,siiact,siitipfra,siifrarec,siitiprec,"
                +
                "siidesfra,siinifemi,siicuoded,siifecper,siidatrec,siidatagr,siibasrec,siicuorec,siirecrec,siibascos,siiiss,siidatdes,"
                +
                "siifrarec1,siifrarec2,siinumacu,siinumresf,siidesman,patron,siirefext,siinomensu,siinifensu,siifraiden,siimacro,siiregprev,"
                +
                "aeattipfac,aeattipgas,aeatimpcon) VALUES "
                +
                "('" + num + "'," + fea + ",'" + doc + "','" + nuf + "'," + fee + ",'" + gas + "','" + cue + "','"
                + li1 + "','" + li2 + "'," + dt1 + "," + dt2 + "," + fuc + ",'" + forpag + "'," + fin + ",'" + alm
                + "','" + com + "','" + nom + "','" + nif + "','" + tra + "'," + ba1eu + "," + iv1eu + "," + re1eu + ","
                + ba2eu + "," + iv2eu + "," + re2eu + "," + ba3eu + "," + iv3eu + "," + re3eu + "," + ba4eu + ","
                + iv4eu + "," + re4eu + "," + ba5eu + "," + iv5eu + "," + re5eu + "," + exeeu + "," + ulceu + ","
                + toceu + "," + enteu + "," + imceu + "," + imreu + "," + tre + "," + pre + "," + ireeu + ",'" + ivainc
                + "'," + entped + ",'" + tip + "','" + aut + "'," + negativa + "," + fecope + ",'" + mod303 + "','"
                + mod303a + "','" + mod303b + "','" + mod303c + "','" + mod347 + "'," + usuario_bloqueo + ",'"
                + rec_deb_pag + "','" + rec_incluir + "','" + rec_antes_dto + "','" + rec_iva_inc + "'," + moneda + ","
                + cotiza + "," + basmon + "," + totmon + "," + entmon + ",'" + obs_doc + "','" + recargo + "',"
                + diasmax + "," + fecini + "," + suplidos + "," + iva1 + "," + iva2 + "," + iva3 + "," + iva4 + ","
                + iva5 + "," + rec1 + "," + rec2 + "," + rec3 + "," + rec4 + "," + rec5 + ",'" + tipivaok + "','"
                + exento + "','" + cri_caja + "','" + ded_cie + "','" + siiest + "','" + siiact + "','" + siitipfra
                + "','" + siifrarec + "','" + siitiprec + "','" + siidesfra + "','" + siinifemi + "'," + siicuoded
                + "," + siifecper + ",'" + siidatrec + "','" + siidatagr + "'," + siibasrec + "," + siicuorec + ","
                + siirecrec + "," + siibascos + ",'" + siiiss + "','" + siidatdes + "','" + siifrarec1 + "','"
                + siifrarec2 + "','" + siinumacu + "','" + siinumresf + "','" + siidesman + "','" + patron + "','"
                + siirefext + "','" + siinomensu + "','" + siinifensu + "','" + siifraiden + "','" + siimacro + "','"
                + siiregprev + "','" + aeattipfac + "','" + aeattipgas + "'," + aeatimpcon + ")";
    }

    public String toUpdate() {
        return "UPDATE FACREC SET fea=" + fea + ",doc='" + doc + "',nuf='" + nuf + "',fee=" + fee
                + ",gas='" + gas + "',cue='" + cue + "',li1='" + li1 + "',li2='" + li2 + "',dt1=" + dt1 + ",dt2=" + dt2
                + ",fuc=" + fuc + ",[for]='" + forpag + "',fin=" + fin + ",alm='" + alm + "',com='" + com + "',nom='"
                + nom + "',nif='" + nif + "',tra='" + tra + "',ba1eu=" + ba1eu + ",iv1eu=" + iv1eu + ",re1eu=" + re1eu
                + ",ba2eu=" + ba2eu + ",iv2eu=" + iv2eu + ",re2eu=" + re2eu + ",ba3eu=" + ba3eu + ",iv3eu=" + iv3eu
                + ",re3eu=" + re3eu + ",ba4eu=" + ba4eu + ",iv4eu=" + iv4eu + ",re4eu=" + re4eu + ",ba5eu=" + ba5eu
                + ",iv5eu=" + iv5eu + ",re5eu=" + re5eu + ",exeeu=" + exeeu + ",ulceu=" + ulceu + ",toceu=" + toceu
                + ",enteu=" + enteu + ",imceu=" + imceu + ",imreu=" + imreu + ",tre=" + tre + ",pre=" + pre + ",ireeu="
                + ireeu + ",ivainc='" + ivainc + "',entped=" + entped + ",tip='" + tip + "',aut='" + aut + "',negativa="
                + negativa + ",fecope=" + fecope + ",mod303='" + mod303 + "',mod303a='" + mod303a + "',mod303b='"
                + mod303b + "',mod303c='" + mod303c + "',mod347='" + mod347 + "',usuario_bloqueo=" + usuario_bloqueo
                + ",rec_deb_pag='" + rec_deb_pag + "',rec_incluir='" + rec_incluir + "',rec_antes_dto='" + rec_antes_dto
                + "',rec_iva_inc='" + rec_iva_inc + "',moneda=" + moneda + ",cotiza=" + cotiza + ",basmon=" + basmon
                + ",totmon=" + totmon + ",entmon=" + entmon + ",obs_doc='" + obs_doc + "',recargo='" + recargo
                + "',diasmax=" + diasmax + ",fecini=" + fecini + ",suplidos=" + suplidos + ",iva1=" + iva1 + ",iva2="
                + iva2 + ",iva3=" + iva3 + ",iva4=" + iva4 + ",iva5=" + iva5 + ",rec1=" + rec1 + ",rec2=" + rec2
                + ",rec3=" + rec3 + ",rec4=" + rec4 + ",rec5=" + rec5 + ",tipivaok='" + tipivaok + "',exento='" + exento
                + "',cri_caja='" + cri_caja + "',ded_cie='" + ded_cie + "',siiest='" + siiest + "',siiact='" + siiact
                + "',siitipfra='" + siitipfra + "',siifrarec='" + siifrarec + "',siitiprec='" + siitiprec
                + "',siidesfra='" + siidesfra + "',siinifemi='" + siinifemi + "',siicuoded=" + siicuoded
                + ",siifecper=" + siifecper + ",siidatrec='" + siidatrec + "',siidatagr='" + siidatagr
                + "',siibasrec=" + siibasrec + ",siicuorec=" + siicuorec + ",siirecrec=" + siirecrec + ",siibascos="
                + siibascos + ",siiiss='" + siiiss + "',siidatdes='" + siidatdes + "',siifrarec1='" + siifrarec1
                + "',siifrarec2='" + siifrarec2 + "',siinumacu='" + siinumacu + "',siinumresf='" + siinumresf
                + "',siidesman='" + siidesman + "',patron='" + patron + "',siirefext='" + siirefext + "',siinomensu='"
                + siinomensu + "',siinifensu='" + siinifensu + "',siifraiden='" + siifraiden + "',siimacro='" + siimacro
                + "',siiregprev='" + siiregprev + "',aeattipfac='" + aeattipfac + "',aeattipgas='" + aeattipgas
                + "',aeatimpcon=" + aeatimpcon + " WHERE num='" + num + "';";
    }

}
