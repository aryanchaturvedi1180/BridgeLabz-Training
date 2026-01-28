package scenario.RestaurantTableReservationSystem;
import java.util.*;

class Restaurant {

    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    // Add tables
    void addTable(int tableNumber, int capacity) {
        tables.put(tableNumber, new Table(tableNumber, capacity));
    }

    // Reserve table
    void reserveTable(int tableNumber, String customerName, String timeSlot)
            throws TableAlreadyReservedException {

        // check double booking
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException("Table " + tableNumber + " already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, customerName, timeSlot));
        System.out.println("Table " + tableNumber + " reserved for " + customerName);
    }

    // Cancel reservation
    void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                iterator.remove();
                System.out.println("Reservation cancelled for Table " + tableNumber);
                return;
            }
        }

        System.out.println("No reservation found");
    }

    // Show available tables
    void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (Table table : tables.values()) {
            boolean isReserved = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == table.tableNumber && r.timeSlot.equals(timeSlot)) {
                    isReserved = true;
                    break;
                }
            }
            if (!isReserved) {
                System.out.println("Table " + table.tableNumber + " (Capacity: " + table.capacity + ")");
            }
        }
    }
}
