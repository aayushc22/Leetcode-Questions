class Solution {
    public int minimumLength(String s) {
        if(s.length()==1)
        return 1;
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return r-l+1;
            }
            char c=s.charAt(l);
            while(l<=r&&s.charAt(l)==c){
                l++;
            }
            while(r>=l&&s.charAt(r)==c){
                r--;
            }
        }
        return Math.max(r-l+1,0);
    }
}