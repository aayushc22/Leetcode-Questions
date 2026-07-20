class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k) return -1;
        int minMax[]= minAndMax(bloomDay);
        int low = minMax[0],high =minMax[1];
        int ans = Integer.MAX_VALUE;


        while(low<=high){

            int mid =(low+high)/2;
            int p = isPossible(bloomDay,k,m,mid);

            if(p==1){
                ans = Math.min(ans,mid);
                high =mid-1;

            }else{
                low = mid+1;
            }


        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
        
    }

    private int isPossible(int arr[],int k,int m,int mid){

        int count =0;int b=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) count++;
            else if(arr[i]>mid) count =0;
            if(count == k) {
                b++; count =0;
            }
        }
        if(b>=m) return 1;
    
        return 0;
    }

    private int[] minAndMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=Math.max(arr[i],max);
            else min=Math.min(arr[i],min);
        }
        return new int[]{min,max};
    }
}
