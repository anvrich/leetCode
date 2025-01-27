package Team;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] opinions = new int[3];
            opinions[0] = sc.nextInt();
            opinions[1] = sc.nextInt();
            opinions[2] = sc.nextInt();

            int confidentCount = opinions[0] + opinions[1] + opinions[2];
            if (confidentCount >= 2) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}



