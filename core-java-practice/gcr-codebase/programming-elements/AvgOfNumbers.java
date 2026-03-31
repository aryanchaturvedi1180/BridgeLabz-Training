package gcr_codebase;
import java.util.*;

public class AvgOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of numbers is " + avg);
        input.close();
    }
    
}
