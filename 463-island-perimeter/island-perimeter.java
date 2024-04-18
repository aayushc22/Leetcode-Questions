class Solution {
    int p=0;
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    helper(grid,i,j);
                    return p;
                }
            }
        }
        return p;
    }
    public void helper(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            p+=1;
            return;
        }
        if(grid[i][j]==0){
            p+=1;
            return;
        }
        if(grid[i][j]==-1)
        return;
        grid[i][j]=-1;
        helper(grid,i-1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
        helper(grid,i+1,j);
        return;
    }
}