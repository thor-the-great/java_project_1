public class FlipMatrix2D {
    public static void flipItVerticalAxis(int[][] matrix) {
        int r = matrix.length - 1, c = matrix[0].length - 1;
        int temp = 0;
        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= c/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][c - j];
                matrix[i][c - j] = temp;
            }
        }
    }
}
/*You are given an m x n 2D image matrix where each integer represents a pixel.
Flip it in-place along its vertical axis. Example:
Input image :
              1 0
              1 0

Modified to :
              0 1
              0 1
              */