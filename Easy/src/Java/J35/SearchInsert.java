package Java.J35;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1, 3, 5, 6};
        int target = 6;
        int result = searchInsert.searchInsert(nums, target);
        System.out.println("Index: " + result);

    }
}
