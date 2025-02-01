package Java.J67;

public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        System.out.println("Начинаем сложение двоичных чисел:");
        System.out.println("  a = " + a);
        System.out.println("  b = " + b);
        System.out.println("------------------------------------------------");

        int step = 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            System.out.println("Шаг " + step + ":");

            int digitA = 0;
            if (i >= 0) {
                digitA = a.charAt(i) - '0';
                System.out.println("  Цифра из a (позиция " + i + "): " + digitA);
            } else {
                System.out.println("  Цифра из a: отсутствует (принимаем за 0)");
            }

            int digitB = 0;
            if (j >= 0) {
                digitB = b.charAt(j) - '0';
                System.out.println("  Цифра из b (позиция " + j + "): " + digitB);
            } else {
                System.out.println("  Цифра из b: отсутствует (принимаем за 0)");
            }

            System.out.println("  Текущий перенос: " + carry);

            int sum = digitA + digitB + carry;
            int bit = sum % 2;
            carry = sum / 2;

            System.out.println("  Вычисляем: " + digitA + " + " + digitB + " + перенос = " + sum);
            System.out.println("  Результирующий бит: " + bit);
            System.out.println("  Новый перенос: " + carry);

            result.append(bit);
            System.out.println("  Промежуточный результат (в обратном порядке): " + result);
            System.out.println("------------------------------------------------");

            i--;
            j--;
            step++;
        }

        String finalResult = result.reverse().toString();
        System.out.println("Финальный двоичный результат: " + finalResult);
        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println("Ответ: " + addBinary("1010", "1011")); // Ожидаемый вывод: "10101"
    }
}


//package Java.J67;
//public class Solution {
//    public static String addBinary(String a, String b) {
//        StringBuilder result = new StringBuilder();
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        int carry = 0;
//
//        while (i >= 0 || j >= 0 || carry != 0) {
//            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
//            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
//            int sum = digitA + digitB + carry;
//            result.append(sum % 2);
//            carry = sum / 2;
//            i--;
//            j--;
//        }
//
//        return result.reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addBinary("1010", "1011"));
//    }
//}