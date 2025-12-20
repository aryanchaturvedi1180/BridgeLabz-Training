package arrays;

import java.util.*;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        // input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        // copy 2D to 1D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // display 1D array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}

