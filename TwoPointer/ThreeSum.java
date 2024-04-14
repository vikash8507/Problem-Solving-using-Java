package TwoPointer;

public class ThreeSum {

    public static Index getTwoSumIndex(int[] array, int start, int end, int target) {
        int i=start, j=end;

        while (i <= j) {
            int currentSum = array[i] + array[j];
            if (currentSum == target) {
                return new Index(i, j, true);
            }
            else if (currentSum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new Index(-1, -1, false);
    }
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 150;

        for (int i=0; i<array.length; i++) {
            Index result = getTwoSumIndex(array, i, array.length-1, target-array[i]);
            
            if (result.checkFound()) {
                System.out.println("Found " + i + ", " + result.getI() + " and " + result.getJ());
                return;
            }
        }
        
        System.out.println("Not found");

    }

}
