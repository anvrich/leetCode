//import java.util.Scanner;
//
//public class A158 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] scores = new int[n];
//        for (int i = 0; i < n; i++) {
//            scores[i] = scanner.nextInt();
//        }
//
//        int thresholdScore = scores[k - 1];
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (scores[i] >= thresholdScore && scores[i] > 0) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//}
public class A158 {
    public static void main(String[] args) {
        int n = 8;
        int k = 5;
        int[] scores = {10, 9, 8, 7, 7, 7, 5, 5};

        int thresholdScore = scores[k - 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= thresholdScore && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
