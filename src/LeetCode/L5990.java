package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L5990 {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        if (nums.length<=2){
            if (nums.length==0){
                return result;
            }else if (nums.length==1){
                result.add(nums[0]);
                return result;
            }else {
                if (nums[0]!=nums[1]&&nums[0]!=nums[1]-1){
                    result.add(nums[0]);
                    result.add(nums[1]);
                }
                return result;
            }
        }
        if (nums[0]!=nums[1]&&nums[0]!=nums[1]-1){
            result.add(nums[0]);
        }
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]+1&&nums[i]!=nums[i+1]-1){
                result.add(nums[i]);
            }
        }
        if (nums[nums.length-1]!=nums[nums.length-1-1]&&nums[nums.length-1]!=nums[nums.length-1-1]+1){
            result.add(nums[nums.length-1]);
        }
        return result;
    }
}
