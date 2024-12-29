class Solution {
    Map<String,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        
        int ans= rob(nums,0);
        return ans;
    }
    int rob(int nums[],int i){
        if(i>=nums.length){
            return 0;
        }
       String key = i+" ";
       if(map.containsKey(key))
       return map.get(key);
       int p = nums[i]+rob(nums,i+2);
       int np = rob(nums,i+1);
       map.put(key,Math.max(p,np));
       return Math.max(p,np);
    }
}