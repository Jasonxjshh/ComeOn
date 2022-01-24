package Lab;

public class Lab16 {
    static int[] A = new int[]{1, 2, 3, 0, 4, 5, 6, 0, 0, 0, 0, 7, 8};
    public static void main(String[] args) {
        Lab16 lab16 = new Lab16();
        int father = lab16.LAC(4,5);
        System.out.println(A[father]);
    }
    public int LAC(int x, int y){//此方法找出给定两个数的最大父节点
        int index1 = 0;//x的下标
        int index2 = 0;//y的下标
        for (int i = 0; i < A.length; i++) {//分别找出x和y的下标
            if (A[i]==x){
                index1 = i;
            }
            if (A[i]==y){
                index2 = i;
            }
        }
        int[] ancestor1 = findAncestor(A, index1);//调用私有方法来找x节点的所有父节点
        int[] ancestor2 = findAncestor(A, index2);//调用私有方法来找y节点的所有父节点
        int n = 0;//指针n，用来比较父节点
        int m = 0;//指针m，用来比较父节点
        int result = 0;
        for (int i = 0; i < ancestor1.length; i++) {
            if (ancestor1[n]==ancestor2[m]){//如果找到相等的父节点就直接返回
                result = ancestor1[n];
                break;
            }
            else{
                if (ancestor1[n]>ancestor2[m]){//如果1当前父节点比2的大，n就往后移动一位
                    n=n+1;
                }
                if (ancestor1[n]<ancestor2[m]){//如果1当前父节点比2的小，m就往后移动一位
                    m=m+1;
                }
            }
        }
        return result;
    }
    private int[] findAncestor(int[] A, int index){//该方法来找到某个节点的所有父节点
        int height = 0;
        for (int i=0; i<A.length;i++){//这个循环来确定树的高度
            if (A.length<Math.pow(2,i)){
                height = i;
                break;
            }
        }
        int[] ancestor = new int[height];
        for (int i=0;i<ancestor.length;i++){//次循环找出所有的父节点并保存到一个数组
            if (index>=0){
                ancestor[i] = index;
                index = (int) Math.ceil(index/2.0)-1;
            }
        }
        return ancestor;
    }
}
