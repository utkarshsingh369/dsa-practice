package arrays;

class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        //row-tracker: matrix[i][0]
        //column-tracker: if j==0:x; else matrix[0][j]

        int x=1; // tracker at the top left corner

        //first mark trackers on occurence of zero
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    //mark row tracker
                    matrix[i][0]=0;

                    //mark column tracker
                    if(j==0){
                        x=0;
                    }else{
                        matrix[0][j]=0;
                    }
                }
            }
        }

        for(int i=matrix.length-1;i>0;i--){
            for(int j=matrix[0].length-1;j>0;j--){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        // first solve column tracker as it is dependent on row-tracker
        if(matrix[0][0]==0){
            for(int i=matrix[0].length-1;i>0;i--){
                matrix[0][i]=0;
            }
        }

        // solve column tracker using x
        if(x==0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

    }
}