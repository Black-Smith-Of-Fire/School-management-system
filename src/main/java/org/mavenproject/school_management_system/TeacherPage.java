package org.mavenproject.school_management_system;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TeacherPage implements Initializable {

    @FXML
    private Scene scene;

    @FXML
    private Stage stage;

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField name_field;

    @FXML
    private TextField dob_field;

    @FXML
    private  TextField reg_field;

    String night[] = {"jeor","mormont"};
    Mysql mysql = new Mysql();

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Should load the data into the vbox
        listView.getItems().addAll(mysql.table("teachers"));
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String selection = listView.getSelectionModel().getSelectedItem();
                name_field.setText(mysql.data("teachers","name",selection));
                dob_field.setText(mysql.data("teachers","dob",selection));
                reg_field.setText(mysql.data("teachers","id_no",selection));
            }
        });
    }

    @FXML
    private void edit(){
        String dob = dob_field.getText();
        String id_no = reg_field.getText();
        String name = name_field.getText();

        String columns[] = {"name", "dob", "id_no"};
        String column_values[] = {name,dob,id_no};

        for (int i = 0; i < columns.length; i++) {
            mysql.editSql("teachers",columns[i],name,column_values[i]);
        }
//        mysql.editSql("teachers","id_no",name,id_no);
    }

    @FXML
    private void back(ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
