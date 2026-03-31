package regex;

import java.util.Scanner;
public class CreditCardValidator {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNumber = sc.nextLine();

        if (cardNumber.matches("^(4\\d{15}|5\\d{15})$")) {
            System.out.println("Valid card number");
        } else {
            System.out.println("Invalid card number");
        }
    }
}
