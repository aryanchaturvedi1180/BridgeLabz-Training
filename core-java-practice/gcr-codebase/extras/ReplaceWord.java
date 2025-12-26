package extras;
import java.util.*;

public class ReplaceWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String oldWord = input.next();
		String newWord = input.next();

		String result = sentence.replace(oldWord, newWord);
		System.out.println("Modified Sentence: " + result);
		input.close();
	}
}
