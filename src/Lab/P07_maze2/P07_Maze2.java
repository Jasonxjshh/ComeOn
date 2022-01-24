package Lab.P07_maze2;

import java.util.Arrays;
import java.util.Scanner;

public class P07_Maze2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int T = sc.nextInt();
        int limitsNumber = sc.nextInt();
        int[][] maze = new int[N][N];
        for (int i=0; i<limitsNumber;i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            int value = sc.nextInt();
            maze[from-1][to-1] =value;
            sc.nextLine();
        }

        for (int i = 0; i < maze.length; i++) {
            for (int i1 = 0; i1 < maze[0].length; i1++) {
                if (maze[i][i1]==0){
                    maze[i][i1] = 10000;
                }
            }
        }
        for (int i = 0; i <N; i++) {
            dijkstra(i,maze,E,T);
        }
    }

    public static void dijkstra(int source, int[][] maze,int E,int T){

        //最短路径长度
        int[] shortest = new int[maze.length];
        //判断该点的最短路径是否求出
        int[] visited = new int[maze.length];

        String[] path = new String[maze.length];
        //初始化输出路径
        for (int i = 0; i < maze.length; i++) {
                path[i] = new String(source+1 + "=> " + (i+1));
        }

        //初始化源节点
        shortest[source] = 0;
        visited[source] = 1;

        for (int i=1;i<maze.length;i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j=0;j<maze.length;j++){
               if (visited[j]==0&&maze[source][j]<min){
                   min = maze[source][j];
                   index = j;
               }
            }
            //更新最短路径
            shortest[index] = min;
            visited[index] = 1;

            for (int m=0;m<maze.length;m++){
                if ((visited[m]==0)&&maze[source][index]+maze[index][m]<maze[source][m]){
                    maze[source][m] = maze[source][index]+maze[index][m];
                    path[m] = path[index]+"=>"+(m+1);
                }
            }

        }
        if (source==E-1){
            System.out.println((source+1)+", "+(source+1)+", "+0);
        }
        else if (shortest[E-1]==Integer.MAX_VALUE||shortest[E-1]>T){
            System.out.println((source+1)+", none");
        }
        else {
            System.out.println((source+1) + ", "+path[E-1]+", "+shortest[E-1]);
        }

    }
}
