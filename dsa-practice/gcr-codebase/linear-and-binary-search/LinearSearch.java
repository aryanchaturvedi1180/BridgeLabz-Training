package linear_and_binary_search;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int target = 9;

        int result = linearSearch(arr, target);
        System.out.println(result);
    }
}

