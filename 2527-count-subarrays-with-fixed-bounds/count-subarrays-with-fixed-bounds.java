class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans =0;
        int j=-1;
        int pMin=-1;
        int pMax = -1;


        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                j=i;
            }
            if(nums[i]==minK)
            pMin=i;
            if(nums[i]==maxK)
            pMax =i;

            ans += Math.max(0,Math.min(pMin,pMax)-j);
        }
        return ans ;
    }
}