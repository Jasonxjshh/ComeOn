package Lab;

public class Lab20 {
    public static int FindShort(int[][] a){
        if (a==null||a.length==0||a[0].length==0){
            return 0;
        }
        int[][] path = new int[a.length][a[0].length];
        path[0][0] = a[0][0];
        for (int i=1;i<a.length;i++){
            path[i][0] = a[i][0]+path[i-1][0];
        }
        for (int i=1;i<a[0].length;i++){
            path[0][i] = a[0][i]+path[0][i-1];
        }
        for (int i=1;i<a.length;i++){
            for (int j=1;j<a[0].length;j++){
                path[i][j] = a[i][j]+Math.min(path[i-1][j],path[i][j-1]);
            }
        }
        return path[a.length-1][a[0].length-1];
    }

    public static void main(String[] args) {
        int[][] a = {{4, 7, 8, 6, 4},
                     {6, 7, 3, 9, 2},
                     {3, 8, 1, 2, 4},
                     {7, 1, 7, 3, 7},
                     {2, 9, 8, 9, 3}};
        int result = FindShort(a);
        System.out.println(result);

    }
}
