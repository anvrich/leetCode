import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Итерация " + (i + 1) + ":");
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("  Обмен: " + array[j + 1] + " и " + array[j]);
                }
                System.out.println("  Состояние массива: " + Arrays.toString(array));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
