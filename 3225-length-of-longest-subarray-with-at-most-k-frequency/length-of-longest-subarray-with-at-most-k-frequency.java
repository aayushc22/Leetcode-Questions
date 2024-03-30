class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int i=0;
        int j=0;
        int n=nums.length;

        int max=0;
        int culprit=0;
        Map<Integer,Integer> map= new HashMap<>();

        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])==k+1){
                culprit++;
                
            }

            if(culprit>0){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==k){
                    culprit--;
                }
                i++;
            }

            if(culprit==0) max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}


