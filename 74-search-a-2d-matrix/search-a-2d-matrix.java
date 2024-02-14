class Solution {
    public boolean searchMatrix(int[][] mt, int t) {
        int m=mt.length;
        int n=mt[0].length;

        int l=0;
        int h=n*m-1;

        while(l<=h){
            int mid=(l+h)/2;
            int r=mid/n;
            int c=mid%n;
            if(mt[r][c]==t){
                return true;

            }
            else if(mt[r][c]<t){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}