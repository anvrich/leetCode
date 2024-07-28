package Java.J136;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            System.out.println("Before XOR: result = " + result + ", num = " + num);
            result ^= num;
            System.out.println("After XOR: result = " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        int res = sn.singleNumber(nums);
        System.out.println("Single number is: " + res);
    }
}
