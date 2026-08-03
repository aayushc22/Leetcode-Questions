class Solution {
    public String stoneGameIII(int[] piles) {
        int n = piles.length;
        int[] suffixSum = new int[piles.length];
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        int[] memo = new int[n];
        int alice = helper(0,piles,suffixSum, memo);
        int bob = suffixSum[0]-alice;
        if(alice >bob) return "Alice";

        else if(alice==bob) return "Tie";

        else return "Bob";
        
    }
    private int helper(int i, int[] piles, int[] ss,int memo[]){
        if(i>=piles.length){
            return 0;
        }
        if(memo[i]!=0) return memo[i];
        int max =Integer.MIN_VALUE;

        for(int x=1;x<=3&&i+x<=piles.length;x++){
            int opp = helper(i+x,piles,ss,memo);
            int my = ss[i]-opp;

            max=Math.max(max,my);
        }
        memo[i]=max;
        return max;

    }
}