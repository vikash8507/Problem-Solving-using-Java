public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 13, 14}};
        int row=3, col=4;
        int item = 12;
        for (int i=0; i<row; i++) {
            int currentItem = matrix[i][col-1];
            if (currentItem == item){
                System.out.println("Item found at " + i + " , " + (col-1));
                return;
            };
            if (item < currentItem) {
                BinarySearch binarySearch = new BinarySearch();
                int result = binarySearch.binarySearchAlgo(matrix[i], col, item);
                if (result == -1) {
                    System.out.println("Item not found");
                    return;
                } else {
                    System.out.println("Item found at " + i + " , " + result);
                    return;
                }
            }
        }
        System.out.println("Item not found");
    }
}
