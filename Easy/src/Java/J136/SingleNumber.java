package Java.J136;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {2,2,1};
        int res = sn.singleNumber(nums);
        System.out.println(res);
    }
}
