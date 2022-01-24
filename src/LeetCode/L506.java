package LeetCode;


import java.util.Arrays;
import java.util.HashMap;

public class L506 {
    String[] g = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        String[] ans = new String[length];
        int[] clone = score.clone();
        Arrays.sort(clone);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = length - 1; i >= 0; i--){
            map.put(clone[i],length-1-i);
        }
        for (int i = 0; i < length; i++) {
            int rank = map.get(score[i]);
            ans[i] = rank < 3 ? g[rank] : String.valueOf(rank + 1);
        }
        return ans;
    }
}
