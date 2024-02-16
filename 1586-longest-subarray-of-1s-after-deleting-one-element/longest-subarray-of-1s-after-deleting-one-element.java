class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;
        int zc=0;
        int c=0;
        int max=0;
        while(r<n){
            if(nums[r]==1) c++;
            max=Math.max(max,c);
             if(nums[r]==0){
                zc++;
                if(zc>1){
                    while(nums[l]!=0){
                        c--;
                        l++;
                    }
                     l++;
                    zc--;
                }
            }
            r++;
            
        }
        return max == n ? max - 1 : max;
    }
}