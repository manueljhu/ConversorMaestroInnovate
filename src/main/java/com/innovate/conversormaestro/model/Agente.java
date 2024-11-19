package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;

public class Agente {

    public String cod = "";
    public String nom = "";
    public String dir = "";
    public String pob = "      -";
    public int npro = 0;
    public String pro = "";
    public String nif = "";
    public String te1 = "";
    public String te2 = "";
    public String fax = "";
    public String mov = "";
    public String ob1 = "";
    public String ob2 = "";
    public String ob3 = "";
    public String rut = "000001";
    public int tip = 1;
    public int com = 1;
    public float co1 = 0.00f;
    public float co2 = 0.00f;
    public float co3 = 0.00f;
    public float co4 = 0.00f;
    public float co5 = 0.00f;
    public float lim = 0.000f;
    public float pais = 1;
    public int tia = 1;
    public String alt = "NULL";
    public String fot = "";
    public String web = "";
    public String xxx = "";
    public String rut_crm = "";
    public float vdi_crm = 0;
    public float ldi_crm = 0;
    public String tcu_crm = "V";
    public String cud_crm = "S";
    public String est_crm = "A";
    public String v01 = "";
    public String v02 = "";
    public String v03 = "";
    public String v04 = "";
    public String v05 = "";
    public String v06 = "";
    public String v07 = "";
    public String v08 = "";
    public String v09 = "";
    public String v10 = "";
    public String v11 = "";
    public String v12 = "";
    public String historia = "";
    public float lopd_ori = 0;
    public String lopd_otr_o = "";
    public String lopd_ces = "";
    public String lopd_otr_c = "";
    public String age_usu = "";
    public String age_ver_todo = "N";
    public int com_per = 1;
    public int com_imp = 1;
    public int com_inc = 1;
    public float com_impinc = 0.000f;
    public float com_por = 0.000f;
    public String web_acc = "N";
    public String web_psw = "";
    public String web_todo = "N";
    public String web_crear = "N";
    public String web_pago = "N";
    public String web_dto = "N";
    public String web_edipre = "N";
    public String web_acccob = "N";

    public Agente() {
    }

    public String getCod() {
        return this.cod;
    }

    public String getNom() {
        return this.nom;
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

    public String getNif() {
        return this.nif;
    }

    public String getTe1() {
        return this.te1;
    }

    public String getTe2() {
        return this.te2;
    }

    public String getFax() {
        return this.fax;
    }

    public String getMov() {
        return this.mov;
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

    public String getRut() {
        return this.rut;
    }

    public int getTip() {
        return this.tip;
    }

    public int getCom() {
        return this.com;
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

    public float getLim() {
        return this.lim;
    }

    public float getPais() {
        return this.pais;
    }

    public int getTia() {
        return this.tia;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getFot() {
        return this.fot;
    }

    public String getWeb() {
        return this.web;
    }

    public String getXxx() {
        return this.xxx;
    }

    public String getRut_Crm() {
        return this.rut_crm;
    }

    public float getVdi_Crm() {
        return this.vdi_crm;
    }

    public float getLdi_Crm() {
        return this.ldi_crm;
    }

    public String getTcu_Crm() {
        return this.tcu_crm;
    }

    public String getCud_Crm() {
        return this.cud_crm;
    }

    public String getEst_Crm() {
        return this.est_crm;
    }

    public String getV01() {
        return this.v01;
    }

    public String getV02() {
        return this.v02;
    }

    public String getV03() {
        return this.v03;
    }

    public String getV04() {
        return this.v04;
    }

    public String getV05() {
        return this.v05;
    }

    public String getV06() {
        return this.v06;
    }

    public String getV07() {
        return this.v07;
    }

    public String getV08() {
        return this.v08;
    }

    public String getV09() {
        return this.v09;
    }

    public String getV10() {
        return this.v10;
    }

    public String getV11() {
        return this.v11;
    }

    public String getV12() {
        return this.v12;
    }

    public String getHistoria() {
        return this.historia;
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

    public String getAge_Usu() {
        return this.age_usu;
    }

    public String getAge_Ver_Todo() {
        return this.age_ver_todo;
    }

    public int getCom_Per() {
        return this.com_per;
    }

    public int getCom_Imp() {
        return this.com_imp;
    }

    public int getCom_Inc() {
        return this.com_inc;
    }

    public float getCom_Impinc() {
        return this.com_impinc;
    }

    public float getCom_Por() {
        return this.com_por;
    }

    public String getWeb_Acc() {
        return this.web_acc;
    }

    public String getWeb_Psw() {
        return this.web_psw;
    }

    public String getWeb_Todo() {
        return this.web_todo;
    }

    public String getWeb_Crear() {
        return this.web_crear;
    }

    public String getWeb_Pago() {
        return this.web_pago;
    }

    public String getWeb_Dto() {
        return this.web_dto;
    }

    public String getWeb_Edipre() {
        return this.web_edipre;
    }

    public String getWeb_Acccob() {
        return this.web_acccob;
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

    public void setNif(String nif) {
        if (nif.length() > 15) {
            this.nif = nif.trim().substring(0, 15).replace("'", "");
        } else {
            this.nif = nif.replace("'", "");
        }
    }

    public void setTe1(String te1) {
        if (te1.length() > 18) {
            this.te1 = te1.trim().substring(0, 18).replace("'", "");
        } else {
            this.te1 = te1.replace("'", "");
        }
    }

    public void setTe2(String te2) {
        if (te2.length() > 18) {
            this.te2 = te2.trim().substring(0, 18).replace("'", "");
        } else {
            this.te2 = te2.replace("'", "");
        }
    }

    public void setFax(String fax) {
        if (fax.length() > 18) {
            this.fax = fax.trim().substring(0, 18).replace("'", "");
        } else {
            this.fax = fax.replace("'", "");
        }
    }

    public void setMov(String mov) {
        if (mov.length() > 18) {
            this.mov = mov.trim().substring(0, 18).replace("'", "");
        } else {
            this.mov = mov.replace("'", "");
        }
    }

    public void setOb1(String ob1) {
        if (ob1.length() > 70) {
            this.ob1 = ob1.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob1 = ob1.replace("'", "");
        }
    }

    public void setOb2(String ob2) {
        if (ob2.length() > 70) {
            this.ob2 = ob2.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob2 = ob2.replace("'", "");
        }
    }

    public void setOb3(String ob3) {
        if (ob3.length() > 70) {
            this.ob3 = ob3.trim().substring(0, 70).replace("'", "");
        } else {
            this.ob3 = ob3.replace("'", "");
        }
    }

    public void setRut(String rut) {
        if (rut.length() > 6) {
            this.rut = rut.trim().substring(0, 6).replace("'", "");
        } else {
            this.rut = rut.replace("'", "");
        }
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setCom(int com) {
        this.com = com;
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

    public void setLim(float lim) {
        this.lim = lim;
    }

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setTia(int tia) {
        this.tia = tia;
    }

    public void setAlt(String alt) {
        if (alt == null || alt.equals("NULL")) {
            this.alt = "NULL";
        } else {
            this.alt = "'" + alt + "'";
        }
    }

    public void setFot(String fot) {
        if (fot.length() > 20) {
            this.fot = fot.trim().substring(0, 20).replace("'", "");
        } else {
            this.fot = fot.replace("'", "");
        }
    }

    public void setWeb(String web) {
        if (web.length() > 80) {
            this.web = web.trim().substring(0, 80).replace("'", "");
        } else {
            this.web = web.replace("'", "");
        }
    }

    public void setXxx(String xxx) {
        if (xxx.length() > 60) {
            this.xxx = xxx.trim().substring(0, 60).replace("'", "");
        } else {
            this.xxx = xxx.replace("'", "");
        }
    }

    public void setRut_Crm(String rut_crm) {
        this.rut_crm = rut_crm;
    }

    public void setVdi_Crm(float vdi_crm) {
        this.vdi_crm = vdi_crm;
    }

    public void setLdi_Crm(float ldi_crm) {
        this.ldi_crm = ldi_crm;
    }

    public void setTcu_Crm(String tcu_crm) {
        if (tcu_crm.length() > 1) {
            this.tcu_crm = tcu_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.tcu_crm = tcu_crm.replace("'", "");
        }
    }

    public void setCud_Crm(String cud_crm) {
        if (cud_crm.length() > 1) {
            this.cud_crm = cud_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.cud_crm = cud_crm.replace("'", "");
        }
    }

    public void setEst_Crm(String est_crm) {
        if (est_crm.length() > 1) {
            this.est_crm = est_crm.trim().substring(0, 1).replace("'", "");
        } else {
            this.est_crm = est_crm.replace("'", "");
        }
    }

    public void setV01(String v01) {
        if (v01.length() > 50) {
            this.v01 = v01.trim().substring(0, 50).replace("'", "");
        } else {
            this.v01 = v01.replace("'", "");
        }
    }

    public void setV02(String v02) {
        if (v02.length() > 50) {
            this.v02 = v02.trim().substring(0, 50).replace("'", "");
        } else {
            this.v02 = v02.replace("'", "");
        }
    }

    public void setV03(String v03) {
        if (v03.length() > 50) {
            this.v03 = v03.trim().substring(0, 50).replace("'", "");
        } else {
            this.v03 = v03.replace("'", "");
        }
    }

    public void setV04(String v04) {
        if (v04.length() > 50) {
            this.v04 = v04.trim().substring(0, 50).replace("'", "");
        } else {
            this.v04 = v04.replace("'", "");
        }
    }

    public void setV05(String v05) {
        if (v05.length() > 50) {
            this.v05 = v05.trim().substring(0, 50).replace("'", "");
        } else {
            this.v05 = v05.replace("'", "");
        }
    }

    public void setV06(String v06) {
        if (v06.length() > 50) {
            this.v06 = v06.trim().substring(0, 50).replace("'", "");
        } else {
            this.v06 = v06.replace("'", "");
        }
    }

    public void setV07(String v07) {
        if (v07.length() > 50) {
            this.v07 = v07.trim().substring(0, 50).replace("'", "");
        } else {
            this.v07 = v07.replace("'", "");
        }
    }

    public void setV08(String v08) {
        if (v08.length() > 50) {
            this.v08 = v08.trim().substring(0, 50).replace("'", "");
        } else {
            this.v08 = v08.replace("'", "");
        }
    }

    public void setV09(String v09) {
        if (v09.length() > 50) {
            this.v09 = v09.trim().substring(0, 50).replace("'", "");
        } else {
            this.v09 = v09.replace("'", "");
        }
    }

    public void setV10(String v10) {
        if (v10.length() > 50) {
            this.v10 = v10.trim().substring(0, 50).replace("'", "");
        } else {
            this.v10 = v10.replace("'", "");
        }
    }

    public void setV11(String v11) {
        if (v11.length() > 50) {
            this.v11 = v11.trim().substring(0, 50).replace("'", "");
        } else {
            this.v11 = v11.replace("'", "");
        }
    }

    public void setV12(String v12) {
        if (v12.length() > 50) {
            this.v12 = v12.trim().substring(0, 50).replace("'", "");
        } else {
            this.v12 = v12.replace("'", "");
        }
    }

    public void setHistoria(String historia) {
        this.historia = historia;
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

    public void setAge_Usu(String age_usu) {
        if (age_usu.length() > 2) {
            this.age_usu = age_usu.trim().substring(0, 2).replace("'", "");
        } else {
            this.age_usu = age_usu.replace("'", "");
        }
    }

    public void setAge_Ver_Todo(String age_ver_todo) {
        if (age_ver_todo.length() > 1) {
            this.age_ver_todo = age_ver_todo.trim().substring(0, 1).replace("'", "");
        } else {
            this.age_ver_todo = age_ver_todo.replace("'", "");
        }
    }

    public void setCom_Per(int com_per) {
        this.com_per = com_per;
    }

    public void setCom_Imp(int com_imp) {
        this.com_imp = com_imp;
    }

    public void setCom_Inc(int com_inc) {
        this.com_inc = com_inc;
    }

    public void setCom_Impinc(float com_impinc) {
        this.com_impinc = com_impinc;
    }

    public void setCom_Por(float com_por) {
        this.com_por = com_por;
    }

    public void setWeb_Acc(String web_acc) {
        if (web_acc.length() > 1) {
            this.web_acc = web_acc.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_acc = web_acc.replace("'", "");
        }
    }

    public void setWeb_Psw(String web_psw) {
        if (web_psw.length() > 15) {
            this.web_psw = web_psw.trim().substring(0, 15).replace("'", "");
        } else {
            this.web_psw = web_psw.replace("'", "");
        }
    }

    public void setWeb_Todo(String web_todo) {
        if (web_todo.length() > 1) {
            this.web_todo = web_todo.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_todo = web_todo.replace("'", "");
        }
    }

    public void setWeb_Crear(String web_crear) {
        if (web_crear.length() > 1) {
            this.web_crear = web_crear.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_crear = web_crear.replace("'", "");
        }
    }

    public void setWeb_Pago(String web_pago) {
        if (web_pago.length() > 1) {
            this.web_pago = web_pago.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_pago = web_pago.replace("'", "");
        }
    }

    public void setWeb_Dto(String web_dto) {
        if (web_dto.length() > 1) {
            this.web_dto = web_dto.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_dto = web_dto.replace("'", "");
        }
    }

    public void setWeb_Edipre(String web_edipre) {
        if (web_edipre.length() > 1) {
            this.web_edipre = web_edipre.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_edipre = web_edipre.replace("'", "");
        }
    }

    public void setWeb_Acccob(String web_acccob) {
        if (web_acccob.length() > 1) {
            this.web_acccob = web_acccob.trim().substring(0, 1).replace("'", "");
        } else {
            this.web_acccob = web_acccob.replace("'", "");
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
        return "INSERT INTO AGENTG(cod, nom, dir, pob, npro, pro, nif, te1, te2, fax, mov, ob1, ob2, ob3, rut, tip, com, "
                +
                "co1, co2, co3, co4, co5, lim, pais, tia, alt, fot, web, xxx, rut_crm, vdi_crm, ldi_crm, tcu_crm, cud_crm, est_crm, "
                +
                "v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12, historia, lopd_ori, lopd_otr_o, lopd_ces, lopd_otr_c, "
                +
                "age_usu, age_ver_todo, com_per, com_imp, com_inc, com_impinc, com_por, web_acc, web_psw, web_todo, web_crear, web_pago, "
                +
                "web_dto, web_edipre, web_acccob) VALUES ('"
                + cod + "', '" + nom + "', '" + dir + "', '" + pob + "', " + npro + ", '" + pro + "', '" + nif + "', '"
                + te1 + "', '" + te2 + "', '" + fax + "', '" + mov + "', '" + ob1 + "', '" + ob2 + "', '" + ob3 + "', '"
                + rut + "', " + tip + ", " + com + ", " + co1 + ", " + co2 + ", " + co3 + ", " + co4 + ", " + co5 + ", "
                + lim + ", " + pais + ", " + tia + ", " + alt + ", '" + fot + "', '" + web + "', '" + xxx + "', '"
                + rut_crm + "', " + vdi_crm + ", " + ldi_crm + ", '" + tcu_crm + "', '" + cud_crm + "', '" + est_crm
                + "', '" + v01 + "', '" + v02 + "', '" + v03 + "', '" + v04 + "', '" + v05 + "', '" + v06 + "', '" + v07
                + "', '" + v08 + "', '" + v09 + "', '" + v10 + "', '" + v11 + "', '" + v12 + "', '" + historia + "', "
                + lopd_ori + ", '" + lopd_otr_o + "', '" + lopd_ces + "', '" + lopd_otr_c + "', '" + age_usu + "', '"
                + age_ver_todo + "', " + com_per + ", " + com_imp + ", " + com_inc + ", " + com_impinc + ", " + com_por
                + ", '" + web_acc + "', '" + web_psw + "', '" + web_todo + "', '" + web_crear + "', '" + web_pago
                + "', '"
                + web_dto + "', '" + web_edipre + "', '" + web_acccob + "');";
    }

    public String toUpdate() {
        return "UPDATE AGENTG SET nom = '" + nom + "',dir='" + dir + "',pob='" + pob + "',npro="
                + npro + ",pro='" + pro + "',nif='" + nif + "',te1='" + te1 + "',te2='" + te2 + "',fax='" + fax
                + "',mov='" + mov + "',ob1='" + ob1 + "',ob2='" + ob2 + "',ob3='" + ob3 + "',rut='" + rut + "',tip="
                + tip + ",com=" + com + ",co1=" + co1 + ",co2=" + co2 + ",co3=" + co3 + ",co4=" + co4 + ",co5=" + co5
                + ",lim=" + lim + ",pais=" + pais + ",tia=" + tia + ",alt=" + alt + ",fot='" + fot + "',web='" + web
                + "',xxx='" + xxx + "',rut_crm='" + rut_crm + "',vdi_crm=" + vdi_crm + ",ldi_crm=" + ldi_crm
                + ",tcu_crm='" + tcu_crm + "',cud_crm='" + cud_crm + "',est_crm='" + est_crm + "',v01='" + v01
                + "',v02='" + v02 + "',v03='" + v03 + "',v04='" + v04 + "',v05='" + v05 + "',v06='" + v06 + "',v07='"
                + v07 + "',v08='" + v08 + "',v09='" + v09 + "',v10='" + v10 + "',v11='" + v11 + "',v12='" + v12
                + "',historia='" + historia + "',lopd_ori=" + lopd_ori + ",lopd_otr_o='" + lopd_otr_o + "',lopd_ces='"
                + lopd_ces + "',lopd_otr_c='" + lopd_otr_c + "',age_usu='" + age_usu + "',age_ver_todo='" + age_ver_todo
                + "',com_per=" + com_per + ",com_imp=" + com_imp + ",com_inc=" + com_inc + ",com_impinc=" + com_impinc
                + ",com_por=" + com_por + ",web_acc='" + web_acc + "',web_psw='" + web_psw + "',web_todo='" + web_todo
                + "',web_crear='" + web_crear + "',web_pago='" + web_pago + "',web_dto='" + web_dto + "',web_edipre='"
                + web_edipre + "',web_acccob='" + web_acccob + "' WHERE cod = '" + cod + "'; ";
    }
}
