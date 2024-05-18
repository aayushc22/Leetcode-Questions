class Solution {
    public String reversePrefix(String word, char ch) {
        int in=0;
        int i= word.indexOf(ch);
        in=i;
        StringBuilder sbr = new StringBuilder();
        sbr.append(word.substring(0,in+1));
        sbr.reverse();
        sbr.append(word.substring(in+1));
        return sbr.toString();
    }
}