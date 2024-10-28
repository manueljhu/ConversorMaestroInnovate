package com.innovate.conversormaestro.model;

public class Efecto {
    private String num;
    private String fec;
    private String cue;
    private String con;
    private String tip;
    private String ban;
    private String vto;
    private String fac;
    private String rem;
    private String fre;
    private String fpa;
    private String dev;
    private String xx1;
    private String xx2;
    private String xx3;
    private float impeu;
    private float pageu;
    private int car;
    private float imprem;
    private String cueapu;
    private float impdev;
    private float impgas;
    private String rie;
    private String rut;
    private String cu1;
    private String cu2;
    private String cu3;
    private String cu4;
    private float serie;
    private String impreso;
    private String efe_tipagr;
    private String efe_docagr;
    private String efe_nefagr;
    private String efe_genagr;
    private String efe_ren;
    private String numefedev;
    private int moneda;
    private float cotiza;
    private float impmon;
    private int diasmax;
    private String fecini;

    public String getNum() {
        return this.num;
    }

    public String getFec() {
        return this.fec;
    }

    public String getCue() {
        return this.cue;
    }

    public String getCon() {
        return this.con;
    }

    public String getTip() {
        return this.tip;
    }

    public String getBan() {
        return this.ban;
    }

    public String getVto() {
        return this.vto;
    }

    public String getFac() {
        return this.fac;
    }

    public String getRem() {
        return this.rem;
    }

    public String getFre() {
        return this.fre;
    }

    public String getFpa() {
        return this.fpa;
    }

    public String getDev() {
        return this.dev;
    }

    public String getXx1() {
        return this.xx1;
    }

    public String getXx2() {
        return this.xx2;
    }

    public String getXx3() {
        return this.xx3;
    }

    public float getImpeu() {
        return this.impeu;
    }

    public float getPageu() {
        return this.pageu;
    }

    public int getCar() {
        return this.car;
    }

    public float getImprem() {
        return this.imprem;
    }

    public String getCueapu() {
        return this.cueapu;
    }

    public float getImpdev() {
        return this.impdev;
    }

    public float getImpgas() {
        return this.impgas;
    }

    public String getRie() {
        return this.rie;
    }

    public String getRut() {
        return this.rut;
    }

    public String getCu1() {
        return this.cu1;
    }

    public String getCu2() {
        return this.cu2;
    }

    public String getCu3() {
        return this.cu3;
    }

    public String getCu4() {
        return this.cu4;
    }

    public float getSerie() {
        return this.serie;
    }

    public String getImpreso() {
        return this.impreso;
    }

    public String getEfe_Tipagr() {
        return this.efe_tipagr;
    }

    public String getEfe_Docagr() {
        return this.efe_docagr;
    }

    public String getEfe_Nefagr() {
        return this.efe_nefagr;
    }

    public String getEfe_Genagr() {
        return this.efe_genagr;
    }

    public String getEfe_Ren() {
        return this.efe_ren;
    }

    public String getNumefedev() {
        return this.numefedev;
    }

    public int getMoneda() {
        return this.moneda;
    }

    public float getCotiza() {
        return this.cotiza;
    }

    public float getImpmon() {
        return this.impmon;
    }

    public int getDiasmax() {
        return this.diasmax;
    }

    public String getFecini() {
        return this.fecini;
    }

    public void setNum(String num) {
        if (num.length() > 6) {
            this.num = num.trim().substring(0, 6).replace("'", "");
        } else {
            this.num = num.replace("'", "");
        }
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public void setCue(String cue) {
        if (cue.length() > 12) {
            this.cue = cue.trim().substring(0, 12).replace("'", "");
        } else {
            this.cue = cue.replace("'", "");
        }
    }

    public void setCon(String con) {
        if (con.length() > 50) {
            this.con = con.trim().substring(0, 50).replace("'", "");
        } else {
            this.con = con.replace("'", "");
        }
    }

    public void setTip(String tip) {
        if (tip.length() > 1) {
            this.tip = tip.trim().substring(0, 1).replace("'", "");
        } else {
            this.tip = tip.replace("'", "");
        }
    }

    public void setBan(String ban) {
        if (ban.length() > 12) {
            this.ban = ban.trim().substring(0, 12).replace("'", "");
        } else {
            this.ban = ban.replace("'", "");
        }
    }

    public void setVto(String vto) {
        this.vto = vto;
    }

    public void setFac(String fac) {
        if (fac.length() > 10) {
            this.fac = fac.trim().substring(0, 10).replace("'", "");
        } else {
            this.fac = fac.replace("'", "");
        }
    }

    public void setRem(String rem) {
        if (rem.length() > 6) {
            this.rem = rem.trim().substring(0, 6).replace("'", "");
        } else {
            this.rem = rem.replace("'", "");
        }
    }

    public void setFre(String fre) {
        this.fre = fre;
    }

    public void setFpa(String fpa) {
        this.fpa = fpa;
    }

    public void setDev(String dev) {
        if (dev.length() > 1) {
            this.dev = dev.trim().substring(0, 1).replace("'", "");
        } else {
            this.dev = dev.replace("'", "");
        }
    }

    public void setXx1(String xx1) {
        if (xx1.length() > 10) {
            this.xx1 = xx1.trim().substring(0, 10).replace("'", "");
        } else {
            this.xx1 = xx1.replace("'", "");
        }
    }

    public void setXx2(String xx2) {
        if (xx2.length() > 10) {
            this.xx2 = xx2.trim().substring(0, 10).replace("'", "");
        } else {
            this.xx2 = xx2.replace("'", "");
        }
    }

    public void setXx3(String xx3) {
        if (xx3.length() > 10) {
            this.xx3 = xx3.trim().substring(0, 10).replace("'", "");
        } else {
            this.xx3 = xx3.replace("'", "");
        }
    }

    public void setImpeu(float impeu) {
        this.impeu = impeu;
    }

    public void setPageu(float pageu) {
        this.pageu = pageu;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public void setImprem(float imprem) {
        this.imprem = imprem;
    }

    public void setCueapu(String cueapu) {
        if (cueapu.length() > 12) {
            this.cueapu = cueapu.trim().substring(0, 12).replace("'", "");
        } else {
            this.cueapu = cueapu.replace("'", "");
        }
    }

    public void setImpdev(float impdev) {
        this.impdev = impdev;
    }

    public void setImpgas(float impgas) {
        this.impgas = impgas;
    }

    public void setRie(String rie) {
        if (rie.length() > 1) {
            this.rie = rie.trim().substring(0, 1).replace("'", "");
        } else {
            this.rie = rie.replace("'", "");
        }
    }

    public void setRut(String rut) {
        if (rut.length() > 6) {
            this.rut = rut.trim().substring(0, 6).replace("'", "");
        } else {
            this.rut = rut.replace("'", "");
        }
    }

    public void setCu1(String cu1) {
        if (cu1.length() > 4) {
            this.cu1 = cu1.trim().substring(0, 4).replace("'", "");
        } else {
            this.cu1 = cu1.replace("'", "");
        }
    }

    public void setCu2(String cu2) {
        if (cu2.length() > 4) {
            this.cu2 = cu2.trim().substring(0, 4).replace("'", "");
        } else {
            this.cu2 = cu2.replace("'", "");
        }
    }

    public void setCu3(String cu3) {
        if (cu3.length() > 2) {
            this.cu3 = cu3.trim().substring(0, 2).replace("'", "");
        } else {
            this.cu3 = cu3.replace("'", "");
        }
    }

    public void setCu4(String cu4) {
        if (cu4.length() > 10) {
            this.cu4 = cu4.trim().substring(0, 10).replace("'", "");
        } else {
            this.cu4 = cu4.replace("'", "");
        }
    }

    public void setSerie(float serie) {
        this.serie = serie;
    }

    public void setImpreso(String impreso) {
        if (impreso.length() > 1) {
            this.impreso = impreso.trim().substring(0, 1).replace("'", "");
        } else {
            this.impreso = impreso.replace("'", "");
        }
    }

    public void setEfe_Tipagr(String efe_tipagr) {
        if (efe_tipagr.length() > 1) {
            this.efe_tipagr = efe_tipagr.trim().substring(0, 1).replace("'", "");
        } else {
            this.efe_tipagr = efe_tipagr.replace("'", "");
        }
    }

    public void setEfe_Docagr(String efe_docagr) {
        if (efe_docagr.length() > 15) {
            this.efe_docagr = efe_docagr.trim().substring(0, 15).replace("'", "");
        } else {
            this.efe_docagr = efe_docagr.replace("'", "");
        }
    }

    public void setEfe_Nefagr(String efe_nefagr) {
        if (efe_nefagr.length() > 6) {
            this.efe_nefagr = efe_nefagr.trim().substring(0, 6).replace("'", "");
        } else {
            this.efe_nefagr = efe_nefagr.replace("'", "");
        }
    }

    public void setEfe_Genagr(String efe_genagr) {
        if (efe_genagr.length() > 6) {
            this.efe_genagr = efe_genagr.trim().substring(0, 6).replace("'", "");
        } else {
            this.efe_genagr = efe_genagr.replace("'", "");
        }
    }

    public void setEfe_Ren(String efe_ren) {
        if (efe_ren.length() > 6) {
            this.efe_ren = efe_ren.trim().substring(0, 6).replace("'", "");
        } else {
            this.efe_ren = efe_ren.replace("'", "");
        }
    }

    public void setNumefedev(String numefedev) {
        if (numefedev.length() > 6) {
            this.numefedev = numefedev.trim().substring(0, 6).replace("'", "");
        } else {
            this.numefedev = numefedev.replace("'", "");
        }
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public void setCotiza(float cotiza) {
        this.cotiza = cotiza;
    }

    public void setImpmon(float impmon) {
        this.impmon = impmon;
    }

    public void setDiasmax(int diasmax) {
        this.diasmax = diasmax;
    }

    public void setFecini(String fecini) {
        this.fecini = fecini;
    }

    @Override
    public String toString() {
        return "Efecto [num=" + num + ", fec=" + fec + ", cue=" + cue + ", con=" + con + ", tip=" + tip + ", ban=" + ban
                + ", vto=" + vto + ", fac=" + fac + ", rem=" + rem + ", fre=" + fre + ", fpa=" + fpa + ", dev=" + dev
                + ", xx1=" + xx1 + ", xx2=" + xx2 + ", xx3=" + xx3 + ", impeu=" + impeu + ", pageu=" + pageu + ", car="
                + car + ", imprem=" + imprem + ", cueapu=" + cueapu + ", impdev=" + impdev + ", impgas=" + impgas
                + ", rie=" + rie + ", rut=" + rut + ", cu1=" + cu1 + ", cu2=" + cu2 + ", cu3=" + cu3 + ", cu4=" + cu4
                + ", serie=" + serie + ", impreso=" + impreso + ", efe_tipagr=" + efe_tipagr + ", efe_docagr="
                + efe_docagr + ", efe_nefagr=" + efe_nefagr + ", efe_genagr=" + efe_genagr + ", efe_ren=" + efe_ren
                + ", numefedev=" + numefedev + ", moneda=" + moneda + ", cotiza=" + cotiza + ", impmon=" + impmon
                + ", diasmax=" + diasmax + ", fecini=" + fecini + "]";
    }
}
