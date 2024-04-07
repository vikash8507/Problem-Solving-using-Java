package Sorting;

/**
 * MergeTwoSortedArray
 */
public class MergeTwoSortedArray {

    public static int[] merge(int[] arr1, int[] arr2, int n1, int n2) {
        int[] c = new int[n1 + n2];

        int i=0, j=0, k=0;

        while (i < n1 & j < n2) {
            if (arr1[i] <= arr2[j]) {
                c[k] = arr1[i];
                i++;
            } else {
                c[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            c[k] = arr1[i];
            i++;k++;
        }
        while (j < n2) {
            c[k] = arr2[j];
            j++;k++;
        }

        return c;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 4, 7, 8, 10}, arr2 = {3, 5, 6, 9};
        int[] result = merge(arr1, arr2, arr1.length, arr2.length);

        for (int item: result) {
            System.out.print(item + " ");
        }

    }

}