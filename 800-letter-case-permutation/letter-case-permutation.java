class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        String op="";
        helper(s, op, ans);
        return ans;
    }
    public void helper(String ip, String op, List<String> ans){
        if(ip.length()==0){
            ans.add(op);
            return;
        }

        String op1 = op;
        String op2 = op;
        char ch = ip.charAt(0);
        if(Character.isDigit(ch)){
            op+=ch;
            ip=ip.substring(1);
            helper(ip, op, ans);            
            return;
        }else{
            op1+=Character.toLowerCase(ch);
            op2+=Character.toUpperCase(ch);
        
        
        ip=ip.substring(1);
        helper(ip, op1, ans);
        helper(ip, op2, ans);
        }
    }
}