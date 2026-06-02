class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(0,n-1,nums);
            
        }
        else{
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
            swap(ind,i,nums);
            break;}
        }

        reverse(ind+1,n-1,nums);}

    }
    public void reverse(int i, int j,int arr[]){

        while(j>i){
        int a = arr[i];
        arr[i]=arr[j];
        arr[j]=a;
        i++;j--;
   }
    }
    public void swap(int i,int j, int arr[]){
        int a =arr[i];
        arr[i]=arr[j];
        arr[j]=a;
    }
}