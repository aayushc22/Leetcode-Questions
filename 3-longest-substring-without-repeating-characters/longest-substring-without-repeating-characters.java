class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}