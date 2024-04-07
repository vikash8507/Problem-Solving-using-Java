/**
 * BinarySearch
 */
public class BinarySearch {

    public int binarySearchAlgo(int[] arr, int len, int item) {

        int l=0, r=len-1, mid;

        while (l<=r) {
            mid = (l+r)/2;
            int midItem = arr[mid];

            if (midItem == item) {
                return mid;
            } else if (midItem > item) {
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    
}