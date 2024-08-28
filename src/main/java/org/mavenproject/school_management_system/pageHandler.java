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
    private Scene scene;

    @FXML
    private Parent root;

    @FXML
    private ListView<String> myListView;


    private String url = "jdbc:mysql://127.0.0.1:3306/school_management";
    private String user = "ben";
    private String password = "example-password";
    String name = "";

    private ArrayList<String> list ;

    @FXML
    private ListView <String> listView;

    Controller ctrl = new Controller();



    public ArrayList<String>table(String table) {
        System.out.println("hello");

        list = new ArrayList<>();

        String sql = "Select * from $table";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String query = sql.replace("$table",table);
            statement.executeQuery(query);

            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {
                list.add(resultSet.getString("name"));
            }
            for (String item : list){
                System.out.println(item);
            }

//            listView.getItems().addAll(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void infoPage(ActionEvent event) throws  IOException {
        root = FXMLLoader.load(getClass().getResource("personInfo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        pageHandler pg = new pageHandler();
//
//        myListView.getItems().addAll(pg.table(ctrl.call()));
//        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                System.out.println(myListView.getSelectionModel().getSelectedItem());
//            }
//        });
    }

//@Override
//    public void initialize(URL location, ResourceBundle resourceBundle) {
//        String list[] = new String[4];
//        String sql = "Select * from $table";
//        try{
//            Connection connection = DriverManager.getConnection(url,user,password);
//            Statement statement = connection.createStatement();
//
//            String query = sql.replace("$table","students");
//            statement.executeQuery(query);
//
////            ResultSet resultSet = statement.getResultSet();
////
////            while(resultSet.next()){
////
////            }
////        }catch(Exception e){
////            e.printStackTrace();
////        }
////        myListView.getItems().addAll(list);
////        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
////            @Override
////            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
////                System.out.println(myListView.getSelectionModel().getSelectedItem());
////            }
//        });
//    }


}
