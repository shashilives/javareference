package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{6, 5, 1, 3, 8};

        // int[] a = new int[]{1, 3, 6, 10};
        //int[] b = new int[]{2, 4, 9};
        //    Arrays.stream(merge(a, b)).forEach(res -> System.out.print(res + " "));
        Arrays.stream(mergeSort(a)).forEach(res -> System.out.print(res + " "));
    }

    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) return a;
        int midPoint = Math.round(a.length / 2);
        int[] leftUnsortedArr = new int[midPoint];
        int[] rightUnSortedArray = new int[a.length - midPoint];
        System.arraycopy(a, 0, leftUnsortedArr, 0, midPoint);
        System.arraycopy(a, midPoint, rightUnSortedArray, 0, a.length - midPoint);
        int[] left = mergeSort(leftUnsortedArr);
        int[] right = mergeSort(rightUnSortedArray);
        int[] temp = merge(left, right);
        return temp;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[i + j] = left[i];
                i++;
            } else {
                result[j + i] = right[j];
                j++;
            }
        }

        while (i < left.length) {
            result[i + j] = left[i];
            i++;
        }


        while (j < right.length) {
            result[j + i] = right[j];
            j++;
        }
        return result;
    }

}
