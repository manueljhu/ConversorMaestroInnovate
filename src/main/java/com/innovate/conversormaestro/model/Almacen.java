package com.innovate.conversormaestro.model;

public class Almacen {

    private int id;
    private String nom;
    private String ser;
    private String se2;
    private String age;

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

    @Override
    public String toString() {
        return "Almacen:" + "id= " + id + ", nom=" + nom + ", ser=" + ser + ", se2=" + se2 + ", age=" + age + "";
    }
}
