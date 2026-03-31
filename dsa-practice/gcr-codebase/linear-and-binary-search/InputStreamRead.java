package linear_and_binary_search;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamRead {
	public static void main(String[] args) {
        String filePath = "/Users/aryanchaturvedi/eclipse-workspace/dsa-practice/src/linear_and_binary_search/example.txt";

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
