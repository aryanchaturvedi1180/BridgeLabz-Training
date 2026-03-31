package strings;

public class NullPointer{

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled");
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}
