package Java.J217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1}; //true
        int[] nums2 = {1, 2, 3, 4};//false
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println("Example 1: " + solution.containsDuplicate(nums1)); // true
        System.out.println("Example 2: " + solution.containsDuplicate(nums2)); //
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
