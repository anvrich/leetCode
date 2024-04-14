package solve.RomantoInteger;

import java.util.HashMap;

public class RomantoInteger {
    final HashMap<Character, Integer> romanValues = new HashMap<>();

    public RomantoInteger() {
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int curValue = romanValues.get(s.charAt(i));
            if (curValue > prevValue) {
                result += curValue - 2 * prevValue;
            } else {
                result += curValue;
            }

            System.out.printf("Текущая римская цифра: %s, её значение: %d\n", s.charAt(i), curValue);
            System.out.printf("Предыдущее значение: %d\n", prevValue);
            System.out.printf("Результат после обработки текущей цифры: %d\n", result);

            prevValue = curValue;
            System.out.println("|"+prevValue +"|" + curValue +"|");
        }
        return result;
    }


    public static void main(String[] args) {
        RomantoInteger converter = new RomantoInteger();
        int three = converter.romanToInt("XXVII");
        System.out.println("XXVII = " + three);
    }
}
