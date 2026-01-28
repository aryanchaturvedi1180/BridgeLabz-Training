package scenario.RestaurantTableReservationSystem;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.addTable(1, 4);
        restaurant.addTable(2, 6);
        restaurant.addTable(3, 2);

        try {
            restaurant.reserveTable(1, "Aryan", "7PM-8PM");
            restaurant.reserveTable(2, "Rahul", "7PM-8PM");

            // This will throw exception
            restaurant.reserveTable(1, "Amit", "7PM-8PM");

        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showAvailableTables("7PM-8PM");

        restaurant.cancelReservation(1, "7PM-8PM");

        restaurant.showAvailableTables("7PM-8PM");
    }
}
