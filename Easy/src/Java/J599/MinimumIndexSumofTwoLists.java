package Java.J599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public static List<String> findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int i = map.get(list2[j]);
                System.out.println("Строка \"" + list2[j] + "\" найдена в list1 с индексом: " + i  + " -> " + map.get(list2[j]));
                int sum = i + j;
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
//        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
//        System.out.println(findRestaurant(list1, list2)); // ["Shogun"]

        String[] list1_2 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2_2 = {"KFC","Shogun","Burger King"};
        System.out.println(findRestaurant(list1_2, list2_2)); // ["Shogun"]

//      `  String[] list1_3 = {"happy","sad","good"};
//        String[] list2_3 = {"sad","happy","good"};
//        System.out.println(findRestaurant(list1_3, list2_3)); // ["sad", "happy"]`
    }
}
