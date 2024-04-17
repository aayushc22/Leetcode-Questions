class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        helper(nums,n,ans,ds,0);
        return ans;
    }
    void helper(int[] arr,int n,List<List<Integer>> ans,List<Integer> ds, int i){
        if(i==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        helper(arr,n,ans,ds,i+1);
        ds.remove(ds.size()-1);
        while(i+1<n&&arr[i]==arr[i+1]){
            i++;
        }
         helper(arr,n,ans,ds,i+1);

    }
}