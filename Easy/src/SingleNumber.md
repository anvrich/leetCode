# 136. Single Number

>Учитывая непустой массив целых чисел nums, каждый элемент появляется дважды, кроме одного. Найдите этого единственного.

>Вы должны реализовать решение с линейной сложностью времени выполнения и использовать только постоянное дополнительное пространство.


Пример 1:
Ввод: числа = `[2,2,1]` -> Выход: `1`

Пример 2:
Ввод: числа = `[4,1,2,1,2]` -> Выход: `4`

Пример 3:
Ввод: числа = `[1]` -> Выход: 1

##### Решение:
```java
public class SingleNumber {
    public static void main(String[] args) {
    int[] nums = {2,2,1};
    int uniqueNumber = singleNumber(nums);
    System.out.println("Уникальный элемент: " + uniqueNumber);

}
public static int singleNumber(int[] nums) {
    int result = 0;
    for (int n : nums) {
        result ^= n;
    }
    return result;
    }
}
