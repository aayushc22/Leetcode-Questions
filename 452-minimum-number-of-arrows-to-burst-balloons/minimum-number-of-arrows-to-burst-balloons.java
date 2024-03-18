class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int ans =1;
        int m=points.length;
        int n=points[0].length;
        if(m==1)
        return ans;
        int l=0;
        for(int i=0;i<m;i++){
            if(points[i][0]>points[l][1]){
            ans++;
            l=i;
            }
        }
        return ans;
    }
}