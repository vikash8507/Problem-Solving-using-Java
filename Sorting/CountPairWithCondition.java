package Sorting;

public class CountPairWithCondition {
    // Given 2 arrays. Count the number of pairs (i, j) such that - a[i] > b[j]

    public static void main(String[] args) {
        
        int[] arr1 = {7, 8, 2, 4}, arr2 = {3, 4, 1, 10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr1, 0, arr1.length-1);
        mergeSort.mergeSort(arr2, 0, arr2.length-1);

        int i=0, j=0, count=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                i++;
            } else {
                count += arr1.length - i;
                j++;
            }
        }
        System.out.println("Result " + count);
    }
    

}
