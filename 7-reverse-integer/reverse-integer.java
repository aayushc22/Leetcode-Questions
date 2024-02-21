class Solution {
    public int reverse(int x) {
        int num=x;
        long newnum=0;
        while(num!=0){
            int d=num%10;
            newnum=newnum*10+d;
            num=num/10;

        }
        if(newnum>=Integer.MIN_VALUE&&newnum<=Integer.MAX_VALUE)
        return (int)newnum;
        else
        return 0;
    }
}