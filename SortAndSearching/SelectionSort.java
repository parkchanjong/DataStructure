package SortAndSearching;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    private static void selectionSort(int[] arr, int start) {
        if (start < arr.length - 1) {
            int min_index = start;

            for (int i = start; i < arr.length; i++) {
                if (arr[i] < arr[min_index]) min_index = i;
            }
            swap(arr, start, min_index);
            selectionSort(arr, start + 1);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void printArry(int[] arr) {
        for (int data : arr) {
            System.out.println(data + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 2, 4};
        printArry(arr);
        selectionSort(arr);
        printArry(arr);
    }
}
