package regex;
public class ValidateUsername {
	
    public static boolean isValidUsername(String username) {
    	
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("user_123 → " + isValidUsername("user_123"));
        System.out.println("123user → " + isValidUsername("123user"));
        System.out.println("us → " + isValidUsername("us"));
    }
}
