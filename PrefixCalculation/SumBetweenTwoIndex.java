package PrefixCalculation;

public class SumBetweenTwoIndex {
    // Given an array of n elemtns and L and R. 
    // Find the sum of all elemets in range [L, R].
    // 0 <= L <= R < N

    public static int getAnswer(int[] ps, int l, int r) {
        int answer;
        if (l == 0) {
            answer = ps[r];
        } else {
            answer = ps[r] - ps[l-1];
        }
        return answer;
    } 

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 2, 6, 1, 8, 3, 5, 9, 1, 4};
        int L=3, R=8;

        int answer = 0;
        for (int i=L; i<=R; i++) {
            answer += array[i];
        }
        System.out.println("Result: " + answer);

        PrefixSum prefixSum = new PrefixSum();
        int[] ps = prefixSum.prefixSum(array);
        answer = getAnswer(ps, L, R);
        System.out.println("Result " + answer);

    }

}
