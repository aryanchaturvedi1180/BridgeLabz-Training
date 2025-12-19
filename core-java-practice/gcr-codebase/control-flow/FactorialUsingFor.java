package control_flow;

import java.util.*;

public class FactorialUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		input.close();
	}


}
