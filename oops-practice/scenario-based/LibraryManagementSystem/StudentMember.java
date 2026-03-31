package scenario_based.LibraryManagementSystem;

class StudentMember extends Member {

    public StudentMember(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 1; // ₹1 per day
    }
}
