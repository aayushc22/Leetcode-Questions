class Solution {
    public int minimumChairs(String s) {
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                c++;
            }
            else c--;
            max=Math.max(max,c);
        }

        return max;
    }
}