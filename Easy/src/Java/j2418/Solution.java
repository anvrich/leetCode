package Java.j2418;

import java.util.Arrays;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        Integer[] indx = new Integer[n];
        for (int i = 0; i < n; i++) {
            indx[i] = i;
        }

        Arrays.sort(indx, (a, b) -> {
            System.out.println("Сравниваем heights[" + b + "] (" + heights[b] + ") и heights[" + a + "] (" + heights[a] + ")");
            return heights[b] - heights[a];
        });

        String[] sortedNames = new String[names.length];
        for (int i = 0; i < indx.length; i++) {
            sortedNames[i] = names[indx[i]];
            System.out.println("sortedNames[" + i + "] = names[" + indx[i] + "] = " + sortedNames[i]);
        }

        System.out.println("\nФинальный результат: " + Arrays.toString(sortedNames));
        return sortedNames;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        solution.sortPeople(names, heights);
    }
}
