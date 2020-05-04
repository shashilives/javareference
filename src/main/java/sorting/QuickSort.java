package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{4, 10, 1, 2, 3, 8};
        Arrays.stream(a).forEach(item -> System.out.print(item + ", "));
        System.out.println();
        // int pivotNo = pivot(a, 0, a.length);
        quickSort(a, 0, a.length);
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivotNo = pivot(a, left, right);
            Arrays.stream(a).forEach(item -> System.out.print(item + ", "));
            System.out.println("\n pivot pos No - " + pivotNo);
            quickSort(a, 0, pivotNo - 1);
            quickSort(a, pivotNo + 1, right);
        }

    }

    private static int pivot(int[] a, int start, int end) {
        int startIdx = start;
        int pivot = a[start];

        for (int i = start; i < end; i++) {
            if (pivot > a[i]) {
                startIdx++;
                swap(a, i, startIdx);
            }
        }
        swap(a, start, startIdx);

        return startIdx;
    }

    private static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
}
