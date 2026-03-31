package arrays;

import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        int[] percentage = new int[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            physics[i] = input.nextInt();
            chemistry[i] = input.nextInt();
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80) {
            	grade[i] = "A";
            }
            else if (percentage[i] >= 70) {
            	grade[i] = "B";
            }
            else if (percentage[i] >= 60) {
            	grade[i] = "C";
            }
            else if (percentage[i] >= 50) {
            	grade[i] = "D";
            }
            else if (percentage[i] >= 40) {
            	grade[i] = "E";
            }
            else {
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
