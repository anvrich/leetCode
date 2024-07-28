import java.util.Scanner;

public class ABit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();

        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.nextLine();
            if (statement.contains("++")) {
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
        sc.close();



    }
}
