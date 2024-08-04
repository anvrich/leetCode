package Java.J168;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char currentChar = (char) ('A' + remainder);
            columnTitle.insert(0, currentChar);
            columnNumber = columnNumber / 26;
        }

        return columnTitle.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        // Пример 2
        int example2 = 28;
        System.out.println("Пример 2: " + solution.convertToTitle(example2)); // Ожидаемый результат: "AB"
        System.out.println("===================");

        // Пример 3
        int example3 = 701;
        System.out.println("Пример 3: " + solution.convertToTitle(example3)); // Ожидаемый результат: "ZY"
        System.out.println("===================");

    }
}
