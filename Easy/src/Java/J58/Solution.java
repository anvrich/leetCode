package Java.J58;

public class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello world";
        System.out.println(solution.lengthOfLastWord(s));

        String s2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s2));
    }
}
