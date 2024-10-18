package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.SQLController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RelacionCamposController implements Initializable {

    private ConnectionController connectionController;
    private SQLController sqlController;
    private DBFController dbfController;

    @FXML
    private Label title = new Label();

    // Label to show the source server
    @FXML
    private Label lblServerSource = new Label();

    @FXML
    private ComboBox<String> cbSourceFields = new ComboBox<String>();

    @FXML
    private ListView<String> lvSourceFields = new ListView<String>();

    @FXML
    private ComboBox<String> cbDestinationFields = new ComboBox<String>();

    @FXML
    private ListView<String> lvDestinationFields = new ListView<String>();

    // Radio buttons to select the option to insert or update
    @FXML
    private RadioButton rbInsert;

    @FXML
    private RadioButton rbUpdate;

    ToggleGroup group = new ToggleGroup();
    String NameOption;

    @SuppressWarnings("null")
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionController = ConnectionController.getConectionController();
        sqlController = SQLController.getSQLController();
        dbfController = DBFController.getDBFController();
        title.setText(connectionController.getSourceTab());
        lblServerSource.setText(connectionController.getSourceTab());
        System.out.println(lblServerSource.getText());
        rbInsert.setSelected(true);

        rbInsert.setToggleGroup(group);
        rbUpdate.setToggleGroup(group);

        if (connectionController.getSourceTab().equals("SQL")) {
            fillComboSource();
        } else if (connectionController.getSourceTab().equals("DBF")) {
            cbSourceFields.setDisable(true);
            fillListSource();
        } else if (connectionController.getSourceTab().equals("Excel")) {
            cbSourceFields.setDisable(true);
            fillListSource();
        }

        fillComboDestination();

        cbSourceFields.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null || !newValue.isEmpty()) {
                fillListSource();
            }
        });

        cbDestinationFields.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null || !newValue.isEmpty()) {
                fillListDestination();
            }
        });

        NameOption = "Insert";
    }

    @FXML
    private void SelectedOption() {
        if (rbInsert.isSelected()) {
            NameOption = "Insert";
        } else if (rbUpdate.isSelected()) {
            NameOption = "Update";
        }
        System.out.println(NameOption);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("ConfiguracionConexion");
    }

    @FXML
    private void readDBF() {
        dbfController.readDBFFile();
    }

    private void fillComboSource() {
        cbSourceFields.getItems().addAll(sqlController.getDataComboOrigin());
    }

    private void fillListSource() {
        lvSourceFields.getItems().clear();
        if (connectionController.getSourceTab().equals("SQL")) {
            lvSourceFields.getItems().addAll(sqlController.getColumnOrigin(cbSourceFields.getValue()));
        } else if (connectionController.getSourceTab().equals("DBF")) {
            lvSourceFields.getItems().addAll(dbfController.getColumnOrigin());
        } else if (connectionController.getSourceTab().equals("Excel")) {
            cbSourceFields.setDisable(true);
        }
        
    }

    private void fillComboDestination() {
        cbDestinationFields.getItems().addAll(connectionController.getDataComboDestination());
    }

    private void fillListDestination() {
        lvDestinationFields.getItems().clear();
        lvDestinationFields.getItems()
                .addAll(connectionController.getColumnDestination(cbDestinationFields.getValue()));
    }

}