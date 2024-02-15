class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        int left=0, right=nums.length-1;
        while(left<right){
            int sum=temp[right]+temp[left];
            if(sum>target) right--;
            else if(sum<target)left++;
            else break;
        }
        int leftElement= temp[left], rightElement=temp[right];
        int result[] = new int[2];
        boolean isChecked = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==leftElement && !isChecked)
             {result[0]=i; isChecked=true;}
            else if(nums[i]==rightElement) result[1]=i;  
        }
        return result;
    }
}