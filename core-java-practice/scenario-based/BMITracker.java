package scenario_based;

import java.util.*;

public class BMITracker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your height in meters: ");
		double height = input.nextDouble();
		System.out.print("Enter your weight in kg: ");
		double weight = input.nextDouble();

		if (height <= 0 || weight <= 0) { // valid input checking
			System.out.println("Invalid Input!. Height and Weight must be positive values ");
		} else {
			double bmi = weight / (height * height); // BMI Calculation

			System.out.println("Your BMI is: " + bmi);
			if (bmi < 18.5) {
				System.out.println("Category: Underweight");
			} else if (bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("Category: Normal");
			} else {
				System.out.println("Category: Overweight");
			}

			input.close();
		}

	}

}
