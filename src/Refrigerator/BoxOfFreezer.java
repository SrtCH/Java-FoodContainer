package Refrigerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BoxOfFreezer extends BoxOfRefrigeratorInformation{

    private ArrayList<FoodInformations> foodArrlayList;

    public BoxOfFreezer(){
        super();
        foodArrlayList = new ArrayList<>();
    }

    public void addFoodtoBox(FoodInformations foodObj){
        foodArrlayList.add(foodObj);
    }

    public void sortByExp(){
        foodArrlayList.sort(Comparator.comparing(FoodInformations::getExpireDate));
    }

    public ArrayList<FoodInformations> getFoodArralay(){
        return foodArrlayList;
    }

}
