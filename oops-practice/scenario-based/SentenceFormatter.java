package scenario_based;
import java.util.*;

public class SentenceFormatter {
	public static String format(String paragraph) {
		
		if (paragraph == null || paragraph.trim().isEmpty()) {
			return "";
		}
		
		paragraph = paragraph.trim().replaceAll("\\s+", " ");
		StringBuilder result = new StringBuilder();
		boolean capitalNext = true;
		for (int i = 0; i < paragraph.length(); i++) {
			char ch = paragraph.charAt(i);
			if (capitalNext && Character.isLetter(ch)) {
				result.append(Character.toUpperCase(ch));
				capitalNext = false;
			} else {
				result.append(ch);
			}
			
			if (ch == '.' || ch == '?' || ch == '!') {
				capitalNext = true;

				if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
					result.append(' ');
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		System.out.println(format(text));
		
		input.close();
	}
}