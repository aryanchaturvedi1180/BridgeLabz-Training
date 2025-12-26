package extras;
import java.util.*;

public class MostFrequentCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int[] freq = new int[256];
		for (char ch : str.toCharArray())
			freq[ch]++;

		char result = str.charAt(0);
		int max = freq[result];

		for (char ch : str.toCharArray()) {
			if (freq[ch] > max) {
				max = freq[ch];
				result = ch;
			}
		}

		System.out.println("Most Frequent Character: " + result);
		input.close();
	}
}
