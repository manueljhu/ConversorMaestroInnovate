module com.innovate.conversormaestro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.github.albfernandez.javadbf;


    opens com.innovate.conversormaestro to javafx.fxml;
    opens com.innovate.conversormaestro.controller to javafx.fxml;
    exports com.innovate.conversormaestro;
    exports com.innovate.conversormaestro.controller;
    exports com.innovate.conversormaestro.datasource;

}