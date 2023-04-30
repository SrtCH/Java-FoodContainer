package Refrigerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Refrigerator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        primaryStage.setTitle("Refrigerator");
        primaryStage.setScene(new Scene(root, 809, 649));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
