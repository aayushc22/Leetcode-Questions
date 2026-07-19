class Solution {
    public double myPow(double x, int n) {
        return myPo(x,n);
       
        
    }
    public double myPo(double x, long n) {
        if(n<0) {
           long nn;
           nn=-n;
           x=1/x;
           return myPo(x,nn);

        }
        if( n==0) return 1;

        if(n==1) return (double) x;

        double ans = myPo(x,n/2);

        if(n%2==0) return ans*ans;
        return x*ans*ans;
        
    }
}