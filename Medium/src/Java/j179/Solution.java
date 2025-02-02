package Java.j179;

import java.util.Arrays;

public class Solution {
    /**
     * Метод для формирования наибольшего числа, составленного из массива чисел.
     *
     * @param nums массив целых чисел
     * @return строка, представляющая наибольшее возможное число
     */
    public String largestNumber(int[] nums) {
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = Integer.toString(nums[i]);
        }
        System.out.println("Массив строк до сортировки: " + Arrays.toString(numStrings));
        // Сортируем строки по следующему правилу:
        // для двух строк a и b сравниваем конкатенации (b+a) и (a+b)
        // Таким образом, если (b+a) больше (a+b), то b должно идти раньше a.
        Arrays.sort(numStrings, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            System.out.println("Сравниваем: \"" + a + "\" и \"" + b + "\" => \""
                    + order1 + "\" vs \"" + order2 + "\"");
            return order2.compareTo(order1);
        });
        System.out.println("Массив строк после сортировки: " + Arrays.toString(numStrings));

        if (numStrings[0].equals("0")) {
            System.out.println("Все числа равны нулю. Результат: 0");
            return "0";
        }
        StringBuilder largestNum = new StringBuilder();
        for (String numStr : numStrings) {
            System.out.println("Добавляем: " + numStr);
            largestNum.append(numStr);
        }
        return largestNum.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {10, 2};
                     //  "210"
        System.out.println("Пример 1: входной массив: " + Arrays.toString(nums1));
        System.out.println("Наибольшее число: " + solution.largestNumber(nums1));

        System.out.println("--------------------------------------------------");

        int[] nums2 = {3, 30, 34, 5, 9};
                          // "9534330"
        System.out.println("Пример 2: входной массив: " + Arrays.toString(nums2));
        System.out.println("Наибольшее число: " + solution.largestNumber(nums2));

    }
}
