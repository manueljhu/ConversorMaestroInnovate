package com.innovate.conversormaestro.model;

public class Banco {
    private String cue = "";
    private String des = "";
    private float rie = 0.000F;
    private String cta = "    /    /  /";
    private String dir = "";
    private String pob = "      -";
    private int npro = 0;
    private String pro = "";
    private String suf = "";
    private String email = "";
    private String iban = "";
    private String swift = "";

    public String getCue() {
        return this.cue;
    }

    public String getDes() {
        return this.des;
    }

    public float getRie() {
        return this.rie;
    }

    public String getCta() {
        return this.cta;
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

    public String getSuf() {
        return this.suf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIban() {
        return this.iban;
    }

    public String getSwift() {
        return this.swift;
    }

    public void setCue(String cue) {
        if (cue.length() > 12) {
            this.cue = cue.trim().substring(0, 12).replace("'", "");
        } else {
            this.cue = cue.replace("'", "");
        }
    }

    public void setDes(String des) {
        if (des.length() > 50) {
            this.des = des.trim().substring(0, 50).replace("'", "");
        } else {
            this.des = des.replace("'", "");
        }
    }

    public void setRie(float rie) {
        this.rie = rie;
    }

    public void setCta(String cta) {
        if (cta.length() > 23) {
            this.cta = cta.trim().substring(0, 23).replace("'", "");
        } else {
            this.cta = cta.replace("'", "");
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

    public void setSuf(String suf) {
        if (suf.length() > 3) {
            this.suf = suf.trim().substring(0, 3).replace("'", "");
        } else {
            this.suf = suf.replace("'", "");
        }
    }

    public void setEmail(String email) {
        if (email.length() > 80) {
            this.email = email.trim().substring(0, 80).replace("'", "");
        } else {
            this.email = email.replace("'", "");
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

    @Override
    public String toString() {
        return "INSERT INTO BANCOS (cue,des,rie,cta,dir,pob,npro,pro,suf,email,iban,swift) VALUES "+
        "('"+cue+"','"+des+"',"+rie+",'"+cta+"','"+dir+"','"+pob+"',"+npro+",'"+pro+"','"+suf+"','"+email+"','"+iban+"','"+swift+"')";
    }
}
