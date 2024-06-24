package Java.J488;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Поиск отсутствующих элементов
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums =   {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllNumbersDisappearedinanArray finder = new FindAllNumbersDisappearedinanArray();
        List<Integer> disappearedNumbers = finder.findDisappearedNumbers(nums);

        // Вывод исходного массива с комментариями к индексам
        System.out.println("Исходный массив (значения):");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? ", " : "\n"));
        }

        System.out.println("Исходный массив (индексы):");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + "   "); // Вывод индексов массива с пробелами для наглядности
        }
        System.out.println(); // Переход на новую строку для четкости вывода

        // Вывод отсутствующих чисел
        System.out.println("Отсутствующие числа:");
        System.out.println(disappearedNumbers);
    }
}
