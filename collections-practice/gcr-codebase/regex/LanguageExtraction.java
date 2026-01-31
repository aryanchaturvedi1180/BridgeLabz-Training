package regex;
public class LanguageExtraction {
    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        for (String word : text.split(" ")) {
            if (word.equals("Java,") || word.equals("Python,") 
                || word.equals("JavaScript,") || word.equals("Go")) {
                System.out.print(word.replace(",", "") + " ");
            }
        }
    }
}
