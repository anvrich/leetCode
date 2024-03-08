package solve;

public class SingleNumber {
    public static void main(String[] args) {
    int[] nums = {2,2,1};
    int uniqueNumber = singleNumber(nums);
    System.out.println("Уникальный элемент: " + uniqueNumber);

}
public static int singleNumber(int[] nums) {
    int result = 0;
    for (int n : nums) {
        result ^= n;
    }
    return result;
    }
}
