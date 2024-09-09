package org.mavenproject.school_management_system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ItemController {

    @FXML
    ImageView imageView;

    @FXML
    Label darth_label; // to be edited

//    @FXML
//    Label registration_number; // For the future

public void setItemInfo(String name  /*, String image*/ ) {
    darth_label.setText(name);

}
}
