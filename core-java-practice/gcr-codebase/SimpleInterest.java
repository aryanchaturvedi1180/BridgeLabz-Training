import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();
        int interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is " + interest);
    }
    
}
