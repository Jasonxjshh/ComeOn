package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L207 {

    //拓扑排序
    //1. 深度优先遍历
    //2. 广度优先遍历

    //DFS
//    List<List<Integer>> edges;
//    int[] visited;
//    boolean valid = true;
//    public boolean canFinish_DFS(int numCourses, int[][] prerequisites) {
//        edges = new ArrayList<List<Integer>>();
//        for (int i = 0; i < numCourses; i++) {
//            edges.add(new ArrayList<Integer>());
//        }
//        visited = new int[numCourses];
//        for (int[] info : prerequisites){
//            edges.get(info[1]).add(info[0]);
//        }
//        for (int i = 0; i < numCourses&&valid; i++) {
//            if (visited[i]==0){
//                dfs(i);
//            }
//        }
//        return valid;
//    }
//
//    private void dfs(int u) {
//        visited[u] = 1;
//        for (int v:edges.get(u)){
//            if (visited[v]==0){
//                dfs(v);
//                if (!valid){
//                    return;
//                }
//            }else if (visited[v] == 1){
//                valid = false;
//                return;
//            }
//        }
//        visited[u] = 2;
//    }

    //BFS
    List<List<Integer>> edges;
    int[] indeg;
    public boolean canFinish_BFS(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        for (int[] info:prerequisites){
            edges.get(info[1]).add(info[0]);
            indeg[info[0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i]==0){
                queue.offer(i);
            }
        }
        int visited = 0;
        while (!queue.isEmpty()){
            visited++;
            int u = queue.poll();
            for (int v:edges.get(u)){
                indeg[v]--;
                if (indeg[v] == 0){
                    queue.offer(v);
                }
            }
        }
        return visited == numCourses;
    }

}
