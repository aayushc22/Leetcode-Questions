class Solution {
    public int search(int[] nums, int target) {

        int pivot =pivot(nums);
        if(target>=nums[pivot]&&target<=nums[nums.length-1])
        return bsearch(nums,target,pivot,nums.length-1);
        else
        
        return bsearch(nums,target,0,pivot-1);
    }
    public int bsearch(int[] nums, int target,int l,int h) {

       

        while(l<=h){
             int m = (l+h)/2;

            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){

                h=m-1;
            }else{
                l=m+1;
            }

        }
        return -1;
        
       
    }

    public int pivot(int nums[]){

        int l=0;
        int h=nums.length-1;

        while(l<h){
            int m = (l+h)/2;
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
        return 0;
    }
}