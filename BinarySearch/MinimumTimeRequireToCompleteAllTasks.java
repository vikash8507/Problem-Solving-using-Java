public class MinimumTimeRequireToCompleteAllTasks {
    // Given N tasks, K workers and time taken to complete each task. Find the minimun time in which we can complete all the tasks
    // Note:
    //     - A single worker can only do continuous set of tasks
    //     - All workers start at the same time
    //     - A task can only be assign to be only one worker.


    public static int[] maximumWithSum(int[] arr) {
        int[] result = {arr[0], 0};
        for (int item: arr) {
            if (result[0] < item) {
                result[0] = item;
            }
            result[1] += item;
        }
        return result;
    }

    public static boolean isPossibleValue(int[] arr, int len, int k, int mid) {
        int count = 1, sum = 0;
        for (int i=0; i<len; i++) {
            sum += arr[i];
            if (sum > mid) {
                count++;
                sum = arr[i];
            }
        }
        return count <= k;
    }


    public static void main(String[] args) {
        
        int[] arr = {3, 5, 1, 7, 8, 2, 5, 3, 10, 1, 4, 7, 5, 4, 6};
        int[] result = maximumWithSum(arr);
        int start = result[0], end = result[1], k=3;
        int answer = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossibleValue(arr, arr.length, k, mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Answer " + answer);
    }

}
