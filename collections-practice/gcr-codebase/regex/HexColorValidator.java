package regex;
import java.util.*;
public class HexColorValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        if (color.matches("^#[0-9A-Fa-f]{6}$")) {
            System.out.println("Valid hex color");
        } else {
            System.out.println("Invalid hex color");
        }
    }
}
