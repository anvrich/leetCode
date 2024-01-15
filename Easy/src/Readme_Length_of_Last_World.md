# 58. Length of the Last Word

#### Дана строка s, состоящая из слов и пробелов, верните длину последнего слова в строке.

Слово – это максимум
подстрока
состоящий только из символов, не являющихся пробелами.

### Пример 1:

Ввод: s = «`Hello world`»
Выход: `5`
Пояснение: Последнее слово — «`World`» длиной `5`.

### Пример 2:
Ввод: s = "`   fly me   to   the moon  `"
Выход: `4`
Пояснение: Последнее слово — «`moon`» длиной `4`.


###### Ограничения:
- `1 <= длина с. <= 104`
- `s` состоит только из английских букв и пробелов `" "`.
- В `s` будет хотя бы одно слово.
- 
##### Решение:
```java
public class Length_Of_Last_Word {
    public static void main(String[] args) {
        String s = "Hello Java";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
    public static int lengthOfLastWord(String s){
        String[] words = s.split("\\s+");
        if (words.length == 0) {
            return 0;
        }
        String lastWord = words[words.length - 1];
        int nLast = lastWord.length();
        return nLast;
    }
}