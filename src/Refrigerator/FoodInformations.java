package Refrigerator;

import java.time.LocalDate;

public class FoodInformations{

    private String nameFood;
    private String typeFood;
    private LocalDate expireDate;
    private double weightFood;
    private int amountFood;
    private String numberOfBox;

    private String typeFoodForReadWrite;
    private String numberOfBoxForReadWrite;
    //private String recordFoodInformationsLocation = "resources/filesCSV/RefrigeratorData.csv";

    public FoodInformations(){
        this.nameFood = "nameFood";
        this.typeFood = "typeFoodStatic";
        this.expireDate = LocalDate.parse("2020-12-31");
        this.weightFood = 0.0;
        this.amountFood = 1;
        this.numberOfBox = "0";
    }

    public FoodInformations(String nameFood, LocalDate expireDate, double weightFood, int amountFood) {
        this.nameFood = nameFood;
        //this.typeFood = typeFood;
        this.expireDate = expireDate;
        this.weightFood = weightFood;
        this.amountFood = amountFood;
        //this.numberOfBox = numberOfBox;
    }
    public FoodInformations(String nameFood, String typeFoodForReadWrite, LocalDate expireDate, double weightFood, int amountFood, String numberOfBoxForReadWrite) {
        this.nameFood = nameFood;
        this.typeFoodForReadWrite = typeFoodForReadWrite;
        this.expireDate = expireDate;
        this.weightFood = weightFood;
        this.amountFood = amountFood;
        this.numberOfBoxForReadWrite = numberOfBoxForReadWrite;
    }

    public String getNameFood() {
        return nameFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public double getWeightFood() {
        return weightFood;
    }

    public int getAmountFood() {
        return amountFood;
    }

    public String getNumberOfBox() {
        return numberOfBox;
    }

    public String getTypeFoodForReadWrite() {
        return typeFoodForReadWrite;
    }

    public String getNumberOfBoxForReadWrite() {
        return numberOfBoxForReadWrite;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public void setTypeFood(final String typeFood) {
        this.typeFood = typeFood;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setWeightFood(double weightFood) {
        this.weightFood = weightFood;
    }

    public void setAmountFood(int amountFood) {
        this.amountFood = amountFood;
    }

    public void setNumberOfBox(final String numberOfBox) {
        this.numberOfBox = numberOfBox;
    }

    public void setTypeFoodForReadWrite(String typeFoodForReadWrite) {
        this.typeFoodForReadWrite = typeFoodForReadWrite;
    }

    public void setNumberOfBoxForReadWrite(String numberOfBoxForReadWrite) {
        this.numberOfBoxForReadWrite = numberOfBoxForReadWrite;
    }


    @Override
    public String toString() {
        return nameFood +","+ typeFoodForReadWrite +","+ expireDate +","+ weightFood +","+ amountFood +","+ numberOfBoxForReadWrite;
    }

}
