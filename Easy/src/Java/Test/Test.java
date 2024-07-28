package Java.Test;

public class Test {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(k);
            System.out.printf("nums[%d] != val[%d]\n",nums[i] ,val);
            if (nums[i] != val) {
                nums[k++] = nums[i];
                System.out.println("nums[" + k + "] = " + nums[i]);
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}
