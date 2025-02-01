package Java.J349;

import java.util.Arrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length, m = nums2.length;
        int[] temp = new int[Math.min(n, m)];
        int index = 0, i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else { // nums1[i] == nums2[j]
                if (index == 0 || temp[index - 1] != nums1[i]) { // Убираем дубликаты
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersection(nums1, nums2))); // [2]

        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersection(nums1_2, nums2_2))); // [4, 9]
    }
}
