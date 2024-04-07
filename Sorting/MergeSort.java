package Sorting;

public class MergeSort {

    // public static void sortArray(int[] arr, int start, int mid, int end) {
    public void sortArray(int[] arr, int start, int mid, int end) {

        int len = end-start+1;
        int[] c = new int[len];
        int i = start, j=mid+1, k=0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                c[k] = arr[i];
                i++;
            } else {
                c[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            c[k] = arr[i];
            i++;k++;
        }
        while (j <= end) {
            c[k] = arr[j];
            j++;k++;
        }

        for (int p=0; p<=end-start; p++) {
            arr[start+p] = c[p];
        }

    }

    // public static void mergeSort(int[] arr, int start, int end) {
    public void mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        sortArray(arr, start, mid, end);
    }
    
    // public static void main(String[] args) {
    //     int[] arr = {4, 1, 5, 3, 6, 5, 8, 9, 5, 7, 0, 4};
    //     mergeSort(arr, 0, arr.length-1);
    //     for (int item: arr) {
    //         System.out.print(item + " ");
    //     }
    // }

}
