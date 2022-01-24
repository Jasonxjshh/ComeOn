package Lab;
public class Lab17 {
    public static void main(String[] args) {
        Lab17 lab17 = new Lab17();
        int[] sum = new int[A.length];                    //定义一个和的数组，用来表示每个节点的和
        for (int i = 0; i < A.length; i++) {              //向数组分别存入每个节点的和
            sum[i] = lab17.Sum(findAncestorSum(A, i));
        }
        int result = sum[0];                              //result来记录最大和的值
        int index = 0;                                    //用来记录最大和对应的下标
        for (int i = 1; i < sum.length; i++) {            //找出result和index
            if (sum[i]>result){
                result = sum[i];
                index = i;
            }
        }
        int length = 0;                                      //用来找和最大的数组的所有非零父节点的个数
        for (int i=0;i<findAncestorSum(A,index).length;i++){
            if (findAncestorSum(A,index)[i]!=0){
                length = length+1;
            }
        }
        int[] resultArr = new int[length];
        int x=0;
        for (int i=0;i<findAncestorSum(A,index).length;i++){//用来找到和最大的数组
            if (findAncestorSum(A,index)[i]!=0){
                resultArr[x] = findAncestorSum(A,index)[i];
                x = x+1;
            }
        }
        System.out.println(result);//打印输出最大和
        System.out.print("{");//打印输出最大和对应的数组
        for (int i=resultArr.length-1;i>=0;i--){
            System.out.print(resultArr[i]+" ");
        }
        System.out.print("}");
    }
    static int[] A = new int[]{1, 2, 3, 8, 4, 5, 6, 0, 0, 10, 0, 7, 9, 10, 1, 0, 0, 0, 0, 1, 2, 0, 0, 0, 5, 2};
    public static int[] findAncestorSum(int[] A, int index){//该方法来找到某个节点的所有父节点值
        int height = 0;
        for (int i=0; i<A.length;i++){//这个循环来确定树的高度
            if (A.length<Math.pow(2,i)){
                height = i;
                break;
            }
        }
        int[] ancestor = new int[height];
        for (int i=0;i<ancestor.length;i++){//次循环找出所有的父节点的值并保存到一个数组
            if (index>=0){
                ancestor[i] = A[index];
                index = (int) Math.ceil(index/2.0)-1;
            }
        }
        return ancestor;
    }
    public int Sum(int[] ancestor){//用来计算所有父节点值得和
        int sum = 0;
        for (int i = 0; i < ancestor.length; i++) {
            sum = sum +ancestor[i];
        }
        return sum;
    }
}
