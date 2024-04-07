public class MaximumValueOfK {

    // Given an array of +ve numbers only. Find the maximum value of k.
	// Such That - maximum sub array sum of size k <= B

    public static int maximumSASum(int[] arr, int size) {
        int maxSum = 0;
        for (int i=0; i<size; i++) {
            maxSum += arr[i];
        }
        int previousSum = maxSum;
        for (int i=1; i<arr.length-size; i++) {
            previousSum = previousSum + arr[size+i] - arr[i-1];
            if (previousSum > maxSum) {
                maxSum = previousSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 6, 3, 7, 2};
        int b = 20;
        int result = -1;
        int l=0, r=arr.length-1;

        while (l <= r) {
            int mid = (l+r)/2;
            if (maximumSASum(arr, mid) <= b) {
                result = mid;
                l = mid+1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("Result: " + result);

    }
    
}