package LeetCode;

public class L2013 {
    class DetectSquares {
        int[][] map;
        public DetectSquares() {
             map = new int[1005][1005];
        }

        public void add(int[] point) {
            map[point[0]][point[1]]++;
        }

        public int count(int[] point) {
            int ans = 0;
            int x = point[0];
            int y = point[1];
            int a = x+y;
            int b = x-y;
            for (int i=0; i<=1000;i++){
                if (i==point[0]){
                    continue;
                }
                int y1 = a-i;
                int y2 = i-b;
                if(y1>=0&&y1<=1000){ans+=map[point[0]][y1]*map[i][point[1]]*map[i][y1];}
                if(y2>=0&&y2<=1000){ans+=map[point[0]][y2]*map[i][point[1]]*map[i][y2];}
            }
            return ans;
        }
    }
}
