package LeetCode;

public class L1816 {
    public static void main(String[] args) {
        L1816 s = new L1816();
        System.out.println(s.truncateSentence("What is the solution to this problem", 4));
    }
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        if (k>=s1.length){
            return s;
        }else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < k-1; i++) {
                stringBuilder.append(s1[i]);
                stringBuilder.append(" ");
            }
            stringBuilder.append(s1[k-1]);
            return stringBuilder.toString();
        }
    }
}
