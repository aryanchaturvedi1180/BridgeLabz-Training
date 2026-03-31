package control_flow;

import java.util.*;

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }

        input.close();
	}

}
