package methods;
import java.util.*;

public class MaxHandshakes {
	public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        
        input.close();
    }

}
