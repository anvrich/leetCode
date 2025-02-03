package Java.j27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int indx = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[indx] = nums[i];
                indx++;
            }
        }
        return indx;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(solution.removeElement(nums, val));
    }
}
