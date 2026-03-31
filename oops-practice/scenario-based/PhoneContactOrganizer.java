package scenario_based;
import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    
    @Override
    public String toString() {
        return String.format("%-20s | %s", name, phoneNumber);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        return phoneNumber.equals(((Contact) obj).phoneNumber);
    }
}

public class PhoneContactOrganizer {
    private List<Contact> contacts;
    
    public PhoneContactOrganizer() {
        contacts = new ArrayList<>();
    }
    
    public void addContact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        validatePhoneNumber(phoneNumber);
        checkDuplicate(phoneNumber);
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully");
    }
    
    public boolean deleteContact(String phoneNumber) {
        Contact contact = findByPhone(phoneNumber);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact deleted successfully");
            return true;
        }
        System.out.println("Contact not found");
        return false;
    }
    
    public void searchByName(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(c);
            }
        }
        
        if (results.isEmpty()) {
            System.out.println("No contacts found");
        } else {
            System.out.println("--- Search Results ---");
            for (Contact c : results) {
                System.out.println(c);
            }
        }
    }
    
    public void searchByPhone(String phoneNumber) {
        Contact contact = findByPhone(phoneNumber);
        if (contact != null) {
            System.out.println("Found: " + contact);
        } else {
            System.out.println("Contact not found");
        }
    }
    
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        
        System.out.println("=== ALL CONTACTS (Total: " + contacts.size() + ") ===");
        System.out.println("Name                 | Phone Number");
        System.out.println("------------------------------------");
        for (Contact c : contacts) {
            System.out.println(c);
        }
        System.out.println("------------------------------------");
    }
    
    // Helper methods
    private void validatePhoneNumber(String phone) throws InvalidPhoneNumberException {
        if (phone == null || phone.length() != 10 || !phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number! Must be exactly 10 digits");
        }
    }
    
    private void checkDuplicate(String phone) throws InvalidPhoneNumberException {
        if (findByPhone(phone) != null) {
            throw new InvalidPhoneNumberException("Duplicate phone number exists!");
        }
    }
    
    private Contact findByPhone(String phone) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phone)) {
                return c;
            }
        }
        return null;
    }
    
    // Interactive menu for group demo
    public static void main(String[] args) {
        PhoneContactOrganizer organizer = new PhoneContactOrganizer();
        Scanner input = new Scanner(System.in);
        
        System.out.println("PHONE CONTACT ORGANIZER");
        System.out.println("=========================");
        
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Phone");
            System.out.println("5. Show All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose option (1-6): ");
            
            int choice = input.nextInt();
            input.nextLine(); // consume newline
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = input.nextLine();
                        System.out.print("Enter phone (10 digits): ");
                        String phone = input.nextLine();
                        organizer.addContact(name, phone);
                        break;
                        
                    case 2:
                        System.out.print("Enter phone to delete: ");
                        organizer.deleteContact(input.nextLine());
                        break;
                        
                    case 3:
                        System.out.print("Enter name to search: ");
                        organizer.searchByName(input.nextLine());
                        break;
                        
                    case 4:
                        System.out.print("Enter phone to search: ");
                        organizer.searchByPhone(input.nextLine());
                        break;
                        
                    case 5:
                        organizer.displayAll();
                        break;
                        
                    case 6:
                        System.out.println("Thank you for using Phone Contact Organizer!");
                        return;
                        
                    default:
                        System.out.println("Invalid option! Try 1-6");
                }
            } catch (InvalidPhoneNumberException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }   
    }
}

