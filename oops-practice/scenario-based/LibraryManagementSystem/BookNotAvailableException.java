package scenario_based.LibraryManagementSystem;

public class BookNotAvailableException extends Exception{
	public BookNotAvailableException(String message) {
        super(message);
    }
}
