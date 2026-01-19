package review;

class InsufficientBalanceException extends Exception{ 
	public InsufficientBalanceException(String message) {
		super(message);
	}

}


public class CustomExceptionGenerate {
	public static void withdraw(double amount, double balance) throws InsufficientBalanceException{
		if(amount < balance) {
			throw new InsufficientBalanceException("Insufficent balance Hai!");
		}
		System.out.println("out");
	}
	public static void main(String[] args) throws InsufficientBalanceException {
		double amount = 500.0;
		double balance = 5000.0;
		
		withdraw(amount, balance);
		
	}

}
