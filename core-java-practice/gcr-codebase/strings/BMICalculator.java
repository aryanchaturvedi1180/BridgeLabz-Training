package strings;

import java.util.*;

public class BMICalculator {

    static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } 
        else if (bmi <= 24.9) {
            return "Normal";
        } 
        else if (bmi <= 39.9) {
            return "Overweight";
        } 
        else {
            return "Obese";
        }
    }

    static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            String status = getBMIStatus(bmi);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1] + "\t\t" + result[i][2] + "\t" + result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        String[][] result = calculateBMI(data);
        displayResult(result);
        
        input.close();
    }
}

