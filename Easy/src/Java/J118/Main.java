package Java.J118;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < prevRow.size(); j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                newRow.add(sum);
                System.out.println("NewRow: " + newRow);
                System.out.println("Добавляем сумму: " + prevRow.get(j - 1) + " + " + prevRow.get(j) + " = " + sum);
            }

            newRow.add(1);
            res.add(newRow);
            System.out.println("res: "+res);
        }
        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);

        System.out.println("\nФинальный треугольник Паскаля:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
