package extras;
import java.util.*;

public class LongestWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String[] words = sentence.split(" ");
		String longest = "";

		for (String word : words) {
			if (word.length() > longest.length())
				longest = word;
		}

		System.out.println("Longest Word: " + longest);
		input.close();
	}
}
