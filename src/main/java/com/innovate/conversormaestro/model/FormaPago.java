package com.innovate.conversormaestro.model;

public class FormaPago {
    private String nom;
    private int di1;
    private int di2;
    private int dir;
    private int npa;
    private String mes;
    private int vto;
    private float inc;
    private float cad;
    private String cob;
    private int car;
    private float porcobdir;
    private String inclib;
    private String reppro;
    private String cuecobdir;

    public String getNom() {
        return this.nom;
    }

    public int getDi1() {
        return this.di1;
    }

    public int getDi2() {
        return this.di2;
    }

    public int getDir() {
        return this.dir;
    }

    public int getNpa() {
        return this.npa;
    }

    public String getMes() {
        return this.mes;
    }

    public int getVto() {
        return this.vto;
    }

    public float getInc() {
        return this.inc;
    }

    public float getCad() {
        return this.cad;
    }

    public String getCob() {
        return this.cob;
    }

    public int getCar() {
        return this.car;
    }

    public float getPorcobdir() {
        return this.porcobdir;
    }

    public String getInclib() {
        return this.inclib;
    }

    public String getReppro() {
        return this.reppro;
    }

    public String getCuecobdir() {
        return this.cuecobdir;
    }

    public void setNom(String nom) {
        if (nom.length() > 50) {
            this.nom = nom.trim().substring(0, 50).replace("'", "");
        } else {
            this.nom = nom.replace("'", "");
        }
    }

    public void setDi1(int di1) {
        this.di1 = di1;
    }

    public void setDi2(int di2) {
        this.di2 = di2;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setNpa(int npa) {
        this.npa = npa;
    }

    public void setMes(String mes) {
        if (mes.length() > 1) {
            this.mes = mes.trim().substring(0, 1).replace("'", "");
        } else {
            this.mes = mes.replace("'", "");
        }
    }

    public void setVto(int vto) {
        this.vto = vto;
    }

    public void setInc(float inc) {
        this.inc = inc;
    }

    public void setCad(float cad) {
        this.cad = cad;
    }

    public void setCob(String cob) {
        if (cob.length() > 1) {
            this.cob = cob.trim().substring(0, 1).replace("'", "");
        } else {
            this.cob = cob.replace("'", "");
        }
    }

    public void setCar(int car) {
        this.car = car;
    }

    public void setPorcobdir(float porcobdir) {
        this.porcobdir = porcobdir;
    }

    public void setInclib(String inclib) {
        if (inclib.length() > 1) {
            this.inclib = inclib.trim().substring(0, 1).replace("'", "");
        } else {
            this.inclib = inclib.replace("'", "");
        }
    }

    public void setReppro(String reppro) {
        if (reppro.length() > 1) {
            this.reppro = reppro.trim().substring(0, 1).replace("'", "");
        } else {
            this.reppro = reppro.replace("'", "");
        }
    }

    public void setCuecobdir(String cuecobdir) {
        if (cuecobdir.length() > 12) {
            this.cuecobdir = cuecobdir.trim().substring(0, 12).replace("'", "");
        } else {
            this.cuecobdir = cuecobdir.replace("'", "");
        }
    }

    @Override
    public String toString() {
        return "FormaPago [nom=" + nom + ", di1=" + di1 + ", di2=" + di2 + ", dir=" + dir + ", npa=" + npa + ", mes="
                + mes + ", vto=" + vto + ", inc=" + inc + ", cad=" + cad + ", cob=" + cob + ", car=" + car
                + ", porcobdir=" + porcobdir + ", inclib=" + inclib + ", reppro=" + reppro + ", cuecobdir=" + cuecobdir
                + "]";
    }
}
