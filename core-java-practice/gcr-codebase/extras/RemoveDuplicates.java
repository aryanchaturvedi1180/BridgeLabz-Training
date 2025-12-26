package extras;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String result = "";

		for (char ch : str.toCharArray()) {
			if (result.indexOf(ch) == -1)
				result += ch;
		}

		System.out.println("Modified String: " + result);
		input.close();
	}
}
