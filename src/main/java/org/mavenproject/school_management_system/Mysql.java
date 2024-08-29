package org.mavenproject.school_management_system;


import java.sql.*;
import java.util.ArrayList;

public class Mysql {

    private String url = "jdbc:mysql://127.0.0.1:3306/school_management";
    private String user = "ben";
    private String password = "example-password";

    private ArrayList<String> list;
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
}
