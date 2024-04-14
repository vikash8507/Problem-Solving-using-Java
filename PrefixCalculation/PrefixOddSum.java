package PrefixCalculation;

public class PrefixOddSum {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 7, 4, 8, 1, 6};
        int[] pos = new int[array.length];
        pos[0] = 0;
        pos[1] = array[1];

        for (int i=2; i<array.length; i++) {
            if (i%2 == 0) {
                pos[i] = pos[i-1];
            } else {
                pos[i] = array[i] + pos[i-1];
            }
        }

        for (int i=0; i<pos.length; i++) {
            System.out.print(pos[i] + " ");
        }

    }
}
