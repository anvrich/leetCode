//package Java.J242;

//import java.util.Arrays;
//
//public class Main {
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        char[] charS = s.toCharArray();
//        char[] charT = t.toCharArray();
//        Arrays.sort(charS);
//        Arrays.sort(charT);
//
//        for (int i = 0; i < charS.length; i++) {
//            if (charS[i] != charT[i]) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram", "nagaram")); // true
//        System.out.println(isAnagram("rat", "car")); // false
//    }
//}


package Java.J242;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // Массив на 26 букв латинского алфавита

        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // Увеличиваем счетчик для буквы
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--; // Уменьшаем счетчик для буквы
        }

        // Если все значения 0, значит, строки анаграммы
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false
    }
}