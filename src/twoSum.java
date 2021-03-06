//https://leetcode.com/problems/two-sum/

public class twoSum {
    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] out = solution(arr, 6);
        System.out.println(out[0] + "," + out[1]);
    }
}