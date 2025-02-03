package Java.J577;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverse(word)).append(" ");
        }
        return result.toString().trim();
    }
    public String reverse(String text) {
        char[] chars = text.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Let's take LeetCode contest";
                    //  "s'teL ekat edoCteeL tsetnoc"
        String res = solution.reverseWords(s);
        System.out.println(res);
    }
}