package streams;
import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {

        String sourceFile = "/Users/aryanchaturvedi/eclipse-workspace/collections-practice/src/streams/source.txt";
        String destinationFile = "/Users/aryanchaturvedi/eclipse-workspace/collections-practice/src/streams/destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing the file.");

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}
