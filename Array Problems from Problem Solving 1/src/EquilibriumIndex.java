import java.util.Scanner;

public class EquilibriumIndex {
//    "You are given an array A of integers of size N.
//    Your task is to find the equilibrium index of the given array
//    The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//    If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
//
//    Note:
//    Array indexing starts from 0.
//
//    If there is no equilibrium index then return -1.
//    If there are more than one equilibrium indexes then return the minimum index."

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefixArr = new int[n];

        if (n<1) {
            return;
        }

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        prefixArr[0] = arr[0];
        for (int i=1; i<n; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for (int i=0; i<n; i++) {
            if (i==0) {
                if (prefixArr[n-1] - prefixArr[0] == 0) {
                    System.out.println(i);
                    return;
                }
            } else if (i == n-1) {
                if (prefixArr[n-2] == 0) {
                    System.out.println(i);
                    return;
                }
            } else {
                int lSum = prefixArr[i-1];
                int rSum = prefixArr[n-1] - prefixArr[i];
                if (lSum == rSum) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);

    }
}
