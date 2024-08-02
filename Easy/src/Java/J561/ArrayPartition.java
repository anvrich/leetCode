package Java.J561;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // Сортируем массив
        Arrays.sort(nums);
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));

        int sum = 0;
        // Проходим по массиву с шагом 2
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
            System.out.println("Сумма после добавления nums[" + i + "] (" + nums[i] + "): " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();

        int[] nums1 = {1, 4, 3, 2};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.arrayPairSum(nums1)); // Output: 4

        System.out.println();

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.arrayPairSum(nums2)); // Output: 9
    }
}
