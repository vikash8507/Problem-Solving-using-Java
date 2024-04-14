package PrefixCalculation;

public class PrefixSum {
    
    public int[] prefixSum(int[] array) {
        int[] ps = new int[array.length];
        ps[0] = array[0];

        for (int i=1; i<array.length; i++) {
            ps[i] = array[i] + ps[i-1];
        }

        // for (int i=0; i<ps.length; i++) {
        //     System.out.print(ps[i] + " ");
        // }
        return ps;
    }

}
