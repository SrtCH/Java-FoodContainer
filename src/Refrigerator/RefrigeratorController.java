package Refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class RefrigeratorController {


    FoodInformations foodObjForStatic = new FoodInformations();
    ContainerA containerA = new ContainerA();


    @FXML
    ImageView milkfx,juiceFX,vegetablesFX,softDrinkFX,meatFX,salmonFX,icecreamFX,frozenFoodsFX;

    @FXML
    public void handleHomeButton(ActionEvent event) throws IOException {
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        stage.setScene(new Scene(loader.load(),809,649));
        stage.show();
    }


    public void handleSelect1Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Soft Drink");
        foodObjForStatic.setNumberOfBox("1");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect2Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Meat");
        foodObjForStatic.setNumberOfBox("2");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect3Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Fish");
        foodObjForStatic.setNumberOfBox("3");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect4Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Milk");
        foodObjForStatic.setNumberOfBox("4");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect5Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Juice");
        foodObjForStatic.setNumberOfBox("5");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect6Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Vegetable");
        foodObjForStatic.setNumberOfBox("6");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect7Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Icecream");
        foodObjForStatic.setNumberOfBox("7");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }

    public void handleSelect8Button(ActionEvent event) throws IOException {
        containerA.clearArrayList();
        foodObjForStatic.setTypeFood("Frozen Foods");
        foodObjForStatic.setNumberOfBox("8");
        containerA.setItem(foodObjForStatic);

        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FoodInformations.fxml"));
        stage.setScene(new Scene(loader.load(),600,450));
        stage.show();
    }


}
