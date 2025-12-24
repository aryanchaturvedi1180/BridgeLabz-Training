package review;

import java.util.*;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr1[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr1[i][j] = input.nextInt();
			}
		}

		int arr2[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		int arr3[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				arr3[i][j] = arr1[i][j] + arr2[i][j];

			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.print(arr3[i][j] + " ");

			}
		}

		input.close();

	}
}
