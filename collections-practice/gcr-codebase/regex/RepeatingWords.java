package regex;
public class RepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equalsIgnoreCase(words[i + 1])) {
                System.out.println(words[i]);
            }
        }
    }
}
