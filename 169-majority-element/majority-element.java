class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ele=nums[0];
        int c=0;

        for(int i=0;i<n;i++){
            if(c==0){
                ele=nums[i];
            }
            if(nums[i]==ele) c++;
            else c--;
        }

        return ele;
    }
}