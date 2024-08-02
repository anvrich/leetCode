package Java.J39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        System.out.println("Текущая комбинация: " + currentCombination + ", Оставшаяся цель: " + target);

        if (target < 0) {
            System.out.println("Цель стала меньше нуля, возвращаемся...");
            return; // если сумма превышает целевую, прерываем
        }

        if (target == 0) {
            result.add(new ArrayList<>(currentCombination)); // если сумма равна целевой, добавляем комбинацию в результат
            System.out.println("Найдена валидная комбинация: " + currentCombination);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]); // добавляем кандидата в текущую комбинацию
            System.out.println("Добавляем " + candidates[i] + " в текущую комбинацию");
            backtrack(candidates, target - candidates[i], i, currentCombination, result); // рекурсивно вызываем метод с обновленным целевым значением
            System.out.println("Удаляем " + candidates[i] + " из текущей комбинации");
            currentCombination.remove(currentCombination.size() - 1); // удаляем последний элемент для возврата к предыдущему состоянию
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = cs.combinationSum(candidates, target);

        System.out.println("Все комбинации: " + result); // Вывод результата на консоль
    }
}
