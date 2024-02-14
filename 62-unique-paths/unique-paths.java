class Solution {
    int memo[][];
    public int uniquePaths(int m, int n) {
        memo=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        return helper(m-1,n-1);
    }
    public int helper(int m,int n){
        if(m==0&&n==0){
            return 1;
        }
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        else if(m==0&&n!=0){
            memo[m][n] = helper(m,n-1);
            return memo[m][n];
        }
        else if(m!=0&&n==0){
          memo[m][n]= helper(m-1,n);
            return memo[m][n];
        }
        else{
            memo[m][n]= helper(m-1,n)+helper(m,n-1);
            return memo[m][n];
        }
    }
}