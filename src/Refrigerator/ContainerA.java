package Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class ContainerA {

    private final List<FoodInformations> items;

    public ContainerA(){
        this.items = new ArrayList<>();
    }

    public void clearArrayList(){
        ContainerC.clearArrayList();
    }
    public void setItem(final FoodInformations item){
        ContainerC.setItem(item);
    }


}
