package sorting_algorithm;

public class EmployeeIDUsingInsertionSort {
	public static void main(String[] args) {
		int empId[] = {201, 401, 101, 301, 501};
		int n = empId.length;
		
		for(int i = 1; i < n; i++) {
			int key = empId[i];
			int j = i - 1;
			
			while(j >= 0 && empId[j] > key) {
				empId[j + 1] = empId[j];
				j--;
			}
			empId[j + 1] = key;
		}
		System.out.println("Sorted EmpIds are: ");
		for(int id : empId) {
			System.out.print(id + " ");
		}
	}

}
