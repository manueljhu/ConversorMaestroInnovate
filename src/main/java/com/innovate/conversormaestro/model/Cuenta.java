package com.innovate.conversormaestro.model;

public class Cuenta {

    public String cue = "";
    public String nom = "";
    public String nif = "";
    public float deb = 0.000f;
    public float hab = 0.000f;
    public String dir = "";
    public String pob = "";
    public int npro = 0;
    public String pro = "";
    public String cont1 = "";
    public String cont2 = "";
    public String cont3 = "";
    public String cont4 = "";
    public String cont5 = "";
    public String cons1 = "";
    public String cons2 = "";
    public String cons3 = "";
    public String cons4 = "";
    public String cons5 = "";
    public String cons6 = "";
    public String cons7 = "";
    public String cons8 = "";
    public String cons9 = "";
    public String cons10 = "";
    public float pais = 1;
    public int gru = 0;
    public String nifr = "";
    public int tdoc = 00;
    public float lopd_Ori = 0;
    public String lopd_Otr_O = "";
    public String lopd_Ces = "";
    public String lopd_Otr_C = "";
    public String cue_Apoyo = "";
    public String lap_Den = "";
    public String lap_Con = "";
    public String lap_Cta = "";
    public String ope_Tip = "";
    public String ope_Cla = "";
    public float ope_Pla = 0;
    public String ope_Des = "";
    public String cta = "";
    public String suf = "";
    public String iban = "";
    public String swift = "";
    public String cri_Caja = "";
    public String siidesfac = "";
    public String patron = "";
    public String patron_Cv = "";

    public Cuenta() {
    }

    public String getCue() {
        return cue;
    }

    public String getNom() {
        return nom;
    }

    public String getNif() {
        return nif;
    }

    public float getDeb() {
        return deb;
    }

    public float getHab() {
        return hab;
    }

    public String getDir() {
        return dir;
    }

    public String getPob() {
        return pob;
    }

    public int getNpro() {
        return npro;
    }

    public String getPro() {
        return pro;
    }

    public String getCont1() {
        return cont1;
    }

    public String getCont2() {
        return cont2;
    }

    public String getCont3() {
        return cont3;
    }

    public String getCont4() {
        return cont4;
    }

    public String getCont5() {
        return cont5;
    }

    public String getCons1() {
        return cons1;
    }

    public String getCons2() {
        return cons2;
    }

    public String getCons3() {
        return cons3;
    }

    public String getCons4() {
        return cons4;
    }

    public String getCons5() {
        return cons5;
    }

    public String getCons6() {
        return cons6;
    }

    public String getCons7() {
        return cons7;
    }

    public String getCons8() {
        return cons8;
    }

    public String getCons9() {
        return cons9;
    }

    public String getCons10() {
        return cons10;
    }

    public float getPais() {
        return pais;
    }

    public int getGru() {
        return gru;
    }

    public String getNifr() {
        return nifr;
    }

    public int getTdoc() {
        return tdoc;
    }

    public float getLopd_Ori() {
        return lopd_Ori;
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

    public String getCue_Apoyo() {
        return cue_Apoyo;
    }

    public String getLap_Den() {
        return lap_Den;
    }

    public String getLap_Con() {
        return lap_Con;
    }

    public String getLap_Cta() {
        return lap_Cta;
    }

    public String getOpe_Tip() {
        return ope_Tip;
    }

    public String getOpe_Cla() {
        return ope_Cla;
    }

    public float getOpe_Pla() {
        return ope_Pla;
    }

    public String getOpe_Des() {
        return ope_Des;
    }

    public String getCta() {
        return cta;
    }

    public String getSuf() {
        return suf;
    }

    public String getIban() {
        return iban;
    }

    public String getSwift() {
        return swift;
    }

    public String getCri_Caja() {
        return cri_Caja;
    }

    public String getSiidesfac() {
        return siidesfac;
    }

    public String getPatron() {
        return patron;
    }

    public String getPatron_Cv() {
        return patron_Cv;
    }

    public void setCue(String cue) {
        if (cue.length() > 12) {
            this.cue = cue.trim().substring(0, 12).replace("'", "");
        } else {
            this.cue = cue.replace("'", "");
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

    public void setDeb(float deb) {
        this.deb = deb;
    }

    public void setHab(float hab) {
        this.hab = hab;
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

    public void setCont1(String cont1) {
        if (cont1.length() > 12) {
            this.cont1 = cont1.trim().substring(0, 12).replace("'", "");
        } else {
            this.cont1 = cont1.replace("'", "");
        }
    }

    public void setCont2(String cont2) {
        if (cont2.length() > 12) {
            this.cont2 = cont2.trim().substring(0, 12).replace("'", "");
        } else {
            this.cont2 = cont2.replace("'", "");
        }
    }

    public void setCont3(String cont3) {
        if (cont3.length() > 12) {
            this.cont3 = cont3.trim().substring(0, 12).replace("'", "");
        } else {
            this.cont3 = cont3.replace("'", "");
        }
    }

    public void setCont4(String cont4) {
        if (cont4.length() > 12) {
            this.cont4 = cont4.trim().substring(0, 12).replace("'", "");
        } else {
            this.cont4 = cont4.replace("'", "");
        }
    }

    public void setCont5(String cont5) {
        if (cont5.length() > 12) {
            this.cont5 = cont5.trim().substring(0, 12).replace("'", "");
        } else {
            this.cont5 = cont5.replace("'", "");
        }
    }

    public void setCons1(String cons1) {
        if (cons1.length() > 12) {
            this.cons1 = cons1.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons1 = cons1.replace("'", "");
        }
    }

    public void setCons2(String cons2) {
        if (cons2.length() > 12) {
            this.cons2 = cons2.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons2 = cons2.replace("'", "");
        }
    }

    public void setCons3(String cons3) {
        if (cons3.length() > 12) {
            this.cons3 = cons3.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons3 = cons3.replace("'", "");
        }
    }

    public void setCons4(String cons4) {
        if (cons4.length() > 12) {
            this.cons4 = cons4.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons4 = cons4.replace("'", "");
        }
    }

    public void setCons5(String cons5) {
        if (cons5.length() > 12) {
            this.cons5 = cons5.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons5 = cons5.replace("'", "");
        }
    }

    public void setCons6(String cons6) {
        if (cons6.length() > 12) {
            this.cons6 = cons6.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons6 = cons6.replace("'", "");
        }
    }

    public void setCons7(String cons7) {
        if (cons7.length() > 12) {
            this.cons7 = cons7.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons7 = cons7.replace("'", "");
        }
    }

    public void setCons8(String cons8) {
        if (cons8.length() > 12) {
            this.cons8 = cons8.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons8 = cons8.replace("'", "");
        }
    }

    public void setCons9(String cons9) {
        if (cons9.length() > 12) {
            this.cons9 = cons9.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons9 = cons9.replace("'", "");
        }
    }

    public void setCons10(String cons10) {
        if (cons10.length() > 12) {
            this.cons10 = cons10.trim().substring(0, 12).replace("'", "");
        } else {
            this.cons10 = cons10.replace("'", "");
        }
    }

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setGru(int gru) {
        this.gru = gru;
    }

    public void setNifr(String nifr) {
        if (nifr.length() > 15) {
            this.nifr = nifr.trim().substring(0, 15).replace("'", "");
        } else {
            this.nifr = nifr.replace("'", "");
        }
    }

    public void setTdoc(int tdoc) {
        this.tdoc = tdoc;
    }

    public void setLopd_Ori(float lopd_ori) {
        this.lopd_Ori = lopd_ori;
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

    public void setCue_Apoyo(String cue_apoyo) {
        if (cue_apoyo.length() > 12) {
            this.cue_Apoyo = cue_apoyo.trim().substring(0, 12).replace("'", "");
        } else {
            this.cue_Apoyo = cue_apoyo.replace("'", "");
        }
    }

    public void setLap_Den(String lap_den) {
        if (lap_den.length() > 50) {
            this.lap_Den = lap_den.trim().substring(0, 50).replace("'", "");
        } else {
            this.lap_Den = lap_den.replace("'", "");
        }
    }

    public void setLap_Con(String lap_con) {
        if (lap_con.length() > 3) {
            this.lap_Con = lap_con.trim().substring(0, 3).replace("'", "");
        } else {
            this.lap_Con = lap_con.replace("'", "");
        }
    }

    public void setLap_Cta(String lap_cta) {
        if (lap_cta.length() > 12) {
            this.lap_Cta = lap_cta.trim().substring(0, 12).replace("'", "");
        } else {
            this.lap_Cta = lap_cta.replace("'", "");
        }
    }

    public void setOpe_Tip(String ope_tip) {
        if (ope_tip.length() > 3) {
            this.ope_Tip = ope_tip.trim().substring(0, 3).replace("'", "");
        } else {
            this.ope_Tip = ope_tip.replace("'", "");
        }
    }

    public void setOpe_Cla(String ope_cla) {
        if (ope_cla.length() > 3) {
            this.ope_Cla = ope_cla.trim().substring(0, 3).replace("'", "");
        } else {
            this.ope_Cla = ope_cla.replace("'", "");
        }
    }

    public void setOpe_Pla(float ope_pla) {
        this.ope_Pla = ope_pla;
    }

    public void setOpe_Des(String ope_des) {
        if (ope_des.length() > 35) {
            this.ope_Des = ope_des.trim().substring(0, 35).replace("'", "");
        } else {
            this.ope_Des = ope_des.replace("'", "");
        }
    }

    public void setCta(String cta) {
        if (cta.length() > 23) {
            this.cta = cta.trim().substring(0, 23).replace("'", "");
        } else {
            this.cta = cta.replace("'", "");
        }
    }

    public void setSuf(String suf) {
        if (suf.length() > 3) {
            this.suf = suf.trim().substring(0, 3).replace("'", "");
        } else {
            this.suf = suf.replace("'", "");
        }
    }

    public void setIban(String iban) {
        if (iban.length() > 4) {
            this.iban = iban.trim().substring(0, 4).replace("'", "");
        } else {
            this.iban = iban.replace("'", "");
        }
    }

    public void setSwift(String swift) {
        if (swift.length() > 15) {
            this.swift = swift.trim().substring(0, 15).replace("'", "");
        } else {
            this.swift = swift.replace("'", "");
        }
    }

    public void setCri_Caja(String cri_caja) {
        if (cri_caja.length() > 1) {
            this.cri_Caja = cri_caja.trim().substring(0, 1).replace("'", "");
        } else {
            this.cri_Caja = cri_caja.replace("'", "");
        }
    }

    public void setSiidesfac(String siidesfac) {
        if (siidesfac.length() > 3) {
            this.siidesfac = siidesfac.trim().substring(0, 3).replace("'", "");
        } else {
            this.siidesfac = siidesfac.replace("'", "");
        }
    }

    public void setPatron(String patron) {
        if (patron.length() > 3) {
            this.patron = patron.trim().substring(0, 3).replace("'", "");
        } else {
            this.patron = patron.replace("'", "");
        }
    }

    public void setPatron_Cv(String patron_cv) {
        if (patron_cv.length() > 1) {
            this.patron_Cv = patron_cv.trim().substring(0, 1).replace("'", "");
        } else {
            this.patron_Cv = patron_cv.replace("'", "");
        }
    }

    @Override
    public String toString() {
        return "INSERT INTO CUENTA (cue,nom,nif,deb,hab,dir,pob,npro,pro,cont1,cont2,cont3,cont4,cont5,cons1,cons2,cons3,cons4,cons5,"
                +
                "cons6,cons7,cons8,cons9,cons10,pais,gru,nifr,tdoc,lopd_ori,lopd_otr_o,lopd_ces,lopd_otr_c,cue_apoyo,lap_den,lap_con,lap_cta,"
                +
                "ope_tip,ope_cla,ope_pla,ope_des,cta,suf,iban,swift,cri_caja,siidesfac,patron,patron_cv) VALUES ('"
                + cue + "','" + nom + "','" + nif + "'," + deb + "," + hab + ",'" + dir + "','" + pob + "'," + npro
                + ",'" + pro + "','" + cont1 + "','" + cont2 + "','" + cont3 + "','" + cont4 + "','" + cont5 + "','"
                + cons1 + "','" + cons2 + "','" + cons3 + "','" + cons4 + "','" + cons5 + "','" + cons6 + "','" + cons7
                + "','" + cons8 + "','" + cons9 + "','" + cons10 + "'," + pais + "," + gru + ",'" + nifr + "'," + tdoc
                + "," + lopd_Ori + ",'" + lopd_Otr_O + "','" + lopd_Ces + "','" + lopd_Otr_C + "','" + cue_Apoyo + "','"
                + lap_Den + "','" + lap_Con + "','" + lap_Cta + "','" + ope_Tip + "','" + ope_Cla + "'," + ope_Pla
                + ",'" + ope_Des + "','" + cta + "','" + suf + "','" + iban + "','" + swift + "','" + cri_Caja + "','"
                + siidesfac + "','" + patron + "','" + patron_Cv + "')";
    }
}
