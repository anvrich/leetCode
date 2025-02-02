package Java.J202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            System.out.println(seen);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        System.out.println(sum);
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 19;
        boolean res = solution.isHappy(n);
        System.out.println(res);
    }
}
