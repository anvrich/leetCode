import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res = twoSum(nums1, target1);
        System.out.println(Arrays.toString(res));

    }

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {// 2 7 11 15
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            return null;
    }
}

