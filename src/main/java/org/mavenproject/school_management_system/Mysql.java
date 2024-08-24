package org.mavenproject.school_management_system;


import java.sql.*;
import java.util.ArrayList;

public class Mysql {

    private String url = "jdbc:mysql://127.0.0.1:3306/school_management";
    private String user = "ben";
    private String password = "example-password";
    String name = "",section;
    int clss ,admission_no;
    int id;
    int age ;


    public String[] table(String table) {

        ArrayList<String> list = new ArrayList<>();
        String result[] = new String[list.size()];
        String sql = "Select * from ?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("Select * from students");
//            PreparedStatement ps = null;
//            ResultSet resultSet = ps.executeQuery();
            ResultSet resultSet = statement.getResultSet();

//            ps = connection.prepareStatement(sql);
//            ps.setString(1,table);

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                clss = resultSet.getInt("class");
                section = resultSet.getString("section");
                admission_no = resultSet.getInt("admission_number");

//                System.out.println(resultSet.getString("id") + " : " + resultSet.getString("name") + " : " + resultSet.getString("class"));
                list.add(name);

            }
            //Putting the values in a list
            result = list.toArray(result);

            for(int i =0; i<result.length; i++){
                System.out.println(result[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // Method to insert data
    public void insert (String name , String subject, int age) {

        String query = "";

        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

            query = "Insert into teachers values (?,?,?);";

            PreparedStatement values = connection.prepareStatement(query);
//                values.setInt(1, id);
                values.setString(2, name);
                values.setString(2, subject);
                values.setInt(3, age);
//                values.setInt(4, phone);

            values.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    // Method to receive data
    public void showData (String query) {

    }
}