package org.mavenproject.school_management_system;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class pageHandler implements Initializable {

    @FXML
    private Stage stage;

    @FXML
    private JButton student_pg = new JButton();

    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    @FXML
    private ListView<String> myListView;

    ActionEvent event = new ActionEvent();


    Controller ctrl = new Controller();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        myListView.getItems().addAll(ctrl.studentPage()); // Getting data from student Page which is a button which will take the list of values from mysql and add it to the list
//        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                System.out.println(myListView.getSelectionModel().getSelectedItem());
//            }
//        });
    }

}
