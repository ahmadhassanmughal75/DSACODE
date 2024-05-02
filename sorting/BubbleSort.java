package sorting;

public class BubbleSort { // class
    // function
    public static void buubleSort(int arr[]) {
        // i loop - outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            // j loop - inner loop
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swaping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // main
    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 3, 8, 9 };

        buubleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}