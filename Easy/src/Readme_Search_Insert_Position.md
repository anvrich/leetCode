# 35. Search Insert Position

>Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если цель найдена. Если нет, верните индекс там, где он был бы, если бы он был вставлен по порядку.

Вы должны написать алгоритм со  O(log n)сложностью выполнения.

### Пример 1:
Ввод: nums = [`1,3,5,6`], цель = `5`
 Вывод: `2`

### Пример 2:
Ввод: nums = [`1,3,5,6`], цель = `2`
 Вывод: `1`

### Пример 3:
Ввод: nums = [`1,3,5,6`], цель = `7`
 Вывод: `4`

##### Решение:
```java
public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right -left)/2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else right = mid - 1;
        }
        return left;
    }
}
