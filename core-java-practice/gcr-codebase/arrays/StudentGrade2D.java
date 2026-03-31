package arrays;

import java.util.*;

public class StudentGrade2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[][] marks = new int[n][3]; // physics, chemistry, maths
		int[] percentage = new int[n];
		String[] grade = new String[n];

		for (int i = 0; i < n; i++) {
			marks[i][0] = input.nextInt();
			marks[i][1] = input.nextInt();
			marks[i][2] = input.nextInt();

			if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
				i--;
				continue;
			}

			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

			if (percentage[i] >= 80) {
				grade[i] = "A";
			} else if (percentage[i] >= 70) {
				grade[i] = "B";
			} else if (percentage[i] >= 60) {
				grade[i] = "C";
			} else if (percentage[i] >= 50) {
				grade[i] = "D";
			} else if (percentage[i] >= 40) {
				grade[i] = "E";
			} else {
				grade[i] = "R";
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Percentage: " + percentage[i]);
			System.out.println("Grade: " + grade[i]);
		}

		input.close();
	}
}
