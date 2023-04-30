package Refrigerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class InputFromCSV {
    public InputFromCSV(){

    }
    public FoodInformations readFromCSV(FoodInformations foobObj, String nameFood, String typeFood, LocalDate expireDate, double weightFood, int amountFood, String numberOfBox) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("resources/filesCSV/RefrigeratorData.csv");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("File not found");
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[0]);

                /*nameFood = values[0];
                typeFood = values[1];
                expireDate = LocalDate.parse(values[2]);
                weightFood = Double.parseDouble(values[3]);
                amountFood = Integer.parseInt(values[4]);
                numberOfBox = values[5];
                foobObj = new FoodInformations(nameFood,typeFood,expireDate,weightFood,amountFood,numberOfBox);*/
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return foobObj;
    }
}
