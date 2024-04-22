class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        boolean[] map=new boolean[nums.length];
        List<Integer> list=new ArrayList<Integer>();
        //sort the array so that duplicate entries will be next to each other
        Arrays.sort(nums);
        mapCombo(nums,map,res,list);
        return res;
    }
    
    private void mapCombo(int[] nums,boolean[] map,List<List<Integer>> res,List<Integer> list){
        
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(!map[i]){
                list.add(nums[i]);
           
                map[i]=true;
                mapCombo(nums,map,res,list);
            
                map[i]=false;
                list.remove(list.size()-1);
                
                while(i+1<nums.length && nums[i]==nums[i+1])i++;
                
            }
        }
    }
}