package control_flow;

import java.util.*;

public class SumNaturalNumbersFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		if (n <= 0) {
			System.out.println("Not a Natural Number");
			
		}

		int sumLoop = 0;
		for(int i = 0; i <= n; i++) {
			sumLoop += i;
		}

		int sumFormula = n * (n + 1) / 2;

		System.out.println("Sum using loop = " + sumLoop);
		System.out.println("Sum using formula = " + sumFormula);

		if (sumLoop == sumFormula) {
			System.out.println("Both results are matching..");
		} else {
			System.out.println("Results are not matching..");
		}

		input.close();
	}
}
