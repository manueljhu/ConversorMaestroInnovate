package com.innovate.conversormaestro.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.MyAlert;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.ini4j.Wini;

public class RelacionCamposController implements Initializable {

    private ConnectionController connectionController;
    private SQLController sqlController;
    private DBFController dbfController = new DBFController();
    private ExcelController excelController = new ExcelController();
    @FXML
    private MenuItem miSave = new MenuItem();

    @FXML
    private MenuItem miLoad = new MenuItem();

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
    private Button btnOrigintoRelation2 = new Button();

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
    private Button btnDestinationtoRelation2 = new Button();

    @FXML
    private TitledPane tpDestinationColumn = new TitledPane();

    @FXML
    private ListView<String> lvRelationDestinationFields = new ListView<String>();

    // Radio buttons to select the option to insert or update
    @FXML
    private RadioButton rbInsert;

    @FXML
    private RadioButton rbUpdate;

    @FXML
    private CheckBox cboxEmptyDestination;

    ToggleGroup group = new ToggleGroup();
    String NameOption;
    File fileDBF;
    File fileExcel;
    

    @SuppressWarnings("null")
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionController = ConnectionController.getConectionController();
        title.setText(connectionController.getSourceTab());
        lblServerSource.setText(connectionController.getSourceTab());
        rbInsert.setSelected(true);
        tpSourceFields.setText("Campos de origen");
        tpDestinationFields.setText("Campos de destino");
        tpSourceFields.setCollapsible(false);
        tpDestinationFields.setCollapsible(false);
        tpSourceColumn.setCollapsible(false);
        tpDestinationColumn.setCollapsible(false);
        btnOrigintoRelation.setDisable(true);
        btnOrigintoRelation2.setDisable(true);
        btnDestinationtoRelation.setDisable(true);
        btnDestinationtoRelation2.setDisable(true);
        cboxEmptyDestination.setSelected(false);

        rbInsert.setToggleGroup(group);
        rbUpdate.setToggleGroup(group);
        boolean firstTime;
        if (connectionController.getSourceTab().equals("SQL")) {
            sqlController = SQLController.getSQLController();
            fillComboSource();
        } else if (connectionController.getSourceTab().equals("DBF")) {
            dbfController = DBFController.getDBFController();
            cbSourceFields.setDisable(true);
            fileDBF = new File(dbfController.getPathSourceDBF());
            firstTime = connectionController.isFirstTime();
            if (!firstTime){
                if (dbfController.getRelaciones() != null) {
                    btnDestinationtoRelation.setDisable(false);
                    btnDestinationtoRelation2.setDisable(false);
                    btnOrigintoRelation.setDisable(false);
                    btnOrigintoRelation2.setDisable(false);
                    lvSourceFields.getItems().addAll(dbfController.getColumnOrigin());
                    cbDestinationFields.setValue(dbfController.getTablename());
                    lvDestinationFields.getItems()
                    .addAll(connectionController.getColumnDestination(cbDestinationFields.getValue()));
                    for (int i = 0; i < dbfController.getRelaciones().size(); i++) {
                        lvRelationSourceFields.getItems().add(dbfController.getRelaciones().get(i).getCampoOrigen());
                        lvRelationDestinationFields.getItems().add(dbfController.getRelaciones().get(i).getCampoDestino());
                    }
                    cboxEmptyDestination.setSelected(dbfController.isBeEmpty());
                }
            } else {
                fileDBF = new File(dbfController.getPathSourceDBF());
                fillListSource();
                connectionController.setFirstTime(false);
            }
        } else if (connectionController.getSourceTab().equals("Excel")) {
            excelController = ExcelController.getExcelController();
            cbSourceFields.setDisable(true);
            fileExcel = new File(excelController.getPathSourceExcel());
            firstTime = connectionController.isFirstTime();
            if (!firstTime) {
                if (excelController.getRelaciones() != null) {
                    btnDestinationtoRelation.setDisable(false);
                    btnDestinationtoRelation2.setDisable(false);
                    btnOrigintoRelation.setDisable(false);
                    btnOrigintoRelation2.setDisable(false);
                    lvSourceFields.getItems().addAll(excelController.getColumnOrigin());
                    cbDestinationFields.setValue(excelController.getTablename());
                    lvDestinationFields.getItems()
                    .addAll(connectionController.getColumnDestination(cbDestinationFields.getValue()));
                    for (int i = 0; i < excelController.getRelaciones().size(); i++) {
                        lvRelationSourceFields.getItems().add(excelController.getRelaciones().get(i).getCampoOrigen());
                        lvRelationDestinationFields.getItems().add(excelController.getRelaciones().get(i).getCampoDestino());
                    }
                    cboxEmptyDestination.setSelected(excelController.isBeEmpty());
                }
            } else {
                fileExcel = new File(excelController.getPathSourceExcel());
                fillListSource();
                connectionController.setFirstTime(false);
            }   
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

        lvRelationSourceFields.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lvRelationDestinationFields.getSelectionModel().clearSelection();
                lvSourceFields.getSelectionModel().clearSelection();
                lvDestinationFields.getSelectionModel().clearSelection();
            }
        });
        
        lvRelationDestinationFields.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lvRelationSourceFields.getSelectionModel().clearSelection();
                lvSourceFields.getSelectionModel().clearSelection();
                lvDestinationFields.getSelectionModel().clearSelection();
            }
        });
        
        lvSourceFields.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lvRelationSourceFields.getSelectionModel().clearSelection();
                lvRelationDestinationFields.getSelectionModel().clearSelection();
                lvDestinationFields.getSelectionModel().clearSelection();
            }
        });
        
        lvDestinationFields.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                lvRelationSourceFields.getSelectionModel().clearSelection();
                lvRelationDestinationFields.getSelectionModel().clearSelection();
                lvSourceFields.getSelectionModel().clearSelection();
            }
        });
    }

    @FXML
    private void SelectedOption() {
        if (rbInsert.isSelected()) {
            NameOption = "Insert";
            cboxEmptyDestination.setDisable(false);
        } else if (rbUpdate.isSelected()) {
            NameOption = "Update";
            cboxEmptyDestination.setSelected(false);
            excelController.setBeEmpty(cboxEmptyDestination.isSelected());
            cboxEmptyDestination.setDisable(true);
        }
        // System.out.println(NameOption);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("ConfiguracionConexion");
    }

    private void fillComboSource() {
        cbSourceFields.getItems().addAll(sqlController.getDataComboOrigin());
    }

    private void fillListSource() {
        btnOrigintoRelation.setDisable(false);
        btnOrigintoRelation2.setDisable(false);
        lvRelationSourceFields.getItems().clear();
        lvSourceFields.getItems().clear();
        if (connectionController.getSourceTab().equals("SQL")) {
            lvSourceFields.getItems().addAll(sqlController.getColumnOrigin(cbSourceFields.getValue()));
        } else if (connectionController.getSourceTab().equals("DBF")) {
            lvSourceFields.getItems().addAll(dbfController.getColumnOrigin());
        } else if (connectionController.getSourceTab().equals("Excel")) {
            lvSourceFields.getItems().addAll(excelController.getColumnOrigin());
        }

    }

    private void fillComboDestination() {
        cbDestinationFields.getItems().addAll(connectionController.getDataComboDestination());
    }

    private void fillListDestination() {
        btnDestinationtoRelation.setDisable(false);
        btnDestinationtoRelation2.setDisable(false);
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

        // System.out.println("Index origen: " + sourceIndex + " Valor origen: " +
        // sourceValue);
    }

    @FXML
    private void relateAllFieldsFromSource(){
        lvRelationSourceFields.getItems().clear();
        lvRelationSourceFields.getItems().addAll(lvSourceFields.getItems());
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

        // System.out.println("Index destino: " + sourceIndex + " Valor destino: " +
        // sourceValue);
    }

    @FXML
    private void relateAllFieldsFromDestination(){
        lvRelationDestinationFields.getItems().clear();
        lvRelationDestinationFields.getItems().addAll(lvDestinationFields.getItems());
    }

    @FXML
    private void deleteField(){
        if (lvRelationSourceFields.getSelectionModel().getSelectedIndex() != -1) {
            lvRelationSourceFields.getItems().remove(lvRelationSourceFields.getSelectionModel().getSelectedIndex());
        } else if (lvRelationDestinationFields.getSelectionModel().getSelectedIndex() != -1) {
            lvRelationDestinationFields.getItems().remove(lvRelationDestinationFields.getSelectionModel().getSelectedIndex());
        } else {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "No se ha seleccionado ningún campo para eliminar");
        }
    }

    @FXML
    private void deleteRelation() {
        int indexSource = lvRelationSourceFields.getSelectionModel().getSelectedIndex();
        int indexDestination = lvRelationDestinationFields.getSelectionModel().getSelectedIndex();

        if (indexSource != -1) {
            lvRelationSourceFields.getItems().remove(indexSource);
            if (indexSource < lvRelationDestinationFields.getItems().size()) {
                lvRelationDestinationFields.getItems().remove(indexSource);
            }
            lvRelationSourceFields.getSelectionModel().clearSelection();
        } else if (indexDestination != -1) {
            lvRelationDestinationFields.getItems().remove(indexDestination);
            if (indexDestination < lvRelationSourceFields.getItems().size()) {
                lvRelationSourceFields.getItems().remove(indexDestination);
            }
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
    private void saveRelations() {
        if (lvRelationSourceFields.getItems().size() != lvRelationDestinationFields.getItems().size()) {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error",
                    "Las listas de campos de origen y destino no tienen la misma cantidad de elementos");
            return;
        }
        if (lvRelationSourceFields.getItems().isEmpty() || lvRelationDestinationFields.getItems().isEmpty()) {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "Las listas de campos de origen y/o destino están vacías");
            return;
        }
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save File");

            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("All files (*.crin)", "*.crin");
            fileChooser.getExtensionFilters().add(extFilter);

            String t = connectionController.getSourceTab();
            String s = cbSourceFields.getValue();
            if (t.equals("SQL")) {
                s = cbSourceFields.getValue();
            } else if (t.equals("DBF")) {
                String name = fileDBF.getName();
                s = name.replace(".dbf", "");
            } else if (t.equals("Excel")) {
                String name = fileExcel.getName();
                s = name.replace(".xls", "");
            }

            String d = cbDestinationFields.getValue();

            fileChooser.setInitialFileName(t + "-" + s + "-" + d + ".crin");

            Stage stage = (Stage) title.getScene().getWindow();
            File iniFile = fileChooser.showSaveDialog(stage);

            Wini ini;
            if (!iniFile.exists()) {
                iniFile.createNewFile();
                ini = new Wini(iniFile);
            } else {
                ini = new Wini(iniFile);
            }

            if (connectionController.getSourceTab().equals("SQL")) {
                ini.put("Source", "Table", cbSourceFields.getValue());
                ini.put("Source", "Fields", lvRelationSourceFields.getItems());
                ini.put("Destination", "Table", cbDestinationFields.getValue());
                ini.put("Destination", "Fields", lvRelationDestinationFields.getItems());
                ini.put("Option", "Name", rbInsert.isSelected() ? "Insert" : "Update");
                ini.put("Option", "Empty", cboxEmptyDestination.isSelected() ? "True" : "False");

            } else if (connectionController.getSourceTab().equals("DBF")) {
                ini.put("Source", "File", fileDBF.getName());
                ini.put("Source", "Fields", lvRelationSourceFields.getItems());
                ini.put("Destination", "Table", cbDestinationFields.getValue());
                ini.put("Destination", "Fields", lvRelationDestinationFields.getItems());
                ini.put("Option", "Name", rbInsert.isSelected() ? "Insert" : "Update");
                ini.put("Option", "Empty", cboxEmptyDestination.isSelected() ? "True" : "False");

            } else if (connectionController.getSourceTab().equals("Excel")) {
                ini.put("Source", "File", fileExcel.getName());
                ini.put("Source", "Fields", lvRelationSourceFields.getItems());
                ini.put("Destination", "Table", cbDestinationFields.getValue());
                ini.put("Destination", "Fields", lvRelationDestinationFields.getItems());
                ini.put("Option", "Name", rbInsert.isSelected() ? "Insert" : "Update");
                ini.put("Option", "Empty", cboxEmptyDestination.isSelected() ? "True" : "False");
            }

            ini.store();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    private void loadRelations() {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");

            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("All files (*.crin)", "*.crin");
            FileChooser.ExtensionFilter extFilter2 = new FileChooser.ExtensionFilter("All files (*.*)", "*.*");
            fileChooser.getExtensionFilters().addAll(extFilter, extFilter2);

            Stage stage = (Stage) title.getScene().getWindow();
            File iniFile = fileChooser.showOpenDialog(stage);

            Wini ini = new Wini(iniFile);

            if (connectionController.getSourceTab().equals("SQL")) {

                cbSourceFields.setValue(ini.get("Source", "Table"));
                if (cbSourceFields.getItems().contains(ini.get("Source", "Table"))) {
                    String source = ini.get("Source", "Fields");
                    lvRelationSourceFields.getItems().clear();
                    String[] sourceFields = source.replace("[", "").replace("]", "").split(", ");
                    for (String field : sourceFields) {
                        lvRelationSourceFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "La tabla de origen no existe");
                }

                cbDestinationFields.setValue(ini.get("Destination", "Table"));
                if (cbDestinationFields.getItems().contains(ini.get("Destination", "Table"))) {
                    String destination = ini.get("Destination", "Fields");
                    lvRelationDestinationFields.getItems().clear();
                    String[] destinationFields = destination.replace("[", "").replace("]", "").split(", ");
                    for (String field : destinationFields) {
                        lvRelationDestinationFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "La tabla de destino no existe");
                }

                rbInsert.setSelected(ini.get("Option", "Name").equals("Insert"));
                rbUpdate.setSelected(ini.get("Option", "Name").equals("Update"));
                cboxEmptyDestination.setSelected(ini.get("Option", "Empty").equals("True"));

            } else if (connectionController.getSourceTab().equals("DBF")) {

                if (fileDBF.getName().equals(ini.get("Source", "File"))) {
                    lblServerSource.setText(ini.get("Source", "File"));
                    String source = ini.get("Source", "Fields");
                    lvRelationSourceFields.getItems().clear();
                    String[] sourceFields = source.replace("[", "").replace("]", "").split(", ");
                    for (String field : sourceFields) {
                        lvRelationSourceFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "El archivo de origen no es el mismo");
                }

                cbDestinationFields.setValue(ini.get("Destination", "Table"));
                if (cbDestinationFields.getItems().contains(ini.get("Destination", "Table"))) {
                    String destination = ini.get("Destination", "Fields");
                    lvRelationDestinationFields.getItems().clear();
                    String[] destinationFields = destination.replace("[", "").replace("]", "").split(", ");
                    for (String field : destinationFields) {
                        lvRelationDestinationFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "La tabla de destino no existe");
                }

                rbInsert.setSelected(ini.get("Option", "Name").equals("Insert"));
                rbUpdate.setSelected(ini.get("Option", "Name").equals("Update"));
                cboxEmptyDestination.setSelected(ini.get("Option", "Empty").equals("True"));

            } else if (connectionController.getSourceTab().equals("Excel")) {
                if (fileExcel.getName().equals(ini.get("Source", "File"))) {
                    lblServerSource.setText(ini.get("Source", "File"));
                    String source = ini.get("Source", "Fields");
                    lvRelationSourceFields.getItems().clear();
                    String[] sourceFields = source.replace("[", "").replace("]", "").split(", ");
                    for (String field : sourceFields) {
                        lvRelationSourceFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "El archivo de origen no es el mismo");
                }

                cbDestinationFields.setValue(ini.get("Destination", "Table"));
                if (cbDestinationFields.getItems().contains(ini.get("Destination", "Table"))) {
                    String destination = ini.get("Destination", "Fields");
                    lvRelationDestinationFields.getItems().clear();
                    String[] destinationFields = destination.replace("[", "").replace("]", "").split(", ");
                    for (String field : destinationFields) {
                        lvRelationDestinationFields.getItems().add(field);
                    }
                } else {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error", "La tabla de destino no existe");
                }

                rbInsert.setSelected(ini.get("Option", "Name").equals("Insert"));
                rbUpdate.setSelected(ini.get("Option", "Name").equals("Update"));
                cboxEmptyDestination.setSelected(ini.get("Option", "Empty").equals("True"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void readArrayList() {
        Relacion relacion;
        ArrayList<Relacion> relaciones = new ArrayList<Relacion>();

        for (int i = 0; i < lvRelationSourceFields.getItems().size(); i++) {
            relacion = new Relacion();
            relacion.setCampoOrigen(lvRelationSourceFields.getItems().get(i));
            relacion.setCampoDestino(lvRelationDestinationFields.getItems().get(i));
            relaciones.add(relacion);
        }

        excelController.setRelaciones(relaciones);
        excelController.tableExcelDestination(cbDestinationFields.getValue());
    }

    @FXML
    private void switchToConversor() throws IOException {
        if (lvRelationSourceFields.getItems().isEmpty() || lvRelationDestinationFields.getItems().isEmpty()) {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Error", "No se han relacionado los campos de origen y destino");
            return;
        } else {
            if (lvRelationSourceFields.getItems().size() != lvRelationDestinationFields.getItems().size()) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Error",
                        "Las listas de campos de origen y destino no tienen la misma cantidad de elementos");
                return;
            } else {
                
                Relacion relacion;
                ArrayList<Relacion> relaciones = new ArrayList<Relacion>();

                for (int i = 0; i < lvRelationSourceFields.getItems().size(); i++) {
                    relacion = new Relacion();
                    relacion.setCampoOrigen(lvRelationSourceFields.getItems().get(i));
                    relacion.setCampoDestino(lvRelationDestinationFields.getItems().get(i));
                    relaciones.add(relacion);
                }

                if (connectionController.getSourceTab().equals("SQL")) {
                    // En proceso
                } else if (connectionController.getSourceTab().equals("DBF")) {
                    dbfController.setBeEmpty(cboxEmptyDestination.isSelected());
                    dbfController.setRelaciones(relaciones);
                    
                    for (int i = 0; i < dbfController.getRelaciones().size(); i++) {
                        System.out.println(dbfController.getRelaciones().get(i).getCampoOrigen());
                        System.out.println(dbfController.getRelaciones().get(i).getCampoDestino());
                    }
                    dbfController.setTypeTransfer(NameOption);
                    dbfController.setTablename(cbDestinationFields.getValue());
                    try {
                        dbfController.tableDBFDestination(dbfController.getTablename());
                    } catch (Exception e) {
                        MyAlert alert = new MyAlert();
                        alert.showAlert(AlertType.ERROR, "Error al pasar datos", e.getMessage());
                    } 
                } else if (connectionController.getSourceTab().equals("Excel")) {
                    excelController.setBeEmpty(cboxEmptyDestination.isSelected());
                    excelController.setRelaciones(relaciones);
                    excelController.setTypeTransfer(NameOption);
                    excelController.setTablename(cbDestinationFields.getValue());
                    try {
                        excelController.tableExcelDestination(excelController.getTablename());
                    } catch (Exception e) {
                        MyAlert alert = new MyAlert();
                        alert.showAlert(AlertType.ERROR, "Error al pasar datos", e.getMessage());
                    }
                }
                
                App.setRoot("Conversor");
            }
        }
    }
}