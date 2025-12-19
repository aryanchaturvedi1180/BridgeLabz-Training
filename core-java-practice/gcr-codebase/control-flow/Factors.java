package control_flow;

import java.util.*;

public class Factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("his is not positive integer. Enter Again!");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
	}
}
