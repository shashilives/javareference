package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 10, 1, 2, 3, 8};
        int[] b = new int[]{2, 1, 9, 7, 6, 4};
        insertionSort(a);
        insertionSort(b);
    }

    static public void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
        Arrays.stream(a).forEach(a1 -> System.out.print(a1 + " "));

    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }


}
