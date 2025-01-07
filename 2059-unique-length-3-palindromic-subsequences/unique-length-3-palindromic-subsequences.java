class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int fo[] = new int [26];
        int lo[] = new int [26];

        Arrays.fill(fo,-1);
        Arrays.fill(lo,-1);
        Set<String> ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i)-'a';
            if(fo[ind]==-1)
            fo[ind]=i;
            lo[ind]=i;
        }

        for(int i=0;i<26;i++){
            if(fo[i]!=-1 && lo[i]!=-1 && fo[i]<lo[i]){
                Set<Character> set = new HashSet<>();
                for(int j=fo[i]+1;j<lo[i];j++){
                    set.add(s.charAt(j));
                }
                for(char ch : set){
ans.add("" + (char)(i + 'a') + ch + (char)(i + 'a'));                
            }
        }
        
    }
    return ans.size();
    }
}