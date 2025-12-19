package control_flow;

import java.util.*;

public class FactorsUsingWhile {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("This is not positive integer. Enter Again!");
        } else {
            int i = 1;
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        input.close();
    }

}
