module org.mavenproject.school_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires mysql.connector.java;
    requires java.sql;


    opens org.mavenproject.school_management_system to javafx.fxml;
    exports org.mavenproject.school_management_system;
}