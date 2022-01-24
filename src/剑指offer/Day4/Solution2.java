package 剑指offer.Day4;

public class Solution2 {
    public int search(int[] nums, int target) {
        int times = 0;
        for (int num : nums) {
            if (num == target){
                times++;
            }
        }
        return times;
    }
}
