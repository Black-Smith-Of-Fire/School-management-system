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
    private  Button student_pg, teacher_pg, courses_pg, transport_pg, classes_pg, fees_pg;
    pageHandler pg = new pageHandler();


    @FXML
    protected void changePage(ActionEvent event) {
        if (event.getSource() == student_pg){
            pg.toPage("student");
        }

        if (event.getSource() == teacher_pg){
            pg.toPage("teacher");
        }
        if (event.getSource() == courses_pg){
            pg.toPage("courses");
        }
        if (event.getSource() == transport_pg){
            pg.toPage("transport");
        }
        if (event.getSource() == classes_pg){
            pg.toPage("classes");
        }
        if (event.getSource() == fees_pg){
            pg.toPage("fees");
        }
    }
}