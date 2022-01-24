package LeetCode;

public class L807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                row[i] = Math.max(grid[i][j],row[i]);
                col[j] = Math.max(grid[i][j],col[j]);
            }
        }
        int res = 0;
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                res = res + (Math.min(row[i], col[j])-grid[i][j]);
            }
        }
        return res;
    }
}
