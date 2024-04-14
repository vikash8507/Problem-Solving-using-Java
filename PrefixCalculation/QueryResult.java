package PrefixCalculation;

public class QueryResult {
    // Given an array of n elements and q queries. For each queries 
    // calculate the sum of all elements in the index range [L, R]. 
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
        int queries = 3;

        PrefixSum prefixSum = new PrefixSum();
        int[] ps = prefixSum.prefixSum(array);

        for (int i=1; i<=queries; i++) {
            int L = (queries + i) / queries;
            int R = (queries * queries + i) / queries;

            int answer = getAnswer(ps, L, R);
            System.out.println("Answer " + answer);
        }
        
    }

}
