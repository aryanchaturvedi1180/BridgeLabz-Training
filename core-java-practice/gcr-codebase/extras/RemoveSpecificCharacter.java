package extras;
import java.util.*;

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char remove = input.next().charAt(0);

		String result = "";
		for (char ch : str.toCharArray()) {
			if (ch != remove)
				result += ch;
		}

		System.out.println("Modified String: " + result);
		input.close();
	}
}
