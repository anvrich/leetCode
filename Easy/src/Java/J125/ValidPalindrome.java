package Java.J125;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Пример 1
        String example1 = "A man, a plan, a canal: Panama";
        System.out.println("Example 1: " + solution.isPalindrome(example1)); // Ожидаемый результат: true

        // Пример 2
        String example2 = "race a car";
        System.out.println("Example 2: " + solution.isPalindrome(example2)); // Ожидаемый результат: false

        // Пример 3
        String example3 = " ";
        System.out.println("Example 3: " + solution.isPalindrome(example3)); // Ожидаемый результат: true
    }
}
