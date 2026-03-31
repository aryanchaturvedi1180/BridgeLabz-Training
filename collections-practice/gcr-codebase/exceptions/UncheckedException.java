package exceptions;
import java.util.*;

public class UncheckedException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        } 
        finally {
            input.close();
        }
	}
}
