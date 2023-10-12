public class LastWordLengthimp {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello Worlds";
        int length = lengthOfLastWord(s);
        System.out.println("Length of last word: " + length);
    }
}