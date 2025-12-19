package control_flow;

import java.util.*;

public class MultiplesBelow100 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid!. Enter a positive integer less than 100");
        } else {
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }

}
