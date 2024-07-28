import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] person = new int[3];
            person[0] = sc.nextInt();
            person[1] = sc.nextInt();
            person[2] = sc.nextInt();

            int confidentCount = person[0] + person[1] + person[2];
            if (confidentCount >= 2) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
