package 杂项;

public class FindPath {
    public static void main(String[] args) {
        int[][] arr = {
                {7, 0, 0, 0, 0},
                {3, 8, 0, 0, 0},
                {8, 1, 0, 0, 0},
                {2, 7, 4, 4, 0},
                {4, 5, 2, 6, 5}
        };
        System.out.println(FindMinPath(arr));
    }

    public static int FindMinPath(int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        for (int i=1;i<arr.length;i++){
            for (int j = 0;j<=i;j++){
                if (j==0){
                    dp[i][j] = arr[i][j] + dp[i-1][0];
                }
                else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j-1],dp[i-1][j]);
                }
            }
        }
        int result = 0;
        for (int j = 0 ;j<arr[arr.length-1].length;j++){
            if (result<=dp[arr.length-1][j]){
                result = dp[arr.length-1][j];
            }
        }
        return result;
    }
}
