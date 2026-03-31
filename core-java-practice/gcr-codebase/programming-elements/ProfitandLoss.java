package gcr_codebase;

public class ProfitandLoss {
	public static void main(String[] args) {
		double costPrice = 129;
        double sellingProfit = 70.0;
        double profit = sellingProfit - costPrice;
        double profitpercentage = (profit / costPrice )* 100; //formula
        
        
        System.out.println("The Cost Price in INR " + costPrice + " and Selling Price in INR "+ sellingProfit);
        System.out.println("Profit in INR " + profit + " and the Profit Percentage is " + profitpercentage);;
	}

}
