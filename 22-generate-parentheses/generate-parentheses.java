class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(n,n,n,ans,"");
        return ans;





        
    }
    public void generateParenthesis(int n,int o,int c,List<String> ans,String s){
        if(o==0&&c==0){
            ans.add(s);
            return;
        }
     
        if(o>0)

        generateParenthesis(n,o-1,c,ans,s+'(');
        if(c>0&&c>o)
        generateParenthesis(n,o,c-1,ans,s+')');

        
    }
}