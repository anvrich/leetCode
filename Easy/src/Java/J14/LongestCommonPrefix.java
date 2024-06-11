package Java.J14;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }


        String prefix = strs[0];
        System.out.println("Initial prefix: " + prefix);

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("Prefix updated to: " + prefix);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println("Longest common prefix for strs1: " + longestCommonPrefix(strs1));
    }
}
