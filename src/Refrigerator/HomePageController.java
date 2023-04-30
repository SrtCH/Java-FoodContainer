package Refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    ImageView refrigeratorsFX;

    @FXML
    public void handleOpenRefrigeratorButton(ActionEvent event) throws IOException {
        //change page to RefrigeratorPage
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RefrigeratorPage.fxml"));
        stage.setScene(new Scene(loader.load(),839,726));
        stage.show();
    }

    @FXML
    public void handleProfileButton(ActionEvent event) throws IOException {
        //change page to Profile
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("profile.fxml"));
        stage.setScene(new Scene(loader.load(),612,573));
        stage.show();
    }
}
