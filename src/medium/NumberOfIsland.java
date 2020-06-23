package medium;

/**
 *  floodfill 算法例题
 *
 */
public class NumberOfIsland {

    public static void main(String[] args) {

    }



    /**
     *  采用二维平面回溯的思想计算岛屿的数量
     * @param grid 区域图
     * @return 返回岛屿的数量
     */
    public int numIslands(char[][] grid) {
        // 移动方向
        int[][] step = {{0,-1},{1,0},{0,1},{-1,0}};
        // 二维矩阵的大小
        int m  = grid.length, n = grid[0].length;

        /** 创建一个与 grid 同等大小的矩阵用于记录已访问的位置
         *  初始值为 false；
         *  当里面的值变为 true 时，表示该位置已经被访问过了。
         */
        boolean[][] visited = new boolean[m][n];

        // ret 用于记录岛屿的数量, 初始值为 0
        int ret = 0;
        for (int i = 0 ; i < m ; ++i){
            for (int j = 0 ; j < n ; ++j){
                if (grid[i][j] == '1' && !visited[i][j]){
                    ++ ret;
                    dfs(grid,step,visited,i,j);
                }
            }
        }
        return ret;
    }

    public boolean isArea(int x , int y , int m , int n){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public void dfs(char[][] grid ,int[][] step, boolean[][] visited , int x , int y ){
        visited[x][y] = true;
        for (int i = 0 ; i < step.length ; ++i){
            int new_x = x + step[i][0];
            int new_y = y + step[0][i];
            if (isArea(new_x,new_y,grid.length,grid[0].length)
                    &&!visited[new_x][new_y]
                    && grid[new_x][new_y] == '1'){
                dfs(grid,step,visited,new_x,new_y);
            }

        }

    }
}
