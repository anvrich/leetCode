package Java.J66;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.print("Исходный массив: ");
        for (int num : digits) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] result = plusOne(digits);

        System.out.print("Результирующий массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println("Проверяем цифру на индексе " + i + ": " + digits[i]);
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println("Увеличили цифру на индексе " + i + ": " + digits[i]);
                System.out.print("Текущий массив: ");
                for (int num : digits) {
                    System.out.print(num + " ");
                }
                System.out.println();
                return digits;
            }
            digits[i] = 0;
            System.out.println("Установили цифру на индексе " + i + " в 0");
            System.out.print("Текущий массив: ");
            for (int num : digits) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        System.out.println("Все цифры были 9, создали новый массив: ");
        for (int num : digits) {
            System.out.print(num + " ");
        }
        System.out.println();
        return digits;
    }


}
