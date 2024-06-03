class Solution {
    public int appendCharacters(String s, String t) {
        int ans = t.length();
        int n =s.length();
        int m =t.length();

        int i=0,j=0;
        while(i<n&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                ans--;
            }
            else i++;
        }

        return ans;
    }
}