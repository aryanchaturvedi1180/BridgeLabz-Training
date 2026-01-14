package scenario_based.HotelReservationSystem;

abstract class Room {
	private int roomNo;
	private double basePrice;
	private boolean isAvailable = true;
	
	public Room(int roomNO, double basePrice) {
		this.roomNo = roomNo;
		this.basePrice = basePrice;
	}
	
	public int getRoomNO() {
		return roomNo;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void checkIn() {
		isAvailable = false;
	}
	
	public void ckeckOut() {
		isAvailable = true;
	}
	
	abstract double calculateBill(int days);
	
	public void displayRoom() {
        System.out.println("Room No: " + roomNo + " | Price: ₹" + basePrice);
    }
}
