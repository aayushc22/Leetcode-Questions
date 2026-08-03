class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffixSum = new int[piles.length];
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        int[][] memo = new int[n][n + 1];
        return helper(0,1,piles,suffixSum, memo);
        
    }
    private int helper(int i, int M, int[] piles, int[] ss,int memo[][]){
        if(i+2*M>=piles.length){
            return ss[i];
        }
        if(memo[i][M]!=0) return memo[i][M];
        int max =0;

        for(int x=1;x<=2*M;x++){
            int opp = helper(i+x,Math.max(M,x),piles,ss,memo);
            int my = ss[i]-opp;
            max=Math.max(max,my);
        }
        memo[i][M]=max;
   return max;

    }
}