package Java.j171;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String columnTitle1 = "A";
        System.out.println(solution.titleToNumber(columnTitle1));

        String columnTitle2 = "AB";
        System.out.println(solution.titleToNumber(columnTitle2));

        String columnTitle3 = "ZY";
        System.out.println(solution.titleToNumber(columnTitle3));
    }
}