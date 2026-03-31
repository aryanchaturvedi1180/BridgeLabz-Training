package linear_and_binary_search;

public class SentenceSearch {

    public static String findSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = { "Java is a powerful language", "I love learning data structures", "Linear search is simple", "Binary search is faster"};
        String word = "Linear";

        System.out.println(findSentence(sentences, word));
    }
}
