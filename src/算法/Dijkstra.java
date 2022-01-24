package 算法;

public class Dijkstra {

    public static int[] dijkstra(int[][] adjMatrix){
        int[] result = new int[adjMatrix.length];
        boolean[] used = new boolean[adjMatrix.length];
        used[0] = true;
        for (int i = 1; i < adjMatrix.length; i++) {
            result[i] = adjMatrix[0][i];
            used[i] = false;
        }
        for (int i=1;i<adjMatrix.length;i++){
            int min = Integer.MAX_VALUE;
            int k = 0;
            for(int j = 1;j < adjMatrix.length;j++) {  //找到顶点0到其它顶点中距离最小的一个顶点
                if(!used[j] && result[j] != -1 && min > result[j]) {
                    min = result[j];
                    k = j;
                }
            }
            used[k] = true;    //将距离最小的顶点，记为已遍历
            for(int j = 1;j < adjMatrix.length;j++) {  //然后，将顶点0到其它顶点的距离与加入中间顶点k之后的距离进行比较，更新最短距离
                if(!used[j]) {  //当顶点j未被遍历时
                    //首先，顶点k到顶点j要能通行；这时，当顶点0到顶点j的距离大于顶点0到k再到j的距离或者顶点0无法直接到达顶点j时，更新顶点0到顶点j的最短距离
                    if(adjMatrix[k][j] != -1 && (result[j] > min + adjMatrix[k][j] || result[j] == -1))
                        result[j] = min + adjMatrix[k][j];
                }
            }
        }
        return result;
    }

}

