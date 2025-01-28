package Java.J1;

import java.util.HashMap;

public class TwoSumWithMap {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Индексы двух чисел: " + result[0] + " и " + result[1]);
        } else {
            System.out.println("Пар чисел с данной суммой не найдено.");
        }
    }
}
