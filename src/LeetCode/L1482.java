package LeetCode;
//制作 m 束花所需的最少天数
public class L1482 {

    public int minDays(int[] bloomDay, int m, int k){
        if (m*k>bloomDay.length){
            return -1;
        }
        int low = 1;
        int high = 1;
        for (int i =0;i<bloomDay.length;i++){
            high = Math.max(high,bloomDay[i]);
        }
        while (low<high){
            int day = (high-low)/2+low;
            if (canMake(bloomDay,day,m,k)){
                high = day;
            }else {
                low = day +1;
            }
        }
        return low;
    }

    public boolean canMake(int[] bloomDay, int days, int m, int k){
        int target = 0;
        int flower = 0;
        int length = bloomDay.length;
        for (int i=0;i<length&&target<m;i++){
            if (bloomDay[i]<=days){
                flower++;
                if (flower == k){
                    target++;
                    flower=0;
                }
            }else {
                flower = 0;
            }
        }
        return target>=m;
    }
}
