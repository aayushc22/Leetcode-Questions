class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),ans);
        return ans;

        
    }
    public void helper(int arr[],int t,int i,List<Integer> list,List<List<Integer>> ans){
        if(i==arr.length){
            if(t==0)
            ans.add(new ArrayList<>(list));
            return;
        }
            if(t>0){
            list.add(arr[i]);
            helper(arr,t-arr[i],i,list,ans);
            list.remove(list.size()-1);
            }
   

            helper(arr,t,i+1,list,ans);
 
    }
}