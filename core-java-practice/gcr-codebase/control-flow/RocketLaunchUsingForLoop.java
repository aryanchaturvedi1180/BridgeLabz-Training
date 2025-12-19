package control_flow;

import java.util.*;

public class RocketLaunchUsingForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = input.nextInt();

		for (int i = counter; i >= 1; i--) {
			System.out.print(i + " ");
		}

		input.close();
	}
}
