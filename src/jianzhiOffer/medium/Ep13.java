package jianzhiOffer.medium;

public class Ep13 {
    public static void main(String[] args) {

        Ep13 ep13 = new Ep13() ;
        System.out.println(ep13.movingCount(2,3,1));
    }
    public  int m ;
    public  int n;
    public  int k;
    public  boolean[][] visited;
    public  int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0,0,0);
    }

    public  int dfs(int i, int j, int si, int sj){
        if (i >= m || j >= n || visited[i][j]|| si+sj > k){
            return 0;
        }
        visited[i][j] = true;
        // 当 i 变化时，变化后的数位和 si 也要变化；同理 j 也一样；
        return 1+ dfs(i+1,j,(i+1)%10==0?si-8:si+1,sj)+dfs(i,j+1,si,(j+1)%10==0?sj-8:sj+1);
    }
}

