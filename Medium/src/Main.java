public class Main  {
    public static int factorial(int n) {
        System.out.println("Входим в метод factorial с n = " + n); // Отслеживаем вход в метод
        if (n == 0) {
            System.out.println("Базовый случай достигнут, n = 0, возвращаем 1"); // Базовый случай
            return 1;
        } else {
            int result = n * factorial(n - 1); // Рекурсивный случай
            System.out.println("Вычисляем: " + n + " * factorial(" + (n - 1) + ") = " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "! = " + factorial(number)); // Вывод: 5! = 120
    }
}
//Входим в метод factorial с n = 5
//Входим в метод factorial с n = 4
//Входим в метод factorial с n = 3
//Входим в метод factorial с n = 2
//Входим в метод factorial с n = 1
//Входим в метод factorial с n = 0
//Базовый случай достигнут, n = 0, возвращаем 1
//Вычисляем: 1 * factorial(0) = 1
//Вычисляем: 2 * factorial(1) = 2
//Вычисляем: 3 * factorial(2) = 6
//Вычисляем: 4 * factorial(3) = 24
//Вычисляем: 5 * factorial(4) = 120
//5! = 120
