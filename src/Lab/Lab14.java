package Lab;

public class Lab14 {
    public int[] longestOnes(int[] arr, int K) {
        int count=0;//统计区间0的个数
        int left=0;//区间左端点
        int right=0;//区间右端点
        int length=0;//最终长度
        int indexLeft = 0;
        int indexRight = 0;
        int[] result = new int[3];
        while(right<arr.length){
            if(arr[right++]==0){//区间扩充一个元素，如果为0则count++；
                count++;
            }
            while(count>K){//当区间内0的个数超过k时候，开始从左减少长度
                if(arr[left++]==0){//如果刚从区间去掉的元素是0，则count--;
                    count--;
                }
            }
            //此时count<=K,保存最大长度

            if (length<(right-left)){
                indexLeft = left;
                indexRight = right-1;
            }
            length=Math.max(length,right-left);
            result[0] = length;
            result[1] = indexLeft;
            result[2] = indexRight;
        }
        return result;
    }


    public static void main(String[] args) {
        Lab14 lab = new Lab14();
        int[] arr = new int[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};
        int[] result = lab.longestOnes(arr,1);

        System.out.println("The length of longest sequence is "+result[0]+" "+result[1]+" "+result[2]);
    }
}
