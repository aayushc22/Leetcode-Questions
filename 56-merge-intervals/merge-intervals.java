class Solution {
    public int[][] merge(int[][] intervals) {
         
         Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
         int s=intervals[0][0];
         int e=intervals[0][1];
         List<int []> ans = new ArrayList<>();
         int m=intervals.length;

         for(int i=0;i<m;i++){
             if(intervals[i][0]<=e){
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