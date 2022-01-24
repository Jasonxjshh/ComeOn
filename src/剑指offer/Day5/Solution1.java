package 剑指offer.Day5;


/*
*在一个 n * m 的二维数组中，每一行都
* 按照从左到右递增的顺序排序，每一列都按照从
* 上到下递增的顺序排序。请完成一个高效的函数，
* 输入这样的一个二维数组和一个整数，判断数
* 组中是否含有该整数。
*
* */
public class Solution1 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i=0;
        int j=m-1;
        boolean res = false;

            while (i<n&&j>=0){
                if (matrix[i][j]>target){
                    j--;
                }
                else if (matrix[i][j]<target){
                    i++;
                }else {
                    res = true;
                }

            }

        return res;
    }
}
