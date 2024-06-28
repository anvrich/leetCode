package Java.J500;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        // Массив строк клавиатуры
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();

        for (String word : words) {
            // Приводим слово к нижнему регистру для удобства сравнения
            String lowerCaseWord = word.toLowerCase();
            System.out.println("Проверяем слово: " + lowerCaseWord);

            // Проверяем, можно ли напечатать слово используя только одну строку клавиатуры
            if (canBeTypedWithOneRow(lowerCaseWord, rows)) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    private boolean canBeTypedWithOneRow(String word, String[] rows) {
        // Перебираем каждую строку клавиатуры
        for (String row : rows) {
            boolean inRow = true;
            System.out.println("Проверяем строку клавиатуры: " + row);

            // Проверяем каждую букву слова
            for (char c : word.toCharArray()) {
                System.out.println("Проверяем букву: " + c);
                // Если буква не содержится в текущей строке, то слово не может быть напечатано только в этой строке
                if (row.indexOf(c) == -1) {
                    inRow = false;
                    break;
                }
            }

            // Если все буквы слова находятся в текущей строке клавиатуры, возвращаем true
            if (inRow) {
                System.out.println("Слово может быть напечатано в этой строке клавиатуры");
                return true;
            }
        }

        // Если не найдено ни одной строки клавиатуры, в которой можно напечатать слово, возвращаем false
        return false;
    }

    public static void main(String[] args) {
        KeyboardRow solution = new KeyboardRow();
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words2 = {"omk"};
        String[] words3 = {"adsdf", "sfd"};

        System.out.println("Результат для words1: " + Arrays.toString(solution.findWords(words1))); // Output: ["Alaska", "Dad"]
        System.out.println("Результат для words2: " + Arrays.toString(solution.findWords(words2))); // Output: []
        System.out.println("Результат для words3: " + Arrays.toString(solution.findWords(words3))); // Output: ["adsdf", "sfd"]
    }
}
