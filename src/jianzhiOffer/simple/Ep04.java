package jianzhiOffer.simple;

public class Ep04 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,4,5},{2,6,7,8},{3,9,10,11},{12,14,15,16}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                if (matrix[i][j] == target ){
                    return true;
                }
            }
        }
        return false;
    }


}
