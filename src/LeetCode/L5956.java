package LeetCode;

public class L5956 {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isP(words[i])){
                return words[i];
            }
        }
        return "";
    }

    private static boolean isP(String s){
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }


}
