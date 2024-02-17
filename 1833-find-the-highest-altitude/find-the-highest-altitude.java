class Solution {
    public int largestAltitude(int[] gain) {
        int ps[]=new int[gain.length+1];
        ps[0]=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            ps[i+1]=ps[i]+gain[i];
            max=Math.max(max,ps[i+1]);
        }
        return max;
    }
}