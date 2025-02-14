package Java.j7;

public class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tmp = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && tmp > 7)) return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && tmp < -8)) return 0;

            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int x = 123;
        int y = -123;
        int z = 120;
        int w = 2147483647;
        int v = -2147483648;

        System.out.println(solution.reverse(x));
        System.out.println(solution.reverse(y));
        System.out.println(solution.reverse(z));
        System.out.println(solution.reverse(w));
        System.out.println(solution.reverse(v));
    }
}
