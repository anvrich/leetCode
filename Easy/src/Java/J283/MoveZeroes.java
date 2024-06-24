package Java.J283;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
           if(nums[i] != 0 && nums[j] == 0){
               int tmp = nums[i];
               nums[i] = nums[j];
               nums[j] = tmp;
           }
           if(nums[j] != 0){
               j++;
           }
        }
    }
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
