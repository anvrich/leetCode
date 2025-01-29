package Java.J136;

public class Main {

    public static int singleNumber(int[] nums) {
        int number = 0;
        for (int x : nums) {
            number ^= x; // XOR
        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
}


//  public int singleNumber(int[] nums) {
//        boolean check;
//        int num=0;
//        for(int i=0;i<nums.length;i++){
//            check = false;
//            for(int j=0;j<nums.length;j++){
//                if(i!=j && nums[i]==nums[j]){
//                    check = true;
//                    break;
//                }
//            }
//            if(!check){
//                num = nums[i];
//            }
//        }
//        return num;
//    }