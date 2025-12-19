package control_flow;

import java.util.*;

public class FactorialUsingWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int fact = 1;
		int i = 1;
		
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		
		System.out.println(fact);
		input.close();
	}

}
