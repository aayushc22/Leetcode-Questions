class Solution {
    public int jump(int[] nums) {
        int ans=0;
        int ce=0,cf=0;
        for(int i=0;i<nums.length-1;i++){
            cf=Math.max(cf,i+nums[i]);
            if(i==ce){
                ce=cf;
                ans++;
            }
        }
        return ans;
    }
}