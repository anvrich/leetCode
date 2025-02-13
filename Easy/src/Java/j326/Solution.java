package Java.j326;

public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 27;
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(45));
        System.out.println(solution.isPowerOfThree(1));
    }
}

//    public boolean isPowerOfThree(int n) {
//        if (n <= 0) return false;
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//        return n == 1;
//    }
