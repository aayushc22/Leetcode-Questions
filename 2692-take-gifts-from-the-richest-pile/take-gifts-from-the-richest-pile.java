class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int i=0;
        while(i<gifts.length){
            maxHeap.add(gifts[i]);
            i++;
        }

        while(k>0){
            int n = maxHeap.poll();
            maxHeap.add((int)Math.sqrt(n));
            k--;
        }
        long sum =0;
        while(!maxHeap.isEmpty()){
            sum +=maxHeap.poll();
        }
        return sum;
    }
}