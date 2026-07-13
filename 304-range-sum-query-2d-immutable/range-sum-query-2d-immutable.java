class NumMatrix {

    int matrix[][];

    public NumMatrix(int[][] matrix) {
        int ps[][] = new int[matrix.length][matrix[0].length];
        ps[0][0]=matrix[0][0];

        for(int i=1;i<matrix[0].length;i++){
            ps[0][i]=ps[0][i-1]+matrix[0][i];

        }
        for(int i=1;i<matrix.length;i++){
            ps[i][0]=ps[i-1][0]+matrix[i][0];

        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                ps[i][j]=ps[i-1][j]+ps[i][j-1]+matrix[i][j]-ps[i-1][j-1];
            }
        }
        this.matrix=ps;
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = matrix[row2][col2];
        
        if (row1 > 0) {
            sum -= matrix[row1 - 1][col2];
        }
        
        if (col1 > 0) {
            sum -= matrix[row2][col1 - 1];
        }
        
        if (row1 > 0 && col1 > 0) {
            sum += matrix[row1 - 1][col1 - 1];
        }
        
        return sum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */