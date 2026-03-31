package control_flow;
import java.util.*;
public class SumUntilZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		double val = input.nextDouble();
		
		while(val != 0) {
			
			total += val;
			val--;
		}
		System.out.println(total);
		
		input.close();
	}

}
