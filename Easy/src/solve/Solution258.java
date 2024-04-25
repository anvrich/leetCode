package solve;

public class Solution258 {
    public static void main(String[] args) {
    int res = addDigits(38);
        System.out.println("res:" + res);

    }
    public static int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        while (num > 10){
            int tmp = 0;
            while (num > 0) {
                tmp += num % 10; //
                num /= 10;
            }
            num = tmp;

        }
        return num;
    }
}
