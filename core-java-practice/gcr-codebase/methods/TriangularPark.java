package methods;

import java.util.*;

public class TriangularPark {
	
	public static int calculateRounds(double a, double b, double c) {
		double perimeter = a + b + c;
		double distance = 5000; // 5 km in meters
		
		return (int) Math.ceil(distance / perimeter);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter side 1, 2, 3 (in meters): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		int rounds = calculateRounds(a, b, c);
		System.out.println("The athlete must complete "+rounds+" rounds to run 5 km");
		
		input.close();
	}

}
