package arrays2;

public class RotateMatrix90deg {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix, n);
        reverseRows(matrix, n);
    }

    private void transpose(int[][] matrix, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                matrix[i][j]=matrix[i][j]+matrix[j][i];
                matrix[j][i]=matrix[i][j]-matrix[j][i];
                matrix[i][j]=matrix[i][j]-matrix[j][i];
            }
        }
    }
    
    private void reverseRows(int[][] matrix, int n){
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                matrix[i][start]=matrix[i][start]+matrix[i][end];
                matrix[i][end]=matrix[i][start]-matrix[i][end];
                matrix[i][start]=matrix[i][start]-matrix[i][end];
                start++;
                end--;
            }
        }
    }
}
