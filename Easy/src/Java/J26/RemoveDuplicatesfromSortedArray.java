package Java.J26;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 10, 10, 10, 20, 20, 30, 30, 40};
//        int[] nums  =   {1,1,2};
        RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
        int k1 = solution.removeDuplicates(nums);
        System.out.println("Example 1: k = " + k1 + ", nums = " + java.util.Arrays.toString(nums));

    }


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // первый элемент всегда уникален
        for (int i = 1; i < nums.length; i++) {
            System.out.printf(" nums[%d] = %d \n nums[%d] = %d;\n",i, nums[i],i-1, nums[i - 1]);
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
