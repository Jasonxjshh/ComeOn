package 剑指offer.Day8;

public class Solution3 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            // 获取最小值
            minPrice = Math.min(minPrice, price);
            // 获取最大利润 = max先前的利润，此次利润 =（此次的价格-最小价格））
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}
