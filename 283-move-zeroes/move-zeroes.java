class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int i =0;
         int l =0;
         int r=nums.length;

         while(l<r){
            if(nums[i]!=0){
                i++;l++;
                continue;
            }else{
                while(l<r && nums[l]==0){
                  l++;
                }
                if(l==r) break;
                swap(nums,i,l);i++;
            }
         }
    }

    static void swap(int arr[],int x,int y){
        int ele = arr[x];
        arr[x]=arr[y];
        arr[y]=ele;
    }


}