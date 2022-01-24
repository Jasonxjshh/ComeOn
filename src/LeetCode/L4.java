package LeetCode;

public class L4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i=0;i<num.length;i++){
            if (index1<nums1.length&&index2<nums2.length){
                if (nums1[index1]<nums2[index2]){
                    num[i] = nums1[index1];
                    index1++;
                }
                else{
                    num[i] = nums2[index2];
                    index2++;
                }
            }
            else if (index2<nums2.length){
                num[i] = nums2[index2];
                index2++;
            }
            else if (index1<nums1.length){
                num[i] = nums1[index1];
                index1++;
            }
        }
        double result;
        if (num.length%2==0){
            result = (num[num.length/2]+num[num.length/2-1])/2.0;
        }
        else{
             result = (num[num.length/2]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 =new int[]{1,3,4};
        int[] num2 = new int[]{2};
        double result = findMedianSortedArrays(num1,num2);
        System.out.println(result);
    }
}
