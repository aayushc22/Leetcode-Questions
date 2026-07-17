class Solution {
    public int findMin(int[] nums) {
         int l=0;
        int h=nums.length-1;

        while(l<h){
            int m = (l+h)/2;
            if(nums[m]>nums[m+1]){
                return nums[m+1];
            }
            else if (nums[m]>nums[h]){
                l=m+1;
            }
            else{
                h = m;
            }
        }
        return nums[l];
        
    }
}