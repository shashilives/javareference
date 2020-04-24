package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 10, 1, 2, 3, 8};
        boolean swapped = true;
        for (int i = 0; i < a.length; i++) {
            System.out.println("i count  = " + i);
            // Break the loop when there is no swap
            if (!swapped) break;
            swapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);

    }
}
