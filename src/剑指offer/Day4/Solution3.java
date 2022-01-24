package 剑指offer.Day4;

public class Solution3 {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if(mid < nums[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
