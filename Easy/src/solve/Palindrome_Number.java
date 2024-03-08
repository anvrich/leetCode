package solve;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        // Проверка отрицательных чисел и чисел, заканчивающихся на 0 (кроме нуля)
        if(x < 0 || x % 10 == 0 && x !=0 ){
            return false;
        }
        int rev = 0; // Переменная для хранения обратного числа
        while(x > rev){
            rev = rev * 10 + x % 10; // Добавление последней цифры к обратному числу
            x/=10; // Удаление последней цифры из исходного числа
        }
        return x == rev || x == rev /10;
    }
}
