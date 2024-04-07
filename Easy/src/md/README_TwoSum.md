# LeetCode: Two Sum

Этот репозиторий содержит решения на Java для задачи "Two Sum" на LeetCode.

## Описание задачи

Учитывая массив целых чисел `nums` и целое число `target`, верните индексы двух чисел так, чтобы их сумма равнялась `target`.

Вы можете предположить, что каждый входной массив имеет ровно одно решение, и вы не можете использовать один и тот же элемент дважды.

Вы можете возвращать ответ в любом порядке.

### Пример

#### Пример 1:

Вход: `nums = [2,7,11,15]`, `target = 9`

Выход: `[0,1]`

Пояснение: Поскольку `nums[0] + nums[1] == 9`, мы возвращаем `[0, 1]`.

#### Пример 2:

Вход: `nums = [3,2,4]`, `target = 6`

Выход: `[1,2]`

#### Пример 3:

Вход: `nums = [3,3]`, `target = 6`

Выход: `[0,1]`

## Ограничения

- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- `-109 <= target <= 109`
- Существует только один правильный ответ.

## Дополнительно

Можете ли вы предложить алгоритм с временной сложностью менее O(n^2)?

## Использование

Не стесняйтесь изучать решение на Java в файле [solve.Test.TwoSum.java](./src/TwoSum.java). Вы можете использовать это решение, чтобы понять, как эффективно решить задачу "Two Sum".




Благодарим за интерес к репозиторию LeetCode Two Sum! Удачи в программировании!


## Описание задачи:
В данной задаче требуется найти два числа в массиве, которые в сумме дают целевое число.

##### Решение:
```java
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;

public class solve.Test.TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        example1 = [0,1] -> nums[0] + nums[1] == 9 ; we return [0,1].
        int[] result = twoSum(nums,target);
        if (result != null){
            System.out.println(result[0] + ", " + result[1]);
        }else System.out.println("No two sum solution found.");
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           int tmp = target - nums[i];
           if (map.containsKey(tmp)) {
               return new int[]{map.get(tmp), i};
           }
           map.put(nums[i], i);
       }
       return null;
    }
}
