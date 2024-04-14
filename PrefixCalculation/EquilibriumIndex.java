package PrefixCalculation;

public class EquilibriumIndex {

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
        int[] array = {-7, 1, 5, 2, -4, 3, 0};
        PrefixSum prefixSum = new PrefixSum();
        int[] ps = prefixSum.prefixSum(array);

        int answer = 0;
        if (ps[array.length-1] - array[0] == array[0]) {
            answer++;
        }
        if (array[array.length-1] == 0) {
            answer++;
        }

        for (int i=1; i<array.length-1; i++) {
            int answer1 = getAnswer(ps, 0, i-1);
            int answer2 = getAnswer(ps, i+1, array.length-1);

            if (answer1 == answer2) {
                answer++;
            }
        }
        System.err.println("Answer " + answer);
    }

}
