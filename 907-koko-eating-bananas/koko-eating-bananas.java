class Solution {
    public int minEatingSpeed(int[] nums, int h) {




        int low = 1, high = maxEle(nums);
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            long  sum = calculateSum(nums,mid);

            if(sum<=h){
                ans= Math.min(ans,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    
        
    }
     int maxEle(int arr[]){

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    private long  calculateSum(int[] nums, int mid) {
    long sum = 0;
    for (int num : nums) {
        sum += (num + mid - 1) / mid; 
    }
    return sum;
}
}