class Solution {
    public String smallestPalindrome(String s) {
        int f[] = new int[26];

        for(char c:s.toCharArray()){
            f[c-'a']++;
        }

        StringBuilder fh=new StringBuilder();
        String m = "";
        for(int i=0;i<26;i++){
            if(f[i]>0){
                char cc = (char) (i + 'a');
                int count = f[i];
                for(int j=0;j<count/2;j++){
                    fh.append(cc);
                }
                if(count%2!=0){
                    m+=cc;
                }


            }
        }
        StringBuilder lh=new StringBuilder(fh).reverse();
        return fh.toString()+m+lh.toString();
        
    }
}