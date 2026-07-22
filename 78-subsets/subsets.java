class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        

        helper(nums,ans,new ArrayList<Integer>(),0);
        return ans;



        
    }
    public void helper(int nums[],List<List<Integer>> ans,List<Integer> list,int i){
        if(i==nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }


        helper(nums,ans,list,i+1);
        list.add(nums[i]);

        helper(nums,ans,list,i+1);
        list.remove(list.size()-1);
       
        
        
        
    }

    
}