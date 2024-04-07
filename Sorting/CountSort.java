package Sorting;


public class CountSort {

    // Give an array. Array contains only 0, 1, 2. Sort this array

    public static void countSort(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int item: arr) {
            if  (item == 0) {
                count0++;
            } else if (item == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i=0; i<count0; i++) {
            arr[i] = 0;
        }
        for (int i=count0; i<count0+count1; i++) {
            arr[i] = 1;
        }
        for (int i=count0+count1; i<count0+count1+count2; i++) {
            arr[i] = 2;
        }

    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 0, 2, 1, 0, 2, 1, 1, 0, 2, 0};
        countSort(arr);
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }

}
