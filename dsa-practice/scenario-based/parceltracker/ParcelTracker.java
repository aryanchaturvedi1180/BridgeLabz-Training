package scenario.parceltracker;

public class ParcelTracker {
    private Node head;

    public void addStage(String stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        Node temp = head;

        while (temp != null) {
            if (temp.stage.equalsIgnoreCase(afterStage)) {
                Node newNode = new Node(newStage);
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Checkpoint added successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found.");
    }

    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking data available.");
            return;
        }

        Node temp = head;
        System.out.println("Parcel Tracking Path:");
        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null)
                System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Handle missing parcel
    public void checkParcelStatus() {
        if (head == null) {
            System.out.println("Parcel is missing (null pointer detected).");
        } else {
            System.out.println("Parcel is in transit safely.");
        }
    }
}
