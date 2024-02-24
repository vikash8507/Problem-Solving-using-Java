import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int number) {
        if (number < 3) {
            return true;
        }
        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }
    }
}
