package strings;

import java.util.*;

public class SubstringCompare {

    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println(manualSub);
        System.out.println(builtInSub);
        System.out.println(compareStrings(manualSub, builtInSub));
        
        input.close();
    }
}

