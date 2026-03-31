package scenario.trafficmanager;
public class RoundAbout {

    private Vehicle head;
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            head.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }

        System.out.println("Vehicle " + number + " entered roundabout");
    }

    public void removeVehicle(String number) {

        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        if (head.number.equals(number)) {
            if (head.next == head) {
                head = null;
            } else {
                Vehicle last = head;
                while (last.next != head) {
                    last = last.next;
                }
                head = head.next;
                last.next = head;
            }

            System.out.println("Vehicle " + number + " exited roundabout");
            return;
        }
        
        Vehicle prev = head;
        Vehicle curr = head.next;

        while (curr != head) {

            if (curr.number.equals(number)) {
                prev.next = curr.next;
                System.out.println("Vehicle " + number + " exited roundabout");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Vehicle not found");
    }

    public void printState() {

        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = head;

        System.out.print(temp.number + " -> ");
        temp = temp.next;

        while (temp != head) {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        }

        System.out.println("(back to start)");
    }
}
