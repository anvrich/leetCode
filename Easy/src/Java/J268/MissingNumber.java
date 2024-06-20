package Java.J268;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.println("Expected Sum: " + expectedSum);
        System.out.println("Actual Sum: " + actualSum);
        int missingNum = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNum);
        return missingNum;
    }

    void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        int[] nums1 = {3, 0, 1};
        System.out.print("1) Array: ");
        solution.printArr(nums1);
        System.out.println("Result: " + solution.missingNumber(nums1) + "\n");


        int[] nums2 = {0, 1};
        System.out.print("2) Array: ");
        solution.printArr(nums2);
        System.out.println("Result: "+solution.missingNumber(nums2)+ "\n");

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.print("3) Array: ");
        solution.printArr(nums3);
        System.out.println("Result: "+solution.missingNumber(nums3)+"\n");
    }
}
