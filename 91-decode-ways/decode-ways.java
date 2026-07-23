class Solution {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length()];
        return helper(s,0,memo);
    }
    private int helper(String s ,int i,Integer[] memo){
        if(i==s.length()){
            
            return 1;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        int num = s.charAt(i)-'0';

        if(!valid(num)){
            return memo[i] = 0;
        }

        int t1 =  helper(s,i+1,memo);
        int t2=0;

        if(s.length()-i>=2){
            int n1=s.charAt(i)-'0';
            int n2=s.charAt(i+1)-'0';
            int n12= n1*10+n2;
            if(valid(n12)){
            t2= helper(s,i+2,memo);
            }
        }
        memo[i] = t1 + t2;
        return t1+t2;

    }
    private boolean valid(int num){
        return num>=1&&num<=26;
    }
}