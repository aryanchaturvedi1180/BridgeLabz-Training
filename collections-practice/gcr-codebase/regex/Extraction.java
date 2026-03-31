package regex;
public class Extraction {

    public static void main(String[] args) {

        String emailText = "Contact us at this@example.com and info@company.org";
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        System.out.println("Extracted Email Addresses:");
        for (String word : emailText.split(" ")) {
            if (word.contains("@")) {
                System.out.println(word);
            }
        }

        System.out.println("\nCapitalized Words:");
        for (String word : sentence.split(" ")) {
            if (Character.isUpperCase(word.charAt(0))) {
                System.out.print(word + " ");
            }
        }
    }
}
