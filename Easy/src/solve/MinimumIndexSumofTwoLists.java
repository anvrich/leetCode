package solve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public static List<String> findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        System.out.println(map);
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                // Вычисление суммы индексов элемента из list2 и его индекса в list1
                int sum = j + map.get(list2[j]);
                System.out.println("j="+j + " list2:"+ map.get(list2[j]) + " = " +sum);
                if (sum < minSum) {
                    // Найден элемент с наименьшей суммой индексов
                    list.clear(); // Очистка списка, т.к. найден новый элемент с меньшей суммой
                    list.add(list2[j]); // Добавление элемента в список
                    minSum = sum; // Обновление минимальной суммы
                } else if (sum == minSum) {
                    // Еще один элемент с наименьшей суммой индексов
                    list.add(list2[j]); // Добавление элемента в список
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun" , "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        // Поиск и вывод общих элементов
        List<String> common = findRestaurant(list1, list2);
        System.out.println(common);
    }
}
