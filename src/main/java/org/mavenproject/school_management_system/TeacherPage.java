package org.mavenproject.school_management_system;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherPage implements Initializable {

    @FXML
    private ListView<String> teacherList;

    Mysql mysql = new Mysql();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        teacherList.getItems().addAll(mysql.table("teachers"));
    }
}
