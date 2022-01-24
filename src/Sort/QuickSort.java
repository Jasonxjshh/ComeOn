package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    //arr 需要排序的数组
    //low 开始时最左边的索引=0
    //high 开始时最右边的索引=arr.length-1
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                int x = arr[i];
                int y = arr[j];
                arr[i] = y;
                arr[j] = x;
            }
        }
            arr[low] = arr[i];
            arr[i] = temp;
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);


//        int i, j ,temp;
//        if (low>high){
//            return;
//        }
//        i = low;//左边的索引
//        j = high;//右边的索引
//        //temp是基准位,一般从要sort数组最左边开始
//        temp = arr[low];
//
//        while (i<j){
//            //先看右边(j)，依次往左递减
//            // 先从右往左找一个小于 基准位的数
//            // 当右边的索引位置所在的数>基准位的数 时
//            // 继续从右往左找（同时 j 索引-1）
//            // 找到后会跳出 while循环
//            while (temp<=arr[j]&&i<j){
//                j--;
//            }
//
//            //在看右边，依次往右递增
//            while (temp>=arr[i]&&i<j){
//                i++;
//            }
//
//            //如果满足条件交换
//            if (i<j){
//                //两个临时参数存放数据
//                int z = arr[i];
//                int y = arr[j];
//                //进行交换
//                arr[i] = y;
//                arr[j] = z;
//            }
//        }
//        //这是跳出大循环 这说明i==j(左右索引在同一位置)
//        //最后将基准位与i和j相等的位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//
////      这时  左半数组<(i或j所在索引的数)<右半数组
////      也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
////      只要用相同的方法 分别处理  左右数组就可以了(递归)
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);

    }
    public static void main(String[] args) {
        int[] myarray = {5,6,8,7,9,10,1,3,2,4};
        quickSort(myarray,0,myarray.length-1);
        for (int x:myarray){
            System.out.print(x+" ");
        }
    }
}
