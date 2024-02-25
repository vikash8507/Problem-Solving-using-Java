import java.util.Scanner;

public class MaximumSumSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n<1) {
            return;
        }
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Result: " + max);
    }
}
