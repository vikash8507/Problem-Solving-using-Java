import java.util.Scanner;

public class SquareRoot {

    public static int findSquareRoot(int number) {
        int i = 1, sqr = i*i;
        while (sqr <= number) {
            if (sqr == number) {
                return i;
            }
            i++;
            sqr = i*i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number =sc.nextInt();

        System.out.println("Result: " + findSquareRoot(number));
    }
}
