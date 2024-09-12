package org.mavenproject.school_management_system;

import java.sql.*;
import java.util.ArrayList;

public class Mysql {

    private String url = "jdbc:mysql://127.0.0.1:3306/school_management";
    private String user = "ben";
    private String password = "example-password";

    private ArrayList<String> list; // the list to contain the data from the database school_management


    public ArrayList<String>table(String table) { // Method that returns the mysql table data as asked within the parameters

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

//            listView.getItems().addAll(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String data(String table, String column , String name) { // Method to return the data according to the name selected in the listview
        String sql = "Select $column from $table where name = ?";

        String query_column = sql.replace("$column",column);
        String query = query_column.replace("$table",table);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                return resultSet.getString(column);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void editSql(String table, String column , String name, String newValue){
        String sql = "Update $table set $column = ? where name = ?";
        String query_table = sql.replace("$table",table);
        String query = query_table.replace("$column",column);

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1,newValue);
            statement.setString(2,name);
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
