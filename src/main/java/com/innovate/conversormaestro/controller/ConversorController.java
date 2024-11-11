package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.ExcelSwitch.FinalList;

public class ConversorController<T> implements Initializable {

    private static ConversorController<?> conversorController;
    private ConnectionController connectionController;
    private ExcelController excelController;
    private FinalList<T> finalList;
    private int nTraspasos = 0;
    private ArrayList<T> lista = new ArrayList<T>();
    int nfilasTotales = 0;

    @FXML
    private ProgressBar progressBar = new ProgressBar();

    @FXML
    private TextArea txtArea = new TextArea();

    @FXML
    private Label txtLabel = new Label();

    private StringProperty progressMessage = new SimpleStringProperty();
    private StringProperty detailMessage = new SimpleStringProperty();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionController = ConnectionController.getConectionController();
        excelController = ExcelController.getExcelController();
        finalList = FinalList.getFinalList();
        txtArea.setEditable(false);
        txtArea.setDisable(true);
        lista = finalList.getLista();
        nfilasTotales = lista.size();
        txtLabel.setText("Procesando 0 de " + nfilasTotales + " filas");
        txtLabel.textProperty().bind(progressMessage);
        txtArea.textProperty().bind(detailMessage);
    }

    public static <T> ConversorController<T> getConversorController() {
        if (conversorController == null) {
            conversorController = new ConversorController<>();
        }
        ConversorController<T> controller = (ConversorController<T>) conversorController;
        return controller;
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("RelacionCampos");
    }

    @FXML
    private void convertButton() {
        if (excelController.isBeEmpty()){
            System.out.println(excelController.getTablename());
            connectionController.truncateDataTable(excelController.getTablename());
        }
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
                    updateProgress(progress, 1.0);
                    updateMessage("Procesando " + nfilas + " de " + nfilasTotales + " filas");
                    detailMessage.set("Detalle: " + t.toString());
                    System.out.println("Procesando " + nfilas + " de " + nfilasTotales + " filas");
                    System.out.println("Progreso: " + (progress * 100) + "%");
                }
                return null;
            }
        };

        progressBar.progressProperty().bind(task.progressProperty());
        progressMessage.bind(task.messageProperty());
        
        new Thread(task).start();
    }

    public void setnTraspasos(int nTraspasos) {
        this.nTraspasos = nTraspasos;
    }

}
