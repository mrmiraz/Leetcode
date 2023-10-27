public class Solution {
    public static void setZeroes(int[][] matrix) {
        int rLength = matrix.length;
        int cLength = matrix[0].length;

        boolean[] rZeros = new boolean[rLength];
        boolean[] cZeros = new boolean[cLength];

        for (int r = 0; r < rLength; r++) {
            for (int c = 0; c < cLength; c++) {
                if (matrix[r][c] == 0){
                    cZeros[c] = true;
                    rZeros[r] = true;
                }
            }
        }

        for (int i = 0; i < rLength; i++) {
            for (int j = 0; j < cLength; j++){
                if (rZeros[i] == true || cZeros[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},
                        {1,0,1},
                        {1,1,1}};
        setZeroes(matrix);
    }
}