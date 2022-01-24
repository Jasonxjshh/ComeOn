package Sort;

public class CountSort {
    public static int[] countSort(int[] arr){
        //求取原数组中最大值和最小值，计算counting数组的长度：counting数组是用来记录原始数据中每个值出现的频率
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int[] counting = new int[max-min+1];//初始化counting数组


        System.out.print("Step "+0+": ");//打印输出第0步
        for (int x:counting){
            System.out.print(x +" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {//循环遍历旧数组计数排序: 就是统计原始数组值出现的频率到counting数组中
            int target = arr[i];
            counting[target - min] += 1;
            System.out.print("Step "+(i+1)+": ");//打印输出每一步的counting数组
            for (int x:counting){
                System.out.print(x +" ");
            }
            System.out.println();
    }

        int[] result = new int[arr.length];//初始化一个新数组来记录排序好的结果
        int index = 0;//index记录索引的位置
        for (int i=0;i<counting.length;i++){
            for (int j = 0; j < counting[i]; j++) {//counting[i]:这个数出现的频率
                result[index++] = i + min;// 向result数组中填充对应的值
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 2, 2, 9, 1, 7, 1, 3};
        arr = countSort(arr);
        //打印输出result
        System.out.print("The result is: ");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
