package Java.J219;

import java.util.HashMap;

public class Solution {
    public boolean containsNearByDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if(i - j <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean result = solution.containsNearByDuplicate(nums, k);
        System.out.println(result);
    }
}
