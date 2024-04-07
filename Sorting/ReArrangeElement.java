package Sorting;

/**
 * ReArrangeElement
 */
public class ReArrangeElement {
    
    public static void rearrange(int[] arr, int len) {
        int i=1, j=len-1;

        while (i <= j) {
            if (arr[0] >= arr[i]) i++;
            else if (arr[0] < arr[j]) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[0];
        arr[0] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 15, 6, 12, 2, 18, 7, 15, 14};
        rearrange(arr, arr.length);
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
    
}