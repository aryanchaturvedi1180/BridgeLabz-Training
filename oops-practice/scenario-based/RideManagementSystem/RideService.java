package scenario_based.RideManagementSystem;

import java.util.*;

class RideService {

	private List<Driver> drivers = new ArrayList<>();
	private List<Ride> rideHistory = new ArrayList<>();

	public RideService(List<Driver> drivers) {
		this.drivers = drivers;
	}

	public Ride bookRide(User user, double distance, FareCalculator fareCalculator)
			throws NoDriverAvailableException {

		for (Driver driver : drivers) {
			if (driver.isAvailable()) {
				System.out.println("\nBooking ride for " + user.getName() + "...");
				driver.assignDriver();
				System.out.println("Driver assigned: " + driver.getName());

				Ride ride = new Ride(user, driver, distance, fareCalculator);
				rideHistory.add(ride);
				return ride;
			}
		}
		throw new NoDriverAvailableException("No drivers available at the moment!");
	}


	public void showRideHistory() {
		System.out.println("\n========= RIDE HISTORY =========");
		for (Ride ride : rideHistory) {
			ride.rideDetails();
		}
	}

}
