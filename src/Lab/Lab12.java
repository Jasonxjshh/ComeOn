package Lab;

public class Lab12 {
    public static int Find_the_second(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i : arr) {//找到最大的和最小的数
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        for (int i=0;i<arr.length;i++){//将最大的数变为最小的数
            if (arr[i]==max){
                arr[i]=min;
                break;
            }
        }
        int second = arr[0];//记录第二大的数，for循环遍历出第二大的数
        for (int i:arr){
            if (i>second){
                second = i;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 11, 24, 9, 24, 13, 2, 19 };
        int result = Find_the_second(arr);
        System.out.println(result);
        //BigO = O(n);
    }
}
