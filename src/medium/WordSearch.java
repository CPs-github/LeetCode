package medium;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(new WordSearch().exist(board, word));
    }

    public boolean exist(char[][] board, String word) {


        boolean[][] visited = new boolean[board.length][board[0].length];
        //Arrays.fill(visited,false);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (searchword(board, word, 0, i, j, visited))
                    return true;
            }
        }
        return false;
    }

    public int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public boolean searchword(char[][] board, String word, int index, int startx, int starty, boolean[][] visited) {
        // 递归边界
        if (index == word.length() - 1) {
            System.out.println(board[startx][starty]);
            return board[startx][starty] == word.charAt(index);
        }

        // 向四个方向寻找；
        if (board[startx][starty] == word.charAt(index)) {
            visited[startx][starty] = true;
            for (int i = 0; i < 4; i++) {
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                System.out.println(board[startx][starty] + "..." + d[i][0] + " , " + d[i][1]);
                if (newx >= 0 && newx < board.length && newy >= 0 && newy < board[0].length && !visited[newx][newy] && searchword(board, word, index + 1, newx, newy, visited)) {
                    return true;
                }
                System.out.println("回溯到：" + board[startx][starty]);
            }

            visited[startx][starty] = false;
        }

        return false;
    }

}
