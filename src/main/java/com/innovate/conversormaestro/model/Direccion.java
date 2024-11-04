package com.innovate.conversormaestro.model;

public class Direccion {
    private String cla;
    private String cod;
    private String den;
    private String dir;
    private String pob;
    private int npro;
    private String pro;
    private float pais;
    private String email;
    private String rut;
    private String tel;
    private String hab;
    private String per;

    public String getCla() {
        return this.cla;
    }

    public String getCod() {
        return this.cod;
    }

    public String getDen() {
        return this.den;
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

    public float getPais() {
        return this.pais;
    }

    public String getEmail() {
        return this.email;
    }

    public String getRut() {
        return this.rut;
    }

    public String getTel() {
        return this.tel;
    }

    public String getHab() {
        return this.hab;
    }

    public String getPer() {
        return this.per;
    }

    public void setCla(String cla) {
        if (cla.length() > 2) {
            this.cla = cla.trim().substring(0, 2).replace("'", "");
        } else {
            this.cla = cla.replace("'", "");
        }
    }

    public void setCod(String cod) {
        if (cod.length() > 6) {
            this.cod = cod.trim().substring(0, 6).replace("'", "");
        } else {
            this.cod = cod.replace("'", "");
        }
    }

    public void setDen(String den) {
        if (den.length() > 50) {
            this.den = den.trim().substring(0, 50).replace("'", "");
        } else {
            this.den = den.replace("'", "");
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

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setEmail(String email) {
        if (email.length() > 80) {
            this.email = email.trim().substring(0, 80).replace("'", "");
        } else {
            this.email = email.replace("'", "");
        }
    }

    public void setRut(String rut) {
        if (rut.length() > 6) {
            this.rut = rut.trim().substring(0, 6).replace("'", "");
        } else {
            this.rut = rut.replace("'", "");
        }
    }

    public void setTel(String tel) {
        if (tel.length() > 18) {
            this.tel = tel.trim().substring(0, 18).replace("'", "");
        } else {
            this.tel = tel.replace("'", "");
        }
    }

    public void setHab(String hab) {
        if (hab.length() > 1) {
            this.hab = hab.trim().substring(0, 1).replace("'", "");
        } else {
            this.hab = hab.replace("'", "");
        }
    }

    public void setPer(String per) {
        if (per.length() > 50) {
            this.per = per.trim().substring(0, 50).replace("'", "");
        } else {
            this.per = per.replace("'", "");
        }
    }

    @Override
    public String toString() {
        return "INSERT INTO DIRECC (cla,cod,den,dir,pob,npro,pro,pais,email,rut,tel,hab,per) VALUES ('" + cla + "','"
                + cod + "','" + den + "','" + dir + "','" + pob + "'," + npro + ",'" + pro + "'," + pais + ",'" + email
                + "','" + rut + "','" + tel + "','" + hab + "','" + per + "')";
    }
}
