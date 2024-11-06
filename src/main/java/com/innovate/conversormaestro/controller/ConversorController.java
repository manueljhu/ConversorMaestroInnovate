package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.ExcelSwitch.FinalList;

public class ConversorController<T> implements Initializable{

    private static ConversorController<?> conversorController;
    private ConnectionController connectionController;
    private ExcelController excelController;
    private FinalList<T> finalList;
    private int nTraspasos = 0;
    private ArrayList<T> lista = new ArrayList<T>();

    @FXML
    public ProgressBar progressBar = new ProgressBar();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionController = ConnectionController.getConectionController();
        excelController = ExcelController.getExcelController();
        finalList = FinalList.getFinalList();
        lista = finalList.getLista();
        progressBar.setProgress(0); 
        progressBar.setAccessibleText("Procesando 0 de "+ nTraspasos +" filas");
    }

    public static <T> ConversorController<T> getConversorController() {
        if (conversorController == null) {
            conversorController = new ConversorController<>();
        }
        ConversorController<T> controller = (ConversorController<T>) conversorController;
        return controller;
    }

    @FXML
    public void setProgressBar(double progress, int nfilas, int nfilasTotales) {
        System.out.println("Procesando " + nfilas + " de " + nfilasTotales + " filas");
        if (progressBar == null) {
            throw new NullPointerException("progressBar is null");
        }
        progressBar.setProgress(progress);
        String text = "Procesando " + nfilas + " de " + nfilasTotales + " filas";
        conversorController.progressBar.setAccessibleText(text);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("RelacionCampos");
    }

    @FXML
    private void convertButton() {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                int nfilas = 0;
                int nfilasTotales = lista.size();
                for (T t : lista) {
                    System.out.println(t.toString());
                    connectionController.insertDataQuery(t.toString());
                    nfilas++;
                    double progress = (double) nfilas / nfilasTotales;
                    setProgressBar(progress, nfilas, nfilasTotales);
                }
                return null;
            }
        };
        new Thread(task).start();
    }

    public void setnTraspasos(int nTraspasos) {
        this.nTraspasos = nTraspasos;
    }

    
}
