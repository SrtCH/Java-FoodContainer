package Refrigerator;

import java.time.LocalDate;

public class Juice extends FoodInformations{
    private String nameFood;
    private String typeFood;
    private LocalDate expireDate;
    private double weightFood;
    private int amountFood;
    private String numberOfBox;

    public Juice(String nameFood, LocalDate expireDate, double weightFood, int amountFood){
        this.nameFood = nameFood;
        this.expireDate = expireDate;
        this.weightFood = weightFood;
        this.amountFood = amountFood;
    }

    public Juice(){
        this.nameFood = "nameFood";
        this.expireDate = LocalDate.parse("2020-12-31");
        this.weightFood = 0.0;
        this.amountFood = 0;
    }

    @Override
    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    @Override
    public void setNumberOfBox(String numberOfBox) {
        this.numberOfBox = numberOfBox;
    }

    @Override
    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String getNumberOfBox() {
        return numberOfBox;
    }

    @Override
    public String toString() {
        return nameFood +","+ typeFood +","+ expireDate +","+ weightFood +","+ amountFood +","+ numberOfBox;
    }
}
