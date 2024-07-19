package Java.Test;

public class Test11 {
    public int maxSpan(int[] nums){
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if(nums[i] == nums[j]){
                    int span = j - i + 1;
                    System.out.printf("%d - %d + %d", nums[i], nums[j], 1);
                    System.out.println("nums[" + i + "] = nums[" + j + "] (" + nums[i] + ")");
                    System.out.println("Current span: " + span);
                    if(span > maxSpan){
                        maxSpan = span;
                        System.out.println("New maxSpan: " + maxSpan);
                    }
                    break;
                }
            }
        }
        return maxSpan;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        Test11 test = new Test11();
        System.out.println("Max span: " + test.maxSpan(nums));  // Expected output: 4
    }
}
