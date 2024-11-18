package com.innovate.conversormaestro.model;

import java.util.ArrayList;

public class FinalList<T> {
    private static FinalList<?> finalList;
    private ArrayList<T> lista;

    private FinalList() {
    }

    public static <T> FinalList<T> getFinalList() {
        if (finalList == null) {
            finalList = new FinalList<>();
        }
        FinalList<T> list = (FinalList<T>) finalList;
        return list;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
}