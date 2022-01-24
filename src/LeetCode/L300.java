package LeetCode;

public class L300 {

    //动态规划
    public int lengthOfLIS(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
            maxans = Math.max(dp[i],maxans);
        }
        return maxans;
    }

    //贪心, 二分
    public int lengthOfLIS_2(int[] nums) {
        int len = 1;
        int n = nums.length;
        if (n==0){
            return 0;
        }
        int[] d = new int[n+1];
        d[len] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i]>d[len]){
                d[len++] = nums[i];
            }else {
                int l=1, r = len, pos = 0;
                while (l<=r){
                    int mid = (l+r)>>1;
                    if (d[mid]<nums[i]){
                       pos = mid;
                       l = mid+1;
                    }else {
                        r = mid-1;
                    }
                }
                d[pos+1]= nums[i];
            }
        }
        return len;
    }
}
