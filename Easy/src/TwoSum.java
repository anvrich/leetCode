import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        example1 = [0,1] -> nums[0] + nums[1] == 9 ; we return [0,1].
        int[] result = twoSum(nums,target);
        if (result != null){
            System.out.println(result[0] + ", " + result[1]);
        }else System.out.println("No two sum solution found.");
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           int tmp = target - nums[i];
           if (map.containsKey(tmp)) {
               return new int[]{map.get(tmp), i};
           }
           map.put(nums[i], i);
       }
       return null;
    }
}
