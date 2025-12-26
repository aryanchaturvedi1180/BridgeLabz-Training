package extras;
import java.util.*;

public class SubstringOccurrences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String sub = input.nextLine();

		int count = 0;
		for (int i = 0; i <= str.length() - sub.length(); i++) {
			if (str.substring(i, i + sub.length()).equals(sub))
				count++;
		}

		System.out.println("Occurrences: " + count);
		input.close();
	}
}
