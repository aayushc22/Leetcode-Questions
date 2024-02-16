class Solution {
    public int maxVowels(String s, int k) {
        
        int l=0;
        int r=0;
        int max=0;
        int cnt=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                cnt++;
            }
            
            if(r-l+1<k){
                r++;
            }
            else{
                max=Math.max(max,cnt);
                char al=s.charAt(l);
                if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u'){
                    cnt--;
                }
                l++;r++;
            }
            
        }
        return max;
    }
}