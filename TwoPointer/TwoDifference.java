package TwoPointer;

public class TwoDifference {
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 10, i = 0, j=0;

        while (j < array.length) {
            int currentDiff = array[j] - array[i];
            if (currentDiff == target) {
                System.out.println("Fount: " + i + " and " + j);
                return;
            } else if (currentDiff > target) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Not found");

    }

}
