public class FindUniqueInDuplicates {
    // Given an array. In this array every element occures twice except 1. Find that element.

    public static void main(String[] args) {
        
        int[] arr = {0, 1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};
        int l = 0, r = arr.length-1;

        while (l <= r) {
            int mid = (l+r) / 2;

            if (mid % 2 == 0) {
                if (mid + 1 < arr.length && arr[mid + 1] == arr[mid]) {
                    l = l+2;
                } else if (mid - 1 > 0 && arr[mid - 1] == arr[mid]) {
                    r = r-2;
                } else {
                    System.out.println("Found: " + arr[mid]);
                    return;
                }
            } else {
                if (arr[mid - 1] == arr[mid]) {
                    l = l+1;
                } else {
                    r = r-1;
                }
            }

        }

    }

}
