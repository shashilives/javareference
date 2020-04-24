package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 10, 1, 2, 3, 8};

        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i; j < a.length; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
        Arrays.stream(a).forEach(System.out::println);

    }
}
