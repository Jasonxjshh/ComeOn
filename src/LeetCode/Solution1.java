package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] mun = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    mun[i]++;
                }
            }
        }
        return mun;
    }
}
