class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int res[]=new int[n];
        boolean skip=true;
        Arrays.sort(deck);
        int i=1,j=1;
        res[0]=deck[0];
        for(int k=1;k<n;k++){
            res[k]=0;
        }
        while(i<n){
            if(res[j]==0){
                if(!skip)
                {res[j]=deck[i];
                i++;}
               
                skip=!skip;
            }
            
             j=(j+1)%n;
            
        }
        return res;
    }
}