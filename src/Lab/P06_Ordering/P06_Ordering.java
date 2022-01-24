package Lab.P06_Ordering;


import java.util.*;


public class P06_Ordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++) {
            answer = new ArrayList<>();
            String x = sc.nextLine();
            String limit = sc.nextLine();
            String[] nodes = x.split(" ");
            String[] limits = limit.split(" ");
            Map<Character, List<Character>> Graph = new HashMap<>();
            Map<Character, Integer> degree = new HashMap<>();
            for (String s : limits) {
                char parent = s.charAt(0);
                char child = s.charAt(2);
                List<Character> children = Graph.getOrDefault(parent, new ArrayList<>());
                children.add(child);
                Graph.put(parent, children);
                degree.put(child, degree.getOrDefault(child, 0) + 1);
                if (!degree.containsKey(parent)) {
                    degree.put(parent, 0);
                }
            }
            for (String s : nodes) {
                if (!degree.containsKey(s.charAt(0))) {
                    degree.put(s.charAt(0), 0);
                }
            }
            List<Character> next = new ArrayList<>();
            for (String s : nodes) {
                if (degree.containsKey(s.charAt(0)) && degree.get(s.charAt(0)) == 0) {
                    next.add(s.charAt(0));
                }
            }
            topologicalSort(new ArrayList<>(), degree, Graph, next);
            int flag = 0;
            if (answer.isEmpty()||answer.get(0).size()==0) {
                System.out.println("NO");
            } else {
                for (List<Character> an : answer) {
                    if (an.size()==nodes.length){
                        System.out.println(an);
                        flag++;
                    }
                }
                if (flag==0){
                    System.out.println("NO");
                }
            }
        }

    }
    static List<List<Character>> answer = new ArrayList<>();

    public static void topologicalSort(List<Character> oneAns,Map<Character,Integer> degree,
                                       Map<Character,List<Character>> Graph, List<Character> next){
        if (next.size()==0){
            answer.add(oneAns);
            return;
        }
        for (int i=0;i<next.size();i++){
            List<Character> tempNext = new ArrayList<>(next);
            List<Character> tempResult = new ArrayList<>(oneAns);
            tempNext.remove(next.get(i));
            tempResult.add(next.get(i));
            Map<Character, Integer> tempDegree = new HashMap<>(degree);
            List<Character> tempEdges = Graph.getOrDefault(next.get(i),new ArrayList<>());
            for (Character tempEdge : tempEdges) {
                tempDegree.put(tempEdge,tempDegree.get(tempEdge)-1);
                if (tempDegree.get(tempEdge)==0){
                    tempNext.add(tempEdge);
                }
            }
            topologicalSort(tempResult,tempDegree,Graph,tempNext);
        }
    }
}
