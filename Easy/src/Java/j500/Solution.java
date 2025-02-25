package Java.j500;

import java.util.*;

public class Solution {
    public static String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            Set<Character> targetRow;
            char firstChar = lowerWord.charAt(0);

            if (row1.contains(firstChar)) {
                targetRow = row1;
            } else if (row2.contains(firstChar)) {
                targetRow = row2;
            } else {
                targetRow = row3;
            }

            boolean valid = true;
            for (char c : lowerWord.toCharArray()) {
                if (!targetRow.contains(c)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        System.out.println(Arrays.toString(result));
    }
}