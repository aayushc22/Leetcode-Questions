class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {


        int [][] merged = merge(occupiedIntervals);
            List<List<Integer>> ans = new ArrayList<>();

    for (int[] interval : merged) {

        int s = interval[0];
        int e = interval[1];

        // No overlap
        if (e < freeStart || s > freeEnd) {
            ans.add(Arrays.asList(s, e));
            continue;
        }

        // Left part survives
        if (s < freeStart) {
            ans.add(Arrays.asList(s, freeStart - 1));
        }

        // Right part survives
        if (e > freeEnd) {
            ans.add(Arrays.asList(freeEnd + 1, e));
        }
    }

    return ans;
}

        
    


    public int[][] merge(int[][] intervals) {
         
         Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
         int s=intervals[0][0];
         int e=intervals[0][1];
         List<int []> ans = new ArrayList<>();
         int m=intervals.length;

         for(int i=1;i<m;i++){
             if(intervals[i][0]<=e+1){
                 e=Math.max(e,intervals[i][1]);
             }
             else{
                 ans.add(new int[]{s,e});
                 s=intervals[i][0];
                 e=intervals[i][1];
             }
             
         }
         ans.add(new int[]{s,e});
         return ans.toArray(new int [0][]);
    }
}