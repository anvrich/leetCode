package WordsAreTooLong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] results = new String[n];

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                String abbreviatedWord = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                results[i] = abbreviatedWord;
            } else {
                results[i] = word;
            }
        }

        scanner.close();

        for (String result : results) {
            System.out.println(result);
        }
    }
}
