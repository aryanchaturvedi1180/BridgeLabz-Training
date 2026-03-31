package methods;

import java.util.*;

public class SimpleInterest {
	
	public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time in years: ");
        double time = input.nextDouble();

        double si = calculateSI(principal, rate, time);
        
        System.out.println("The Simple Interest for Principal " + principal +", Rate of Interest " + rate + ", and Time " + time + " is " + si);
        
        input.close();
	}

}
