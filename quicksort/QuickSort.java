package quicksort;

//public class QuickSort {
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(arr, low, high);
//            quickSort(arr, low, pivotIndex - 1);
//            quickSort(arr, pivotIndex + 1, high);
//        }
//    }
//
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
//        System.out.println("Original array:");
//        printArray(arr);
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println("Sorted array:");
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}

public class QuickSort{
	public static void quickSort(int arr[] ,int low,int high) {
		if(low<high) {
			int pivotindex=partition(arr,low,high);
			quickSort(arr, low, pivotindex-1);
			quickSort(arr, pivotindex+1, high);
		}
	}
	public static int partition(int arr[] ,int low , int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		int arr[]= {5,6,84,3,8,3,24,59,24,35,24};
		int lengthofarray=arr.length;
		System.out.println("Original Array is :");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		quickSort(arr, 0, lengthofarray-1);
		System.out.println("Sorted Array is :");
        for(int i=0;i<lengthofarray;i++) {
        	System.out.print(arr[i] + " ");
        }
	}
}


















