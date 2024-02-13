class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int ms=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            ms=Math.max(ms,sum);
        }

        return (double)ms/k;
    }
}