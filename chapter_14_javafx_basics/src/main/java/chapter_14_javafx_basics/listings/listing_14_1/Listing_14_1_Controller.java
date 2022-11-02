package chapter_14_javafx_basics.listings.listing_14_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Listing_14_1_Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}