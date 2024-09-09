package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

import java.io.IOException;


public class PageHandler {

    @FXML
    private Stage stage;


    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    @FXML
    public void studentPage(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("StudentPage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
    @FXML
    public void teacherPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TeacherPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void coursePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CoursePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void classPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ClassPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void transportPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TransportPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void feesPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FeesPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
