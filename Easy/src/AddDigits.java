public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int res = addDigits(num);
    }
    public static int addDigits(int num){
        if (num == 0) return 0;
        if (num <= 9) return num;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}
