//https://leetcode.com/problems/two-sum/

import java.util.*;

public class twoSum2 {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (result.containsKey(complement)) {
                return new int[]{result.get(complement), i};
            }
            result.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] out = solution(arr, 6);
        System.out.println(out[0] + "," + out[1]);
    }
}