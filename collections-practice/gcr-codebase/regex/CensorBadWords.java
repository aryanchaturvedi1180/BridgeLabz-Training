package regex;

public class CensorBadWords {

    public static void main(String[] args) {

        String input = "\tThis is a damn bad example with some stupid words.";
        System.out.println("Input Sentence is: "+ input);

        input = input.replace("damn", "****");
        input = input.replace("stupid", "****");

        System.out.println("\nReplaced Sentence is: " + input);
    }
}
