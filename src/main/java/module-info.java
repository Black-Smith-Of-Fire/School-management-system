module org.mavenproject.school_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mavenproject.school_management_system to javafx.fxml;
    exports org.mavenproject.school_management_system;
}