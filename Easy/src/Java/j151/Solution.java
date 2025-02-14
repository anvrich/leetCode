package Java.j151;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int right = s.length() - 1, left = right;
        StringBuilder result = new StringBuilder();

        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            result.append(s.substring(left + 1, right + 1)).append(" ");

            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            right = left;
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Итоговый вывод: \"" + solution.reverseWords("  hello   world  ") + "\"");
    }
}
















