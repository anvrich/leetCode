package Java.J39;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        back(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void back(int[] candidates, int target, int i, ArrayList<Integer> currentCombination, List<List<Integer>> result) {
        System.out.println("Текущая комбинация: " + currentCombination + ", Цель: " + target);

        if (target < 0) {
            System.out.println("Цель меньше нуля, возвращаемся.");
            return;
        }

        if (target == 0) {
            System.out.println("Цель равна нулю, добавляем текущую комбинацию в результат: " + currentCombination);
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            System.out.println("Добавляем кандидат " + candidates[j] + " в текущую комбинацию");
            currentCombination.add(candidates[j]);
            back(candidates, target - candidates[j], j, currentCombination, result);
            System.out.println("Удаляем кандидат " + candidates[j] + " из текущей комбинации");
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Test ts = new Test();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = ts.combinationSum(candidates, target);

        System.out.println("Все комбинации: " + result); // Вывод результата на консоль
    }
}
