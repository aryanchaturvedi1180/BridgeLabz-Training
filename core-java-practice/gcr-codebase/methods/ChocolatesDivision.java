package methods;

import java.util.*;
public class ChocolatesDivision {
	
	public static int[] findRemAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        int[] result = findRemAndQuotient(chocolates, children);
        
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
        
        input.close();
    }

}
