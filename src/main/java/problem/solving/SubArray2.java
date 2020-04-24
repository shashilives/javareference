package problem.solving;

import java.util.HashMap;

public class SubArray2 {
    public static void main(String[] args) {
        System.out.println(new SubArray2().subarraySum(new int[]{3, 4, 3, -3, 1, 4, 2}, 7));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
