class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        if(nums.length==1)
        return true;
        int p=0;
        if(nums[0]%2!=0)
           p=1;

        for(int i=1;i<nums.length;i++){
            int cp=0;
            if(nums[i]%2==0)
            cp=0;
            else cp=1;
            if(cp==p)
            return false;
            p=cp;
        }
        return true;
    }

}