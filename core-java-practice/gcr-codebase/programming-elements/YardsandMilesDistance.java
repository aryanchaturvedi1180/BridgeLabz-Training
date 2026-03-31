package gcr_codebase;
import java.util.*;

public class YardsandMilesDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter distance in feet: ");
		double distance = input.nextDouble();
		
		double yards = distance / 3;
		double miles = yards / 1760;
		
		System.out.print("Distance in Yards is: " + yards + " and in miles is: " + miles);
		
		input.close();
	}
}
