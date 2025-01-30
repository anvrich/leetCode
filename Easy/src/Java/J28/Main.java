package Java.J28;

public class Main {
        public static int strStr(String haystack, String needle) {
            int n = haystack.length();
            int m = needle.length();

            if (m == 0) {
                return 0;
            }

            // Проходим по haystack
            for (int i = 0; i <= n - m; i++) {
                // Проверяем, совпадает ли подстрока с needle
                if (haystack.substring(i, i + m).equals(needle)) {
                    return i;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2));
    }
}
