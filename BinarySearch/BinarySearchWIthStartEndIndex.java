public class BinarySearchWIthStartEndIndex {
    
    public int binarySearchAlgo (int[] arr, int start, int end, int item) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int midItem = arr[mid];
            if (midItem == item) {
                return mid;
            } else if (midItem > item) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
