package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> partitionLabels(String S) {

        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0;
        int end = 0;
        for (int i = 0;i<length;i++){
            end = Math.max(end,last[S.charAt(i)-'a']);
            if (i==end){
                partition.add(end-start+1);
                start = end+1;
            }
        }
        return partition;
    }
    public static void main(String[] args) {
        String S = "ababcfijkil";
        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        for (int x:last){
            System.out.println(x);
        }
    }
}
