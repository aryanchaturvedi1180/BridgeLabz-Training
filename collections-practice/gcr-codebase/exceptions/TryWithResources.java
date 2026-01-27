package exceptions;
import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {
		try (
				FileReader fr = new FileReader("info.txt");
	            BufferedReader br = new BufferedReader(fr)
	            ){

            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
	}
}
