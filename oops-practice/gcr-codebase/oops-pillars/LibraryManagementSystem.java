package oops_pillars;
import java.util.*;

// Interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower's personal data
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrowerName = null; 		// initially not borrowed
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Protected access to sensitive data
    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Item ID     : " + itemId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
    }
}

class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public void reserveItem() {
        setBorrowerName("Reserved");
        System.out.println("Book reserved successfully");
    }

    public boolean checkAvailability() {
        return getBorrowerName() == null;
    }
}

class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; // 7 days
    }

    public void reserveItem() {
        setBorrowerName("Reserved");
        System.out.println("Magazine reserved successfully");
    }

    public boolean checkAvailability() {
        return getBorrowerName() == null;
    }
}

class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3; // 3 days
    }

    public void reserveItem() {
        setBorrowerName("Reserved");
        System.out.println("DVD reserved successfully");
    }

    public boolean checkAvailability() {
        return getBorrowerName() == null;
    }
}

// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        LibraryItem i1 = new Book(101, "Clean Code", "Robert C. Martin");
        LibraryItem i2 = new Magazine(102, "Time", "Time Editors");
        LibraryItem i3 = new DVD(103, "Inception", "Christopher Nolan");

        items.add(i1);
        items.add(i2);
        items.add(i3);

        // Polymorphism
        for (LibraryItem item : items) {

            System.out.println("----------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;

            System.out.println("Available     : " + r.checkAvailability());
            r.reserveItem();
        }
    }
}
