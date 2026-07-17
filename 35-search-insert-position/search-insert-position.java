class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h =nums.length-1;

        int idx=-1;

        while (l<=h){

            int m =(l+h)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                h=m-1;
            }
            else{
                idx =m;
                l=m+1;
            }
        }
        return idx+1;
    }
}