package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;

public class Almacen {
    private ConnectionController connectionController;
    private int id = 1;
    public String nom = "";
    public String ser = "";
    public String se2 = "";
    public String age = "";
    public String cer_tipo = "";
    public String cer_ropo = "";

    public int getId() {
        return id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getSer() {
        return this.ser;
    }

    public String getSe2() {
        return this.se2;
    }

    public String getAge() {
        return this.age;
    }

    public String getCer_tipo() {
        return cer_tipo;
    }

    public String getCer_ropo() {
        return cer_ropo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        if (nom.length() > 20) {
            this.nom = nom.trim().substring(0, 20).replace("'", "");
        } else {
            this.nom = nom.replace("'", "");
        }
    }

    public void setSer(String ser) {
        if (ser.length() > 2) {
            this.ser = ser.trim().substring(0, 2).replace("'", "");
        } else {
            this.ser = ser.replace("'", "");
        }
    }

    public void setSe2(String se2) {
        if (se2.length() > 2) {
            this.se2 = se2.trim().substring(0, 2).replace("'", "");
        } else {
            this.se2 = se2.replace("'", "");
        }
    }

    public void setAge(String age) {
        if (age.length() > 6) {
            this.age = age.trim().substring(0, 6).replace("'", "");
        } else {
            this.age = age.replace("'", "");
        }
    }

    public void setCer_tipo(String cer_tipo) {
        if (cer_tipo.length() > 1) {
            this.cer_tipo = cer_tipo.trim().substring(0, 1).replace("'", "");
        } else {
            this.cer_tipo = cer_tipo.replace("'", "");
        }
    }

    public void setCer_ropo(String cer_ropo) {
        if (cer_ropo.length() > 30) {
            this.cer_ropo = cer_ropo.trim().substring(0, 30).replace("'", "");
        } else {
            this.cer_ropo = cer_ropo.replace("'", "");
        }
    }

    @Override
    public String toString() {
        connectionController = ConnectionController.getInstance();
        String GPVersion = connectionController.getGPVersionDestination();
        if (GPVersion.equals("Fitosanitarios")) {
            return toUpdateFit();
        } else {
            return toUpdate();
        }
    }

    public String toUpdate() {
        return "UPDATE ALMACE SET nom = '" + nom + "', ser = '" + ser + "', se2 = '" + se2 + "', age = '" + age
                + "' WHERE id = " + id + ";";
    }

    public String toUpdateFit() {
        return "UPDATE ALMACE SET nom = '" + nom + "', ser = '" + ser + "', se2 = '" + se2 + "', age = '" + age
                + "', cer_tipo = '" + cer_tipo + "', cer_ropo = '" + cer_ropo + "' WHERE id = " + id + ";";
    }
}