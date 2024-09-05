package org.mavenproject.school_management_system;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TeacherPage implements Initializable {

    @FXML
    private VBox vbox;

    @FXML
    private AnchorPane pane1;

    Mysql mysql = new Mysql();

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Should load the data into the vbox

        FXMLLoader loader = new FXMLLoader();

        ArrayList<String> list = new ArrayList<>();
        list.addAll(mysql.table("teachers"));
        for (int i = 0; i < list.size(); i++) { // testing arraylist
            System.out.println(list.get(i));
        }

        try{
            Node[] node = new Node[5];

            for (int i = 0; i < node.length; i++) {
                node[i] = FXMLLoader.load(getClass().getResource("item.fxml"));
                vbox.getChildren().add(node[i]); // Supposed to add items in a vbox
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void menu(){
        System.out.println("menu working");

    }

    }
