package sorting;

public class Selection_Sort {
	public static void main(String[] args) {
		int arr[] = { 78, 4, 7, 43, 78, 123, 523, 235, 787 };
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
//			Swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Ascending order:");
		for (int i : arr) {
			
			System.out.print(i+" ");
		}
		// for (int i = 0; i < arr.length; i++) {
			// System.out.print(" ");
		// }
	}
}
//Complexities
//Selection sort:
//best case =o(n^2);
//worst case =o(n^2)
