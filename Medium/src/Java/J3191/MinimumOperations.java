package Java.J3191;

import java.util.Arrays;

public class MinimumOperations {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        System.out.println("Начальный массив: " + Arrays.toString(nums));

        // Проходим по массиву до тех пор, пока не останется возможность перевернуть тройку элементов
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                System.out.println("Переворачиваем тройку начиная с индекса " + i);
                // Переворачиваем тройку, начиная с nums[i]
                flipThree(nums, i);
                operations++;
                System.out.println("Массив после операции " + operations + ": " + Arrays.toString(nums));
            }
        }

        // Проверяем, все ли элементы массива равны 1
        for (int num : nums) {
            if (num == 0) {
                System.out.println("Невозможно сделать все элементы равными 1");
                return -1; // Если остался хотя бы один 0, возвращаем -1
            }
        }

        System.out.println("Все элементы массива равны 1 после " + operations + " операций");
        return operations;
    }

    // Метод для переворота трех последовательных элементов массива
    private void flipThree(int[] nums, int start) {
        for (int i = start; i < start + 3; i++) {
            nums[i] = nums[i] == 0 ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        MinimumOperations solution = new MinimumOperations();
        int[] nums1 = {0, 1, 1, 1, 0, 0};
        System.out.println("Результат: " + solution.minOperations(nums1)); // Выход: 3

        int[] nums2 = {0, 1, 1, 1};
        System.out.println("Результат: " + solution.minOperations(nums2)); // Выход: -1
    }
}
