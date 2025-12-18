package gcr_codebase;

public class ProfitandLoss {
	public static void main(String[] args) {
		double CP = 129;
        double SP = 70.0;
        double profit = SP - CP;
        double profitpercentage = (profit / CP )* 100; //formula
        
        
        System.out.println("The Cost Price in INR " + CP + " and Selling Price in INR "+ SP);
        System.out.println("Profit in INR " + profit + " and the Profit Percentage is " + profitpercentage);;
	}

}
