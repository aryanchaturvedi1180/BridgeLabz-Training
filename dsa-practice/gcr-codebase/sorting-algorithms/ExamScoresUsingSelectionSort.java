package sorting_algorithm;

public class ExamScoresUsingSelectionSort {
	public static void main(String[] args) {
		int arr[] = {78, 92, 84, 11, 35};
		int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("Sorted Exam Scores:");
        for (int score : arr) {
            System.out.print(score + " ");
        }
	}
}
