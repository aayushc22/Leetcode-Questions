class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd= sumOdd(n);
        int sumEven = sumEven(n);
        return GCD(sumOdd,sumEven);
        
    }
    public int GCD(int n1, int n2) {
        if( n1%n2==0) return n2;
        if(n2%n1==0) return n1;
        while (n1!=0&&n2!=0){
            if(n1>n2) n1=n1%n2;
            else if(n2>n1) n2=n2%n1;
        }
        if(n1==0) return n2;
        return n1;
        
    }
    int sumOdd(int n ){
        return n*n;
    }
    int sumEven(int n){
        return n*(n+1);
    }

}