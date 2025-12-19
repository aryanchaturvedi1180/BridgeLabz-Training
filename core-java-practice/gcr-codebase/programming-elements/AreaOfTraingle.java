package gcr_codebase;
import java.util.*;

public class AreaOfTraingle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base: ");
		double base = input.nextDouble();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		double areaInCm = 0.5 * base * height;
        double areaInInch = areaInCm / (2.54 * 2.54);
        
        System.out.println("Area of triangle in square inches is: " + areaInInch + " and in square centimetres is: " + areaInCm);
        
        input.close();
	}

}
