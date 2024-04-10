class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q= new LinkedList<>();
        int n=deck.length;
        Arrays.sort(deck);
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int i=0;
        int res[]=new int[n];
        while(i<n){
            res[q.poll()]=deck[i];
            i++;
            if(!q.isEmpty())
            {int e=q.poll();
            q.add(e);}

        
        }
        return res;
    }
}