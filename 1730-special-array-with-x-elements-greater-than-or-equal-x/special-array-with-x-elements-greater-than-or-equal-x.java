class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        int c=0;
        if(nums[nums.length-1]==0) return -1;

        for(int i=nums.length-1;i>=0;i--){
            if(c==nums[i]) return -1;
            temp++;
            if(temp<=nums[i]){
              c++;
            }
        }
        return c;
    }
}