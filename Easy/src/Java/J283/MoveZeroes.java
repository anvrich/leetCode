package Java.J283;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            System.out.println("Перед итерацией " + i + ": nums = " + java.util.Arrays.toString(nums) + ", i = " + i+" : " + nums[i] + ", j = " + j+" : " + nums[j]);
            if (nums[i] != 0 && nums[j] == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                System.out.println("После обмена: nums = " + java.util.Arrays.toString(nums));
            }
            if (nums[j] != 0) {
                j++;
            }
            System.out.println("После итерации " + i + ": nums = " + java.util.Arrays.toString(nums) + ", i = " + i + ", j = " + j);
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        System.out.print("Конечный массив: ");
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
