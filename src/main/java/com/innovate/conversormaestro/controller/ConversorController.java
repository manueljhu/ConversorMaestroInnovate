package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.utils.MyAlert;

public class ConversorController<T> implements Initializable {

    private static ConversorController<?> conversorController;
    private ConnectionController connectionController;
    private SQLController sqlController;
    private DBFController dbfController;
    private ExcelController excelController;
    private FinalList<T> finalList;
    private ArrayList<T> lista = new ArrayList<T>();
    int nfilasTotales = 0;
    private StringBuilder logBuilder = new StringBuilder();

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
        if (connectionController.getSourceTab().equals("SQL")) {
            sqlController = SQLController.getSQLController();
        } else if (connectionController.getSourceTab().equals("DBF")) {
            dbfController = DBFController.getDBFController();
        } else if (connectionController.getSourceTab().equals("Excel")) {
            excelController = ExcelController.getExcelController();
        }
        
        finalList = FinalList.getFinalList();
        txtArea.setEditable(false);
        lista = finalList.getLista();
        nfilasTotales = lista.size();
        txtLabel.setText("Procesando 0 de " + nfilasTotales + " filas");
        txtLabel.textProperty().bind(progressMessage);
        txtArea.textProperty().bind(detailMessage);
        txtArea.setWrapText(true);
    }

    @SuppressWarnings("unchecked")
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
        if (connectionController.getSourceTab().equals("SQL")) {
            if (sqlController.isBeEmpty()) {
                System.out.println(sqlController.getTablename());
                connectionController.truncateDataTable(sqlController.getTablename());
            }
        } else if (connectionController.getSourceTab().equals("DBF")) {
            if (dbfController.isBeEmpty()) {
                System.out.println(dbfController.getTablename());
                connectionController.truncateDataTable(dbfController.getTablename());
            }
        } else if (connectionController.getSourceTab().equals("Excel")) {
            if (excelController.isBeEmpty()) {
                System.out.println(excelController.getTablename());
                connectionController.truncateDataTable(excelController.getTablename());
            }
        }
        

        Task<Boolean> task = new Task<Boolean>() {
            @Override
            protected Boolean call() throws Exception {
                boolean result = true;
                int cont = 0;
                int nfilas = 0;
                int nfilasTotales = lista.size();
                for (T t : lista) {
                    if (cont == 100) {
                        cont = 0;
                        Platform.runLater(() -> {
                            logBuilder.setLength(0);
                            detailMessage.set("");
                        });
                    }
                    System.out.println(t.toString());
                    boolean insertResult = true;
                    insertResult = connectionController.insertDataQuery(t.toString());
                    cont++;
                    nfilas++;
                    double progress = (double) nfilas / nfilasTotales;
                    int progressPercentage = (int) Math.round(progress * 100);
                    updateProgress(progress, 1.0);
                    updateMessage("Procesando " + nfilas + " de " + nfilasTotales + " filas");
                    appendLog("Detalle: " + t.toString());
                    System.out.println("Procesando " + nfilas + " de " + nfilasTotales + " filas");
                    System.out.println("Progreso: " + (progress * 100) + "%");
                    if (!insertResult) {
                        appendLog(connectionController.getError());
                        result = false;
                    }
                    appendLog("Procesando " + nfilas + " de " + nfilasTotales + " filas");
                    appendLog("Progreso: " + progressPercentage + "%");
                    appendLog(
                            "--------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (!insertResult) {
                        break;
                    }
                }
                return result;
            }
        };

        task.setOnSucceeded(event -> {
            boolean result = task.getValue();
            MyAlert myAlert = new MyAlert();
            if (result) {
                myAlert.showAlert(AlertType.INFORMATION, "Datos insertados correctamente",
                        "Datos insertados correctamente en la base de datos");
            } else {
                myAlert.showAlert(AlertType.ERROR, "Error al insertar datos",
                        "Error al insertar datos en la base de datos");
            }
        });

        task.setOnFailed(event -> {
            Throwable exception = task.getException();
            exception.printStackTrace();
            MyAlert myAlert = new MyAlert();
            myAlert.showAlert(AlertType.ERROR, "Error en la tarea",
                    "Se produjo un error durante la ejecución de la tarea: " + exception.getMessage());
        });

        progressBar.progressProperty().bind(task.progressProperty());
        progressMessage.bind(task.messageProperty());

        Thread t = new Thread(task);
        t.start();

    }

    private void appendLog(String message) {
        logBuilder.append(message).append("\n\n");
        Platform.runLater(() -> {
            detailMessage.set(logBuilder.toString());
            txtArea.setScrollTop(Double.MAX_VALUE);
        });
    }

}
