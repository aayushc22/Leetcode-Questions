class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,ds,ans,freq);
        return ans;
    }
    public void helper(int[] arr,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                helper(arr,ds,ans,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
                while(i+1<arr.length&&arr[i]==arr[i+1])i++;
            }
        }
    }
}