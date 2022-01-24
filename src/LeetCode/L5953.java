package LeetCode;

public class L5953 {
    public static void main(String[] args) {
        L5953 l = new L5953();
        System.out.println(l.subArrayRanges(new int[]{4, -2, -3,4,1}));
    }
    public long subArrayRanges(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j=i+1;j<nums.length;j++){
                max = Math.max(nums[j],max);
                min = Math.min(nums[j],min);
                res +=max-min;
            }
        }
        return res;
//        long sum = 0;
//        for (int i=2;i<=nums.length;i++){
//            int[] part = new int[i];
//            for (int j=0;j+i<=nums.length;j++){
//                for (int k=0;k<i;k++){
//                    part[k] = nums[j+k];
//                }
//                sum = sum+count(part);
//            }
//        }
//        return sum;
    }

//    private long count(int[] part){
//        long max = Long.MIN_VALUE;
//        long min = Long.MAX_VALUE;
//        for (int j : part) {
//            if (j > max) {
//                max = j;
//            }
//            if (j < min) {
//                min = j;
//            }
//        }
//        return max-min;
//    }
}
