package extras;
import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		if (str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		input.close();
	}

}
