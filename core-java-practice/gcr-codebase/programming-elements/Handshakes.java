package gcr_codebase;
import java.util.*;

public class Handshakes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum no. of handshakes is: " + handshakes);
        
        input.close();
	}

}
