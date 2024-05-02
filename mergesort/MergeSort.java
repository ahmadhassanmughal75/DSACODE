package mergesort;

public class MergeSort {
    // Method to divide the array into subarrays
    public static void divide(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to the end index, the array is already sorted
        if (si >= ei) {
            return;
        } else {
            // Calculate the middle index
            int mid = si + (ei - si) / 2;
            // Recursively divide the left half of the array
            divide(arr, si, mid);
            // Recursively divide the right half of the array
            divide(arr, mid + 1, ei);
            // Merge the divided subarrays
            conquer(arr, si, mid, ei);
        }
    }

	// Method to merge the divided subarrays
	public static void conquer(int arr[], int si, int mid, int ei) {
		// Create an auxiliary array to store the merged elements
		int merged[] = new int[ei - si + 1];
		int idx1 = si; // Index for the left subarray
		int idx2 = mid + 1; // Index for the right subarray
		int x = 0; // Index for the merged array

		// Merge elements from both subarrays until one of them is exhausted
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		// If there are any remaining elements in the left subarray, add them to the
		// merged array
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		// If there are any remaining elements in the right subarray, add them to the
		// merged array
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}

		// Copy the merged elements back to the original array
		for (int i = 0, j = si; j <= ei; i++, j++) {
			arr[j] = merged[i];
		}
	}

    public static void main(String[] args) {
        // Test array
        int arr[] = { 69, 47, 38, 3, 24, 59, 36, 25, 29 };
        int n = arr.length;
        // Call divide method to start sorting
        divide(arr, 0, n - 1);
        System.out.println("Sorted Array:");
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
