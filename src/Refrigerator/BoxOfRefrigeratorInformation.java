package Refrigerator;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class BoxOfRefrigeratorInformation{
    private ArrayList<FoodInformations> foodArralay;

    public BoxOfRefrigeratorInformation(){
        foodArralay = new ArrayList<>();
    }

    public void addFoodtoBox(FoodInformations foodObj){
        foodArralay.add(foodObj);
    }

    public void sortByExp(){
        foodArralay.sort(Comparator.comparing(FoodInformations::getExpireDate));
        //Collections.reverse(foodObj);
    }

    public ArrayList<FoodInformations> getFoodArralay(){
        return foodArralay;
    }


    //write to csv
    public void recordFoodInformationsToCSV(ArrayList<FoodInformations> foodArralay){
        try {
            File file = new File("resources/filesCSV/RefrigeratorData.csv");
            if (!file.exists()) file.mkdirs();
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int iObj=0; iObj < foodArralay.size() ; iObj++) {
                writer.write(foodArralay.get(iObj) +"");
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving");
        }
    }


    //over write
    public void recordFoodInformationsToCSVOverWrite(ArrayList<FoodInformations> foodArralay){
        try {
            File file = new File("resources/filesCSV/RefrigeratorData.csv");
            if (!file.exists()) file.mkdirs();
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int iObj=0; iObj < foodArralay.size() ; iObj++) {
                writer.write(foodArralay.get(iObj) +"");
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving");
        }
    }


    //load from CSV
    public void loadFromCSV(BoxOfRefrigeratorInformation box1 , BoxOfRefrigeratorInformation box2 , BoxOfRefrigeratorInformation box3 , BoxOfRefrigeratorInformation box4 , BoxOfRefrigeratorInformation box5 ,
                            BoxOfRefrigeratorInformation box6 , BoxOfRefrigeratorInformation box7 , BoxOfRefrigeratorInformation box8 , ArrayList<FoodInformations> box1Casted , ArrayList<FoodInformations> box2Casted ,
                            ArrayList<FoodInformations> box3Casted , ArrayList<FoodInformations> box4Casted , ArrayList<FoodInformations> box5Casted , ArrayList<FoodInformations> box6Casted , ArrayList<FoodInformations> box7Casted , ArrayList<FoodInformations> box8Casted){

        String inputNameFoodFromCSV;
        String inputTypeFoodFromCSV;
        LocalDate inputExpireDate;
        double inputWeightFoodFromCSV = 0.0;
        int inputAmountInt = 0;
        String inputNumberOfBoxFromCSV;


        try{
            File file = new File("resources/filesCSV/RefrigeratorData.csv");
            if(!file.exists()) file.mkdirs();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                String[] values = line.split(",");
                if (values[0].equals("")){
                    continue;
                }
                else {
                    inputNameFoodFromCSV = values[0];
                    inputTypeFoodFromCSV = values[1];
                    inputExpireDate = LocalDate.parse(values[2]);
                    inputWeightFoodFromCSV = Double.parseDouble(values[3]);
                    inputAmountInt = Integer.parseInt(values[4]);
                    inputNumberOfBoxFromCSV = values[5];

                    FoodInformations foodObjFromCSV = new FoodInformations(inputNameFoodFromCSV,inputTypeFoodFromCSV,inputExpireDate,inputWeightFoodFromCSV,inputAmountInt,inputNumberOfBoxFromCSV);

                    //Load food to box and sort
                    if (inputNumberOfBoxFromCSV.equals("1")){
                        box1.addFoodtoBox(foodObjFromCSV);
                        box1.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("2")){
                        box2.addFoodtoBox(foodObjFromCSV);
                        box2.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("3")){
                        box3.addFoodtoBox(foodObjFromCSV);
                        box3.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("4")){
                        box4.addFoodtoBox(foodObjFromCSV);
                        box4.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("5")){
                        box5.addFoodtoBox(foodObjFromCSV);
                        box5.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("6")){
                        box6.addFoodtoBox(foodObjFromCSV);
                        box6.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("7")){
                        box7.addFoodtoBox(foodObjFromCSV);
                        box7.sortByExp();
                    }
                    else if (inputNumberOfBoxFromCSV.equals("8")){
                        box8.addFoodtoBox(foodObjFromCSV);
                        box8.sortByExp();
                    }
                }
            }
            reader.close();


        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            e.printStackTrace();
            System.err.println("Error reading");
        }

    }

    //read from csv
    public void readFromCSV(){

    }

}
