package control_flow;
import java.util.*;
public class DivisivleByFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.print("Is the number " + number + " divisible by 5? ");
		
		if(number % 5 == 0) {
			System.out.println("Yes, it is divisible by 5");
		}
		else {
			System.out.println("No, it is not divisible by 5");
		}
		

	}

}
