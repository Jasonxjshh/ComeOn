package Lab.P06_Ordering;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();
        String limitStr = sc.nextLine();
        String[] limit = limitStr.split(" ");
        String[] alphabets = alphabet.split(" ");
        Map<Character, List<Character>> adjacent = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        //统计所有限制，建表
        for (String s : limit) {
            char from = s.charAt(0);
            char to = s.charAt(2);
            List<Character> orDefault = adjacent.getOrDefault(from, new ArrayList<>());
            orDefault.add(to);
            adjacent.put(from, orDefault);
            degree.put(to, degree.getOrDefault(to, 0) + 1);
            if (!degree.containsKey(from)) degree.put(from, 0);
        }
        //遍历一个空的字母，防止漏掉
        for (String s : alphabets) {
            if (!degree.containsKey(s.charAt(0))) {
                degree.put(s.charAt(0), 0);
            }
        }
        List<Character> next = new ArrayList<>();
        //入度为0的点，刚开始就可以加入next数组中
        for (String s : alphabets) {
            if (degree.containsKey(s.charAt(0)) && degree.get(s.charAt(0)) == 0) {
                next.add(s.charAt(0));
            }
        }
        topologicalSort(new ArrayList<>(), degree, adjacent, next);
        //没有结果，就是NO
        if (ans.isEmpty()) {
            System.out.println("NO");
        } else {
            for (List<Character> an : ans) {
                System.out.println(an);
            }
        }
    }

    //最终结果
    static List<List<Character>> ans = new ArrayList<>();

    /**
     * 深度优先搜索进行所有拓扑
     * @param oneResult 其中的一个结果
     * @param inDegree 每一个节点的入度
     * @param graph 每一个节点的子节点
     * @param next 下一个可以添加的节点
     */
    public static void topologicalSort(List<Character> oneResult, Map<Character, Integer> inDegree, Map<Character, List<Character>> graph, List<Character> next) {
        if (next.size() == 0) {
            ans.add(oneResult);
            return;
        }

        for (int i = 0; i < next.size(); i++) {
            List<Character> tempNext = new ArrayList<>(next);
            List<Character> tempOneResult = new ArrayList<>(oneResult);
            tempNext.remove(next.get(i));
            tempOneResult.add(next.get(i));
            Map<Character, Integer> tempInDegree = new HashMap<>(inDegree);
            List<Character> tempEdges = graph.getOrDefault(next.get(i), new ArrayList<>());
            for (Character tempEdge : tempEdges) {
                tempInDegree.put(tempEdge, tempInDegree.get(tempEdge) - 1);
                if (tempInDegree.get(tempEdge) == 0) {
                    tempNext.add(tempEdge);
                }
            }
            topologicalSort(tempOneResult, tempInDegree, graph, tempNext);
        }
    }
}
