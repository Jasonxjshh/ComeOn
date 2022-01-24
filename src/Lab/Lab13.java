package Lab;

public class Lab13 {
    public int[] Merge_two_array(int[] x, int[] y){
        int index = 0;//这个变量用来遍历数组y
        if (index<y.length){//次循环将数组y的数依次插入数组x的0处
            for (int i = 0; i < x.length; i++) {
                if (x[i]==0){
                    x[i]=y[index];
                    index++;
                }
            }
        }
        for (int i=1;i<x.length;i++){//通过InsertSort来对合并后的数组进行排序
            if (x[i]<x[i-1]){        //因为InsertSort是Stable，不会改变原有的顺序
                int temp =x[i];
                int j;
                for (j=i;j>=0&&temp<x[j-1];j--){
                    x[j] = x[j-1];
                }
                x[j] = temp;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] x = new int[]{ 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] y = new int[]{ 1, 8, 9, 10, 15};
        Lab13 lab = new Lab13();
        x = lab.Merge_two_array(x,y);
        for (int result:x){
            System.out.print(result+" ");
        }

    }
}
