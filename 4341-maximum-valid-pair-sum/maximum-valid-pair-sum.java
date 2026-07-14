class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;


        for(int j=k;j<nums.length;j++){

            preMax= Math.max(preMax,nums[j-k]);
            ans = Math.max(ans,preMax+nums[j]);

        }
        return ans;
        
    }
}