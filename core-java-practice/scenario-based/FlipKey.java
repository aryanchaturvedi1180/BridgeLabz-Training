package scenario_based;
import java.util.*;

public class FlipKey {
	
	public static String CleanseAndInvert(String input) {
		if(input == null || input.length() < 6) {
			return "";
		}
		
		for(int i = 0; i < input.length(); i++) {
			if(!Character.isLetter(input.charAt(i))) {
				return "";
			}
		}
		
		// Convert the input to lowercase.
		input = input.toLowerCase();
		
		// Remove all characters whose ASCII values are even numbers.
		String filter = "";
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch % 2 != 0) {
				filter += ch;
			}
		}
		
		// Reverse the remaining characters.
		String rev = "";
		for(int i = filter.length() - 1; i >= 0; i--) {
			rev += filter.charAt(i);
		}
		
		// Convert even index characters to uppercase
		String result = "";
		for(int i = 0; i < rev.length(); i++) {
			if(i % 2 == 0) {
				result += Character.toUpperCase(rev.charAt(i));
			}
			else {
				result += rev.charAt(i);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		String word = input.nextLine();
		
		String output = CleanseAndInvert(word);
		
		if(output.isEmpty()) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("The generated key is - " + output);
		}
		
		input.close();
	}
}
