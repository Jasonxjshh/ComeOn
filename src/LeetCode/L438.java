package LeetCode;

import java.util.*;

public class L438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < p.length(); i++) {
            char cr = p.charAt(i);
            pmap.put(cr, pmap.getOrDefault(cr, 0) + 1);
        }
        if (s.length() < p.length()) {
            return result;
        } else {
            for (int i = 0; i < s.length() - p.length() + 1; i++) {
                if (isEOXWord(s.substring(i, i + p.length()), p)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    Map<Character, Integer> pmap = new HashMap<>();

    public  boolean isEOXWord(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (!Objects.equals(characterIntegerEntry.getValue(), pmap.get(characterIntegerEntry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        L438 l = new L438();
        List<Integer> anagrams = l.findAnagrams("abab", "ab");
        System.out.println(anagrams);
    }
}

//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ans = new ArrayList<>();
//        int n = s.length(), m = p.length();
//        int[] c1 = new int[26], c2 = new int[26];
//        for (int i = 0; i < m; i++) c2[p.charAt(i) - 'a']++;
//        for (int l = 0, r = 0; r < n; r++) {
//            c1[s.charAt(r) - 'a']++;
//            if (r - l + 1 > m) c1[s.charAt(l++) - 'a']--;
//            if (check(c1, c2)) ans.add(l);
//        }
//        return ans;
//    }
//    boolean check(int[] c1, int[] c2) {
//        for (int i = 0; i < 26; i++) {
//            if (c1[i] != c2[i]) return false;
//        }
//        return true;
//    }