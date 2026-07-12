class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1);
        int s=0,c=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(map.containsKey(s-k))
            c+=map.get(s-k);
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
            map.put(s,1);
        }
        return c;
    }
}