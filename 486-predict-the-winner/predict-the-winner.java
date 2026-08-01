class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        return helper(nums,0,nums.length-1,0,0,true)>=0;
    }
    int helper(int nums[],int l,int r,int p1,int p2,boolean ip1){
        if(l>r){
            return p1-p2;
        }

        if(ip1){
            int tl = helper(nums,l+1,r,p1+nums[l],p2,false);
            int tr=helper(nums,l,r-1,p1+nums[r],p2,false);
            return Math.max(tl,tr);
        }
        else{
            int tl = helper(nums,l+1,r,p1,p2+nums[l],true);
            int tr=helper(nums,l,r-1,p1,p2+nums[r],true);
            return Math.min(tl,tr);
        }
       
    }
}