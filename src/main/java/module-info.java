module com.innovate.conversormaestro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.github.albfernandez.javadbf;
    requires org.apache.poi.poi;
    requires ini4j;
    requires dans.dbf.lib;
    
    opens com.innovate.conversormaestro to javafx.fxml;
    opens com.innovate.conversormaestro.controller to javafx.fxml;
    exports com.innovate.conversormaestro;
    exports com.innovate.conversormaestro.controller;
    exports com.innovate.conversormaestro.datasource;
    exports com.innovate.conversormaestro.model;
}