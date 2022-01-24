package LeetCode;

import java.util.*;

public class L5952 {
    public static void main(String[] args) {
        L5952 s = new L5952();
        System.out.println(s.countPoints("G4"));
    }
    public int countPoints(String rings) {
        List<Set<Character>> linkedLists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            linkedLists.add(new HashSet<>());
        }
        for (int i = 0; i < rings.length(); i=i+2) {
            char a1 = rings.charAt(i);
            int a2 = (int)rings.charAt(i+1)-48;
            linkedLists.get(a2).add(a1);
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (linkedLists.get(i).size()==3){
                count++;
            }
        }
        return count;
    }
}
