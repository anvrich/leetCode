package Java.J387;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            System.out.println("Символ: " + c + ", Частота: " + countMap.get(c));
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Символ: " + s.charAt(i) + ", Частота в countMap: " + countMap.get(s.charAt(i)));
            if (countMap.get(s.charAt(i)) == 1) {
                System.out.println("Первый уникальный символ: " + s.charAt(i) + ", Индекс: " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("Строка: " + s);
        int index = firstUniqChar(s);
        System.out.println("\nРезультат: " + index);
    }
}
