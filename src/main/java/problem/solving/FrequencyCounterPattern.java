package problem.solving;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterPattern {
    // The idea of this pattern is to have a  counter for each interested field and then do the math
    // Fx - in the below case, we are tracking as the frequency of occurance of each element
    // Given two array - check if the second array is having all the squares of first array


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4};
        int[] b = {1, 4, 9, 16, 4};
        // System.out.println("naive - " + naiveApproachCheckSame(a, b));
        System.out.println(optimizedSoln(a, b));

    }

    public static boolean optimizedSoln(int[] a, int[] b) {
        Map<Integer, Integer> aMap = new HashMap<>();
        Map<Integer, Integer> bMap = new HashMap<>();

        for (Integer i : a) {
            if (aMap.containsKey(i)) {
                int x = aMap.get(i);
                x++;
                aMap.put(i, x);
            } else {
                aMap.put(i, 1);
            }
        }
        for (Integer i : b) {
            if (bMap.containsKey(i)) {
                int x = bMap.get(i);
                x++;
                bMap.put(i, x);
            } else {
                bMap.put(i, 1);
            }
        }

        System.out.println(aMap);
        System.out.println(bMap);

        for (Integer j : aMap.keySet()) {
            if (bMap.containsKey(j * j)) {
                if (bMap.get(j * j) == aMap.get(j)) return true;
                else return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean naiveApproachCheckSame(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        int presentCounter = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkIfNumberIsPresent(b, a[i] * a[i])) {
                a[i] = -1;
                presentCounter++;
            } else return false;
        }
        System.out.println(presentCounter);
        return presentCounter == a.length ? true : false;
    }

    private static boolean checkIfNumberIsPresent(int[] b, int x) {
        for (int i : b) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
}
