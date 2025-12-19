package control_flow;

import java.util.*;

public class SumUntilZeroWithBreak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		double val = input.nextDouble();
		
		while(val != 0) {
			
			if(val == 0.0) {
				break;
			}
			
			total += val;
			val--;
		}
		System.out.println(total);
		
		input.close();
	}

}
