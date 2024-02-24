import java.util.Scanner;

public class IsItPerfectNumber {

    public static boolean isPerfect(int number) {
        if (number == 1) {
            return true;
        }
        int sum = 1;
        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total test cases");
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            System.out.println("Enter number");
            int number = sc.nextInt();
            if (isPerfect(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
