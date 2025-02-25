package Java.j905;

import java.util.Arrays;

public class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);

        while (start < end) {
            if (nums[start] % 2 != 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                end--;

                if (temp % 2 == 0) {
                    nums[start] = temp;
                    start++;
                } else {
                    nums[start] = temp;
                }
            } else {
                start++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 33, 22};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }
}
