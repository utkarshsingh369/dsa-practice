package arrays2;

public class MatchRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int i=0;i<4;i++){
            if(same(mat,target,n)){
                return true;
            }else{
                rotate90(mat, n);
            }
        }
        return false;
    }

    private boolean same(int[][] mat, int[][] target, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void rotate90(int[][] mat, int n){
        transpose(mat,n);
        reverseRow(mat,n);
    }

    private void transpose(int[][] mat, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                mat[i][j]=mat[i][j]+mat[j][i];
                mat[j][i]=mat[i][j]-mat[j][i];
                mat[i][j]=mat[i][j]-mat[j][i];
            }
        }
    }

    private void reverseRow(int[][] mat,int n){
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                mat[i][start]=mat[i][start]+mat[i][end];
                mat[i][end]=mat[i][start]-mat[i][end];
                mat[i][start]=mat[i][start]-mat[i][end];
                start++;
                end--;
            }
        }
    }
}
