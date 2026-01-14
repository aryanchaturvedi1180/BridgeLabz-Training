package scenario_based.HotelReservationSystem;

public interface PricingStrategy {
	double calculate(double Price, int days);
}
