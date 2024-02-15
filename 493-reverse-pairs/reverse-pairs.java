class Solution {

    static int merge(int low,int mid,int high,int[] arr,int[] B){
         int i =low;
        int j =mid;
        int k=low;
       int count=0;
       for(i=low;i<mid;i++){
           while(j<=high && arr[i]>2*(long)arr[j]){
               j++;
           }
           count+=j-(mid);
       }
       i=low;
       j=mid;
        while(i<=mid-1 && j<=high){
            if(arr[i]<=arr[j]){
                B[k++]=arr[i++];
            }
            else{
                B[k++]=arr[j++];
                
            }
        }
        while(i<=mid-1){
            B[k++]=arr[i++];
        }
        while(j<=high){
            B[k++]=arr[j++];
        }
        for(i=low;i<=high;i++){
            arr[i]=B[i];
        }
        return count;
    }
    static int ms(int low,int high,int[] arr,int[] ans){
        int count=0;
        int mid;
        if(low<high){
            mid = (low+high)/2;
            count=ms(low,mid,arr,ans);
            count+=ms(mid+1,high,arr,ans);
            count+=merge(low,mid+1,high,arr,ans);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        int[] ans = new int[nums.length];
        return ms(0,nums.length-1,nums,ans);
    }
}