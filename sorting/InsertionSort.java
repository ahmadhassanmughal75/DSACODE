package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 9, 4, 6, 8, 4, 5, 4, 9, 7 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Array in asscending order:");
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i] + " ");
		// }
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
// Complexities
// Insertion sort:
// best case =o(n2);
// worst case =o(n^2);