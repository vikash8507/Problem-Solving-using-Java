import java.util.Scanner;

public class ReverseArrayInPlace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int i=0, j=n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

        for (var item: arr) {
            System.out.println(item);
        }
    }

}
