package gcr_codebase;
import java.util.*;

public class UserInputCourseFeeDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountPercent = input.nextInt();
		
		int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + "Tand the final discounted fee is INR " + finalFee);
		
        input.close();
	}

}
