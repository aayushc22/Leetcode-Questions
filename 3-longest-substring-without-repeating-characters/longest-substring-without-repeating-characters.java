class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int max=0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}