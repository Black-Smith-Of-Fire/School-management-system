package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Controller {


    @FXML
    private Stage stage;

    @FXML
    private Scene scene ;

    @FXML
    private Parent root;

    private String page = "";

    @FXML
    private  Button student_pg, teacher_pg, courses_pg, transport_pg, classes_pg, fees_pg;

    @FXML
    private ListView<String> myListView;

    private String table = "";

    @FXML
    private ListView <String> listView;


    @FXML
    protected String changePage(ActionEvent event) throws  IOException{

        listView = new ListView<>();

        if (event.getSource() == student_pg){
            table = "teacher";
            listView.getItems().add("burger");
        }
        if (event.getSource() == courses_pg){
//            pg.table("students");
            table = "teacher";
        }
        if (event.getSource() == transport_pg){
//            pg.table("students");
        }
        if (event.getSource() == classes_pg){
//            pg.table("students");
        }
        if (event.getSource() == fees_pg){
//            pg.table("students");
        }

        root = FXMLLoader.load(getClass().getResource("dataPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        return table;
    }

    public String call () {
        return table;
    }


}