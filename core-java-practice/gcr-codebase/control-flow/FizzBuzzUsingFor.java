package control_flow;

import java.util.*;

public class FizzBuzzUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		if (number <= 0) {
			System.out.println("This is not positive integer. Enter Again!");
		} else {
			for (int i = 1; i <= number; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
		input.close();
	}

}
