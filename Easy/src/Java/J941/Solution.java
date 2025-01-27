package Java.J941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Проверяем строгое возрастание
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Пик не может быть первым или последним элементом
        if (i == 0 || i == n - 1) return false;

        // Проверяем строгое убывание
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Если мы прошли весь массив, значит, это горный массив
        return i == n - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {2, 1};
        int[] arr2 = {3, 5, 5};
        int[] arr3 = {0, 3, 2, 1};

        System.out.println("Пример 1: " + solution.validMountainArray(arr1));
        System.out.println("Пример 2: " + solution.validMountainArray(arr2));
        System.out.println("Пример 3: " + solution.validMountainArray(arr3));
    }
}
