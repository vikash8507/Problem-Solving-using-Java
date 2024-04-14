package PrefixCalculation;

public class PrefixEvenSum {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 7, 4, 8, 1, 6};
        int[] pes = new int[array.length];
        pes[0] = array[0];

        for (int i=1; i<array.length; i++) {
            if (i%2 == 1) {
                pes[i] = pes[i-1];
            } else {
                pes[i] = array[i] + pes[i-1];
            }
        }

        for (int i=0; i<pes.length; i++) {
            System.out.print(pes[i] + " ");
        }

    }
}
