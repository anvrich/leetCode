package Java.J66;

import java.util.Arrays;

public class Main {
//        public static int[] plusOne(int[] digits) {
//            int n = digits.length;
//            for(int i = n - 1; i >= 0; i--){
//                digits[i]++;
//                if(digits[i] < 10) return digits;
//                digits[i] = 0;
//            }
//            int[] res = new int[n + 1];
//            res[0] = 1;
//            return res;
//        }


    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i --){
            digits[i]++;
            if(digits[i] < 10) return digits;
            digits[i] = 0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }


    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits1)));

        int[] digits2 = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits2)));

        int[] digits3 = {9};
        System.out.println(Arrays.toString(plusOne(digits3)));
    }
}
