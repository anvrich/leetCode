package solve.TwoSum.Java;

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
        for (int i = 0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
       for (int i = 0; i < nums.length; i++) {
           int tmp = target - nums[i]; // 9 - 2 = 7
           System.out.println(tmp);
           if (map.containsKey(tmp)) { // if 7 есть в массиве то true
               return new int[]{map.get(tmp), i}; // возврашаем новый массыв 7, 2
           }
           map.put(nums[i], i);
       }
       return null;
    }
}
