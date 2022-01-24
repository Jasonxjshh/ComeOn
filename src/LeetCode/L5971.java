package LeetCode;

import java.util.Arrays;

public class L5971 {
    public int minimumCost(int[] cost) {
        int minCost = 0;
        Arrays.sort(cost);
        for (int i=cost.length-1,j=0;i>=0;i--,j++){
            if (j == 2) {
                j = -1;
            }else {
                minCost += cost[i];
            }
        }
        return minCost;
    }
}
