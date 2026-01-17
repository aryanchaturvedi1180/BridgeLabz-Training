package linear_and_binary_search;

public class FirstNegativeLinearSearch {
    public static int findFirstNegative(int[] arr) {
    	
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, -2, 7, -9};

        int index = findFirstNegative(arr);

        System.out.println(index);
    }
}
