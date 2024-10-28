package com.innovate.conversormaestro.model;

public class Stock {
    private String cod;
    private float exi;
    private float ent;
    private float sal;
    private String ubi;
    private float ide;
    private float min;
    private float max;

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
        return "Stock: cod=" + cod + ", exi=" + exi + ", ent=" + ent + ", sal=" + sal + ", ubi=" + ubi + ", ide=" + ide
                + ", min=" + min + ", max=" + max + "";
    }
}
