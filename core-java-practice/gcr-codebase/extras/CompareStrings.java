package extras;
import java.util.*;

public class CompareStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		input.close();

		int len = Math.min(s1.length(), s2.length());

		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (s1.charAt(i) < s2.charAt(i))
					System.out.println(s1 + " comes before " + s2);
				else
					System.out.println(s2 + " comes before " + s1);
				return;
			}
		}

		if (s1.length() < s2.length())
			System.out.println(s1 + " comes before " + s2);
		else if (s1.length() > s2.length())
			System.out.println(s2 + " comes before " + s1);
		else
			System.out.println("Both strings are equal");
		
	}
}
