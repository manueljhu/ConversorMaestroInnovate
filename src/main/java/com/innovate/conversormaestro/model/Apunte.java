package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;

public class Apunte {
    private ConnectionController connectionController = ConnectionController.getConectionController();
    private String num = "";
    private String fec = "NULL";
    private String cue = "";
    private String con = "";
    private String sig = "H";
    private String mar = "";
    private String fac = "";
    private String doc = "000013";
    private String xxx = "";
    private float impeu = 1000;
    private String acl = "";
    private String cen = "000001002";
    private String ren = "";
    private float met = 0.000f;
    private String apu_tipdoc = "";
    private String apu_numdoc = "";
    private int anno_efe = 0;

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

    public String getSig() {
        return this.sig;
    }

    public String getMar() {
        return this.mar;
    }

    public String getFac() {
        return this.fac;
    }

    public String getDoc() {
        return this.doc;
    }

    public String getXxx() {
        return this.xxx;
    }

    public float getImpeu() {
        return this.impeu;
    }

    public String getAcl() {
        return this.acl;
    }

    public String getCen() {
        return this.cen;
    }

    public String getRen() {
        return this.ren;
    }

    public float getMet() {
        return this.met;
    }

    public String getApu_Tipdoc() {
        return this.apu_tipdoc;
    }

    public String getApu_Numdoc() {
        return this.apu_numdoc;
    }

    public int getAnno_Efe() {
        return this.anno_efe;
    }

    public void setNum(String num) {
        if (num.length() > 6) {
            this.num = num.trim().substring(0, 6).replace("'", "");
        } else {
            this.num = num.replace("'", "");
        }
    }

    public void setFec(String fec) {
        if (fec != null ){
            this.fec = "'"+fec+"'";
        } else {
            this.fec = "NULL";
        }
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

    public void setSig(String sig) {
        if (sig.length() > 1) {
            this.sig = sig.trim().substring(0, 1).replace("'", "");
        } else {
            this.sig = sig.replace("'", "");
        }
    }

    public void setMar(String mar) {
        if (mar.length() > 1) {
            this.mar = mar.trim().substring(0, 1).replace("'", "");
        } else {
            this.mar = mar.replace("'", "");
        }
    }

    public void setFac(String fac) {
        if (fac.length() > 10) {
            this.fac = fac.trim().substring(0, 10).replace("'", "");
        } else {
            this.fac = fac.replace("'", "");
        }
    }

    public void setDoc(String doc) {
        if (doc.length() > 6) {
            this.doc = doc.trim().substring(0, 6).replace("'", "");
        } else {
            this.doc = doc.replace("'", "");
        }
    }

    public void setXxx(String xxx) {
        if (xxx.length() > 10) {
            this.xxx = xxx.trim().substring(0, 10).replace("'", "");
        } else {
            this.xxx = xxx.replace("'", "");
        }
    }

    public void setImpeu(float impeu) {
        this.impeu = impeu;
    }

    public void setAcl(String acl) {
        if (acl.length() > 107) {
            this.acl = acl.trim().substring(0, 107).replace("'", "");
        } else {
            this.acl = acl.replace("'", "");
        }
    }

    public void setCen(String cen) {
        if (cen.length() > 9) {
            this.cen = cen.trim().substring(0, 9).replace("'", "");
        } else {
            this.cen = cen.replace("'", "");
        }
    }

    public void setRen(String ren) {
        if (ren.length() > 6) {
            this.ren = ren.trim().substring(0, 6).replace("'", "");
        } else {
            this.ren = ren.replace("'", "");
        }
    }

    public void setMet(float met) {
        this.met = met;
    }

    public void setApu_Tipdoc(String apu_tipdoc) {
        if (apu_tipdoc.length() > 3) {
            this.apu_tipdoc = apu_tipdoc.trim().substring(0, 3).replace("'", "");
        } else {
            this.apu_tipdoc = apu_tipdoc.replace("'", "");
        }
    }

    public void setApu_Numdoc(String apu_numdoc) {
        if (apu_numdoc.length() > 15) {
            this.apu_numdoc = apu_numdoc.trim().substring(0, 15).replace("'", "");
        } else {
            this.apu_numdoc = apu_numdoc.replace("'", "");
        }
    }

    public void setAnno_Efe(int anno_efe) {
        this.anno_efe = anno_efe;
    }

    @Override
    public String toString() {
        String exercise = connectionController.getExerciseDestination();
        exercise = exercise.substring(exercise.length()-2);
        return "INSERT INTO APUN"+ exercise +"(num, fec, cue, con, sig, mar, fac, doc, xxx, impeu, acl, cen, ren, met, apu_tipdoc, "+
        "apu_numdoc, anno_efe) VALUES ('"+num+"', "+fec+", '"+cue+"', '"+con+"', '"+sig+"', '"+mar+"', '"+fac+"', '"+doc+"', "+
        "'"+xxx+"', "+impeu+", '"+acl+"', '"+cen+"', '"+ren+"', "+met+", '"+apu_tipdoc+"', '"+apu_numdoc+"', "+anno_efe+");";
    }
}