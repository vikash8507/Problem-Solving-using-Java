import java.util.Scanner;

public class GoodPair {
//    Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number");
        int number = sc.nextInt();

//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (i!=j && arr[i] + arr[j] == number) {
//                    System.out.println(1);
//                    return;
//                }
//            }
//        }
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
