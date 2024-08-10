package string;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));

        String s3 = "крыса";
        String s4 = "автомобиль";
        System.out.println(isAnagram(s3, s4));
    }
}
