import java.util.Scanner;

public class PrefixSumQuery {
//You are given an integer array A of length N.
//You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

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

        System.out.println("Total Queries");
        int Q = sc.nextInt();
        int[] result = new int[Q];

        for (int i=0; i<Q; i++) {
            System.out.println("Value of L");
            int L = sc.nextInt();
            System.out.println("Value of R");
            int R = sc.nextInt();

            if (L==0) {
                result[i] = prefixArr[R];
            } else {
                result[i] = prefixArr[R] - prefixArr[L-1];
            }
        }

        for (int i=0; i<Q; i++) {
            System.out.print(result[i] + " -> ");
        }

    }
}
