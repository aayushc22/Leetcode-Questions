class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        helper(n,n,n,ans,"");
        return ans;
        
    }

    void helper(int n,int o,int c,List<String> ans,String s){
        if(o==0&&c==0){
            ans.add(s);
            return;
        }
        if(o>0){
            helper(n,o-1,c,ans,s+'(');

        }
        if(c>o&&c!=0)   helper(n,o,c-1,ans,s+')');
    }
}