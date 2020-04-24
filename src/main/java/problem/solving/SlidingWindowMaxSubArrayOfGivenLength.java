package problem.solving;

public class SlidingWindowMaxSubArrayOfGivenLength {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,2,3,4,5,1}, 3));
    }

    static int maxSubArray(int[] a, int n) {
        int maxSum = 0;
        int tempSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += a[i];
        }

        tempSum = maxSum;
        // 1, 2, 3, 4, 5
        for (int i = n; i < a.length; i++) {
            tempSum = tempSum + a[i] - a[i - n];
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }
}
