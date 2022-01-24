package LeetCode;

import java.util.StringJoiner;

public class L5957 {
    public static void main(String[] args) {
        L5957 l = new L5957();
        System.out.println(l.addSpaces("icodeinpython", new int[]{1,5,7,9}));
    }
    public String addSpaces(String s, int[] spaces) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(s.substring(0,spaces[0]));
        for (int i = 1; i < spaces.length; i++) {
            joiner.add(s.substring(spaces[i-1],spaces[i]));
        }
        joiner.add(s.substring(spaces[spaces.length-1]));
        return joiner.toString();
    }
}
