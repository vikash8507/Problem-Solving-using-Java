package TwoPointer;

public class TwoSum {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int i=0, j=array.length-1;
        int target = 90;

        while (i <= j) {
            int currentSum = array[i] + array[j];
            if (currentSum == target) {
                System.out.println("Found :" + i + " and " + j);
                return;
            }
            else if (currentSum > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not found");
    }

}
