package Sort;

public class SelectSort {

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_position = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_position]) {
                    min_position = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            System.out.print("Step "+i+": ");
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.print(",and min_position = "+min_position);
            System.out.println();//打印输出每一步交换的结果和其对应的最小位置的值

            if (i != min_position) {// 交换当前索引 i 和最小值索引 minIndex 两处的值
                int temp = arr[i];
                arr[i] = arr[min_position];
                arr[min_position] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }
//        for (int i=0;i<arr.length;i++){
//            int min = i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[j]<arr[min]){
//                    min = j;
//                }
//            }
//            if (min!=i){
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 11, 20, 9, 24, 13, 2, 19 };
        selectSort(arr);
        System.out.print("The result is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
