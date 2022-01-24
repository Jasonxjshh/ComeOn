package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class L5958 {
    public static void main(String[] args) {
        L5958 l = new L5958();
        System.out.println(l.getDescentPeriods(new int[]{1}));
    }
    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        long[] dp = new long[prices.length];
        dp[0] = 1;
        for (int i = 1; i < prices.length; i++) {
            dp[i]=1;
            if (prices[i] == prices[i-1]-1){
                dp[i] += dp[i-1];
            }
            ans += dp[i];
        }
        return ans;
    }
}
