class Solution {
    public int scoreOfString(String s) {
        
        int sum =0;

        for(int i=1;i<s.length();i++){
            int t=Math.abs(s.charAt(i)-s.charAt(i-1));
            sum+=t;
        }

        return sum;
    }
}