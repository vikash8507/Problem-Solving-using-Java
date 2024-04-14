package SubArray;

public class SumOfAllSubArray {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        int answer = 0, len=array.length;

        for (int i=0; i<len; i++) {
            answer += array[i]*(len-i);
        }
        System.out.println("Result " + answer);
    }

}
