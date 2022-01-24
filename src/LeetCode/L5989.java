package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L5989 {
    public int countElements(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int i = 1;
        int j = 1;
        for (int x =1;x<nums.length;x++) {
            if (nums[x] == nums[0]) {
                i++;
            }
        }
            for (int y =1;y<nums.length;y++){
                if (nums[nums.length-1-y]==nums[nums.length-1]){
                    j++;
                }
            }
        return Math.max(nums.length - i - j, 0);

    }
}

