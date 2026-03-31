package linear_and_binary_search;
import java.io.*;

public class FileRead {

    public static void main(String[] args) {
        String filePath = "/Users/aryanchaturvedi/eclipse-workspace/dsa-practice/src/linear_and_binary_search/example.txt";

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
