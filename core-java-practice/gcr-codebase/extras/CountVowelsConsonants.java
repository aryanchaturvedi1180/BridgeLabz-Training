package extras;
import java.util.*;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int vowels = 0, consonants = 0;
		str = str.toLowerCase();

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		input.close();
	}
}
