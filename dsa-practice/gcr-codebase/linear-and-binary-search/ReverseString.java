package linear_and_binary_search;
public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        
        String reversedString = sb.toString();

        System.out.println(reversedString);
    }
}
