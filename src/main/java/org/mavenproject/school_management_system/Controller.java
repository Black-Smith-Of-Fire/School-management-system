package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Controller {
//    private JButton student_pg, teacher_pg, courses_pg, transport_pg, classes_pg, fees_pg;

    @FXML
    Stage stage;

    @FXML
    Scene scene;

    @FXML
    protected void changePage(ActionEvent event) throws IOException {
//        student_pg = new JButton();

        Parent root = FXMLLoader.load(getClass().getResource("dataPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void backPage(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}