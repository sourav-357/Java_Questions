package Part_3_Advance;

import java.util.Arrays;

public class Problem3_BubbleSort {
    
    // Method to perform Bubble Sort in Ascending Order
    public static void bubbleSortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Bubble Sort in Descending Order
    public static void bubbleSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arrAsc = {64, 25, 12, 22, 11};
        int[] arrDesc = {64, 25, 12, 22, 11};
        
        bubbleSortAsc(arrAsc);
        System.out.println("Bubble Sort Ascending: " + Arrays.toString(arrAsc));
        
        bubbleSortDesc(arrDesc);
        System.out.println("Bubble Sort Descending: " + Arrays.toString(arrDesc));
    }
}
