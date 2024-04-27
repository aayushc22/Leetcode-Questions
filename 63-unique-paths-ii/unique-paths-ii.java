class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int[][] memo = new int[mat.length][mat[0].length];
        return cp(mat, 0, 0, mat.length, mat[0].length, memo);
    }

    int cp(int[][] mat, int i, int j, int r, int c, int[][] memo) {
        if (i == r || j == c) return 0;
        if (mat[i][j] == 1) return 0;
        if (i == r - 1 && j == c - 1) return 1;
        
        if (memo[i][j] != 0) return memo[i][j];

        int p1 = cp(mat, i + 1, j, r, c, memo);
        int p2 = cp(mat, i, j + 1, r, c, memo);
        memo[i][j] = p1 + p2;
        return memo[i][j];
    }
}
