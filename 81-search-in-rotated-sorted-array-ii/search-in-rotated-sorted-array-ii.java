class Solution {
    public boolean search(int[] nums, int target) {
      int pivot =pivot(nums);
        if(target>=nums[pivot]&&target<=nums[nums.length-1])
        return bsearch(nums,target,pivot,nums.length-1);
        else
        
        return bsearch(nums,target,0,pivot-1);
    }
    public boolean bsearch(int[] nums, int target,int l,int h) {

       

        while(l<=h){
             int m = (l+h)/2;

            if(nums[m]==target){
                return true;
            }
            else if(nums[m]>target){

                h=m-1;
            }else{
                l=m+1;
            }

        }
        return false;
        
       
    }

    public int pivot(int nums[]){

        int l=0;
        int h=nums.length-1;
        int ans = -1;

        while(l<h){
            int m = (l+h)/2;
               if (nums[l] == nums[m] && nums[m] == nums[h]) {
                if(nums[l]>nums[l+1])
                return l+1;
                else if(nums[h-1]>nums[h])
                return h;
                l++;h--; continue;
            }
            if(nums[m]>nums[m+1]){
                return m+1;

            }
         
            else if (nums[m]>nums[h]){
                l=m+1;
            }
            else{
                h = m;
            }
        }
        return ans==-1? 0:ans;
    }
}