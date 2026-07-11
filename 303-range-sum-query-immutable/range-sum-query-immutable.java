class NumArray {
    int nums[];

    public NumArray(int[] nums) {
        this.nums = nums;
        
        
    }
    
    public int sumRange(int left, int right) {
        int ps[] = new int[this.nums.length];
        ps[0]=nums[0];

        for(int i=1;i<this.nums.length;i++){
            
            ps[i]= ps[i-1]+this.nums[i];

        }
        if(left==0) return ps[right];
        return ps[right]-ps[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */