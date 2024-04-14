public class SquareRootOfNumberInteger {
    
    public static void main(String[] args) {
        
        int number = 49;
        int i=1, j=64;
        int answer=0;

        while (i<=j) {

            int mid = (i+j)/2;
            int current = mid*mid;

            if (current >= number) {
                answer = mid;
                i = mid+1;
            } else {
                j = mid-1;
            }

        }
        System.out.println("Answer " + answer);

    }

}
