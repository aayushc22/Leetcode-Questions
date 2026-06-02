class Solution {
    public void sortColors(int[] arr) {
        

        int l=0;
        int r=arr.length-1;
        int m=0;
        while(m<=r){
            if(arr[m]==0){
                swap(m,l,arr);
                l++;m++;
            }
            else if(arr[m]==1){
              m++;
            }
            else if(arr[m]==2){
                swap(m,r,arr);r--;
            }
        }
    }
    public void swap (int i,int j,int nums[]){
        int a = nums[i];
        nums[i]=nums[j];
        nums[j]=a;
    }
}