package Java.j76;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        back(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void back(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        System.out.println("Добавляем в res: " + temp);
        res.add(new ArrayList<>(temp));
        System.out.println("res: "+ res);
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            System.out.println("  -> Добавили: " + nums[i] + " | temp: " + temp);
            back(res, temp, nums, i + 1);
            System.out.println("  <- Удаляем: " + temp.get(temp.size() - 1) + " | перед удалением temp: " + temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = solution.subsets(nums);
        System.out.println("\nРезультат: " + res);
    }
}
