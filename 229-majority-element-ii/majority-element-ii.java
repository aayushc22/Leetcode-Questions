class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = 0, e2 = 0;
        int c1 = 0, c2 = 0;


        for(int i=0;i<nums.length;i++){
            if (e1==nums[i])
            c1++;
            else if(nums[i]==e2) c2++;
            else if(c1==0){
                c1++;
                e1=nums[i];
            }
            else if(c2==0){
                c2++;
                e2=nums[i];
            }
            else {
                c1--;c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int x : nums) {
            if (x == e1)
                c1++;
            else if (x == e2)
                c2++;
        } 
        List<Integer> ans = new ArrayList<>();
        
        if (c1 > nums.length / 3)
            ans.add(e1);

        if (c2 > nums.length / 3)
            ans.add(e2);
        return ans;
    }
}