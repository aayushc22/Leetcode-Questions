class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int s=0,ms=0;
        
        while(l<=r){
            if(power>=tokens[l]){
                s++;
                power-=tokens[l];
                l++;
                ms=Math.max(s,ms);
            }else if(s>=1){
                power+=tokens[r];
                r--;
                s--;
            }
            else
            break;
        }
        return ms;
    }
}