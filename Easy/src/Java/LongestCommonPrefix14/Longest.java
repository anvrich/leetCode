package Java.LongestCommonPrefix14;

import java.util.Arrays;

public class Longest {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] example2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        StringBuilder prefix = new StringBuilder();

        String first = strs[0];
        String last = strs[strs.length - 1];


        int minLength = Math.min(first.length(), last.length());
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                prefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}


