package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.utils.MyAlert;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.stage.Stage;

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
    private TitledPane tpSourceFields = new TitledPane();

    @FXML
    private ListView<String> lvSourceFields = new ListView<String>();

    @FXML
    private Button btnOrigintoRelation = new Button();

    @FXML
    private TitledPane tpSourceColumn = new TitledPane();

    @FXML
    private ListView<String> lvRelationSourceFields = new ListView<String>();

    @FXML
    private ComboBox<String> cbDestinationFields = new ComboBox<String>();

    @FXML
    private TitledPane tpDestinationFields = new TitledPane();

    @FXML
    private ListView<String> lvDestinationFields = new ListView<String>();

    @FXML
    private Button btnDestinationtoRelation = new Button();

    @FXML
    private TitledPane tpDestinationColumn = new TitledPane();

    @FXML
    private ListView<String> lvRelationDestinationFields = new ListView<String>();

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
        tpSourceFields.setText("Campos de origen");
        tpDestinationFields.setText("Campos de destino");
        tpSourceFields.setCollapsible(false);
        tpDestinationFields.setCollapsible(false);
        tpSourceColumn.setCollapsible(false);
        tpDestinationColumn.setCollapsible(false);
        btnOrigintoRelation.setDisable(true);
        btnDestinationtoRelation.setDisable(true);

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
        btnOrigintoRelation.setDisable(false);
        lvRelationSourceFields.getItems().clear();
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
        btnDestinationtoRelation.setDisable(false);
        lvRelationDestinationFields.getItems().clear();
        lvDestinationFields.getItems().clear();
        lvDestinationFields.getItems()
                .addAll(connectionController.getColumnDestination(cbDestinationFields.getValue()));
    }

    @FXML
    private void relateFieldsFromSource() {
        int sourceIndex = lvSourceFields.getSelectionModel().getSelectedIndex();
        String sourceValue = lvSourceFields.getSelectionModel().getSelectedItem();

        if (sourceValue != null) {
            int selectedIndex = lvRelationSourceFields.getSelectionModel().getSelectedIndex();

            if (selectedIndex != -1) {
                lvRelationSourceFields.getItems().set(selectedIndex, sourceValue);
                lvRelationSourceFields.getSelectionModel().clearSelection();
            } else {
                lvRelationSourceFields.getItems().add(sourceValue);
            }
        } else {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "No se ha seleccionado ningún campo de origen");
        }

        System.out.println("Index origen: " + sourceIndex + " Valor origen: " + sourceValue);
    }

    @FXML
    private void relateFieldsFromDestination() {
        int sourceIndex = lvDestinationFields.getSelectionModel().getSelectedIndex();
        String sourceValue = lvDestinationFields.getSelectionModel().getSelectedItem();

        if (sourceValue != null) {
            int selectedIndex = lvRelationDestinationFields.getSelectionModel().getSelectedIndex();

            if (selectedIndex != -1) {
                lvRelationDestinationFields.getItems().set(selectedIndex, sourceValue);
                lvRelationDestinationFields.getSelectionModel().clearSelection();
            } else {
                lvRelationDestinationFields.getItems().add(sourceValue);
            }
        } else {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "No se ha seleccionado ningún campo de destino");
        }

        System.out.println("Index destino: " + sourceIndex + " Valor destino: " + sourceValue);
    }

    @FXML
    private void deleteRelation() {
        int indexSource = lvRelationSourceFields.getSelectionModel().getSelectedIndex();
        int indexDestination = lvRelationDestinationFields.getSelectionModel().getSelectedIndex();

        if (indexSource != -1) {
            lvRelationSourceFields.getItems().remove(indexSource);
            lvRelationDestinationFields.getItems().remove(indexSource);
            lvRelationSourceFields.getSelectionModel().clearSelection();
        } else if (indexDestination != -1) {
            lvRelationDestinationFields.getItems().remove(indexDestination);
            lvRelationSourceFields.getItems().remove(indexDestination);
            lvRelationDestinationFields.getSelectionModel().clearSelection();
        } else {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "No se ha seleccionado ningún campo para eliminar");
        }
    }

    @FXML
    private void emptyAllRelation() {
        lvRelationSourceFields.getItems().clear();
        lvRelationDestinationFields.getItems().clear();
    }

    @FXML
    private void readArrayList() {
        System.out.println("-------------------------------------");
        System.out.println("Origen");
        for (String s : lvRelationSourceFields.getItems()) {
            System.out.println(s + " " + lvRelationSourceFields.getItems().indexOf(s));
        }
        System.out.println("-------------------------------------");
        System.out.println("Destino");
        for (String s : lvRelationDestinationFields.getItems()) {
            System.out.println(s + " " + lvRelationDestinationFields.getItems().indexOf(s));
        }
    }

}