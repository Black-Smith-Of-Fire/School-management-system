package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

import java.io.IOException;

public class pageHandler {

//    @FXML
//    private Stage stage;
//
//    @FXML
//    private Scene scene ;
//
//    @FXML
//    private Parent root;

//    @FXML
//    public void sceneSwitch(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("dataPage.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

    public void toPage(String page){
        if(page.equals("student")){
            System.out.println("student");
        }
        else if (page.equals("teacher")) {
            System.out.println("teacher");
        }
        else if (page.equals("courses")) {
            System.out.println("courses");
        }
        else if (page.equals("transport")) {
            System.out.println("transport");
        }
        else if (page.equals("fees")) {
            System.out.println("fees");
        }
        else if (page.equals("classes")) {
            System.out.println("classes");
        }
    }
}
