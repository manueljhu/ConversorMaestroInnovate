package com.innovate.conversormaestro.model;

public class Relacion {

    private static Relacion relacion = null;
    private String campoOrigen;
    private String campoDestino;

    public Relacion() {
        
    }

    public static Relacion getRelacion() {
        if (relacion == null) {
            relacion = new Relacion();
        }
        return relacion;
    }

    public Relacion(String campoOrigen, String campoDestino) {
        this.campoOrigen = campoOrigen;
        this.campoDestino = campoDestino;
    }

    public String getCampoOrigen() {
        return campoOrigen;
    }

    public void setCampoOrigen(String campoOrigen) {
        this.campoOrigen = campoOrigen;
    }

    public String getCampoDestino() {
        return campoDestino;
    }

    public void setCampoDestino(String campoDestino) {
        this.campoDestino = campoDestino;
    }
}
