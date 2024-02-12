class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            rev(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swp(nums,i,ind);
                break;
            }
        }
        rev(nums,ind+1,n-1);
        
    }
     public void rev(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public void swp(int[] arr,int i,int j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
    }
}