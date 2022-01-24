package LeetCode;

public class L1446 {

    public int maxPower(String s) {
        int length = s.length();
        int ans=1;
        for (int i = 0;i<length;){
            int j = i;
            while (j<length&&s.charAt(i)==s.charAt(j)){
                j++;
            }
            ans = Math.min(ans,j-i);
            i=j;
        }
        return ans;
    }

}
