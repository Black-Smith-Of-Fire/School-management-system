package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Controller {


    @FXML
    private Stage stage;

    @FXML
    private Scene scene ;

    @FXML
    private Parent root;

    @FXML
    private  Button student_pg, teacher_pg, courses_pg, transport_pg, classes_pg, fees_pg;
    pageHandler pg = new pageHandler();


    @FXML
    protected void changePage(ActionEvent event) throws  IOException{
        if (event.getSource() == student_pg){
            pg.page = "students";
        }

        if (event.getSource() == teacher_pg){
            pg.page = "teachers";
        }
        if (event.getSource() == courses_pg){
            pg.page = "courses";
        }
        if (event.getSource() == transport_pg){
            pg.page = "transport";
        }
        if (event.getSource() == classes_pg){
            pg.page = "classes";
        }
        if (event.getSource() == fees_pg){
            pg.page = "fees";
        }

        root = FXMLLoader.load(getClass().getResource("dataPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}