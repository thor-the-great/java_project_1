public class HorizontalFlipMatrix2D {
    public static void flipHorizontalAxis(int[][] matrix) {
        int r = matrix.length - 1, c = matrix[0].length - 1;
        int temp = 0;
        for(int i = 0; i <= r/2; i++){
            for(int j = 0; j <= c; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[r-i][j];
                matrix[r-i][j] = temp;
            }
        }
    }

}
