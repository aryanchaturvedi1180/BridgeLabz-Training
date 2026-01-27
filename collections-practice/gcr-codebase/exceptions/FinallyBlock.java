package exceptions;
import java.util.*;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter the first number: ");
			int num1 = input.nextInt();
			
			System.out.println("Enter the second number: ");
			int num2 = input.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		finally {
			System.out.println("Operation completed");
			input.close();
		}
	}
}
