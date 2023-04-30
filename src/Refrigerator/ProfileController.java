package Refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    @FXML
    ImageView profileFX;

    //Home Button
    @FXML
    public void handleHomeButton(ActionEvent event) throws IOException {
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        stage.setScene(new Scene(loader.load(),809,649));
        stage.show();
    }
}
