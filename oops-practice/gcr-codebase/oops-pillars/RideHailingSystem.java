package oops_pillars;
import java.util.*;

interface GPS {
    void updateLocation(String location);
    String getCurrentLocation();
}

abstract class Vehicles {

    private String VehiclesId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicles(String VehiclesId, String driverName, double ratePerKm) {
        this.VehiclesId = VehiclesId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehiclessId() {
        return VehiclesId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    protected String getLocation() {
        return currentLocation;
    }

    abstract double calculateFare(double distance);

    void getVehiclessDetails() {
        System.out.println("Vehicless ID     : " + VehiclesId);
        System.out.println("Driver Name    : " + driverName);
        System.out.println("Rate per KM    : ₹" + ratePerKm);
        System.out.println("Current Place  : " + currentLocation);
    }
}

class Cars extends Vehicles implements GPS {

    public Cars(String VehiclessId, String driverName) {
        super(VehiclessId, driverName, 15);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }

    public String getCurrentLocation() {
        return getLocation();
    }
}

class Bikes extends Vehicles implements GPS {

    public Bikes(String VehiclessId, String driverName) {
        super(VehiclessId, driverName, 8);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }

    public String getCurrentLocation() {
        return getLocation();
    }
}

class Auto extends Vehicles implements GPS {

    public Auto(String VehiclessId, String driverName) {
        super(VehiclessId, driverName, 10);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }

    public String getCurrentLocation() {
        return getLocation();
    }
}

public class RideHailingSystem {

    // Polymorphic method
    static void calculateRideFare(Vehicles Vehicless, double distance) {
        Vehicless.getVehiclessDetails();
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + Vehicless.calculateFare(distance));
    }

    public static void main(String[] args) {

        List<Vehicles> rides = new ArrayList<>();

        Vehicles v1 = new Cars("CAR101", "Amit");
        Vehicles v2 = new Bikes("BIKE202", "Rohit");
        Vehicles v3 = new Auto("AUTO303", "Suresh");

        ((GPS) v1).updateLocation("Delhi");
        ((GPS) v2).updateLocation("Noida");
        ((GPS) v3).updateLocation("Gurgaon");

        rides.add(v1);
        rides.add(v2);
        rides.add(v3);

        for (Vehicles Vehicless : rides) {
            System.out.println("----------------------------");
            calculateRideFare(Vehicless, 12);
        }
    }
}
