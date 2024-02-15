class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n=nums.length;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int l=1;

        for(int i:set){
            if(!set.contains(i-1)){
                int c=1;
                int x=i;
                while(set.contains(x+1)){
                    x=x+1;
                    c++;
                }
                l=Math.max(l,c);
            }
        }
        return l;
    }
}