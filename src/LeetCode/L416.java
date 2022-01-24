package LeetCode;

public class L416 {
    /*
    * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
    * */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,96};
        boolean i = canPartition1(arr);
        System.out.println(i);
    }

    public static boolean canPartition1(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        if (sum%2==1){
            return false;
        }
        int target = sum/2;
        boolean[] dp = new boolean[target + 1]; // 用于存储 “背包”问题 每一个状态的可能性
        dp[0] = true;
        for (int num : nums) {  // 遍历 可放入“背包”的“物品”
            for (int i = target; i >= num; i--) {   // 从后向前，计算dp数组
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[target];

    }
//    public static boolean canPartition2(int[] nums){
//        int sum = 0;
//        for (int i=0;i<nums.length;i++){
//            sum = sum + nums[i];
//        }
//        if (sum%2==1){
//            return false;
//        }
//        int target = sum/2;
//        boolean[][] dp = new boolean[nums.length][target+1];
//    }
}
