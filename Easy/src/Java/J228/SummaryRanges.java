package Java.J228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    // Метод для получения списка диапазонов
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) return ranges; // Если массив пустой, возвращаем пустой список

        int start = nums[0]; // Инициализируем начало первого диапазона
        int end = nums[0];   // Инициализируем конец первого диапазона

        for (int i = 1; i < nums.length; i++) {
            System.out.println("Текущий элемент: " + nums[i]);
            if (nums[i] == end + 1) {
                // Если текущий элемент на единицу больше конца предыдущего диапазона
                end = nums[i]; // Расширяем текущий диапазон
                System.out.println("Расширяем диапазон: " + start + "->" + end);
            } else {
                // Если текущий элемент не является продолжением текущего диапазона
                if (start == end) {
                    // Если начало и конец одинаковы, добавляем одно число
                    ranges.add(String.valueOf(start));
                    System.out.println("Добавляем одно число: " + start);
                } else {
                    // Иначе добавляем диапазон в формате "start->end"
                    ranges.add(start + "->" + end);
                    System.out.println("Добавляем диапазон: " + start + "->" + end);
                }
                start = nums[i]; // Начинаем новый диапазон с текущего элемента
                end = nums[i];   // Инициализируем конец нового диапазона
                System.out.println("Начинаем новый диапазон с: " + start);
            }
        }

        // Обрабатываем последний диапазон после выхода из цикла
        if (start == end) {
            ranges.add(String.valueOf(start));
            System.out.println("Добавляем последнее одно число: " + start);
        } else {
            ranges.add(start + "->" + end);
            System.out.println("Добавляем последний диапазон: " + start + "->" + end);
        }

        return ranges; // Возвращаем список диапазонов
    }

    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();

        // Пример 1: массив [0, 1, 2, 4, 5, 7]
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println("Результат для nums1:");
        System.out.println(solution.summaryRanges(nums1)); // Ожидаемый вывод: ["0->2","4->5","7"]

        System.out.println(); // Пустая строка для разделения выводов

        // Пример 2: массив [0, 2, 3, 4, 6, 8, 9]
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println("Результат для nums2:");
        System.out.println(solution.summaryRanges(nums2)); // Ожидаемый вывод: ["0","2->4","6","8->9"]
    }
}
