package Sorting;

public class QuickSort {
    
    public static int rearrange(int[] arr, int start, int end) {
        int i=start+1, j=end;
        while (i <= j) {
            if (arr[0] >= arr[i]) i++;
            else if (arr[0] < arr[j]) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = rearrange(arr, start, end);
        quickSort(arr, start, p-1);
        quickSort(arr, p+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3, 6, 5, 8, 9, 5, 7, 0, 4};
        quickSort(arr, 0, arr.length-1);
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }

}
