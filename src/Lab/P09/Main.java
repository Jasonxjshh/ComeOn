package Lab.P09;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] map = new List[n];
        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            map[from].add(to);
            map[to].add(from);
        }
        boolean[] visit = new boolean[n];
        int count = 0;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                count++;
                List<Integer> list = new ArrayList<Integer>();
                dfs(map,i,visit,list);
                ans.add(list);
            }
        }
        System.out.println("There are "+count+" connected component(s) in this graph");
        for (int i = 1; i <= ans.size(); i++) {
            System.out.println("components "+i+" contains vertices "+ans.get(i-1));
        }
    }
    public static void dfs(List<Integer>[] map,int cur,boolean[] visit,List<Integer> list){
        if(visit[cur])return;
        visit[cur] = true;
        list.add(cur);
        for (Integer next : map[cur]) {
            dfs(map,next,visit,list);
        }
    }
}