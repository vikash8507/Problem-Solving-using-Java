package Sorting;

public class ReArrangeElementInSubArray {

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
    

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 15, 6, 12, 2, 18, 7, 15, 14};
        int result = rearrange(arr, 2, 6);
        for (int item: arr) {
            System.out.print(item + " ");
        }
        System.out.println("Result " + result);
    }

}
