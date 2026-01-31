package regex;
import java.util.*;

public class ValidateLicense {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        if (username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Username is invalid");
        }

        System.out.print("Enter license plate number: ");
        String plate = sc.nextLine();
        if (plate.matches("^[A-Z]{2}[0-9]{4}$")) {
            System.out.println("License plate is valid");
        } else {
            System.out.println("License plate is invalid");
        }
    }
}
