package Java.j69;

public class Solution {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}