package Lab.P08_MaxFlow;


import java.util.*;

public class Maximum_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int source = sc.nextInt();
        int sink = sc.nextInt();
        int e_number = sc.nextInt();
        int[][] G = new int[N][N];
        int answer = 0;
        for (int i=0;i<e_number;i++){
            G[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }

        while (true){
            if (bfs(G, source, sink, N).size()<=1){
                System.out.println(answer);
                return;
            }
            else {
                LinkedList<Integer> path = bfs(G, source, sink, N);
                System.out.println(path);
                int[] flow = new int[path.size()-1];
                for (int i = 0; i < path.size()-1; i++) {
                    flow[i] = G[path.get(i)][path.get(i+1)];
                }
                int min = Integer.MAX_VALUE;
                for (int j : flow) {
                    if (j < min) {
                        min = j;
                    }
                }
                for (int i = 0; i < path.size()-1; i++) {
                    G[path.get(i)][path.get(i+1)] -= min;
                }
                answer = answer+min;
            }
        }
    }

    public static LinkedList<Integer> bfs(int[][] G, int source, int sink, int N){
        boolean[] visited = new boolean[N];
        int[] v_before = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()){
            int v = queue.remove();
            for (int i=0;i<G[v].length;i++){
                if (G[v][i]>0&&!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                    v_before[i] = v;
                }
            }
        }
        Stack<Integer> path = new Stack<>();
        if (visited[sink]){
            for (int x=sink;x!=source;x=v_before[x]){
                path.add(x);
            }
        }
        path.add(source);
        LinkedList<Integer> one_path = new LinkedList<>();
        while (!path.isEmpty()){
            one_path.add(path.pop());
        }
        return one_path;

    }
}

