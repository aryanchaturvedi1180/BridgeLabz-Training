package scenario_based;
import java.util.*;

public class MovieTicketBookingApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice = 'y';

		do {
			int ticketPrice = 0;
			int snackPrice = 0;

			System.out.print("Enter movie type (1:Regular, 2:3D): ");
			int movieType = input.nextInt();

			switch (movieType) {
			case 1:
				ticketPrice = 150;
				break;
			case 2:
				ticketPrice = 250;
				break;
			default:
				System.out.println("Invalid movie type");
				continue;
			}

			System.out.print("Enter seat type (gold/silver): ");
			String seatType = input.next();

			if (seatType.equalsIgnoreCase("gold")) {
				ticketPrice += 100;
			} else if (seatType.equalsIgnoreCase("silver")) {
				ticketPrice += 50;
			} else {
				System.out.println("Invalid seat type");
				continue;
			}

			System.out.print("Do you want snacks? (y/n): ");
			char snacks = input.next().charAt(0);

			if (snacks == 'y' || snacks == 'Y') {
				snackPrice = 80;
			}

			int totalAmount = ticketPrice + snackPrice;

			System.out.println("Total ticket cost: ₹" + totalAmount);

			System.out.print("Next customer? (y/n): ");
			choice = input.next().charAt(0);
			System.out.println();

		} while (choice == 'y' || choice == 'Y');

		System.out.println("Booking closed.");
		input.close();
	}
}
