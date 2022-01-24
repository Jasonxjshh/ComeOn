package 剑指offer.Day10;

public class Solution1 {
    public static void main(String[] args) {
        int i = translateNum(12258);
        System.out.println(i);
    }
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        for(int i = 2; i <= s.length(); i++) {
            String tmp = s.substring(i - 2, i);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }
}
