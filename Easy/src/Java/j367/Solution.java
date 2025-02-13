package Java.j367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            else if (sq > num) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 16;
        System.out.println(solution.isPerfectSquare(num));
        int num1 = 14;
        System.out.println(solution.isPerfectSquare(num1));
    }
}
