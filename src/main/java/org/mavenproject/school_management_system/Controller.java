package org.mavenproject.school_management_system;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    @FXML
    private ListView<String> myListView;

    Mysql mysql = new Mysql();


    @FXML
    protected void changePage(ActionEvent event) throws IOException{
// Function to change page
            root = FXMLLoader.load(getClass().getResource("StudentPage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    public void studentPage(ActionEvent event) throws  IOException{ // This will return a string array list which will be used by the listview
        ObservableList<String> names = FXCollections.observableArrayList("Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        myListView = new ListView<>();
        myListView.setItems(names);

        root = FXMLLoader.load(getClass().getResource("StudentPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}