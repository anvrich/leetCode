package Java.j520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (Character.isUpperCase( word.charAt(0) )) {
            String remaining = word.substring(1);
            if (remaining.equals(remaining.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word = "USA";
        String word2 = "FlaG";
        String word3 = "Google";
        System.out.println(solution.detectCapitalUse(word));
        System.out.println(solution.detectCapitalUse(word2));
        System.out.println(solution.detectCapitalUse(word3));
    }
}
