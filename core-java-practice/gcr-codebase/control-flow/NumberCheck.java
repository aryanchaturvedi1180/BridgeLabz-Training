package control_flow;

import java.util.*;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();

		if (n > 0) {
			System.out.println("positive");
		} else if (n < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		
		input.close();
	}
}
