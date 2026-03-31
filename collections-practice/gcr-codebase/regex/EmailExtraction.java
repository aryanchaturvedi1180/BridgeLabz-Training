package regex;
public class EmailExtraction {

    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";

        for (String word : text.split(" ")) {
            if (word.contains("@")) {
                System.out.println(word);
            }
        }
    }
}
