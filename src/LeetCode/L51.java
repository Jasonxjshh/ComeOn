package LeetCode;

import java.util.*;

public class L51 {//8皇后

    public static void main(String[] args) {

    }

    public List<List<String>> solveQueues(int n){
        List<List<String>> solutions = new ArrayList<List<String>>();
        int[] queues = new int[n];
        Arrays.fill(queues,-1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();


        return solutions;
    }

    public void backtrack(List<List<String>> solutions, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row==n){
            List<String> board = generateBoard(queens,n);
            solutions.add(board);
        }
        else {
            for (int i=0;i<n;i++){
                if (columns.contains(i)){
                    continue;
                }
            }
        }
    }
    public List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }

}


