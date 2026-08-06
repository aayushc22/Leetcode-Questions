class Solution {
    public int smallestNumber(int n, int t) {
        return helper(n,t);
        
    }
    public int helper(int n,int t){
        int sum=1;

        while(n<=100){
            if(pod(n)%t==0){
                return n;
            }
            n++;


        }
        return 100;
    }
    public int pod(int n){
        int p=1;

        while(n>0){
            p*=n%10;
            n=n/10;
        }
        return p;
    }
}