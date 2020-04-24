package problem.solving;

public class MultiplePointerSumZero {
    //    The idea of this pattern is to use multiple pointer at the same time and converge
    // find the first occurance of the sub array who sum up to zero
    public static void main(String[] args) {
        int[] mainArray = {-3, -2, -1, 2, 4};

        int left = 0, right = mainArray.length - 1;

        while (left < right) {
            int sum = mainArray[left] + mainArray[right];
            if (sum == 0) {
                System.out.println("Left = " + mainArray[left] + " Right = " + mainArray[right]);
                return;
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
}
