class Solution {
    public boolean searchMatrix(int[][] mt, int t) {
        int m=mt.length;
        int n=mt[0].length;

        for(int i=0;i<m;i++){
           if (mt[i][0] <= t && t <= mt[i][n - 1]) {
            return bs(mt[i], t);
            }

        }
        return false;
    }

    public boolean bs(int arr[],int t){
        int n=arr.length;
        int l=0,h=n-1;

        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==t){
                return true;
            }
            else if(arr[m]>t){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
}