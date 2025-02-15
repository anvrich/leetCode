package NextRound158A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test = "8 5\n10 9 8 7 7 7 5 5";
        Scanner sc = new Scanner(test);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int count = 0;
        int minScore = scores[k - 1];

        for (int score : scores) {
            if (score >= minScore && score > 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
