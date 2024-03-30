class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k==0)
        return 0;
        
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=1;
        int c=0;
        while(j<n){
            sum*=nums[j];

            while(sum>=k&&i<=j){
                sum=sum/nums[i];
                i++;
            }
           c+=j-i+1;
            j++;
        }
        return c;
    } 
}