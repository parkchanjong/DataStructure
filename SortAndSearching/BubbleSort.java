package SortAndSearching;

public class BubbleSort {
    private static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length - 1);
    }

    private static void bubbleSort(int[] arr, int last) {
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            bubbleSort(arr, last - 1);
        }
    }

    private static void swap(int[] arr, int sorce, int target) {
        int temp = arr[sorce];
        arr[sorce] = arr[target];
        arr[target] = temp;
    }

    private static void printArry(int[] arr) {
        for (int data : arr) {
            System.out.println(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 2, 4};
        printArry(arr);
        bubbleSort(arr);
        printArry(arr);
    }
}
