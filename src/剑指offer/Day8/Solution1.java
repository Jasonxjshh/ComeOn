package 剑指offer.Day8;

public class Solution1 {
    public int fib(int n) {
//        int a = 0;
//        int b = 1;
//        int sum;
//        for (int i = 0; i < n; i++) {
//            sum = (a+b)%1000000007;
//            a = b;
//            b = sum;
//        }
//        return a;
        if (n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i= 2;i<n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
            dp[i] = dp[i]%1000000007;
        }
        return dp[n];
    }
}
