class Solution {
    public int lengthOfLastWord(String s) {
         s=s.trim();
         int l=s.length();
         
        int n=0;
        for(int i=l-1;i>=0;i--){
         if(s.charAt(i)==' '){
             break;
         }else
             n++;
        }return n;
    }
}



 
        