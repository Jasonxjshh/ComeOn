package Lab.P05_Maze;

import java.util.Scanner;

public class P05_Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int [][] dp = new int[n][m];

        walkMaze(maze,dp,0,0);


    }

    public static void walkMaze(int[][] maze,int[][] dp,int x,int y){
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i=0;i<dir.length;i++){
            if (maze[x][y] == -1){
                break;
            }
            int tx = x+dir[i][0];
            int ty = y+dir[i][1];
            if (tx>=0&&tx<dp.length&&ty>=0&&ty<dp[tx].length&&maze[tx][ty]!=-1){
                if (dp[tx][ty]!=0){
                    dp[tx][ty] = Math.min(dp[x][y]+maze[tx][ty],dp[tx][ty]);
                }else {
                    dp[tx][ty] = dp[x][y] + maze[tx][ty];
                }
            }
        }
        if (y+1<dp[x].length){
            walkMaze(maze,dp,x,y+1);
        }
        else if (x+1<dp.length){
            walkMaze(maze,dp,x+1,0);
        }
        else {
            System.out.println(dp[dp.length-1][dp[0].length-1]);
        }
    }


}
