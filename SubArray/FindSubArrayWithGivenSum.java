package SubArray;

import PrefixCalculation.PrefixSum;

public class FindSubArrayWithGivenSum {
    
    public static void main(String[] args) {
        
        int[] array = {1, 4, 2, 5, 7, 2, 4, 8};
        int target=21;
        int i=0, j=0;

        PrefixSum prefixSum = new PrefixSum();
        int[] ps = prefixSum.prefixSum(array);

        while (j < array.length) {
            int currentDiff = ps[j] - ps[i];
            if (currentDiff == target) {
                System.out.println("Found " + (i+1) + " and " + j);
                return;
            } else if (currentDiff > target) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Not Found");

    }
    
}
