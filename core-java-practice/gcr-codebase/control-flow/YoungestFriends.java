package control_flow;
import java.util.*;
public class YoungestFriends {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.println("Enter ages of Amar, Akbar, Anthony: ");
	    int age1 = input.nextInt();
	    int age2 = input.nextInt();
	    int age3 = input.nextInt();

	    System.out.println("Enter heights of Amar, Akbar, Anthony: ");
	    int height1 = input.nextInt();
	    int height2 = input.nextInt();
	    int height3 = input.nextInt();

	    // Youngest
	    int youngest = age1;
	    if (age2 < youngest) {
	    	youngest = age2;
	    }
	    if (age3 < youngest) {
	    	youngest = age3;
	    }
	    System.out.println("Youngest age: " + youngest);

	    // Tallest
	    int tallest = height1;
	    if (height2 > tallest) {
	    	tallest = height2;
	    }
	    if (height3 > tallest) {
	    	tallest = height3;
	    }
	    System.out.println("Tallest height: " + tallest);

	    input.close();
	}

}
