import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int result = (number * (number + 1))/2;
        System.out.println("Result: " + result);
    }
}
