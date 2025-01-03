package com.innovate.conversormaestro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import javafx.beans.value.ChangeListener;

import com.innovate.conversormaestro.App;
import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.utils.MyAlert;

public class ConfiguracionConexionController implements Initializable {

    // Conection to the destination database
    @FXML
    private TextField txServerDestination;

    @FXML
    private TextField txUserDestination;

    @FXML
    private PasswordField txPasswordDestination;

    @FXML
    private TextField txEnterpriseDestination;

    @FXML
    private TextField txExerciseDestination;

    @FXML
    private ComboBox<String> cbAccountDigitsDestination;

    @FXML
    private ComboBox<String> cbGroupDigitsDestination;

    @FXML
    private TextField txWarehouseDestination;

    @FXML
    private ComboBox<String> cbGPVersionDestination;

    @FXML
    private Button btTestConnectionDestination;

    private String ServerDestination;
    private String UserDestination;
    private String PasswordDestination;
    private String EnterpriseDestination;
    private String ExerciseDestination;
    private String AccountDigitsDestination;
    private String GroupDigitsDestination;
    private String WarehouseDestinationDestination;

    // SQL conection to the source database
    @FXML
    private TextField txServerSource;

    @FXML
    private TextField txUserSource;

    @FXML
    private PasswordField txPasswordSource;

    @FXML
    private TextField txDataBaseSource;

    @FXML
    private Button btTestConnectionSource;

    @FXML
    private RadioButton rbTablesSource;

    @FXML
    private RadioButton rbViewsSource;

    ToggleGroup group = new ToggleGroup();

    private String ServerSource;
    private String UserSource;
    private String PasswordSource;
    private String DataBaseSource;
    private String GPVersion;
    private String NameOption;

    // Tabs
    @FXML
    private TabPane tabPane;

    String ActualTab;

    // DBF conection to the source database
    @FXML
    private TextField txPathSourceDBF;

    @FXML
    private Button btPathSourceDBF;

    // Excel conection to the source database
    @FXML
    private TextField txPathSourceExcel;

    @FXML
    private Button btPathSourceExcel;

    // Next button
    @FXML
    private Button btNext;

    private ConnectionController connectionController;

    private ExcelController excelController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbAccountDigitsDestination.getItems().addAll("9", "10", "11", "12");
        cbGroupDigitsDestination.getItems().addAll("3", "4", "5");
        cbAccountDigitsDestination.setValue("10");
        cbGroupDigitsDestination.setValue("4");
        cbGPVersionDestination.getItems().addAll("Estandar", "Distribucion", "Fitosanitarios", "Talleres");
        rbTablesSource.setSelected(true);

        rbTablesSource.setToggleGroup(group);
        rbViewsSource.setToggleGroup(group);

        // Cargar las credenciales desde el archivo de propiedades
        Properties properties = new Properties();
        try (InputStream input = getClass().getResourceAsStream("/config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);

            txServerDestination.setText(properties.getProperty("server.destination"));
            txUserDestination.setText(properties.getProperty("user.destination"));
            txPasswordDestination.setText(properties.getProperty("password.destination"));
            txEnterpriseDestination.setText(properties.getProperty("enterprise.destination"));
            txExerciseDestination.setText(properties.getProperty("exercise.destination"));
            cbAccountDigitsDestination.setValue(properties.getProperty("accountDigits.destination"));
            cbGroupDigitsDestination.setValue(properties.getProperty("groupDigits.destination"));
            txWarehouseDestination.setText(properties.getProperty("warehouse.destination"));
            cbGPVersionDestination.setValue(properties.getProperty("gpVersion.destination"));

            txServerSource.setText(properties.getProperty("server.source"));
            txUserSource.setText(properties.getProperty("user.source"));
            txPasswordSource.setText(properties.getProperty("password.source"));
            txDataBaseSource.setText(properties.getProperty("database.source"));

            txPathSourceDBF.setText(properties.getProperty("path.source.dbf"));
            txPathSourceExcel.setText(properties.getProperty("path.source.excel"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        /*
         * txPathSourceDBF.setDisable(true);
         * txPathSourceExcel.setDisable(true);
         */

        connectionController = ConnectionController.getConectionController();
        excelController = ExcelController.getExcelController();
        connectionController.setFirstTime(true);
        ActualTab = "SQL";

        tabPane.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
            @Override
            public void changed(ObservableValue<? extends Tab> observable, Tab oldTab, Tab newTab) {
                if (newTab != null) {
                    //System.out.println("Selected Tab: " + newTab.getText());
                }
                ActualTab = newTab.getText();
            }
        });

        NameOption = "Tables";
    }

    // Test connection to the destination database
    @FXML
    private void testConnectionDestination() {
        if (txServerDestination.getText().isEmpty() || txUserDestination.getText().isEmpty()
                || txPasswordDestination.getText().isEmpty() || txEnterpriseDestination.getText().isEmpty()
                || txExerciseDestination.getText().isEmpty() || txWarehouseDestination.getText().isEmpty() || cbGPVersionDestination.getValue() == null) {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Test Connection", "Please fill all the fields!");
            return;
        } else {
            setDestination();
            /*
             * System.out.println("Server: " + ServerDestination
             * + "\nUser: " + UserDestination
             * + "\nPassword: " + PasswordDestination
             * + "\nEnterprise: " + EnterpriseDestination
             * + "\nExercise: " + ExerciseDestination
             * + "\nAccount Digits: " + AccountDigitsDestination
             * + "\nGroup Digits: " + GroupDigitsDestination
             * + "\nDestination Warehouse: " + WarehouseDestinationDestination);
             */

            boolean test = connectionController.testConnectionDestination(ServerDestination, UserDestination,
                    PasswordDestination, EnterpriseDestination, ExerciseDestination, AccountDigitsDestination,
                    GroupDigitsDestination, WarehouseDestinationDestination);

            if (test) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.INFORMATION, "Test Connection", "Connection test successful!");
            } else {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Test Connection", "Connection test failed!");
            }
        }
    }

    private void setDestination() {
        ServerDestination = txServerDestination.getText();
        UserDestination = txUserDestination.getText();
        PasswordDestination = txPasswordDestination.getText();
        EnterpriseDestination = txEnterpriseDestination.getText();
        ExerciseDestination = txExerciseDestination.getText();
        AccountDigitsDestination = cbAccountDigitsDestination.getValue();
        GroupDigitsDestination = cbGroupDigitsDestination.getValue();
        WarehouseDestinationDestination = txWarehouseDestination.getText();
        GPVersion = cbGPVersionDestination.getValue();
    }

    // Test connection to the source database
    @FXML
    private void testConnectionSource() {
        if (txServerSource.getText().isEmpty() || txUserSource.getText().isEmpty()
                || txPasswordSource.getText().isEmpty() || txDataBaseSource.getText().isEmpty()) {
            MyAlert alert = new MyAlert();
            alert.showAlert(AlertType.ERROR, "Test Connection", "Please fill all the fields!");
            return;
        } else {
            setSource();
            /*
             * System.out.println("Server: " + ServerSource
             * + "\nUser: " + UserSource
             * + "\nPassword: " + PasswordSource
             * + "\nDatabase: " + DataBaseSource
             * + "\nTables: " + TablesSource
             * + "\nViews: " + ViewsSource);
             */

            boolean test = connectionController.testConnectionOrigin(ServerSource, UserSource, PasswordSource,
                    DataBaseSource, GPVersion);

            if (test) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.INFORMATION, "Test Connection", "Connection test successful!");
            } else {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Test Connection", "Connection test failed!");
            }
        }
    }

    private void setSource() {
        ServerSource = txServerSource.getText();
        UserSource = txUserSource.getText();
        PasswordSource = txPasswordSource.getText();
        DataBaseSource = txDataBaseSource.getText();
    }

    @FXML
    private void SelectedOption() {
        if (rbTablesSource.isSelected()) {
            NameOption = "Tables";
        } else if (rbViewsSource.isSelected()) {
            NameOption = "Views";
        }
        //System.out.println(NameOption);
    }

    @FXML
    private void selectPathSourceDBF() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select DBF File");

        // Set extension filter for .dbf files
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("DBF files (*.dbf)", "*.dbf");
        fileChooser.getExtensionFilters().add(extFilter);

        String route = "C:/Users/PC/Documents";
        if (!txPathSourceDBF.getText().isEmpty()) {
            if (txPathSourceDBF.getText().endsWith(".dbf") || txPathSourceDBF.getText().endsWith(".DBF")) {
                route = txPathSourceDBF.getText().substring(0, txPathSourceDBF.getText().lastIndexOf("\\"));
            } else {
                route = txPathSourceDBF.getText();
            }
        }

        File initialDirectory = new File(route);
        if (initialDirectory.exists()) {
            fileChooser.setInitialDirectory(initialDirectory);
        }

        Stage stage = (Stage) btPathSourceDBF.getScene().getWindow(); // Assuming btTestConnection is your button
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            txPathSourceDBF.setText(file.getAbsolutePath());
        } else {
            System.out.println("No file selected");
        }
    }

    @FXML
    private void selectPathSourceExcel() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Excel File");

        // Set extension filter for .dbf files
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Excel files (*.xls)", "*.xls");
        fileChooser.getExtensionFilters().add(extFilter);

        String route = "C:/Users/PC/Documents";
        if (!txPathSourceExcel.getText().isEmpty()) {
            if (txPathSourceExcel.getText().endsWith(".xls")) {
                route = txPathSourceExcel.getText().substring(0, txPathSourceExcel.getText().lastIndexOf("\\"));
            } else {
                route = txPathSourceExcel.getText();
            }
        }
        File initialDirectory = new File(route);
        if (initialDirectory.exists()) {
            fileChooser.setInitialDirectory(initialDirectory);
        }

        Stage stage = (Stage) btPathSourceExcel.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            txPathSourceExcel.setText(file.getAbsolutePath());
        } else {
            System.out.println("No file selected");
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        if (ActualTab.equals("SQL")) {
            if (txServerDestination.getText().isEmpty() || txUserDestination.getText().isEmpty()
                    || txPasswordDestination.getText().isEmpty() || txEnterpriseDestination.getText().isEmpty()
                    || txExerciseDestination.getText().isEmpty()
                    || txWarehouseDestination.getText().isEmpty()
                    || txServerSource.getText().isEmpty() || txUserSource.getText().isEmpty()
                    || txPasswordSource.getText().isEmpty()
                    || txDataBaseSource.getText().isEmpty() || cbGPVersionDestination.getValue() == null) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Next", "Please fill all the fields!");
            } else {
                setDestination();
                connectionController.saveCredentialsDestination(ServerDestination, UserDestination, PasswordDestination,
                        EnterpriseDestination, ExerciseDestination, AccountDigitsDestination, GroupDigitsDestination,
                        WarehouseDestinationDestination, GPVersion);
                setSource();
                connectionController.saveCredentialsOriginSQL(ServerSource, UserSource, PasswordSource, DataBaseSource,
                        NameOption);
                App.setRoot("RelacionCampos");
            }
        } else if (ActualTab.equals("DBF")) {
            if (txServerDestination.getText().isEmpty() || txUserDestination.getText().isEmpty()
                    || txPasswordDestination.getText().isEmpty() || txEnterpriseDestination.getText().isEmpty()
                    || txExerciseDestination.getText().isEmpty()
                    || txWarehouseDestination.getText().isEmpty() || txPathSourceDBF.getText().isEmpty()  || cbGPVersionDestination.getValue() == null) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Next", "Please fill all the fields!");
            } else {
                if (txPathSourceDBF.getText().endsWith(".dbf") == false && txPathSourceDBF.getText().endsWith(".DBF") == false) {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Next", "Please select a valid DBF file!");
                    return;
                } else {
                    setDestination();
                    connectionController.saveCredentialsDestination(ServerDestination, UserDestination,
                            PasswordDestination,
                            EnterpriseDestination, ExerciseDestination, AccountDigitsDestination,
                            GroupDigitsDestination,
                            WarehouseDestinationDestination, GPVersion);
                    connectionController.saveCredentialsOriginDBF(txPathSourceDBF.getText());
                    App.setRoot("RelacionCampos");
                }
            }
        } else if (ActualTab.equals("Excel")) {
            if (txServerDestination.getText().isEmpty() || txUserDestination.getText().isEmpty()
                    || txPasswordDestination.getText().isEmpty() || txEnterpriseDestination.getText().isEmpty()
                    || txExerciseDestination.getText().isEmpty()
                    || txWarehouseDestination.getText().isEmpty() || txPathSourceExcel.getText().isEmpty()  || cbGPVersionDestination.getValue() == null) {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Next", "Please fill all the fields!");
            } else {
                if (txPathSourceExcel.getText().endsWith(".xls") == false) {
                    MyAlert alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Next", "Please select a valid Excel file!");
                    return;
                } else {
                    setDestination();
                    connectionController.saveCredentialsDestination(ServerDestination, UserDestination,
                            PasswordDestination,
                            EnterpriseDestination, ExerciseDestination, AccountDigitsDestination,
                            GroupDigitsDestination,
                            WarehouseDestinationDestination , GPVersion);
                    connectionController.saveCredentialsOriginExcel(txPathSourceExcel.getText());
                    if (excelController.getColumnOrigin().isEmpty()) {
                        MyAlert alert = new MyAlert();
                        alert.showAlert(AlertType.ERROR, "Next", "This Excel file is empty!");
                    } else {
                        App.setRoot("RelacionCampos");
                    }
                }
            }
        }
    }
}