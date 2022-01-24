package Sort;

public class InsertSort {
    //像打扑克牌给扑克牌排序
    public static void insertSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j;
            for (j=i;j>=0&&arr[j-1]>temp;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }

//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<arr[i-1]){
//                int temp =arr[i];
//                int j;
//                for (j=i;j>=0&&temp<arr[j-1];j--){
//                    arr[j] = arr[j-1];
//                }
//                arr[j] = temp;
//            }
//        }
    }
}
