package org.mavenproject.school_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TeacherPage implements Initializable {

    @FXML
    private VBox vbox;

    @FXML
    private Scene scene;

    @FXML
    private Stage stage;

    @FXML
    private AnchorPane pane1;

    @FXML
    public static Label darth_label = new Label();

    Mysql mysql = new Mysql();

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Should load the data into the vbox
        FXMLLoader loader = new FXMLLoader();
        ArrayList<String> list = new ArrayList<>();

        list.addAll(mysql.table("teachers"));

        Controller controller = loader.getController();

        try{
            Node[] node = new Node[list.size()];

            for (int i = 0; i < node.length; i++) {
                darth_label.setText("lol");
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

    @FXML
    private void back(ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
