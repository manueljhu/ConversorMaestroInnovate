package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;

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

    @Override
    public String toString() {
        return "INSERT INTO ALMA" + connectionController.getWarehouseDestination()
                + " (cod,exi,ent,sal,ubi,ide,min,max) VALUES ('" + cod + "'," + exi + "," + ent + ","
                + sal + ",'" + ubi + "'," + ide + "," + min + "," + max + ")";
    }
}
