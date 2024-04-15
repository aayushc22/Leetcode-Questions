class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums,nums.length,0,new ArrayList<>(),ans);
        return ans;
    }

    void helper(int nums[],int n,int i, ArrayList<Integer> ds,List<List<Integer>> ans){

        if(i==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        helper(nums,n,i+1,ds,ans);
        ds.remove(ds.size()-1);
        helper(nums,n,i+1,ds,ans);

    }

}