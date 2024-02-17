class Solution {
    public int pivotIndex(int[] nums) {
        

        int sr[]=new int[nums.length];
        sr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sr[i]=nums[i]+sr[i+1];
            
        }
        int sl[]=new int[nums.length];
        sl[0]=nums[0];
         if(sl[0]==sr[0])
        return 0;
        for(int i=1;i<nums.length;i++){
            sl[i]=nums[i]+sl[i-1];
            if(sr[i]==sl[i])
            return i;
        }
        
       
        if(sl[nums.length-1]==sr[nums.length-1])
        return nums.length-1;
        return -1;
    }
}