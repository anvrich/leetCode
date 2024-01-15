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
