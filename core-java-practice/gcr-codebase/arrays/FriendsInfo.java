package arrays;

import java.util.*;

public class FriendsInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] age = new int[3];
		double[] height = new double[3];
		String[] names = { "Amar", "Akbar", "Anthony" };

		for (int i = 0; i < 3; i++) {
			age[i] = input.nextInt();
			height[i] = input.nextDouble();
		}

		int youngestIndex = 0;
		int tallestIndex = 0;

		for (int i = 1; i < 3; i++) {
			if (age[i] < age[youngestIndex]) {
				youngestIndex = i;
			}

			if (height[i] > height[tallestIndex]) {
				tallestIndex = i;
			}
		}

		System.out.println("Youngest Friend: " + names[youngestIndex] + " and Tallest Friend: " + names[tallestIndex]);

		input.close();
	}
}
