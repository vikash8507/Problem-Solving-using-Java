public class SearchElementSortedArrayAfterRotate {
    // Find element k in array which is rotated k times of original array, k is not given

    public static int findK(int[] arr, int len) {
        int l = 0, r = len-1;
        int mid = (l+r)/2;

        while (l <= r) {
            if (arr[mid] > arr[len-1]) {
                l = mid + 1;
            } else {
                r = mid-1;
            }
            mid = (l+r)/2;
        }
        return mid+1;
     }

    public static void main(String[] args) {
        
        int[] arr = {7, 11, 14, 19, 23, -27, -20, -14, -8, -4, 1, 2, 4};
        int k = findK(arr, arr.length);
        int item = 100;

        BinarySearchWIthStartEndIndex binarySearchWIthStartEndIndex = new BinarySearchWIthStartEndIndex();
        if (item <= arr[k-1] && item >= arr[0]) {
            System.out.println(binarySearchWIthStartEndIndex.binarySearchAlgo(arr, 0, k-1, item));
            return;
        }
        else if (item >= arr[k] && item <= arr[arr.length-1]) {
            System.out.println(binarySearchWIthStartEndIndex.binarySearchAlgo(arr, k, arr.length-1, item));
            return;
        }
        System.out.println("Not found");    

    }
    
}
