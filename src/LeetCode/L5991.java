package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class L5991 {
    public static void main(String[] args) {
        int[] m = new int[]{3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(m)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int zheng = 0;
        int fu = 1;
        for (int num : nums) {
            if (num>=0){
                result[zheng] = num;
                zheng+=2;
            }else {
                result[fu] = num;
                fu+=2;
            }
        }
        return result;
    }
}
