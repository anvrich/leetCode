package Java.j1089;

public class Solution {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zerosCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zerosCount++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + zerosCount < n) {
                arr[i + zerosCount] = arr[i];
            }
            if (arr[i] == 0) {
                zerosCount--;
                if (i + zerosCount < n) {
                    arr[i + zerosCount] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        System.out.println("Результат: " + java.util.Arrays.toString(arr1)); // [1, 0, 0, 2, 3, 0, 0, 4]

        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        System.out.println("Результат: " + java.util.Arrays.toString(arr2)); // [1, 2, 3]
    }
}