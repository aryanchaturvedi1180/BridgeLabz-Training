package linear_and_binary_search;
import java.io.*;

public class WordCount {

    public static void main(String[] args) {
        String filePath = "/Users/aryanchaturvedi/eclipse-workspace/dsa-practice/src/linear_and_binary_search/example.txt";
        String targetWord = "java";

        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");// Split line into words using space

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences of '" + targetWord + "': " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
