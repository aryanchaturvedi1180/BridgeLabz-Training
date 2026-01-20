package scenario.trafficmanager;

public class Main {

    public static void main(String[] args) {

        RoundAbout roundabout = new RoundAbout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue("CAR-101");
        queue.enqueue("CAR-102");
        queue.enqueue("CAR-103");
        System.out.println(); 
        queue.enqueue("CAR-104"); // Overflow
        System.out.println(); 

        roundabout.addVehicle(queue.dequeue());
        roundabout.addVehicle(queue.dequeue());

        System.out.println(); 
        roundabout.printState();

        roundabout.removeVehicle("CAR-101");
        System.out.println(); 
        roundabout.printState();

        roundabout.addVehicle(queue.dequeue());
        System.out.println(); 
        roundabout.printState();
    }
}
