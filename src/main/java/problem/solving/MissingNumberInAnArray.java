package problem.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<int[]> bigList = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int maxElement = scanner.nextInt();
            int[] temp = new int[maxElement - 1];
            for (int j = 0; j < maxElement - 1; j++) {
                temp[j] = scanner.nextInt();
            }
            bigList.add(temp);
        }

        for (int i = 0; i < bigList.size(); i++) {
            int[] tempArr = bigList.get(i);
            int tempSum = 0;
            for (int j = 0; j < tempArr.length; j++) {
                tempSum += tempArr[j];
            }
            int n = tempArr.length+1;
            int actualSumtobe = (n * (n+1)) / 2;
            System.out.println(actualSumtobe - tempSum);
        }
    }
}

//
//        2
//        5
//        1 2 3 5
//        10
//        1 2 3 4 5 6 7 8 10
