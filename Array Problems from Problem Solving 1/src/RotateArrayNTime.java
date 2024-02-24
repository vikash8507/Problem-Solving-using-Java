import java.util.Scanner;

public class RotateArrayNTime {
//    Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Rotation times");
        int b = sc.nextInt();

        int i=0, j=n-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        for (var item: arr) {
            System.out.print(item + " ");
        }

        i=0;j=b-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        i=b;j=n-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

        for (var item: arr) {
            System.out.print(item + " ");
        }
    }
}
