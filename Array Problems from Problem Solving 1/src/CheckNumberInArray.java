import java.util.Scanner;

public class CheckNumberInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of test cases");
        int T = sc.nextInt();
        while (T > 0) {
            System.out.println("Enter number of elements");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter search element");
            int b = sc.nextInt();
            boolean found=false;
            for (int i=0; i<n && !found; i++) {
                if (arr[i] == b) {
                    System.out.println(1);
                    found=true;
                }
            }
            if (!found) {
                System.out.println(0);
            }
            T--;
        }
    }

}
