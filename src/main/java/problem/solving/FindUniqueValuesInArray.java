package problem.solving;

public class FindUniqueValuesInArray {
    // we shall use MultiplePointer Pattern for this porblem

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 4, 5, 6, 7, 7};

        int x = a[0];
        int y = a[1];
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        System.out.println(i+1);
    }
}
