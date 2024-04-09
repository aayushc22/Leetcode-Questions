class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int t=0;
        while(true){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0){
                    t++;
                    tickets[i]--;
                }
                if(i==k&&tickets[i]==0)
                return t;
            }
        }
    }
}