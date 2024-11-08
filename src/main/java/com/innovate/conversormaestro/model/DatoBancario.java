package com.innovate.conversormaestro.model;

public class DatoBancario {
    private String cla = "";
    private String cod = "";
    private String dir = "";
    private String pob = "";
    private int npro = 0;
    private String pro = "";
    private float pais = 0.00f;
    private String iban = "";
    private String bic = "";
    private String cu1 = "";
    private String cu2 = "";
    private String cu3 = "";
    private String cu4 = "";
    private String hab = "";
    private String bban = "";
    private String trem = "";
    private String epri = "";
    private String nman = "";
    private String fman = "";

    public String getCla() {
        return this.cla;
    }

    public String getCod() {
        return this.cod;
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

    public String getIban() {
        return this.iban;
    }

    public String getBic() {
        return this.bic;
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

    public String getHab() {
        return this.hab;
    }

    public String getBban() {
        return this.bban;
    }

    public String getTrem() {
        return this.trem;
    }

    public String getEpri() {
        return this.epri;
    }

    public String getNman() {
        return this.nman;
    }

    public String getFman() {
        return this.fman;
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

    public void setIban(String iban) {
        if (iban.length() > 4) {
            this.iban = iban.trim().substring(0, 4).replace("'", "");
        } else {
            this.iban = iban.replace("'", "");
        }
    }

    public void setBic(String bic) {
        if (bic.length() > 15) {
            this.bic = bic.trim().substring(0, 15).replace("'", "");
        } else {
            this.bic = bic.replace("'", "");
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

    public void setHab(String hab) {
        if (hab.length() > 1) {
            this.hab = hab.trim().substring(0, 1).replace("'", "");
        } else {
            this.hab = hab.replace("'", "");
        }
    }

    public void setBban(String bban) {
        if (bban.length() > 30) {
            this.bban = bban.trim().substring(0, 30).replace("'", "");
        } else {
            this.bban = bban.replace("'", "");
        }
    }

    public void setTrem(String trem) {
        if (trem.length() > 1) {
            this.trem = trem.trim().substring(0, 1).replace("'", "");
        } else {
            this.trem = trem.replace("'", "");
        }
    }

    public void setEpri(String epri) {
        if (epri.length() > 1) {
            this.epri = epri.trim().substring(0, 1).replace("'", "");
        } else {
            this.epri = epri.replace("'", "");
        }
    }

    public void setNman(String nman) {
        if (nman.length() > 35) {
            this.nman = nman.trim().substring(0, 35).replace("'", "");
        } else {
            this.nman = nman.replace("'", "");
        }
    }

    public void setFman(String fman) {
        this.fman = fman;
    }

    @Override
    public String toString() {
        return "INSERT INTO DATBAN (cla,cod,dir,pob,npro,pro,pais,iban,bic,cu1,cu2,cu3,cu4,hab,bban,trem,epri,nman,fman) VALUES "
                +
                "('" + cla + "','" + cod + "','" + dir + "','" + pob + "'," + npro + ",'" + pro + "'," + pais + ",'"
                + iban + "','" + bic + "','" + cu1 + "','" + cu2 + "','" + cu3 + "','" + cu4 + "','" + hab + "','"
                + bban + "','" + trem + "','" + epri + "','" + nman + "','" + fman + "')";
    }
}
