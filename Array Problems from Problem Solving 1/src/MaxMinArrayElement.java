import java.util.Scanner;

public class MaxMinArrayElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for (var item: arr) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        System.out.printf("%d %d", max, min);
    }

}
