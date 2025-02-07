package Java.j283;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println("Тест 1: " + Arrays.toString(nums1));

        int[] nums2 = {0, 0, 0, 0, 0};
        solution.moveZeroes(nums2);
        System.out.println("Тест 2: " + Arrays.toString(nums2));

        int[] nums3 = {1, 2, 3, 4, 5};
        solution.moveZeroes(nums3);
        System.out.println("Тест 3: " + Arrays.toString(nums3));

        int[] nums4 = {0};
        solution.moveZeroes(nums4);
        System.out.println("Тест 4: " + Arrays.toString(nums4));

        int[] nums5 = {1};
        solution.moveZeroes(nums5);
        System.out.println("Тест 5: " + Arrays.toString(nums5));

        int[] nums6 = {0, 1};
        solution.moveZeroes(nums6);
        System.out.println("Тест 6: " + Arrays.toString(nums6));

        int[] nums7 = {1, 0};
        solution.moveZeroes(nums7);
        System.out.println("Тест 7: " + Arrays.toString(nums7));

        int[] nums8 = {4, 0, 5, 0, 6, 7, 0, 8};
        solution.moveZeroes(nums8);
        System.out.println("Тест 8: " + Arrays.toString(nums8));
    }
}
