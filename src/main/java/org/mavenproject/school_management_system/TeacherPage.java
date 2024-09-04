package org.mavenproject.school_management_system;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class TeacherPage implements Initializable {

    @FXML
    private ListView<String> teacherList;

    @FXML
    private AnchorPane pane1;


    Mysql mysql = new Mysql();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        pane1.setTranslateX(240);
        teacherList.getItems().addAll(mysql.table("teachers"));
    }

    @FXML
    private void menu(){
        System.out.println("menu working");
//        pane1.setVisible(true);
//        TranslateTransition slide = new TranslateTransition();
//        slide.setDuration(Duration.ONE);
//        slide.setNode(pane1);
//        slide.setToX(0); //200
//        slide.play();
//        pane1.setTranslateX(240);

//        TranslateTransition slide = new TranslateTransition();
//        slide.setDuration(Duration.seconds(0.4));
//        slide.setNode(pane1);
//
//        slide.setToX(0);
//        slide.play();

//        pane1.setTranslateX(160);

//        slide.setOnFinished((ActionEvent event) -> {
//
//        });
    }
    /*

    @FXML
    private AnchorPane panelslide;

    @FXML
    private void run() { // function to slide the navbar
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.ONE);
        slide.setNode(panelslide);
        slide.setToX(0); //200
        slide.play();
        panelslide.setTranslateX(200);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        panelslide.setTranslateX(200);
    }
    * */
}
