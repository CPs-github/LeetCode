package jianzhiOffer.medium;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 *
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 *
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
 * 路径不能再次进入这个格子。
 * 示例 1：
 *
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 *
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 * 提示：
 *
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 *
 */
public class Ep12 {
    public static void main(String[] args) {

    }

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0 ; i < board.length; i++){
            for (int j = 0 ; j < board[0].length; j++){
                if (dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }

       return false;
    }
    public static boolean dfs(char[][] board, char[] words, int i, int j , int k ){
        // 设置递归终止条件
        if (i >= board.length || j >= board[0].length || board[i][j] != words[k]){
            return false;
        }

        if (k == words.length-1){
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '/';
        boolean ret = dfs(board,words,i+1,j,k+1)||dfs(board,words,i-1,j,k+1)||
                      dfs(board,words,i,j+1,k+1)||dfs(board,words,i,j-1,k+1);
        board[i][j] = temp;
        return ret;
    }

}
