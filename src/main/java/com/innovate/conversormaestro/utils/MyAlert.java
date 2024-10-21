package com.innovate.conversormaestro.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MyAlert {

    private Alert alert;

    public MyAlert() {

    }

    public void showAlert(AlertType type, String title, String content) {
        alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/com/innovate/conversormaestro/icons/icono_con_fondo.png")));

        alert.showAndWait();
    }

}
