package Java.J169;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        System.out.println("Начальная инициализация: majorityElement = " + majorityElement + ", count = " + count);

        // Первый проход для определения возможного мажоритарного элемента
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            }
            System.out.println("Итерация " + i + ": majorityElement = " + majorityElement + ", count = " + count);
        }

        // Второй проход для проверки, действительно ли элемент является мажоритарным
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }
        System.out.println("Подсчет количества мажоритарного элемента: majorityElement = " + majorityElement + ", count = " + count);
        if (count > nums.length / 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = {2, 1, 2, 1, 2, 1, 2};
        int result = solution.majorityElement(nums);

        if (result != -1) {
            System.out.println("Мажоритарный элемент: " + result);
        } else {
            System.out.println("Мажоритарный элемент не найден.");
        }
    }
}
