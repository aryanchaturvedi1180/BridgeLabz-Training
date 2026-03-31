package linear_and_binary_search;
import java.io.*;

public class ConsoleToFile {
	public static void main(String[] args) {
        String filePath = "/Users/aryanchaturvedi/eclipse-workspace/dsa-practice/src/linear_and_binary_search/example.txt";

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true) // append mode
        ) 
        {
            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input + System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
