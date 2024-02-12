class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                m++;
                l++;
            }
            else if(nums[m]==1){
               
                m++;
                
            }
            else{
                swap(nums,m,h);
                
                h--;
            }
        }
    }
    public void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}