package Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class ContainerC {

    private static List<FoodInformations> items = new ArrayList<>();

    public static void clearArrayList(){
        ContainerC.items.clear();
    }
    public static void setItem(final FoodInformations item){
        ContainerC.items.add(item);
    }

    public static String getTypeFoodStatic(){
        return ContainerC.items.get(0).getTypeFood();
    }

    public static String getNumberOfBoxStatic(){
        return ContainerC.items.get(0).getNumberOfBox();
    }

}
