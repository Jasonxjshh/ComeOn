package 剑指offer.Day3;

public class reverseLeftString {
    public String reverseLeftWords(String s, int n) {
        String left = s.substring(0,n);
        String right = s.substring(n);
        return right+left;
    }

    public static void main(String[] args) {
        reverseLeftString s = new reverseLeftString();
        System.out.println(s.reverseLeftWords("abcdefg", 2));
    }
}
