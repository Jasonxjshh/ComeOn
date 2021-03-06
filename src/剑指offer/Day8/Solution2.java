package 剑指offer.Day8;

public class Solution2 {
    public int numWays(int n) {
        if (n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}
