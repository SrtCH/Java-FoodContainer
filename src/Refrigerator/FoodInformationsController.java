package Refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FoodInformationsController{
    //create box
    BoxOfRefrigeratorInformation boxNormal1 = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxNormal2  = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxNormal3 = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxNormal4  = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxNormal5 = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxNormal6  = new BoxOfNormal();
    BoxOfRefrigeratorInformation boxFreezer7 = new BoxOfFreezer();
    BoxOfRefrigeratorInformation boxFreezer8  = new BoxOfFreezer();



    //cast box to type ArrayList
    ArrayList<FoodInformations> boxNormal1Casted = (ArrayList<FoodInformations>) boxNormal1.getFoodArralay();
    ArrayList<FoodInformations> boxNormal2Casted = (ArrayList<FoodInformations>) boxNormal2.getFoodArralay();
    ArrayList<FoodInformations> boxNormal3Casted = (ArrayList<FoodInformations>) boxNormal3.getFoodArralay();
    ArrayList<FoodInformations> boxNormal4Casted = (ArrayList<FoodInformations>) boxNormal4.getFoodArralay();
    ArrayList<FoodInformations> boxNormal5Casted = (ArrayList<FoodInformations>) boxNormal5.getFoodArralay();
    ArrayList<FoodInformations> boxNormal6Casted = (ArrayList<FoodInformations>) boxNormal6.getFoodArralay();
    ArrayList<FoodInformations> boxFreezeer7Casted = (ArrayList<FoodInformations>) boxFreezer7.getFoodArralay();
    ArrayList<FoodInformations> boxFreezeer8Casted = (ArrayList<FoodInformations>) boxFreezer8.getFoodArralay();

    //receive obj from RefrigeratorController
    ContainerB containerB = new ContainerB();

    @FXML
    TextField nameFoodTextField , weightFoodTextField , amountTextField;

    @FXML
    DatePicker expireDateTextField;

    @FXML
    TextArea showFoodInBoxTextArea , showLastAddActionTextArea , showLastDeleteActionTextArea;

    @FXML
    Label numberOfBoxLabel;


    @FXML //add Food Button
    public void handleAddFoodToBoxButton(ActionEvent event){

        //show number of box
        numberOfBoxLabel.setText("Box No. " + containerB.getNumberOfBoxStatic());

        // clear TextArea
        showFoodInBoxTextArea.setText("");
        showLastAddActionTextArea.setText("");

        //load FoodInformations from CSV add to box
        boxNormal1.loadFromCSV(boxNormal1,boxNormal2,boxNormal3,boxNormal4,boxNormal5,boxNormal6,boxFreezer7,boxFreezer8,boxNormal1Casted,boxNormal2Casted,boxNormal3Casted,boxNormal4Casted,boxNormal5Casted,boxNormal6Casted,boxFreezeer7Casted,boxFreezeer8Casted);

        //input from keyboard
        String InputNameFood = nameFoodTextField.getText();
        LocalDate InputExpireDate = expireDateTextField.getValue();
        String InputWeightFood = weightFoodTextField.getText();
        String InputAmount = amountTextField.getText();
        double InputWeightFoodDouble = Double.parseDouble(InputWeightFood);
        int InputAmountInt = Integer.parseInt(InputAmount);



        //add food to box and sort
        if (containerB.getNumberOfBoxStatic().equals("1")){
            SoftDrink softDrink = new SoftDrink(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            softDrink.setTypeFood("Soft Drink");
            softDrink.setNumberOfBox("1");
            boxNormal1.addFoodtoBox(softDrink);
            boxNormal1.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal1Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal1Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal1Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal1Casted.get(i) + "");
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("2")){
            Meat meat = new Meat(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            meat.setTypeFood("Meat");
            meat.setNumberOfBox("2");
            boxNormal2.addFoodtoBox(meat);
            boxNormal2.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal2Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal2Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal2Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal2Casted.get(i) + "");
            }


        }
        else if (containerB.getNumberOfBoxStatic().equals("3")){
            Fish fish = new Fish(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            fish.setTypeFood("Fish");
            fish.setNumberOfBox("3");
            boxNormal3.addFoodtoBox(fish);
            boxNormal3.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal3Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal3Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal3Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal3Casted.get(i) + "");
            }


        }
        else if (containerB.getNumberOfBoxStatic().equals("4")){
            Milk milk = new Milk(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            milk.setTypeFood("Milk");
            milk.setNumberOfBox("4");
            boxNormal4.addFoodtoBox(milk);
            boxNormal4.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal4Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal4Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal4Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal4Casted.get(i) + "");
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("5")){
            Juice juice = new Juice(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            juice.setTypeFood("Juice");
            juice.setNumberOfBox("5");
            boxNormal5.addFoodtoBox(juice);
            boxNormal5.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal5Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal5Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal5Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal5Casted.get(i) + "");
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("6")){
            Vegetable vegetable = new Vegetable(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            vegetable.setTypeFood("Vegetable");
            vegetable.setNumberOfBox("6");
            boxNormal6.addFoodtoBox(vegetable);
            boxNormal6.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxNormal6Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal6Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxNormal6Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxNormal6Casted.get(i) + "");
            }


        }
        else if (containerB.getNumberOfBoxStatic().equals("7")){
            IceCream icecream = new IceCream(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            icecream.setTypeFood("Icecream");
            icecream.setNumberOfBox("7");
            boxFreezer7.addFoodtoBox(icecream);
            boxFreezer7.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxFreezeer7Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer7Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxFreezeer7Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxFreezeer7Casted.get(i) + "");
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("8")){
            FrozenFoods frozenFoods = new FrozenFoods(InputNameFood,InputExpireDate,InputWeightFoodDouble,InputAmountInt);
            frozenFoods.setTypeFood("Frozen Foods");
            frozenFoods.setNumberOfBox("8");
            boxFreezer8.addFoodtoBox(frozenFoods);
            boxFreezer8.sortByExp();
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);

            //show food in box TextArea
            for (int i=0; i < boxFreezeer8Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer8Casted.get(i) + System.lineSeparator());
            }

            //show last added food TextArea
            for (int i=0; i < boxFreezeer8Casted.size() ; i++) {
                showLastAddActionTextArea.setText(boxFreezeer8Casted.get(i) + "");
            }


        }

        nameFoodTextField.setText("");
        weightFoodTextField.setText("");
        amountTextField.setText("");

        //create box to clear box to use again
        boxNormal1 = new BoxOfNormal();
        boxNormal2  = new BoxOfNormal();
        boxNormal3 = new BoxOfNormal();
        boxNormal4  = new BoxOfNormal();
        boxNormal5 = new BoxOfNormal();
        boxNormal6  = new BoxOfNormal();
        boxFreezer7 = new BoxOfFreezer();
        boxFreezer8  = new BoxOfFreezer();


        //new boxCasted to clear box to use again
        boxNormal1Casted = (ArrayList<FoodInformations>) boxNormal1.getFoodArralay();
        boxNormal2Casted = (ArrayList<FoodInformations>) boxNormal2.getFoodArralay();
        boxNormal3Casted = (ArrayList<FoodInformations>) boxNormal3.getFoodArralay();
        boxNormal4Casted = (ArrayList<FoodInformations>) boxNormal4.getFoodArralay();
        boxNormal5Casted = (ArrayList<FoodInformations>) boxNormal5.getFoodArralay();
        boxNormal6Casted = (ArrayList<FoodInformations>) boxNormal6.getFoodArralay();
        boxFreezeer7Casted = (ArrayList<FoodInformations>) boxFreezer7.getFoodArralay();
        boxFreezeer8Casted = (ArrayList<FoodInformations>) boxFreezer8.getFoodArralay();

    }


    @FXML
    public void handleDeleteFoodButton(ActionEvent event){

        //clear TextArea
        showLastDeleteActionTextArea.setText("");
        showFoodInBoxTextArea.setText("");

        //show number of box
        numberOfBoxLabel.setText("Box No. " + containerB.getNumberOfBoxStatic());

        //load FoodInformations from CSV to box
        boxNormal1.loadFromCSV(boxNormal1, boxNormal2, boxNormal3, boxNormal4, boxNormal5, boxNormal6, boxFreezer7, boxFreezer8, boxNormal1Casted, boxNormal2Casted, boxNormal3Casted, boxNormal4Casted, boxNormal5Casted, boxNormal6Casted, boxFreezeer7Casted, boxFreezeer8Casted);

        if (containerB.getNumberOfBoxStatic().equals("1")){
            boxNormal1.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal1Casted.get(0) +"");
            boxNormal1Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal1Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal1Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("2")){
            boxNormal2.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal2Casted.get(0) +"");
            boxNormal2Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal2Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal2Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("3")){
            boxNormal3.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal3Casted.get(0) +"");
            boxNormal3Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal3Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal3Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("4")){
            boxNormal4.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal4Casted.get(0) +"");
            boxNormal4Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal4Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal4Casted.get(i) + System.lineSeparator());
            }

        }
        else if(containerB.getNumberOfBoxStatic().equals("5")){
            boxNormal5.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal5Casted.get(0) +"");
            boxNormal5Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal5Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal5Casted.get(i) + System.lineSeparator());
            }

        }
        else if(containerB.getNumberOfBoxStatic().equals("6")){
            boxNormal6.sortByExp();
            showLastDeleteActionTextArea.setText(boxNormal6Casted.get(0) +"");
            boxNormal6Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxNormal6Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal6Casted.get(i) + System.lineSeparator());
            }

        }
        else if(containerB.getNumberOfBoxStatic().equals("7")){
            boxFreezer7.sortByExp();
            showLastDeleteActionTextArea.setText(boxFreezeer7Casted.get(0) +"");
            boxFreezeer7Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxFreezeer7Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer7Casted.get(i) + System.lineSeparator());
            }

        }
        else if(containerB.getNumberOfBoxStatic().equals("8")){
            boxFreezer8.sortByExp();
            showLastDeleteActionTextArea.setText(boxFreezeer8Casted.get(0) +"");
            boxFreezeer8Casted.remove(0);
            boxNormal1.recordFoodInformationsToCSVOverWrite(boxNormal1Casted);
            boxNormal2.recordFoodInformationsToCSV(boxNormal2Casted);
            boxNormal3.recordFoodInformationsToCSV(boxNormal3Casted);
            boxNormal4.recordFoodInformationsToCSV(boxNormal4Casted);
            boxNormal5.recordFoodInformationsToCSV(boxNormal5Casted);
            boxNormal6.recordFoodInformationsToCSV(boxNormal6Casted);
            boxFreezer7.recordFoodInformationsToCSV(boxFreezeer7Casted);
            boxFreezer8.recordFoodInformationsToCSV(boxFreezeer8Casted);
            for (int i=0; i < boxFreezeer8Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer8Casted.get(i) + System.lineSeparator());
            }

        }

        //create box to clear box to use again
        boxNormal1 = new BoxOfNormal();
        boxNormal2  = new BoxOfNormal();
        boxNormal3 = new BoxOfNormal();
        boxNormal4  = new BoxOfNormal();
        boxNormal5 = new BoxOfNormal();
        boxNormal6  = new BoxOfNormal();
        boxFreezer7 = new BoxOfFreezer();
        boxFreezer8  = new BoxOfFreezer();


        //new boxCasted to clear box to use again
        boxNormal1Casted = (ArrayList<FoodInformations>) boxNormal1.getFoodArralay();
        boxNormal2Casted = (ArrayList<FoodInformations>) boxNormal2.getFoodArralay();
        boxNormal3Casted = (ArrayList<FoodInformations>) boxNormal3.getFoodArralay();
        boxNormal4Casted = (ArrayList<FoodInformations>) boxNormal4.getFoodArralay();
        boxNormal5Casted = (ArrayList<FoodInformations>) boxNormal5.getFoodArralay();
        boxNormal6Casted = (ArrayList<FoodInformations>) boxNormal6.getFoodArralay();
        boxFreezeer7Casted = (ArrayList<FoodInformations>) boxFreezer7.getFoodArralay();
        boxFreezeer8Casted = (ArrayList<FoodInformations>) boxFreezer8.getFoodArralay();

    }

    @FXML
    public void handleShowButton(ActionEvent event) throws IOException{

        //clear TextArea
        showFoodInBoxTextArea.setText("");

        //load FoodInformations from CSV to box
        boxNormal1.loadFromCSV(boxNormal1, boxNormal2, boxNormal3, boxNormal4, boxNormal5, boxNormal6, boxFreezer7, boxFreezer8, boxNormal1Casted, boxNormal2Casted, boxNormal3Casted, boxNormal4Casted, boxNormal5Casted, boxNormal6Casted, boxFreezeer7Casted, boxFreezeer8Casted);

        //show number of box
        numberOfBoxLabel.setText("Box No. " + containerB.getNumberOfBoxStatic());

        if (containerB.getNumberOfBoxStatic().equals("1")){
            boxNormal1.sortByExp();
            for (int i=0; i < boxNormal1Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal1Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("2")){
            boxNormal2.sortByExp();
            for (int i=0; i < boxNormal2Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal2Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("3")){
            boxNormal3.sortByExp();
            for (int i=0; i < boxNormal3Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal3Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("4")){
            boxNormal4.sortByExp();
            for (int i=0; i < boxNormal4Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal4Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("5")){
            boxNormal5.sortByExp();
            for (int i=0; i < boxNormal5Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal5Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("6")){
            boxNormal6.sortByExp();
            for (int i=0; i < boxNormal6Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxNormal6Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("7")){
            boxFreezer7.sortByExp();
            for (int i=0; i < boxFreezeer7Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer7Casted.get(i) + System.lineSeparator());
            }

        }
        else if (containerB.getNumberOfBoxStatic().equals("8")){
            boxFreezer8.sortByExp();
            for (int i=0; i < boxFreezeer8Casted.size() ; i++) {
                showFoodInBoxTextArea.appendText(boxFreezeer8Casted.get(i) + System.lineSeparator());
            }

        }

        //create box to clear box to use again
        boxNormal1 = new BoxOfNormal();
        boxNormal2  = new BoxOfNormal();
        boxNormal3 = new BoxOfNormal();
        boxNormal4  = new BoxOfNormal();
        boxNormal5 = new BoxOfNormal();
        boxNormal6  = new BoxOfNormal();
        boxFreezer7 = new BoxOfFreezer();
        boxFreezer8  = new BoxOfFreezer();


        //new boxCasted to clear box to use again
        boxNormal1Casted = (ArrayList<FoodInformations>) boxNormal1.getFoodArralay();
        boxNormal2Casted = (ArrayList<FoodInformations>) boxNormal2.getFoodArralay();
        boxNormal3Casted = (ArrayList<FoodInformations>) boxNormal3.getFoodArralay();
        boxNormal4Casted = (ArrayList<FoodInformations>) boxNormal4.getFoodArralay();
        boxNormal5Casted = (ArrayList<FoodInformations>) boxNormal5.getFoodArralay();
        boxNormal6Casted = (ArrayList<FoodInformations>) boxNormal6.getFoodArralay();
        boxFreezeer7Casted = (ArrayList<FoodInformations>) boxFreezer7.getFoodArralay();
        boxFreezeer8Casted = (ArrayList<FoodInformations>) boxFreezer8.getFoodArralay();

    }

    @FXML
    public void handleHomeButton(ActionEvent event) throws IOException {
        //change page to HomePage
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        stage.setScene(new Scene(loader.load(),809,649));
        stage.show();
    }

    @FXML
    public void handleBackButton(ActionEvent event) throws IOException {
        //change page to RefrigeratorPage
        Button HomeButton = (Button) event.getSource();
        Stage stage = (Stage) HomeButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RefrigeratorPage.fxml"));
        stage.setScene(new Scene(loader.load(),839,726));
        stage.show();
    }
}