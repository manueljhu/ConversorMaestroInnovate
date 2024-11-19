package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;

public class Contacto {
    private String cla = "";
    private String cod = "";
    private String nom = "";
    private String car = "";
    private String tel = "";
    private String ext = "";
    private String ob1 = "";
    private String ob2 = "";
    private String ob3 = "";
    private String email = "";
    private String codcon = "";
    private float lopd_ori = 0;
    private String lopd_otr_o = "";
    private String lopd_ces = "";
    private String lopd_otr_c = "";

    public String getCla() {
        return this.cla;
    }

    public String getCod() {
        return this.cod;
    }

    public String getNom() {
        return this.nom;
    }

    public String getCar() {
        return this.car;
    }

    public String getTel() {
        return this.tel;
    }

    public String getExt() {
        return this.ext;
    }

    public String getOb1() {
        return this.ob1;
    }

    public String getOb2() {
        return this.ob2;
    }

    public String getOb3() {
        return this.ob3;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCodcon() {
        return this.codcon;
    }

    public float getLopd_Ori() {
        return this.lopd_ori;
    }

    public String getLopd_Otr_O() {
        return this.lopd_otr_o;
    }

    public String getLopd_Ces() {
        return this.lopd_ces;
    }

    public String getLopd_Otr_C() {
        return this.lopd_otr_c;
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

    public void setNom(String nom) {
        if (nom.length() > 50) {
            this.nom = nom.trim().substring(0, 50).replace("'", "");
        } else {
            this.nom = nom.replace("'", "");
        }
    }

    public void setCar(String car) {
        if (car.length() > 30) {
            this.car = car.trim().substring(0, 30).replace("'", "");
        } else {
            this.car = car.replace("'", "");
        }
    }

    public void setTel(String tel) {
        if (tel.length() > 18) {
            this.tel = tel.trim().substring(0, 18).replace("'", "");
        } else {
            this.tel = tel.replace("'", "");
        }
    }

    public void setExt(String ext) {
        if (ext.length() > 6) {
            this.ext = ext.trim().substring(0, 6).replace("'", "");
        } else {
            this.ext = ext.replace("'", "");
        }
    }

    public void setOb1(String ob1) {
        if (ob1.length() > 80) {
            this.ob1 = ob1.trim().substring(0, 80).replace("'", "");
        } else {
            this.ob1 = ob1.replace("'", "");
        }
    }

    public void setOb2(String ob2) {
        if (ob2.length() > 80) {
            this.ob2 = ob2.trim().substring(0, 80).replace("'", "");
        } else {
            this.ob2 = ob2.replace("'", "");
        }
    }

    public void setOb3(String ob3) {
        if (ob3.length() > 80) {
            this.ob3 = ob3.trim().substring(0, 80).replace("'", "");
        } else {
            this.ob3 = ob3.replace("'", "");
        }
    }

    public void setEmail(String email) {
        if (email.length() > 80) {
            this.email = email.trim().substring(0, 80).replace("'", "");
        } else {
            this.email = email.replace("'", "");
        }
    }

    public void setCodcon(String codcon) {
        if (codcon.length() > 12) {
            this.codcon = codcon.trim().substring(0, 12).replace("'", "");
        } else {
            this.codcon = codcon.replace("'", "");
        }
    }

    public void setLopd_Ori(float lopd_ori) {
        this.lopd_ori = lopd_ori;
    }

    public void setLopd_Otr_O(String lopd_otr_o) {
        if (lopd_otr_o.length() > 100) {
            this.lopd_otr_o = lopd_otr_o.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_otr_o = lopd_otr_o.replace("'", "");
        }
    }

    public void setLopd_Ces(String lopd_ces) {
        if (lopd_ces.length() > 100) {
            this.lopd_ces = lopd_ces.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_ces = lopd_ces.replace("'", "");
        }
    }

    public void setLopd_Otr_C(String lopd_otr_c) {
        if (lopd_otr_c.length() > 100) {
            this.lopd_otr_c = lopd_otr_c.trim().substring(0, 100).replace("'", "");
        } else {
            this.lopd_otr_c = lopd_otr_c.replace("'", "");
        }
    }

    @Override
    public String toString() {
        String type = "";
        ConnectionController connectionController = ConnectionController.getConectionController();
        if (connectionController.getSourceTab().equals("SQL")) {
            
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
        return "INSERT INTO CONTAC (cla,cod,nom,car,tel,ext,ob1,ob2,ob3,email,codcon,lopd_ori,lopd_otr_o,lopd_ces,lopd_otr_c) VALUES "
                +
                "('" + cla + "','" + cod + "','" + nom + "','" + car + "','" + tel + "','" + ext + "','" + ob1 + "','"
                + ob2 + "','" + ob3 + "','" + email + "','" + codcon + "'," + lopd_ori + ",'" + lopd_otr_o + "','"
                + lopd_ces + "','" + lopd_otr_c + "')";
    }

    public String toUpdate() {
        return "UPDATE CONTAC SET nom='" + nom + "',car='" + car + "',tel='" + tel
                + "',ext='" + ext + "',ob1='" + ob1 + "',ob2='" + ob2 + "',ob3='" + ob3 + "',email='" + email
                + "',codcon='" + codcon + "',lopd_ori=" + lopd_ori + ",lopd_otr_o='" + lopd_otr_o + "',lopd_ces='"
                + lopd_ces + "', lopd_otr_c='" + lopd_otr_c + "' WHERE cod='" + cod + "' AND cla='" + cla + "';";
    }
}
