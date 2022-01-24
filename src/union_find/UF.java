package union_find;

public class UF {
    private int[] id; //分量id
    private int count;  //分量数量

    public UF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

//    /**
//     * quick-find: find method
//     */
//    public int find(int p){
//        return id[p];
//    }
//    /**
//     * quick-find: union method
//     */
//     public void union(int p,int q){
//         int pID = find(p);
//         int qID = find(q);
//
//         if (pID == qID){
//             return;
//         }
//         for (int i = 0; i < id.length; i++) {
//             if (id[i] == pID){
//                 id[i] = qID;
//             }
//         }
//         count--;
//     }


    /**
     * quick-union: find method
     */
    public int find(int p){
        while (p!=id[p]){
            p = id[p];
        }
        return p;
    }
    /**
     * quick-union: union method
     */
    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot){
            return;
        }
        id[pRoot] = qRoot;  //将p归到q中
        count--;
    }
}
