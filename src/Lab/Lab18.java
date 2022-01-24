package Lab;

public class Lab18 {
    static int[] S = {1,3,5,7};
    static int k = S.length;
    private static int coinChange(int[]S, int N, int k) {
        if (N < 0) {
            return 0;
        }
        if (N == 0) {
            return 1;
        }
        int cut = 0;
        //循环遍历使用了k枚该面值硬币后的组成方法数再相加
        for (int i = 0; k >= 0 && i * S[k] <= N; i++) {
            //每一层递归都在拆分成更小的问题，直到只有面值1的硬币
            cut += coinChange(S, N-i*S[k],k-1);
        }

        return cut;
    }
    public static void main(String[] args) {
        int[] S = {1,2,3};
        int N = 4;
        int cut = coinChange(S,N,S.length-1);
        System.out.println(cut);
    }
}
