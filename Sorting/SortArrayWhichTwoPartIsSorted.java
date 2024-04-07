package Sorting;

/**
 * SortArrayWhichTwoPartIsSorted
 */
public class SortArrayWhichTwoPartIsSorted {

    public static void sortArray(int[] arr, int start, int mid, int end) {

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

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        sortArray(arr, 0, 3, 7);
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
    
}