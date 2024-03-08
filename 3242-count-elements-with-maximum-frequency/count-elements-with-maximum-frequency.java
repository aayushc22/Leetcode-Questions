class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxFreq=0;
        for(int k:map.keySet()){
            maxFreq=Math.max(maxFreq,map.get(k));
        }

        int ans=0;

        for(int k:map.keySet()){
            if(map.get(k)==maxFreq){
                ans+=map.get(k);
            }
        }

        return ans;
    }
}