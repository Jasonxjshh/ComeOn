package Lab;

public class Lab15 {
    public int[] reverse(int[] arr, int i, int j, int m){//输入数组，开始的位置，结束的位置和翻转的个数
        for (int x=i;x+m-1<=j;x=x+m){//以m个为单位进行循环
            for (int y=0; y<m/2; y++){//每次循环交换该次循环中m个数
                int temp = arr[x+y];
                arr[x+y] = arr[x+m-1-y];
                arr[x+m-1-y] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Lab15 lab = new Lab15();
        arr = lab.reverse(arr,1,7,3);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
