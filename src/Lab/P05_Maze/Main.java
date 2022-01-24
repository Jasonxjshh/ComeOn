package Lab.P05_Maze;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
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
        System.out.println(findMin(maze));
    }

    //方向数组
    static int[] dir = new int[]{-1, 0, 1, 0, -1};

    /**
     * 给定初始数组，用堆优化的dijkstra算法，跑最短路
     * @param maze 给定的数组迷宫
     * @return 返回最短路径
     */
    public static int findMin(int[][] maze) {
        int row = maze.length;
        int col = maze[0].length;
        int[] dist = new int[row * col];
        Arrays.fill(dist, Integer.MAX_VALUE);
        //初始点到初始点初始化为0
        dist[0] = 0;
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
        pq.offer(0);
        boolean[] visit = new boolean[row * col];
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            //如果访问过就不需要再访问了
            if (visit[cur]) continue;
            visit[cur] = true;
            int x = cur / col;
            int y = cur % col;
            int d = maze[x][y];
            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i];
                int ny = y + dir[i + 1];
                //坐标不合法或者是坐标是障碍物，跳过
                if (nx < 0 || ny < 0 || nx >= row || ny >= col) continue;
                if (maze[nx][ny] == -1) continue;
                int next = nx * col + ny;
                if (visit[next]) continue;
                dist[next] = Math.min(dist[next], dist[cur] + d);
                pq.offer(next);
            }
        }
        //因为迷宫的终点也要算进去体力
        return dist[row * col - 1] + maze[row - 1][col - 1];
    }

}