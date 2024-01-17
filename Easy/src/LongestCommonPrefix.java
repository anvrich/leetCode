public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "rececar", "car"};

        String result = longestCommonPrefix(strs);
        System.out.println("Самый длинный общий префикс: " + result);

        String result2 = longestCommonPrefix(strs2);
        System.out.println("Самый длинный общий префикс: " + result2);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
