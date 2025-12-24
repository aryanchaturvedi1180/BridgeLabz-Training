package methods;

import java.util.*;

public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        if((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
        	return true;
        }    
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        if(isSpring(month, day)) {
        	System.out.println("It's a Spring Season");
        }
        else {
        	System.out.println("Not a Spring Season");
        }
            
        input.close();
    }
    
}
