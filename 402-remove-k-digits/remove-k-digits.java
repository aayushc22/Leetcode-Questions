class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }

        Stack<Character> st= new Stack<>();
        for(char c:num.toCharArray()){
            while(k>0&&!st.isEmpty()&&c<st.peek()){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
       while(sb.length()>1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
         return sb.toString();
    }
}