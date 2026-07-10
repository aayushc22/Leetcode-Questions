class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,p);
                p++;

            }
        }
    }
    void swap(int arr[],int x,int y){
        int ele = arr[x];
        arr[x]=arr[y];
        arr[y]=ele;
    }

}