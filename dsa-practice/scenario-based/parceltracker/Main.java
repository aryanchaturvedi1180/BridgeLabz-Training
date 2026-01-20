package scenario.parceltracker;

public class Main {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        // Adding default delivery stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        // Adding intermediate checkpoint
        tracker.addCheckpoint("Shipped", "Customs Check");

        tracker.trackParcel();			// Forward tracking

        tracker.checkParcelStatus();	// Check parcel status
    }
}
