package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class Stock {
    ConnectionController connectionController = ConnectionController.getConectionController();

    public String cod = "";
    public float exi = 0.00f;
    public float ent = 0.00f;
    public float sal = 0.00f;
    public String ubi = "";
    public float ide = 0.00f;
    public float min = 0.00f;
    public float max = 0.00f;
    public float dis_cai = 0.00f;
    public float dis_cae = 0.00f;
    public float dis_cas = 0.00f;
    public float dis_pii = 0.00f;
    public float dis_pie = 0.00f;
    public float dis_pis = 0.00f;

    public String getCod() {
        return this.cod;
    }

    public float getExi() {
        return this.exi;
    }

    public float getEnt() {
        return this.ent;
    }

    public float getSal() {
        return this.sal;
    }

    public String getUbi() {
        return this.ubi;
    }

    public float getIde() {
        return this.ide;
    }

    public float getMin() {
        return this.min;
    }

    public float getMax() {
        return this.max;
    }

    public ConnectionController getConnectionController() {
        return connectionController;
    }

    public float getDis_cai() {
        return dis_cai;
    }

    public float getDis_cae() {
        return dis_cae;
    }

    public float getDis_cas() {
        return dis_cas;
    }

    public float getDis_pii() {
        return dis_pii;
    }

    public float getDis_pie() {
        return dis_pie;
    }

    public float getDis_pis() {
        return dis_pis;
    }

    public void setCod(String cod) {
        if (cod.length() > 25) {
            this.cod = cod.trim().substring(0, 25).replace("'", "");
        } else {
            this.cod = cod.replace("'", "");
        }
    }

    public void setExi(float exi) {
        this.exi = exi;
    }

    public void setEnt(float ent) {
        this.ent = ent;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void setUbi(String ubi) {
        if (ubi.length() > 15) {
            this.ubi = ubi.trim().substring(0, 15).replace("'", "");
        } else {
            this.ubi = ubi.replace("'", "");
        }
    }

    public void setIde(float ide) {
        this.ide = ide;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public void setConnectionController(ConnectionController connectionController) {
        this.connectionController = connectionController;
    }

    public void setDis_cai(float dis_cai) {
        this.dis_cai = dis_cai;
    }

    public void setDis_cae(float dis_cae) {
        this.dis_cae = dis_cae;
    }

    public void setDis_cas(float dis_cas) {
        this.dis_cas = dis_cas;
    }

    public void setDis_pii(float dis_pii) {
        this.dis_pii = dis_pii;
    }

    public void setDis_pie(float dis_pie) {
        this.dis_pie = dis_pie;
    }

    public void setDis_pis(float dis_pis) {
        this.dis_pis = dis_pis;
    }

    @Override
    public String toString() {
        String type = "";
        String GPVersion = "";
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

        GPVersion = connectionController.getGPVersionDestination();

        if (type.equals("Insert")) {
            if (GPVersion.equals("Distribucion")) {
                return toInsertDis();
            } else {
                return toInsert();
            }
        } else if (type.equals("Update")) {
            if (GPVersion.equals("Distribucion")) {
                return toUpdateDis();
            } else {
                return toUpdate();
            }
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO ALMA" + connectionController.getWarehouseDestination()
                + " (cod,exi,ent,sal,ubi,ide,min,max) VALUES ('" + cod + "'," + exi + "," + ent + ","
                + sal + ",'" + ubi + "'," + ide + "," + min + "," + max + ")";
    }

    public String toInsertDis() {
        return "INSERT INTO ALMA" + connectionController.getWarehouseDestination()
                + " (cod,exi,ent,sal,ubi,ide,min,max,dis_cai,dis_cae,dis_cas,dis_pii,dis_pie,dis_pis) VALUES ('" + cod
                + "'," + exi + "," + ent + ","
                + sal + ",'" + ubi + "'," + ide + "," + min + "," + max + "," + dis_cai + "," + dis_cae + "," + dis_cas
                + "," + dis_pii + "," + dis_pie + "," + dis_pis + ")";
    }

    public String toUpdate() {
        return "UPDATE ALMA" + connectionController.getWarehouseDestination() + " SET exi=" + exi + ",ent=" + ent
                + ",sal=" + sal + ",ubi='" + ubi + "',ide=" + ide + ",min=" + min + ",max=" + max + " WHERE cod='" + cod
                + "';";
    }

    public String toUpdateDis() {
        return "UPDATE ALMA" + connectionController.getWarehouseDestination() + " SET exi=" + exi + ",ent=" + ent
                + ",sal=" + sal + ",ubi='" + ubi + "',ide=" + ide + ",min=" + min + ",max=" + max + ", dis_cai="
                + dis_cai
                + ", dis_cae=" + dis_cae + ", dis_cas=" + dis_cas + ", dis_pii=" + dis_pii + ", dis_pie=" + dis_pie
                + ", dis_pis=" + dis_pis + " WHERE cod='" + cod + "';";
    }
}
