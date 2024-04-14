package TwoPointer;


public class TrappingRainWater {
    
    public static void main(String[] args) {
        
        int[] array = {3, 8, 7, 4, 6, 5, 2};
        int i = 0, j=array.length-1;
        int answer = Integer.MIN_VALUE;

        while (i < j) {
            int diff = (j-i);
            int minValue = array[i];
            if (minValue > array[j]) {
                minValue = array[j];
                j--;
            } else {
                i++;
            }

            int currentAnswer = diff*minValue;

            answer = Math.max(answer, currentAnswer);

        }

        System.out.println("Result " + answer);


    }



}
