package Java.j268;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exceptedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        return exceptedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        System.out.println(solution.missingNumber(nums));
    }
}
