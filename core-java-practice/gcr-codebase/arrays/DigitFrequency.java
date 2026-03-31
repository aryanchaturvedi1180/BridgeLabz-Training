package arrays;
import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;

        int[] digits = new int[20];
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " Frequency: " + frequency[i]);
            }
        }

        sc.close();
    }
}
