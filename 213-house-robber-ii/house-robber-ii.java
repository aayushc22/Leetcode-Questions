class Solution {
    Map<String,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int ans1 = rob(nums,0,nums.length-2);
        map.clear();
        int ans2= rob(nums,1,nums.length-1);
        return Math.max(ans1,ans2);
    }
    int rob(int nums[],int i,int n){
        if(i>n){
            return 0;
        }
       String key = i+" ";
       if(map.containsKey(key))
       return map.get(key);
       int p = nums[i]+rob(nums,i+2,n);
       int np = rob(nums,i+1,n);
       map.put(key,Math.max(p,np));
       return Math.max(p,np);
    }
}