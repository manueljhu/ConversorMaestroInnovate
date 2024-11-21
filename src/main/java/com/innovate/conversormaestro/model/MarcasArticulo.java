package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class MarcasArticulo {
    private String cod = "";
    private String nom = "";
    private String cuc = "";
    private String cuv = "";
    private float co1 = 0.00f;
    private float co2 = 0.00f;
    private float co3 = 0.00f;
    private float co4 = 0.00f;
    private float co5 = 0.00f;
    private String dtocom1 = "P";
    private String dtocom2 = "P";
    private String dtoven1 = "P";
    private String dtoven2 = "P";
    private float dt1 = 0.00f;
    private float dt2 = 0.00f;
    private float dt3 = 0.00f;
    private float dt4 = 0.00f;
    private float dt5 = 0.00f;
    private float d01 = 0.00f;
    private float d02 = 0.00f;
    private float d03 = 0.00f;
    private float d04 = 0.00f;
    private float d05 = 0.00f;
    private float ma1 = 0.00f;
    private float ma2 = 0.00f;
    private float ma3 = 0.00f;
    private float ma4 = 0.00f;
    private float ma5 = 0.00f;
    private String ima = "123.BMP";
    private String fot = "";
    private String abr = "";
    private String pos = "";
    private String ctadevcom = "6080000000";
    private String ctadevven = "7080000000";
    private String ctadtocom = "6000000000";
    private String ctadtoven = "7000000000";
    private String historia = "";

    public String getCod() {
        return this.cod;
    }

    public String getNom() {
        return this.nom;
    }

    public String getCuc() {
        return this.cuc;
    }

    public String getCuv() {
        return this.cuv;
    }

    public float getCo1() {
        return this.co1;
    }

    public float getCo2() {
        return this.co2;
    }

    public float getCo3() {
        return this.co3;
    }

    public float getCo4() {
        return this.co4;
    }

    public float getCo5() {
        return this.co5;
    }

    public String getDtocom1() {
        return this.dtocom1;
    }

    public String getDtocom2() {
        return this.dtocom2;
    }

    public String getDtoven1() {
        return this.dtoven1;
    }

    public String getDtoven2() {
        return this.dtoven2;
    }

    public float getDt1() {
        return this.dt1;
    }

    public float getDt2() {
        return this.dt2;
    }

    public float getDt3() {
        return this.dt3;
    }

    public float getDt4() {
        return this.dt4;
    }

    public float getDt5() {
        return this.dt5;
    }

    public float getD01() {
        return this.d01;
    }

    public float getD02() {
        return this.d02;
    }

    public float getD03() {
        return this.d03;
    }

    public float getD04() {
        return this.d04;
    }

    public float getD05() {
        return this.d05;
    }

    public float getMa1() {
        return this.ma1;
    }

    public float getMa2() {
        return this.ma2;
    }

    public float getMa3() {
        return this.ma3;
    }

    public float getMa4() {
        return this.ma4;
    }

    public float getMa5() {
        return this.ma5;
    }

    public String getIma() {
        return this.ima;
    }

    public String getFot() {
        return this.fot;
    }

    public String getAbr() {
        return this.abr;
    }

    public String getPos() {
        return this.pos;
    }

    public String getCtadevcom() {
        return this.ctadevcom;
    }

    public String getCtadevven() {
        return this.ctadevven;
    }

    public String getCtadtocom() {
        return this.ctadtocom;
    }

    public String getCtadtoven() {
        return this.ctadtoven;
    }

    public String getHistoria() {
        return this.historia;
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

    public void setCuc(String cuc) {
        if (cuc.length() > 12) {
            this.cuc = cuc.trim().substring(0, 12).replace("'", "");
        } else {
            this.cuc = cuc.replace("'", "");
        }
    }

    public void setCuv(String cuv) {
        if (cuv.length() > 12) {
            this.cuv = cuv.trim().substring(0, 12).replace("'", "");
        } else {
            this.cuv = cuv.replace("'", "");
        }
    }

    public void setCo1(float co1) {
        this.co1 = co1;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public void setCo3(float co3) {
        this.co3 = co3;
    }

    public void setCo4(float co4) {
        this.co4 = co4;
    }

    public void setCo5(float co5) {
        this.co5 = co5;
    }

    public void setDtocom1(String dtocom1) {
        if (dtocom1.length() > 1) {
            this.dtocom1 = dtocom1.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtocom1 = dtocom1.replace("'", "");
        }
    }

    public void setDtocom2(String dtocom2) {
        if (dtocom2.length() > 1) {
            this.dtocom2 = dtocom2.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtocom2 = dtocom2.replace("'", "");
        }
    }

    public void setDtoven1(String dtoven1) {
        if (dtoven1.length() > 1) {
            this.dtoven1 = dtoven1.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtoven1 = dtoven1.replace("'", "");
        }
    }

    public void setDtoven2(String dtoven2) {
        if (dtoven2.length() > 1) {
            this.dtoven2 = dtoven2.trim().substring(0, 1).replace("'", "");
        } else {
            this.dtoven2 = dtoven2.replace("'", "");
        }
    }

    public void setDt1(float dt1) {
        this.dt1 = dt1;
    }

    public void setDt2(float dt2) {
        this.dt2 = dt2;
    }

    public void setDt3(float dt3) {
        this.dt3 = dt3;
    }

    public void setDt4(float dt4) {
        this.dt4 = dt4;
    }

    public void setDt5(float dt5) {
        this.dt5 = dt5;
    }

    public void setD01(float d01) {
        this.d01 = d01;
    }

    public void setD02(float d02) {
        this.d02 = d02;
    }

    public void setD03(float d03) {
        this.d03 = d03;
    }

    public void setD04(float d04) {
        this.d04 = d04;
    }

    public void setD05(float d05) {
        this.d05 = d05;
    }

    public void setMa1(float ma1) {
        this.ma1 = ma1;
    }

    public void setMa2(float ma2) {
        this.ma2 = ma2;
    }

    public void setMa3(float ma3) {
        this.ma3 = ma3;
    }

    public void setMa4(float ma4) {
        this.ma4 = ma4;
    }

    public void setMa5(float ma5) {
        this.ma5 = ma5;
    }

    public void setIma(String ima) {
        if (ima.length() > 20) {
            this.ima = ima.trim().substring(0, 20).replace("'", "");
        } else {
            this.ima = ima.replace("'", "");
        }
    }

    public void setFot(String fot) {
        if (fot.length() > 20) {
            this.fot = fot.trim().substring(0, 20).replace("'", "");
        } else {
            this.fot = fot.replace("'", "");
        }
    }

    public void setAbr(String abr) {
        if (abr.length() > 9) {
            this.abr = abr.trim().substring(0, 9).replace("'", "");
        } else {
            this.abr = abr.replace("'", "");
        }
    }

    public void setPos(String pos) {
        if (pos.length() > 4) {
            this.pos = pos.trim().substring(0, 4).replace("'", "");
        } else {
            this.pos = pos.replace("'", "");
        }
    }

    public void setCtadevcom(String ctadevcom) {
        if (ctadevcom.length() > 12) {
            this.ctadevcom = ctadevcom.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadevcom = ctadevcom.replace("'", "");
        }
    }

    public void setCtadevven(String ctadevven) {
        if (ctadevven.length() > 12) {
            this.ctadevven = ctadevven.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadevven = ctadevven.replace("'", "");
        }
    }

    public void setCtadtocom(String ctadtocom) {
        if (ctadtocom.length() > 12) {
            this.ctadtocom = ctadtocom.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadtocom = ctadtocom.replace("'", "");
        }
    }

    public void setCtadtoven(String ctadtoven) {
        if (ctadtoven.length() > 12) {
            this.ctadtoven = ctadtoven.trim().substring(0, 12).replace("'", "");
        } else {
            this.ctadtoven = ctadtoven.replace("'", "");
        }
    }

    public void setHistoria(String historia) {
        this.historia = historia;
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
        return "INSERT INTO MARART(cod,nom,cuc,cuv,co1,co2,co3,co4,co5,dtocom1,dtocom2,dtoven1,dtoven2,dt1,dt2,dt3,dt4,"
                +
                "dt5,d01,d02,d03,d04,d05,ma1,ma2,ma3,ma4,ma5,ima,fot,abr,pos,ctadevcom,ctadevven,ctadtocom,ctadtoven,historia) VALUES "
                +
                "('" + cod + "','" + nom + "','" + cuc + "','" + cuv + "'," + co1 + "," + co2 + "," + co3 + "," + co4
                + "," + co5 + ",'" + dtocom1 + "','" + dtocom2 + "','" + dtoven1 + "','" + dtoven2 + "'," + dt1 + ","
                + dt2 + "," + dt3 + "," + dt4 + "," + dt5 + "," + d01 + "," + d02 + "," + d03 + "," + d04 + "," + d05
                + "," + ma1 + "," + ma2 + "," + ma3 + "," + ma4 + "," + ma5 + ",'" + ima + "','" + fot + "','" + abr
                + "','" + pos + "','" + ctadevcom + "','" + ctadevven + "','" + ctadtocom + "','" + ctadtoven + "','"
                + historia + "')";
    }

    public String toUpdate() {
        return "UPDATE MARART SET nom='" + nom + "',cuc='" + cuc + "',cuv='" + cuv + "',co1=" + co1
                + ",co2=" + co2 + ",co3=" + co3 + ",co4=" + co4 + ",co5=" + co5 + ",dtocom1='" + dtocom1 + "',dtocom2='"
                + dtocom2 + "',dtoven1='" + dtoven1 + "',dtoven2='" + dtoven2 + "',dt1=" + dt1 + ",dt2=" + dt2 + ",dt3="
                + dt3 + ",dt4=" + dt4 + ",dt5=" + dt5 + ",d01=" + d01 + ",d02=" + d02 + ",d03=" + d03 + ",d04=" + d04
                + ",d05=" + d05 + ",ma1=" + ma1 + ",ma2=" + ma2 + ",ma3=" + ma3 + ",ma4=" + ma4 + ",ma5=" + ma5
                + ",ima='" + ima + "',fot='" + fot + "',abr='" + abr + "',pos='" + pos + "',ctadevcom='" + ctadevcom
                + "',ctadevven='" + ctadevven + "',ctadtocom='" + ctadtocom + "',ctadtoven='" + ctadtoven
                + "',historia='" + historia + "' WHERE cod='" + cod + "';";
    }
}
