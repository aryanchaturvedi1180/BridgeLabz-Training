package scenario_based.HotelReservationSystem;

interface PricingStrategy {
    double calculatePrice(double basePrice, int days);
}
