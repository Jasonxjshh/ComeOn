package 牛客网;


import java.util.Scanner;

/*
*有个物品可供选择，必须选择其中个物品，请按字典序顺序输出所有选取方案的物品编号

与与等被认为是同一种方案，输出字典序最小的即可
*
* */
public class NO4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] res = new int[m];
        fun(res, 0, 1, m, n);
    }
    /**
     * @param res   结果列表
     * @param index 固定值下标
     * @param start 固定值起始值
     * @param m     m
     * @param n     n
     */
    private static void fun(int[] res, int index, int start, int m, int n) {
        if (index == m) {
            for (index = 0; index < m; index++) {
                System.out.printf("" + res[index]);
                if (index != m - 1) {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            return;
        }
        //固定值在区间[start,n-(m-index)+1]变化
        for (int val = start; val <= n - (m - index) + 1; val++) {
            res[index] = val;
            fun(res, index + 1, val + 1, m, n);
        }
    }

}
